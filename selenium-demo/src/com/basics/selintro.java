package com.basics;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class selintro {
	public static void main(String[] arg)
	{
		WebDriver webdriver = null;
		
//		System.setProperty("webdriver.chrome.driver", "C:\\tools\\chromedriver_win32\\chromedriver.exe");
//		webdriver = new ChromeDriver();
		
//		System.setProperty("webdriver.gecko.driver", "C:\\tools\\geckodriver-v0.31.0-win32\\geckodriver.exe");
//		webdriver = new FirefoxDriver();
		
		System.setProperty("webdriver.edge.driver", "C:\\tools\\edgedriver_win64\\msedgedriver.exe");
		webdriver = new EdgeDriver();
		
		
		
		webdriver.get("http://simplilearn.com");
		System.out.println(webdriver.getCurrentUrl());
		System.out.println(webdriver.getTitle());
		//webdriver.quit();
	}

}
