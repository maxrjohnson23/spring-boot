package com.max.beans;

import com.max.model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.ComponentScan;

@ComponentScan({"com.max"})
@SpringBootApplication
public class BeansApplication {

    @Bean
    public User user(){
        return new User("Max", "Johnson");
    }

	public static void main(String[] args) {

		ApplicationContext ctx = SpringApplication.run(BeansApplication.class, args);
		String[] beanNames = ctx.getBeanDefinitionNames();
		for(String bean : beanNames) {
            System.out.println(bean);
        }

        System.out.println(ctx.getBean("user").toString());

	}
}
