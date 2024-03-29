package cn.gg3083.blog.business.vo;

import cn.gg3083.blog.business.entity.Article;
import cn.gg3083.blog.framework.object.BaseConditionVO;
import lombok.Data;
import lombok.EqualsAndHashCode;

import java.util.List;

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
public class ArticleConditionVO extends BaseConditionVO {
	private Article article;
	private Long typeId;
	private Long tagId;
	private Integer status;
	private Boolean top;
	private Boolean recommended;
	private Boolean original;
	private Boolean random;
	private List<Long> tagIds;
}

