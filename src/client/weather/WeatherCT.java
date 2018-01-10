package client.weather;

import java.util.List;

import weather.ArrayOfString;
import weather.WeatherWebService;
import weather.WeatherWebServiceSoap;

public class WeatherCT {
   public static void main(String[] args) {
	
	   
	   WeatherWebServiceSoap wss = new WeatherWebService().getWeatherWebServiceSoap();
	   ArrayOfString info = wss.getWeatherbyCityName("北京");
	   System.out.println(info);
	   System.out.println(info.getString());
	   List<String> string = info.getString();
	   for (String s:info.getString()) {
		System.out.println(s);
	}
}
}
