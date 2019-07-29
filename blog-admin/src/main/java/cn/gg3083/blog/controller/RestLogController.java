package cn.gg3083.blog.controller;

import cn.gg3083.blog.business.entity.Template;
import cn.gg3083.blog.business.service.BizLogService;
import cn.gg3083.blog.business.vo.TemplateConditionVO;
import cn.gg3083.blog.framework.object.BaseConditionVO;
import cn.gg3083.blog.framework.object.PageResult;
import cn.gg3083.blog.persistence.beans.BizLog;
import cn.gg3083.blog.util.ResultUtil;
import com.github.pagehelper.PageInfo;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/***
 *
 * @author Gimi
 * @date 2019/7/29 12:44
 *
 ***/
@RestController
@RequestMapping("/log")
public class RestLogController {

    @Autowired
    private BizLogService logService;

    @PostMapping("list")
    public PageResult list(BaseConditionVO vo) {
        PageInfo<BizLog> pageInfo = logService.findPageBreakByCondition(vo);
        return ResultUtil.tablePage(pageInfo);
    }
}
