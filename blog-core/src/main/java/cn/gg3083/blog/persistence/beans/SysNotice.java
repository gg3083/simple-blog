package cn.gg3083.blog.persistence.beans;

import cn.gg3083.blog.framework.object.AbstractDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2018/4/16 16:26
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class SysNotice extends AbstractDO {
    private Long userId;
    private String status;
    private String title;
    private String content;
}
