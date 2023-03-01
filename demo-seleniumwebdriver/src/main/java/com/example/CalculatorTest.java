package com.example;
// import org.openqa.selenium.By;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;

public class CalculatorTest {
    public static void main(String[] args) {

        // Cấu hình đường dẫn tới file Chorme driver, dk td chorme
        System.setProperty("webdriver.chrome.driver", "D:\\chromedriver_win32\\chromedriver.exe");
        //Tạo đối tượng webdriver dk td chorme
        WebDriver driver = new EdgeDriver();
        
        // truy cập  đến trang web
        driver.get("https://www.calculator.net/");
        
        
        // Nhập số 1 vào ô nhập liệu
        WebElement button2 = driver.findElement(By.id("two"));
        button2.click();

        
        // Chọn toán tử cộng
        WebElement plusButton = driver.findElement(By.id("plus"));
        plusButton.click();

        
        // Nhập số 1 vào ô nhập liệu
        button2.click();
        // Click nút tính toán
        WebElement equalsButton = driver.findElement(By.id("scinm"));
        equalsButton.click();

        
        // Lấy kết quả

         WebElement result = driver.findElement(By.id("sciOutPut"));
        String actualResult = result.getText().trim();
        String expectedResult = "4";

        
        // So sánh kết quả
        if (actualResult.equals(expectedResult)) {
            System.out.println("Test case passed!");
        } else {
            System.out.println("Test case failed!");
        }

        
      
        // Đóng trình duyệt
        driver.quit();
    }

}

