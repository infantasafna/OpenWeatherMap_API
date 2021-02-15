package com.API.data;

import org.testng.annotations.DataProvider;

public class ApiParameters {
	
	
	@DataProvider(name="ResponseBody")
	public Object[][] ParameterstoFetchResponseBody()
	{
		return new Object[][]
				{
			{"q","London","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather","London","GB"},
			{"q","Bengaluru","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather","Bengaluru","IN"},
			{"q","Toronto","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather","Toronto","CA"},
			{"q","New York","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather","New York","US"},
			{"q","Sydney","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather","Sydney","AU"},
			{"q","Moscow","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather","Moscow","RU"},
			{"q","Beijing","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather","Beijing","CN"}
   				};
	}
	
	@DataProvider(name="ResponseStatus")
	public Object[][] ParameterstoFetchResponseStatus()
	{
		return new Object[][]
				{
			{"q","London","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather"},
			{"q","Bengaluru","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather"},
			{"q","Toronto","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather"},
			{"q","New York","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather"},
			{"q","Sydney","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather"},
			{"q","Moscow","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather"},
			{"q","Beijing","appid","e0115400bd2deb85547cd85f2a858c5a","http://api.openweathermap.org/data/2.5/weather"}
				};
	}
	
	
	@DataProvider(name="ResponseHeaders")
	public Object[][] ParameterstoFetchResponseHeaders()
	{
		return new Object[][]
				{
			{"http://api.openweathermap.org/data/2.5/weather?q=London&appid=e0115400bd2deb85547cd85f2a858c5a","X-Cache-Key","/data/2.5/weather?q=london","London"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Bengaluru&appid=e0115400bd2deb85547cd85f2a858c5a","X-Cache-Key","/data/2.5/weather?q=bengaluru","Bengaluru"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Toronto&appid=e0115400bd2deb85547cd85f2a858c5a","X-Cache-Key","/data/2.5/weather?q=toronto","Toronto"},
			{"http://api.openweathermap.org/data/2.5/weather?q=New York&appid=e0115400bd2deb85547cd85f2a858c5a","X-Cache-Key","/data/2.5/weather?q=new%20york","New York"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Sydney&appid=e0115400bd2deb85547cd85f2a858c5a","X-Cache-Key","/data/2.5/weather?q=sydney","Sydney"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Moscow&appid=e0115400bd2deb85547cd85f2a858c5a","X-Cache-Key","/data/2.5/weather?q=moscow","Moscow"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Beijing&appid=e0115400bd2deb85547cd85f2a858c5a","X-Cache-Key","/data/2.5/weather?q=beijing","Beijing"}
				};
	}
	
	@DataProvider(name="ResponseTime")
	public Object[][] ParameterstoFetchResponseTime()
	{
		return new Object[][]
				{
			{"http://api.openweathermap.org/data/2.5/weather?q=London&appid=e0115400bd2deb85547cd85f2a858c5a","London"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Bengaluru&appid=e0115400bd2deb85547cd85f2a858c5a","Bengaluru"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Toronto&appid=e0115400bd2deb85547cd85f2a858c5a","Toronto"},
			{"http://api.openweathermap.org/data/2.5/weather?q=New York&appid=e0115400bd2deb85547cd85f2a858c5a","New York"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Sydney&appid=e0115400bd2deb85547cd85f2a858c5a","Sydney"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Moscow&appid=e0115400bd2deb85547cd85f2a858c5a","Moscow"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Beijing&appid=e0115400bd2deb85547cd85f2a858c5a","Beijing"}
				};
	}
	
	
	@DataProvider(name="ResponseContentType")
	public Object[][] ParameterstoFetchResponseContentType()
	{
		return new Object[][]
				{
			{"http://api.openweathermap.org/data/2.5/weather?q=London&appid=e0115400bd2deb85547cd85f2a858c5a","London"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Bengaluru&appid=e0115400bd2deb85547cd85f2a858c5a","Bengaluru"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Toronto&appid=e0115400bd2deb85547cd85f2a858c5a","Toronto"},
			{"http://api.openweathermap.org/data/2.5/weather?q=New York&appid=e0115400bd2deb85547cd85f2a858c5a","New York"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Sydney&appid=e0115400bd2deb85547cd85f2a858c5a","Sydney"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Moscow&appid=e0115400bd2deb85547cd85f2a858c5a","Moscow"},
			{"http://api.openweathermap.org/data/2.5/weather?q=Beijing&appid=e0115400bd2deb85547cd85f2a858c5a","Beijing"}
				};
	}
	
}
