package cn.gg3083.blog.business.service;


import com.github.pagehelper.PageInfo;
import cn.gg3083.blog.business.entity.Template;
import cn.gg3083.blog.business.enums.TemplateKeyEnum;
import cn.gg3083.blog.business.vo.TemplateConditionVO;
import cn.gg3083.blog.framework.object.AbstractService;

/**
 * 系统模板
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/16 16:26
 * @since 1.0
 */
public interface SysTemplateService extends AbstractService<Template, Long> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<Template> findPageBreakByCondition(TemplateConditionVO vo);

    /**
     * 通过key获取模板信息
     *
     * @param key
     * @return
     */
    Template getTemplate(TemplateKeyEnum key);

    /**
     * 通过key获取模板信息
     *
     * @param key
     * @return
     */
    Template getTemplate(String key);
}
