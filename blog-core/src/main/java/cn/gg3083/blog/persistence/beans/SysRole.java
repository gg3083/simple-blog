package cn.gg3083.blog.persistence.beans;

import cn.gg3083.blog.framework.object.AbstractDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import javax.persistence.Transient;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2018/4/16 16:26
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysRole extends AbstractDO {
    private String name;
    private String description;
    private Boolean available;

    @Transient
    private Integer selected;
}
