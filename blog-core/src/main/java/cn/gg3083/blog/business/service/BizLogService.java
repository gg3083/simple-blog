package cn.gg3083.blog.business.service;

import cn.gg3083.blog.framework.object.BaseConditionVO;
import cn.gg3083.blog.persistence.beans.BizLog;
import com.github.pagehelper.PageInfo;

/***
 *
 * @author Gimi
 * @date 2019/7/29 11:10
 *
 ***/
public interface BizLogService {

    void save(String ip);

    PageInfo<BizLog> findPageBreakByCondition(BaseConditionVO vo);
}
