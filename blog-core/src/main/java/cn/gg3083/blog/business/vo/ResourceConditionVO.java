package cn.gg3083.blog.business.vo;

import cn.gg3083.blog.business.entity.Resources;
import cn.gg3083.blog.framework.object.BaseConditionVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

/**
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
@Data
@EqualsAndHashCode(callSuper = false)
public class ResourceConditionVO extends BaseConditionVO {
    private Resources resources;
}

