package com.ali.wechat;

import org.mybatis.spring.annotation.MapperScan;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.openfeign.EnableFeignClients;

@SpringBootApplication
@MapperScan("com.ali.wechat.dao")
@EnableFeignClients
public class WechatApplication {
	public static void main(String[] args) {
		SpringApplication.run(WechatApplication.class, args);
	}

}
