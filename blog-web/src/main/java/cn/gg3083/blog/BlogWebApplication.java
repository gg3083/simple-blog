package cn.gg3083.blog;

import me.zhyd.braum.spring.boot.annotation.EnableBraumConfiguration;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import org.springframework.transaction.annotation.EnableTransactionManagement;

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
//@EnableBraumConfiguration
public class BlogWebApplication {

    public static void main(String[] args) {
        if (args == null || args.length == 0) {
            args = new String[] { "--spring.profiles.include=dev" };
        }
        SpringApplication.run(BlogWebApplication.class, args);
    }



}
