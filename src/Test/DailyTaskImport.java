package Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;


public class DailyTaskImport {
    public void main(String args[]) {

        WebDriver driver = new ChromeDriver();
        String url = "https://umami-me.atlassian.net/";
        String account = "kera@ripla.jp";
        String password = "mg26202620";


        driver.get(url);
        driver.findElement(By.xpath("//*[@id=\"google-auth-button\"]/span[2]")).click();
        driver.findElement(By.xpath("//input[@id='identifierId']")).sendKeys(account);
        driver.findElement(By.xpath("//span[contains(.,'Next')]"));
        driver.findElement(By.xpath("//input[@type='password']")).sendKeys(password);
        driver.findElement(By.xpath("//span[contains(.,'Next')]"));


    }

}
