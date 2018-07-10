package com.example.demo;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.eureka.EnableEurekaClient;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;

@EnableZuulProxy
@EnableEurekaClient
@SpringBootApplication
public class ServiceZuulApplication {

	public static void main(String[] args) {
		SpringApplication.run(ServiceZuulApplication.class, args);
	}

    /*在微服务架构中，需要几个基础的服务治理组件，
    包括服务注册与发现、服务消费、负载均衡、断路器、智能路由、配置管理等，
    由这几个基础组件相互协作，共同组建了一个简单的微服务系统
    Zuul的主要功能是路由转发和过滤器。路由功能是微服务的一部分，
    比如／api/user转发到到user服务，/api/shop转发到到shop服务。
    zuul默认和Ribbon结合实现了负载均衡的功能*/
}
