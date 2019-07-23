package cn.gg3083.blog.service;

import cn.gg3083.blog.business.service.SysConfigService;
import com.alibaba.fastjson.JSON;
import cn.gg3083.blog.BaseJunitTest;
import org.junit.Test;
import org.springframework.beans.factory.annotation.Autowired;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2019/1/7 14:35
 * @since 1.8
 */
public class SysConfigServiceImplTest extends BaseJunitTest {

    @Autowired
    private SysConfigService configService;

    @Test
    public void comment() throws InterruptedException {
        System.out.println(JSON.toJSONString(configService.getConfigs()));
    }
}
