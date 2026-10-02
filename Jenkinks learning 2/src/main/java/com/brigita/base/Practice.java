package com.brigita.base;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

public class Practice extends BaseTest {

    @Test
    public void practice() {

        WebElement search = driver.findElement(
                By.xpath("//input[@placeholder='Search Amazon.in']")
        );

        search.sendKeys("Iphone");

        List<WebElement> autosuggestions = driver.findElements(
                By.xpath("//div[@class='two-pane-results-container']/div/div")
        );

        for (WebElement name : autosuggestions) {
            System.out.println(name.getText());
        }



        for (int i = 0; i< autosuggestions.size(); i++){
          WebElement  suggestions =  autosuggestions.get(i);
        }
    }
}