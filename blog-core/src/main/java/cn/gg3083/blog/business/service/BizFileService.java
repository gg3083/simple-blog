package cn.gg3083.blog.business.service;


import com.github.pagehelper.PageInfo;
import cn.gg3083.blog.business.entity.File;
import cn.gg3083.blog.business.vo.FileConditionVO;
import cn.gg3083.blog.framework.object.AbstractService;
import org.springframework.web.multipart.MultipartFile;

/**
 * @author innodev java team
 * @version 1.0
 * @date 2018/12/14 09:23
 * @since 1.8
 */
public interface BizFileService extends AbstractService<File, Long> {

    PageInfo<File> findPageBreakByCondition(FileConditionVO vo);

    File selectFileByPathAndUploadType(String filePath, String uploadType);

    void remove(Long[] ids);

    int upload(MultipartFile[] file);
}
