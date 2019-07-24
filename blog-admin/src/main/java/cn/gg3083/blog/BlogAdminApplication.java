package cn.gg3083.blog;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.web.servlet.ServletComponentScan;
import tk.mybatis.spring.annotation.MapperScan;

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
public class BlogAdminApplication {

    public static void main(String[] args) {
        if ( args == null || args.length == 0){
            args = new String[]{"--spring.profiles.include=dev"};
        }
        SpringApplication.run(BlogAdminApplication.class, args);
    }
}
