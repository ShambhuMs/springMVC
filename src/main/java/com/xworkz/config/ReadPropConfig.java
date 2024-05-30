package com.xworkz.config;

import jdk.nashorn.internal.objects.annotations.Property;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import org.springframework.context.annotation.PropertySource;

@Configuration
@PropertySource("classpath:application.properties")
public class ReadConfig {
    @Value("${userName}")
    private String userName;
   @Value("${password}")
   private int password;

    public ReadConfig() {
        System.out.println("Created no arg const.***********");
    }

    @Bean
    public String getDisplay(){
       System.out.println("username: "+this.userName);
       System.out.println("pswrd: "+this.password);
       return "xx";
   }


}
