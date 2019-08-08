package cn.gg3083.blog.demo.config.platform;

import me.zhyd.hunter.config.HunterConfig;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @since 1.8
 */
public interface InnerPlatform {

    HunterConfig process(String url);
}
