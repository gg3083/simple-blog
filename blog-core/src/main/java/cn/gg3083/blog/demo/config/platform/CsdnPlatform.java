package cn.gg3083.blog.demo.config.platform;

import me.zhyd.hunter.config.HunterConfig;
import me.zhyd.hunter.config.platform.BasePlatform;
import me.zhyd.hunter.config.platform.Platform;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @since 1.8
 */
public class CsdnPlatform extends BasePlatform {

    public CsdnPlatform() {
        super(Platform.CSDN.getPlatform());
    }

    @Override
    public HunterConfig process(String url) {
        return this.get(url);
    }
}
