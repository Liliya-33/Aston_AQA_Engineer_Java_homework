package lesson15;

import jdk.jfr.Description;
import org.junit.jupiter.api.*;
import org.openqa.selenium.By;
import org.openqa.selenium.TimeoutException;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedCondition;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import java.beans.Visibility;
import java.time.Duration;
import java.util.List;
import java.util.NoSuchElementException;

import static org.testng.Assert.assertEquals;
import static org.testng.AssertJUnit.*;


public class TestCaseLesson15 {
    @Test
    @Description("Проверить название блока")
    public void TestTask1() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        Thread.sleep(5000);
        WebElement cookiesButton = driver.findElement(By.cssSelector(".btn.btn_black.cookie__ok"));
        cookiesButton.click();
        WebElement nameSection = driver.findElement(By.xpath("//div[@class='pay__wrapper']/h2"));
        String expectedText = "Онлайн пополнение без комиссии";
        String actualText = nameSection.getText().replaceAll("\\s+", " ").trim();
        assertEquals(actualText, expectedText);
        driver.quit();
    }

    @Test
    @Description("Проверка логотипов платежных систем")
    public void TestTask2() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        //Thread.sleep(5000);
        //WebElement cookiesButton = driver.findElement(By.cssSelector(".btn.btn_black.cookie__ok"));
        //cookiesButton.click();
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

    @Test
    @Description("Проверка ссылки 'Подробнее о сервисе'")
    public void TestTask3() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");
        //Thread.sleep(5000);
        //WebElement cookiesButton = driver.findElement(By.cssSelector(".btn.btn_black.cookie__ok"));
        //cookiesButton.click();
        WebElement sectionPay = driver.findElement(By.className("pay"));
        WebElement link = sectionPay.findElement(By.tagName("a"));
        assertNotNull("Ссылка не найдена", link);
        String expectedLink = "https://www.mts.by/help/poryadok-oplaty-i-bezopasnost-internet-platezhey/";
        String actualLink = link.getAttribute("href");

        if (actualLink.equals(expectedLink)) {
            link.click();
            System.out.println("Ссылка корректная и кликабельная");
        } else {
            System.out.println("Ссылка неверная");
        }
        driver.quit();
    }


    @Test
    @Description("Проверка заполнение полей и работоспособность кнопки")
    public void TestTask4() throws InterruptedException {
        WebDriver driver = new ChromeDriver();
        driver.get("https://www.mts.by/");

        //WebElement cookiesButton = null;
        try {
            WebElement cookiesButton = new WebDriverWait(driver, Duration.ofSeconds(5))
                    .until(ExpectedConditions.visibilityOfElementLocated(By.cssSelector(".btn.btn_black.cookie__ok")));
            //if (cookiesButton.isDisplayed()) {
            cookiesButton.click();
            System.out.println("Кнопка 'Продолжить' нажата.");
            //} else {
            //    System.out.println("Модальное окно 'Обработка файлов cookie' не найдено, продолжаем тест.");
            //}
        } catch (NoSuchElementException | TimeoutException e) {
            System.out.println("Модальное окно 'Обработка файлов cookie' не найдено, продолжаем тест.");
        }

        WebElement sectionPay = driver.findElement(By.className("pay"));
        WebElement inputPhone = sectionPay.findElement(By.className("phone"));
        inputPhone.click();
        inputPhone.sendKeys("297777777");
        WebElement inputRub = sectionPay.findElement(By.className("total_rub"));
        inputRub.click();
        inputRub.sendKeys("1");
        WebElement inputEmail = sectionPay.findElement(By.className("email"));
        inputEmail.click();
        inputEmail.sendKeys("test@test.com");
        WebElement buttonContinue = sectionPay.findElement(By.cssSelector("#pay-connection > button"));

        //if (buttonContinue.isEnabled()) {
        buttonContinue.click();
        driver.quit();
        System.out.println("Блок 'Онлайн пополнение без комиссии' заполнено и нажата кнопка 'Продолжить'");
            /*Thread.sleep(10000);
            //WebElement windowPay = new WebDriverWait(driver, Duration.ofSeconds(15)).until(ExpectedConditions.visibilityOfElementLocated(By.className("app-wrapper__content")));
            WebElement windowPay;
            WebElement payText = driver.findElement(By.cssSelector("body > app-root > div > div > div > app-payment-container > section > div > div > div.pay-description__text"));
            payText.getText();
            assertTrue("Оплата", payText.isDisplayed());
            System.out.println(payText);
        //} else {
            //fail("Кнопка 'Продолжить' не кликабельна");
        driver.quit();
    }
            try {
                WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                WebElement payText = wait.until(ExpectedConditions.visibilityOfElementLocated(By.className("pay-description__text")));
                System.out.println("Элемент найден: " + payText.getText());
            } catch (TimeoutException e) {
                System.out.println("Элемент не найден в отведенное время.");
            }*/


    }
}


