package cn.gg3083.blog;

import lombok.extern.slf4j.Slf4j;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.TimeZone;

/**
 * 程序启动类
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/24 14:37
 * @since 1.0
 */
@SpringBootApplication
@ServletComponentScan
@MapperScan("cn.gg3083.blog.persistence.mapper")
@Slf4j
public class BlogAdminApplication {

    @PostConstruct
    void started() {
        String timeZoneStr = "Asia/Shanghai";
        TimeZone.setDefault(TimeZone.getTimeZone(timeZoneStr));
        log.info("设置timeZone为{}", timeZoneStr);
        log.info("当前时间:{}", new Date());
    }


    public static void main(String[] args) {
        if ( args == null || args.length == 0){
            args = new String[]{"--spring.profiles.include=dev"};
        }
        SpringApplication.run(BlogAdminApplication.class, args);
    }
}
