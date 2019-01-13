package com.example.fly;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.jdbc.DataSourceAutoConfiguration;

/**
 * https://blog.csdn.net/iku5200/article/details/82856621
 *
 * https://blog.csdn.net/diaoling1990/article/details/82356747  // MyBatis
 *
 * https://blog.csdn.net/m0_37885618/article/details/79848285   bug 解决
 *
 * https://www.baidu.com/s?wd=nested%20exception%20is%20java.lang.IllegalArgumentException%3A%20Property%20%27sqlSession&rsv_spt=1&rsv_iqid=0xb55d5e980003c3a7&issp=1&f=8&rsv_bp=0&rsv_idx=2&ie=utf-8&tn=baiduhome_pg&rsv_enter=0&rsv_n=2&rsv_sug3=3&inputT=4248&rsv_sug4=4248
 */

@MapperScan("com.example.fly.mapper") //扫描的mapper
//@SpringBootApplication(exclude = DataSourceAutoConfiguration.class)
@SpringBootApplication
public class FlyApplication {

    public static void main(String[] args) {
        SpringApplication.run(FlyApplication.class, args);
    }

}

