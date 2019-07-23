package cn.gg3083.blog.business.service;


import com.github.pagehelper.PageInfo;
import cn.gg3083.blog.business.entity.Tags;
import cn.gg3083.blog.business.vo.TagsConditionVO;
import cn.gg3083.blog.framework.object.AbstractService;

/**
 * 标签
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
public interface BizTagsService extends AbstractService<Tags, Long> {

    PageInfo<Tags> findPageBreakByCondition(TagsConditionVO vo);

    Tags getByName(String name);
}
