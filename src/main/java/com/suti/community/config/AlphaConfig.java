package com.suti.community.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

import java.text.SimpleDateFormat;

//为了配置第三方的bean

@Configuration
public class AlphaConfig {

    //bean的名字就是方法名  这里是为了配置一个日期的第三方bean
    @Bean
    public SimpleDateFormat simpleDateFormat(){
        return new SimpleDateFormat("YYYY-MM-DD HH:mm:ss");
    }

}
