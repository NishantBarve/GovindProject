package org.parabank.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserLogin {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/index.htm\n");
        driver.findElement(By.name("username")).clear();
        driver.findElement(By.name("username")).sendKeys("govind");
        driver.findElement(By.name("password")).clear();
        driver.findElement(By.name("password")).sendKeys("Govind123");
        driver.findElement(By.name("password")).sendKeys(Keys.ENTER);

        String title = driver.getTitle();
        if(title.equals("ParaBank")){
            System.out.println("Login Sucessfual");

        }
        else{
            System.out.println("Login Failed");
        }
        //driver.quit();
    }
}
