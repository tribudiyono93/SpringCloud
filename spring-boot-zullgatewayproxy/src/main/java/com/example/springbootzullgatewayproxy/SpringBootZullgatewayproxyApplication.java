package com.example.springbootzullgatewayproxy;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.cloud.netflix.zuul.EnableZuulProxy;
import org.springframework.context.annotation.Bean;
import com.example.springbootzullgatewayproxy.filters.ErrorFilter;
import com.example.springbootzullgatewayproxy.filters.PostFilter;
import com.example.springbootzullgatewayproxy.filters.PreFilter;
import com.example.springbootzullgatewayproxy.filters.RouteFilter;
 
@SpringBootApplication
@EnableZuulProxy
public class SpringBootZullgatewayproxyApplication {

	public static void main(String[] args) {
		SpringApplication.run(SpringBootZullgatewayproxyApplication.class, args);
	}
	
	@Bean
    public PreFilter preFilter() {
        return new PreFilter();
    }
    @Bean
    public PostFilter postFilter() {
        return new PostFilter();
    }
    @Bean
    public ErrorFilter errorFilter() {
        return new ErrorFilter();
    }
    @Bean
    public RouteFilter routeFilter() {
        return new RouteFilter();
    }
    
}
