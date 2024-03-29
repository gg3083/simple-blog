package cn.gg3083.blog.persistence.beans;

import cn.gg3083.blog.framework.object.AbstractDO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.Date;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2018/4/16 16:26
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class BizArticleLove extends AbstractDO {
    private Long articleId;
    private Long userId;
    private String userIp;
    private Date loveTime;
}
