package cn.gg3083.blog;

import lombok.extern.slf4j.Slf4j;
import me.zhyd.braum.spring.boot.annotation.EnableBraumConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

import javax.annotation.PostConstruct;
import java.util.Date;
import java.util.TimeZone;

/**
 * 程序启动类
 *
 * @author yadong.zhang (yadong.zhang0415(a)gmail.com)
 * @version 1.0
 * @website https://www.zhyd.me
 * @date 2018/4/18 11:48
 * @since 1.0
 */
@SpringBootApplication
@ServletComponentScan
@EnableTransactionManagement
@Slf4j
//@EnableBraumConfiguration
public class BlogWebApplication {

    @PostConstruct
    void started() {
        String timeZoneStr = "Asia/Shanghai";
        TimeZone.setDefault(TimeZone.getTimeZone(timeZoneStr));
        log.info("设置timeZone为{}", timeZoneStr);
        log.info("当前时间:{}", new Date());
    }

    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            args = new String[] { "--spring.profiles.include=dev" };
        }
        SpringApplication.run(BlogWebApplication.class, args);
    }



}
