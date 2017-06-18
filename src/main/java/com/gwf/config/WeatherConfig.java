package com.gwf.config;

import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;
import webxml.WeatherWebService;
import webxml.WeatherWebServiceSoap;

/**
 * Created by gaowenfeng on 2017/5/23.
 */
@Configuration
public class WeatherConfig {
    @Bean
    WeatherWebServiceSoap weatherWebServiceSoap(){
        return new WeatherWebService().getWeatherWebServiceSoap();
    }
}
