package com.qiu.physicsdatahandlehouduan;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.builder.SpringApplicationBuilder;
import org.springframework.boot.web.servlet.support.SpringBootServletInitializer;

@SpringBootApplication
public class PhysicsDataHandleHouDuanApplication extends SpringBootServletInitializer {
@Override
    protected SpringApplicationBuilder configure(SpringApplicationBuilder builder) {
        // 注意这里要指向原先用main方法执行的启动类
        return builder.sources(PhysicsDataHandleHouDuanApplication.class);

    }
    public static void main(String[] args) {

        SpringApplication.run(PhysicsDataHandleHouDuanApplication.class, args);
    }

}
