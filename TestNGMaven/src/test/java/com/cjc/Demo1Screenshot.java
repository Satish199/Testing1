package com.cjc;

import java.io.File;
import java.io.IOException;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class Demo1Screenshot {
	public static void main(String[] args) throws IOException {
		
System.out.println("Chrome BRowser");
		
		System.setProperty("webdriver.chrome.driver", "E:\\Drivers\\chromedriver.exe");
		
		WebDriver driver=new ChromeDriver();
		
		driver.get("https://www.facebook.com/");
		
		driver.manage().window().maximize();
		
		//driver.manage().timeouts().pageLoadTimeout(10, TimeUnit.SECONDS);
		
		File src=((TakesScreenshot)driver).getScreenshotAs(OutputType.FILE);
		
		FileUtils.copyFile(src, new File("E:\\Testing Notes\\ScreenShot\\fb2.jpeg"));
		
		System.out.println("SuccessFully Take Screen Shots");
		
	}

}
