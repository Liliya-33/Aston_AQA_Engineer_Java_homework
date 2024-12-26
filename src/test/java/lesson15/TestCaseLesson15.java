package lesson15;

import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.testng.Assert;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;


public class TestCaseLesson15 {
    @Test
    @Description("Проверить название блока")
    public void TestTask1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        Thread.sleep(5000);
        WebElement CookiesButton = driver.findElement(By.cssSelector(".btn.btn_black.cookie__ok"));
        CookiesButton.click();
        WebElement NameSection = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2"));
        String expectedText = "Онлайн пополнение без комиссии";
        String actualText = NameSection.getText().replaceAll("\\s+", " ").trim();
        Assert.assertEquals(actualText, expectedText);
        driver.quit();
    }

    @Test
    @Description("Проверка логотипов платежных систем")
    public void TestTask2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        //Thread.sleep(5000);
        //WebElement CookiesButton = driver.findElement(By.cssSelector(".btn.btn_black.cookie__ok"));
        //CookiesButton.click();
        WebElement listLogo = driver.findElement(By.className("pay__partners"));
        List<WebElement> logoImages = listLogo.findElements(By.tagName("img"));
        System.out.println("Найдено логотипов: " + logoImages.size());

        if (logoImages.isEmpty()) {
            System.out.println("Изображения не найдены.");
        } else {
            for (WebElement logoImage : logoImages) {
                String logoAlt = logoImage.getAttribute("alt");
                String logoSrc = logoImage.getAttribute("src");
                System.out.println("Логотип: Alt = " + logoAlt + ", Src = " + logoSrc);
            }
        }
        driver.quit();
    }
}
