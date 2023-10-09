package com.smartFarming.Service;

import java.util.List;

import com.smartFarming.entities.Weather;



public interface WeatherService {
	public Weather addWeather(Weather weather); 

	 public  List<Weather> viewAllWeather();
	


public Weather updateweather( int id,Weather weather);

  public String  deleteWeatherById (int id) ;
  public String deleteAllWeather();

	public Weather viewweatherById(int id);

	Weather updateWeather(int id, Weather weather);


}



	



