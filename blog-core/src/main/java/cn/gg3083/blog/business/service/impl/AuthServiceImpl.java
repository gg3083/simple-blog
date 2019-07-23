package cn.gg3083.blog.business.service.impl;

import cn.gg3083.blog.business.entity.User;
import cn.gg3083.blog.business.enums.UserTypeEnum;
import cn.gg3083.blog.business.service.AuthService;
import cn.gg3083.blog.business.service.SysUserService;
import cn.gg3083.blog.plugin.oauth.RequestFactory;
import cn.gg3083.blog.util.BeanConvertUtil;
import cn.gg3083.blog.util.SessionUtil;
import lombok.extern.slf4j.Slf4j;
import me.zhyd.oauth.model.AuthResponse;
import me.zhyd.oauth.model.AuthUser;
import me.zhyd.oauth.request.AuthRequest;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2019/5/25 14:34
 * @since 1.8
 */
@Slf4j
@Service
public class AuthServiceImpl implements AuthService {

    @Autowired
    private SysUserService userService;

    @Override
    public boolean login(String source, String code, String auth_code) {
        AuthRequest authRequest = RequestFactory.getInstance(source).getRequest();
        AuthResponse response = authRequest.login(StringUtils.isEmpty(code) ? auth_code : code);
        if (response.ok()) {
            AuthUser authUser = (AuthUser) response.getData();
            User newUser = BeanConvertUtil.doConvert(authUser, User.class);
            newUser.setSource(authUser.getSource().toString());
            if (null != authUser.getGender()) {
                newUser.setGender(authUser.getGender().getCode());
            }
            User user = userService.getByUuidAndSource(authUser.getUuid(), authUser.getSource().toString());
            newUser.setUserType(UserTypeEnum.USER);
            if (null != user) {
                newUser.setId(user.getId());
                userService.updateSelective(newUser);
            } else {
                userService.insert(newUser);
            }
            SessionUtil.setUser(newUser);
            return true;
        }
        log.warn("[{}] {}", source, response.getMsg());
        return false;
    }

    @Override
    public boolean revoke(String source, Long userId) {
        return false;
    }

    @Override
    public void logout() {
        SessionUtil.removeUser();
    }
}
