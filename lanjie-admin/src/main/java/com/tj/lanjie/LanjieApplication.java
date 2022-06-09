package com.tj.lanjie;

import org.mybatis.spring.annotation.MapperScan;
import org.mybatis.spring.annotation.MapperScans;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * 启动程序
 *
 * @author lanjie
 */
@SpringBootApplication(exclude = {DataSourceAutoConfiguration.class})
@MapperScan(value = {"com.tj.lanjie.system.mapper","com.tj.lanjie.quartz.mapper","com.tj.lanjie.generator.mapper"})
public class LanjieApplication {
    public static void main(String[] args) {
        // System.setProperty("spring.devtools.restart.enabled", "false");
        SpringApplication.run(LanjieApplication.class, args);
        System.out.println("(♥◠‿◠)ﾉﾞ  蓝街启动成功   ლ(´ڡ`ლ)ﾞ  \n");
    }
}
