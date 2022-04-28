package org.parabank.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class ForgetLoginInfo {

    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/lookup.htm");
        driver.findElement(By.id("firstName")).clear();
        driver.findElement(By.id("firstName")).sendKeys("Govind");
        driver.findElement(By.id("lastName")).clear();
        driver.findElement(By.id("lastName")).sendKeys("Galande");
        driver.findElement(By.id("address.street")).clear();
        driver.findElement(By.id("address.street")).sendKeys("Basmath");
        driver.findElement(By.id("address.city")).clear();
        driver.findElement(By.id("address.city")).sendKeys("Hingoli");
        driver.findElement(By.id("address.state")).clear();
        driver.findElement(By.id("address.state")).sendKeys("Maharastra");
        driver.findElement(By.id("address.zipCode")).clear();
        driver.findElement(By.id("address.zipCode")).sendKeys("431525");
        driver.findElement(By.id("ssn")).clear();
        driver.findElement(By.id("ssn")).sendKeys("123456789");

        driver.findElement(By.id("ssn")).sendKeys(Keys.ENTER);

        String title = driver.getTitle();
        if(title.equals("ParaBank | Customer Lookup")){
            System.out.println("Forget Login Info Sucessfual");

        }
        else{
            System.out.println("Forget Login Info Failed");
        }
        //driver.quit();
    }
}

