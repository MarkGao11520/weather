package com.gwf.service;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.context.annotation.Scope;
import org.springframework.stereotype.Service;
import webxml.WeatherWebServiceSoap;

import java.util.List;

/**
 * Created by gaowenfeng on 2017/5/23.
 */
@Service
@Scope("prototype")
public class WeatherImpl implements IWeatherService{
    @Autowired
    WeatherWebServiceSoap weatherWebServiceSoap;


    @Override
    public List<String> getProvince() {
        return weatherWebServiceSoap.getSupportProvince().getString();
    }

    @Override
    public List<String> getCity(String probinceName) {
        return weatherWebServiceSoap.getSupportCity(probinceName).getString();
    }

    @Override
    public List<String> getWeather(String cityName) {
        return weatherWebServiceSoap.getWeatherbyCityName(cityName).getString();
    }
}
