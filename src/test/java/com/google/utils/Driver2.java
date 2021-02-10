package com.google.utils;


import io.github.bonigarcia.wdm.WebDriverManager;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class Driver2 {

  private static ThreadLocal< WebDriver > driverPool = new ThreadLocal<>();

  private Driver2(){

  }


  public static WebDriver getDriver(){
      String browser = ConfigurationReader.getProperty("browser");
      synchronized (Driver.class){

          if (System.getProperty("browser") != null){
              browser = System.getProperty("browser");
          }

          if (driverPool.get() == null){

              if (browser.equals("chrome")){
                  WebDriverManager.chromedriver().setup();
                  driverPool.set( new ChromeDriver());
              }else if (browser.equals("firefox")){
                  WebDriverManager.firefoxdriver().setup();
                  driverPool.set( new FirefoxDriver());
              }else {
                  throw new RuntimeException("No such driver!!!");
              }






          }



      }






      return driverPool.get();
  }


  public static void closeDriver(){

      if (driverPool.get() != null){
          driverPool.get().quit();
          driverPool.remove();
      }


  }








}
