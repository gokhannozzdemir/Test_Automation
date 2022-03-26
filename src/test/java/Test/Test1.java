package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class Test1 {

    public static void main(String[] args) {
        System.setProperty("webdriver.chrome.driver","C:\\Users\\EXT02D26039\\Desktop\\Test_Automation\\drivers\\chromedriver.exe");
        WebDriver driver = new ChromeDriver();

        //driver.get("https://demoqa.com/");
        driver.navigate().to("https://demoqa.com/text-box");
        driver.manage().window().maximize();

        WebElement nameElement = driver.findElement(By.id("userName"));
        nameElement.click();
        nameElement.sendKeys("gokhan");
        //WebElement emailElement = driver.findElement(By.id("password"));
        //emailElement.sendKeys("XXXX");
        WebElement email = driver.findElement(new By.ByCssSelector(".mr-sm-2[id = 'userEmail']"));
        email.click();
        email.sendKeys("gokhannozzdemir@gmail.com");


    }
}
