package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class ExampleTestCase {

    private WebDriver driver;

    @Before
    public void setUp() {
        System.setProperty("webdriver.chrome.driver", "/path/to/chromedriver");
        driver = new EdgeDriver();
        driver.get("http://www.example.com");
    }

    @Test
    public void testExample() {
        WebElement heading = driver.findElement(By.tagName("h1"));
        String actualHeading = heading.getText();
        String expectedHeading = "Example Domain";
        assertEquals(expectedHeading, actualHeading);

        WebElement firstLink = driver.findElement(By.tagName("a"));
        firstLink.click();
    }

    @After
    public void tearDown() {
        //driver.quit();
    }
}

