package SampleApp;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;

public class Project1 {
    public static void main(String[] args) throws InterruptedException {
       System.setProperty("webdriver.chrome.driver",
               "C:\\Users\\Miko Mukhari\\Downloads\\chromedriver.exe");

        WebDriver driver = new ChromeDriver();
        driver.manage().window().maximize();
        driver.get("https://www.ilabquality.com/");
        Thread.sleep(3000);
        driver.findElement(By.xpath("//*[@id=\"menu-item-1373\"]/a")).click();
        driver.findElement(By.linkText("South Africa")).click();
        driver.findElement(By.xpath("/html/body/section/div[2]/div/div/div/div[3]/div[2]/div/div/div/div/div/div[1]/div[1]/div[2]/div[1]/a")).click();
        driver.findElement(By.xpath("//*[@id=\"wpjb-scroll\"]/div[1]/a")).click();

        driver.findElement(By.id("applicant_name")).sendKeys("Miko");
        driver.findElement(By.id("email")).sendKeys(" automationAssessment@iLABQuality.com");
        driver.findElement(By.id("phone")).sendKeys("078 284 1949");
        driver.findElement(By.xpath("//*[@id=\"wpjb_submit\"]")).click();
        System.out.println(driver.findElement(By.xpath("//*[@id=\"wpjb-apply-form\"]/fieldset[1]/div[5]/div/ul/li/text()")).getText());




    }
}
