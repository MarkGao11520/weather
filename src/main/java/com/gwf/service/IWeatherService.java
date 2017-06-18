package com.gwf.service;

import java.util.List;

/**
 * Created by gaowenfeng on 2017/5/23.
 */
public interface IWeatherService {
    List<String> getProvince();

    List<String> getCity(String probinceName);

    List<String> getWeather(String cityName);
}
