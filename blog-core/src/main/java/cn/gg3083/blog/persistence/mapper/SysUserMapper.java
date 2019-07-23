package cn.gg3083.blog.persistence.mapper;

import cn.gg3083.blog.business.vo.UserConditionVO;
import cn.gg3083.blog.plugin.BaseMapper;
import cn.gg3083.blog.persistence.beans.SysUser;

import java.util.List;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2018/4/16 16:26
 * @since 1.0
 */

public interface SysUserMapper extends BaseMapper<SysUser> {

    List<SysUser> findPageBreakByCondition(UserConditionVO vo);

    List<SysUser> listByRoleId(Long roleId);

}
