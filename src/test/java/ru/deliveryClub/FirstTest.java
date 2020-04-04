package ru.deliveryClub;

import org.junit.After;
import org.junit.Assert;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.chrome.ChromeDriver;

public class FirstTest {

    public ChromeDriver driver;
    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "d://Users//user//Downloads//chromedriver.exe");
        driver = new ChromeDriver();
        System.out.println("Test start");
    }

    @Test
    public void firstTest() {

        driver.get("https://www.delivery-club.ru/nn");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Доставка еды из ресторанов Нижнего Новгорода от 45 минут! Delivery Club"));
    }

    @Test
    public void firstTest2() {

        driver.get("https://www.delivery-club.ru/nn");

        String title = driver.getTitle();
        Assert.assertTrue(title.equals("Доставка еды из ресторанов Нижнего Новгорода от 45 минут! Delivery Club"));
    }

    @After
    public void Close() {
        System.out.println("Test close");
        driver.quit();
    }
}
