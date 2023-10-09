package com.smartFarming.ServiceImpl;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.smartFarming.Service.WeatherService;
import com.smartFarming.entities.Weather;
import com.smartFarming.repository.WeatherRepository;
@Service
public class WeatherServiceImpl implements WeatherService{
	@Autowired
	WeatherRepository wr;

	@Override
	public Weather addWeather(Weather weather) {
		return wr.save(weather);
	}

	@Override
	public List<Weather> viewAllWeather() {
		List<Weather> w=wr.findAll();
		return w;
	}

	@Override
	public Weather updateWeather(int id, Weather weather) {
		Weather w=new Weather();
		w.setDataId(weather.getDataId());
		w.setPrecipitation(weather.getPrecipitation());
		w.setTemperature(weather.getTemperature());
		w.setTimestamp(weather.getTimestamp());
		w.setWheatherCondition(weather.getWheatherCondition());
		w.setWindSpeed(weather.getWindSpeed());
		
		return wr.save(w);
	}
	
	

	@Override
	public String deleteWeatherById(int id) {
		wr.deleteById(id);
		return "Weather is deleted";
	}

	@Override
	public String deleteAllWeather() {
		wr.deleteAll();
		return "all Weather is deleted";
	}

	@Override
	public Weather viewweatherById(int id) {
		Weather w=wr.findById(id).get();
		return w;
	}

	@Override
	public Weather updateweather(int id, Weather weather) {
		// TODO Auto-generated method stub
		return null;
	}



}
