package com.example;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.edge.EdgeDriver;

public class Demogoogle {

    @Test
    public void testSearch() {
        // Cấu hình đường dẫn tới file Chorme driver, dk td chorme
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");

        // Tạo đối tượng webdriver dk td chorme
        WebDriver driver = new EdgeDriver();

        // lấy url chỉ định và đẩy trình duyệt tới trang web
        driver.get("https://www.google.com");
        
        // tìm phần tử ô tìm kiếm
       WebElement searchBox = driver.findElement(By.name("q"));

        // sử dụng phương thức sendkey đê nhập văn bản cần tìm
       searchBox.sendKeys("Selenium WebDriver");

        // gửi yêu cầu tìm kiếm bởi sử dụng hàm submit của ô tìm kiếm
        searchBox.submit();
        WebElement firstLink = driver.findElement(By.tagName("h3"));
        firstLink.click();
        // Tìm element có id là search để để bít kết quả là bao nhiêu
        //WebElement searchResults = driver.findElement(By.id("search"));

        // In ra só lượng kết quả tìm được
        //System.out.println("Number of search results: " + searchResults.findElements(By.tagName("h3")).size());
         // gán một văn ban liên kết để mở link
         
        // thoát trình duyệt
        //driver.quit();
    }
    
}
