package com.gwf.web;

import com.gwf.service.IWeatherService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.List;

/**
 * Created by gaowenfeng on 2017/5/23.
 */
@Controller
@Scope("prototype")
@RestController
public class WeatherController {
    @Autowired
    IWeatherService iWeatherService;

    @RequestMapping("getProvince")
    public List<String> getProvince(){
        return iWeatherService.getProvince();
    }


    @RequestMapping("getCity")
    public List<String> getCity(String province){
        return iWeatherService.getCity(province);
    }

    @RequestMapping("getWeather")
    public List<String> getWeather(String city){
        return iWeatherService.getWeather(city);
    }
}
