package com.API.CallCurrentWeatherData;

import java.util.concurrent.TimeUnit;

import org.testng.annotations.Test;

import com.API.data.ApiParameters;

import io.restassured.RestAssured;
import io.restassured.http.ContentType;
import static org.hamcrest.Matchers.*;


public class CurrentWeatherDataForLocationByCityName extends ApiParameters {
	
		
	// get the response Body and also put an assertion to validate the same
	
	@Test (priority = 0, dataProvider="ResponseBody")
	public static void getResponseBody(String queryParameter1, String cityName, String queryParameter2, String ApiKey, String url, String city, String country){
				 
		RestAssured.given().queryParam(queryParameter1,cityName).queryParam(queryParameter2,ApiKey).when().get(url).then().log().body();
		RestAssured.given().queryParam(queryParameter1,cityName).queryParam(queryParameter2,ApiKey).when().get(url).then().assertThat().body(containsString(city), containsString(country));
				  		           
	}
		
	
	// get the status code and also put an assertion to validate the same
	
	
	@Test (priority = 1, dataProvider="ResponseStatus")
	public static void getResponseStatus(String queryParameter1, String cityName, String queryParameter2, String ApiKey, String url){
		   
		int statusCode= RestAssured.given().queryParam(queryParameter1,cityName).queryParam(queryParameter2,ApiKey).when().get(url).getStatusCode();
		           
		System.out.println("The response status code for - Call Current Weather Data For Location By City Name - "+cityName+ " : " +statusCode);
		
		RestAssured.given().queryParam(queryParameter1,cityName).queryParam(queryParameter2,ApiKey).when().get(url).then().assertThat().statusCode(200);
           
		}
	
	// get the response Header and also put an assertion to validate the same
	
	@Test (priority = 2, dataProvider="ResponseHeaders")
	public static void getResponseHeaders(String url, String headerName, String headerValue, String cityName){
		   
		System.out.println("The headers in the response for - Call Current Weather Data For Location By City Name - "+ cityName + " : " + RestAssured.get(url).then().extract().headers());
		RestAssured.get(url).then().assertThat().header(headerName, headerValue);
		
	}
		
	// get the response time
	
	@Test (priority = 3, dataProvider="ResponseTime")
	public static void getResponseTime(String url, String cityName){
		  
		System.out.println("The time taken to fetch the response for - Call Current Weather Data For Location By City Name - "+ cityName + " : " + RestAssured.get(url).timeIn(TimeUnit.MILLISECONDS) + " milliseconds");
		         
		}
	
	// get the response content-type and also put an assertion to validate the same
	
	@Test (priority = 4, dataProvider="ResponseContentType")
	public static void getResponseContentType(String url, String cityName){
		   
		System.out.println("The content type of response for - Call Current Weather Data For Location By City Name - "+ cityName + " : " + RestAssured.get(url).then().extract().contentType());
		RestAssured.get(url).then().assertThat().contentType(ContentType.JSON);
				              
		}
	}

