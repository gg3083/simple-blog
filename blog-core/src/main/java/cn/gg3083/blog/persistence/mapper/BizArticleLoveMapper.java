package cn.gg3083.blog.persistence.mapper;

import cn.gg3083.blog.business.vo.ArticleLoveConditionVO;
import cn.gg3083.blog.plugin.BaseMapper;
import cn.gg3083.blog.persistence.beans.BizArticleLove;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @website https://www.zhyd.me
 * @version 1.0
 * @date 2018/4/16 16:26
 * @since 1.0
 */
@Repository
public interface BizArticleLoveMapper extends BaseMapper<BizArticleLove> {

    /**
     * 分页查询
     * @param vo
     *
     * @return
     */
    List<BizArticleLove> findPageBreakByCondition(ArticleLoveConditionVO vo);
}
