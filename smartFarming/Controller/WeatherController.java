package com.smartFarming.Controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import com.smartFarming.Service.WeatherService;
import com.smartFarming.entities.Weather;
@RestController
@SpringBootApplication
public class WeatherController {
	@Autowired
	WeatherService ws;
	@PostMapping("/rei")
	Weather addweather (@RequestBody Weather weather)
	{
		return ws.addWeather(weather);
	}
	@GetMapping("/viewAllWeather")
	List<Weather> viewAllWeather() {
		return ws.viewAllWeather();
	}
	@GetMapping("/ viewweatherById/{id}")
	Weather viewweatherById ( @PathVariable int id, @RequestBody Weather weather)
	{
		return ws.viewweatherById(id);
	}
	@PutMapping("/updateweather/{id}")
	 Weather updateweather(@PathVariable int id, @RequestBody Weather weather)
	 {
		return ws.updateweather(id, weather);
	 }
	@DeleteMapping("/ deleteWeatherById/{id}")
	String  deleteWeatherById (@PathVariable int id) {
		return ws.deleteWeatherById(id);
	}
	@DeleteMapping("/deleteAllWeather")
	String deleteAllWeather()
	{
		return ws.deleteAllWeather();
	}
}

