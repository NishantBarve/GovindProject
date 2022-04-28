package org.parabank.tests;

import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;

public class UserRegister {
    public static void main(String[] args) {

        System.setProperty("webdriver.chrome.driver", "src/test/resources/drivers/chromedriver.exe");
        WebDriver driver = new ChromeDriver();
        driver.get("https://parabank.parasoft.com/parabank/register.htm;jsessionid=82DEDDBDE7AB8A52C1B68259B0B1F76D");
        driver.findElement(By.id("customer.firstName")).clear();
        driver.findElement(By.id("customer.firstName")).sendKeys("Govind");
        driver.findElement(By.id("customer.lastName")).clear();
        driver.findElement(By.id("customer.lastName")).sendKeys("Galande");
        driver.findElement(By.id("customer.address.street")).clear();
        driver.findElement(By.id("customer.address.street")).sendKeys("Basmath");
        driver.findElement(By.id("customer.address.city")).clear();
        driver.findElement(By.id("customer.address.city")).sendKeys("Hingoli");
        driver.findElement(By.id("customer.address.state")).clear();
        driver.findElement(By.id("customer.address.state")).sendKeys("Maharastra");
        driver.findElement(By.id("customer.address.zipCode")).clear();
        driver.findElement(By.id("customer.address.zipCode")).sendKeys("431525");
        driver.findElement(By.id("customer.phoneNumber")).clear();
        driver.findElement(By.id("customer.phoneNumber")).sendKeys("9876543210");
        driver.findElement(By.id("customer.ssn")).clear();
        driver.findElement(By.id("customer.ssn")).sendKeys("123456789");
        driver.findElement(By.id("customer.username")).clear();
        driver.findElement(By.id("customer.username")).sendKeys("govind");
        driver.findElement(By.id("customer.password")).clear();
        driver.findElement(By.id("customer.password")).sendKeys("Govind123");
        driver.findElement(By.id("repeatedPassword")).clear();
        driver.findElement(By.id("repeatedPassword")).sendKeys("Govind123");
        driver.findElement(By.id("repeatedPassword")).sendKeys(Keys.ENTER);

        String title = driver.getTitle();
        if(title.equals("ParaBank")){
            System.out.println("Customer Registration Sucessfual");

        }
        else{
            System.out.println("Registration Failed");
        }
        //driver.quit();
    }
}
