package cn.gg3083.blog.business.enums;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2018/4/16 16:26
 * @since 1.0
 */
public enum ResourceTypeEnum {
    menu("菜单"), button("按钮");

    private final String info;

    private ResourceTypeEnum(String info) {
        this.info = info;
    }

    public String getInfo() {
        return info;
    }
}
