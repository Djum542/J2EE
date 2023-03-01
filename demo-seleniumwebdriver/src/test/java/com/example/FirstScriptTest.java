package com.example;

import static org.junit.jupiter.api.Assertions.assertEquals;

import java.time.Duration;

import org.junit.jupiter.api.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebDriverInfo;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
// import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.edge.EdgeDriverInfo;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class FirstScriptTest {

    @Test
    public void eightComponents() {
        // Bắt đầu phiên trình điều khiển
        WebDriver driver = new EdgeDriver();
        // Thực hiện hành động trên trình duyệt ở đây ta đặt một đia chỉ trang web
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        // Yêu cầu thông tin trình duyệt
        String title = driver.getTitle();
        assertEquals("Web form", title);
        // Thiết lập chiến lược chờ đợi
        driver.manage().timeouts().implicitlyWait(Duration.ofMillis(20));
        // Tìm một phần tử
        WebElement textBox = driver.findElement(By.name("my-text"));
        WebElement submitButton = driver.findElement(By.cssSelector("button"));
        WebElement pass = driver.findElement(By.name("my-password"));
        WebElement area = driver.findElement(By.name("my-textarea"));
    //    WebElement com = driver.findElement(By.name("my-select"));
        // Thực hiện hành động trên phần tử.
        textBox.sendKeys("Selenium");
        pass.sendKeys("54873");
        area.sendKeys("Bạn có thể nói về bản thân minh không");
        // com.click();
        //submitButton.click();
        
        
        //WebElement message = driver.findElement(By.id("message"));
        // Yêu cầu thông tin phần tử
        //String value = message.getText();
        //assertEquals("Received!", value);
        // kết thúc phiên
        //driver.quit();
    }

    @Test
    void testOption() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        // chọn nhiều giá trị trong combobox
        // select the multiple values from a dropdown
        Select selectByValue = new Select(driver.findElement(By.name("my-select")));
        selectByValue.selectByValue("3");
        //selectByValue.selectByVisibleText("3");
        //selectByValue.selectByIndex(2);
    }

    @Test
    void testColor() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        // chọn màu sắc
        WebElement mau = driver.findElement(By.name("my-colors"));
        mau.sendKeys("#F6EFEF");
        // mau.sendKeys(Keys.RIGHT);  
    }

    @Test
    void testCaculater() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement cacul = driver.findElement(By.name("my-date"));
        cacul.sendKeys("03/28/2023");
    }

    @Test
    void testCheck() {
        WebDriver driver = new EdgeDriver();
        driver = new FirefoxDriver();
        driver = new ChromeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
       WebElement bycheck = driver.findElement(By.name("my-check"));
        bycheck.click();
        bycheck = driver.findElement(By.id("my-radio-2"));
        bycheck.click();
    }

    @Test
    void testLoadfile() {
    WebDriver driver = new EdgeDriver();   
    driver.get("https://www.selenium.dev/selenium/web/web-form.html");
    WebElement load = driver.findElement(By.xpath("//input[@type='file']"));
    // nhập đường dẫn của tệp vào phần đầu vào
    String filePath = "C:/Users/Djum5/Pictures/sharedata/selenium.png";
    load.sendKeys(filePath);

    // // định vị nút Tải lên và nhấp vào để hoàn thành tải lên
    // WebElement uploadButton = driver.findElement(By.xpath("//input[@type='submit']"));
    // uploadButton.click();
    }

    @Test
    void testHyperlink() {
        WebDriver driver = new EdgeDriver();
        driver.get("https://www.selenium.dev/selenium/web/web-form.html");
        WebElement hyperlink = driver.findElement(By.linkText("Return to index"));
        //hyperlink.click();
    }
    

}

