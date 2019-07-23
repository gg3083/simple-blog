package cn.gg3083.blog.persistence.mapper;

import cn.gg3083.blog.business.vo.LogConditionVO;
import cn.gg3083.blog.plugin.BaseMapper;
import cn.gg3083.blog.persistence.beans.SysLog;
import org.springframework.stereotype.Repository;

import java.util.List;

/**
 * @author yadong.zhang email:yadong.zhang0415(a)gmail.com
 * @version 1.0
 * @date 2018/01/09 17:45
 * @since 1.0
 */
@Repository
public interface SysLogMapper extends BaseMapper<SysLog> {

    /**
     * 分页查询
     * @param vo
     *
     * @return
     */
    List<SysLog> findPageBreakByCondition(LogConditionVO vo);
}
