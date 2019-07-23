package cn.gg3083.blog.business.service;


import com.github.pagehelper.PageInfo;
import cn.gg3083.blog.business.entity.Log;
import cn.gg3083.blog.business.enums.PlatformEnum;
import cn.gg3083.blog.business.vo.LogConditionVO;
import cn.gg3083.blog.framework.object.AbstractService;

/**
 * @author yadong.zhang email:yadong.zhang0415(a)gmail.com
 * @version 1.0
 * @date 2018/01/09 17:40
 * @since 1.0
 */
public interface SysLogService extends AbstractService<Log, Integer> {

    /**
     * 分页查询
     *
     * @param vo
     * @return
     */
    PageInfo<Log> findPageBreakByCondition(LogConditionVO vo);

    void asyncSaveSystemLog(PlatformEnum platform, String bussinessName);
}
