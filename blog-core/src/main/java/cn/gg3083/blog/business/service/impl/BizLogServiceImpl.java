package cn.gg3083.blog.business.service.impl;

import cn.gg3083.blog.business.enums.ConfigKeyEnum;
import cn.gg3083.blog.business.service.BizLogService;
import cn.gg3083.blog.business.service.SysConfigService;
import cn.gg3083.blog.business.util.BaiduPushUtil;
import cn.gg3083.blog.persistence.beans.BizLog;
import cn.gg3083.blog.persistence.mapper.BizLogMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.util.StringUtils;

import java.util.Map;

/***
 *
 * @author Gimi
 * @date 2019/7/29 11:11
 *
 ***/
@Service
public class BizLogServiceImpl implements BizLogService {

    @Autowired
    private BizLogMapper bizLogMapper;
    @Autowired
    private SysConfigService sysConfigService;


    public void save(String ip){
        BizLog log = new BizLog();
        if (StringUtils.isEmpty(ip))return;
        log.setIpaddr( ip );
        String address = "获取失败";
        if ("127.0.0.1".equals(ip)||"localhost".equals("ip")){
            address = "本地";
        }else {
            Map<String, Object> configs = sysConfigService.getConfigs();
            Object baiduApi = configs.get(ConfigKeyEnum.BAIDU_API_AK.getKey());
            address = BaiduPushUtil.getAddress(ip,String.valueOf(baiduApi));
        }
        log.setAddress( address );
        bizLogMapper.insertSelective(log);
    }

}
