package io.emvnuel.github.ifoodbackendchallenge.client.openweathermap;

import io.emvnuel.github.ifoodbackendchallenge.client.openweathermap.response.OpenWeatherMapResponse;
import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

@FeignClient(url = "${open-weather-maps.api.url}", name = "openwheatermap", configuration = OpenWeatherMapClientConfiguration.class)
public interface OpenWeatherMapClient {

    @GetMapping(value = "?lat={lat}&lon={lon}&units=metric")
    OpenWeatherMapResponse findByLatAndLon(@PathVariable("lat") Double lat,
                                           @PathVariable("lon") Double lon);


    @GetMapping(value = "?q={cityName}&units=metric")
    OpenWeatherMapResponse findByCityName(@PathVariable("cityName") String cityName);

}
