package com.xuecheng.manage_cms;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.boot.autoconfigure.domain.EntityScan;
import org.springframework.cloud.client.discovery.EnableDiscoveryClient;
import org.springframework.cloud.client.loadbalancer.LoadBalanced;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;
import org.springframework.http.client.OkHttp3ClientHttpRequestFactory;
import org.springframework.web.client.RestTemplate;

/**
 * @author Walker_Don
 * @version V1.0
 * @Description TODO
 * @ClassName ManageCmsApplication
 * @date 2019年06月09日 下午 9:35
 */
@SpringBootApplication
@EnableDiscoveryClient
@EntityScan("com.xuecheng.framework.domain.cms")//扫描实体类
@ComponentScan(basePackages = {"com.xuecheng.api"})//扫描接口
@ComponentScan(basePackages = "com.xuecheng.framework")//扫描common工程下的类
@ComponentScan(basePackages = {"com.xuecheng.manage_cms"})//扫描本项目下的所有类
public class ManageCmsApplication {
	public static void main(String[] args) {
		SpringApplication.run(ManageCmsApplication.class, args);
	}

	//远程请求接口
	@Bean
	@LoadBalanced
	public RestTemplate restaaTemplate() {
		return new RestTemplate(new OkHttp3ClientHttpRequestFactory());
	}
}
