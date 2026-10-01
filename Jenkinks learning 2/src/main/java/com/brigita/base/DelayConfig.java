package com.brigita.base;

import java.time.Duration;
import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.testng.Assert;

import com.brigita.selenium.common.TestReporter;



public class DelayConfig extends BaseTest {


        By Tabledata = By.xpath("//table[@id='alternative_pagination_table_v1']/tbody/tr");


        public  void lunchmodule(String expectedURL){


                TestReporter.log("Test Start: Verify Delay Config Module Lunch");
                try {
                        TestReporter.log("Lunching The Delay Config Module");
                        driver.get(expectedURL);
                        String actualURl = driver.getCurrentUrl();
                        Assert.assertEquals(actualURl, expectedURL, "Delay Config Module Lunch Failed");

                        WebDriverWait wait = new WebDriverWait(driver, Duration.ofSeconds(10));
                        wait.until(ExpectedConditions.visibilityOfElementLocated(Tabledata));
                        List<WebElement> tableRows = createWebElements(Tabledata);

                        TestReporter.log("Validating Table Data");
                        Assert.assertFalse(tableRows.isEmpty(), "Table Data is Empty");

                        TestReporter.log("Table Data Found. Total Rows: " + tableRows.size());

                } catch (Exception e) {
                        TestReporter.log("Error while launching Delay Config Module: "+ e.getMessage()
        );

        Assert.fail("An error occurred while launching Delay Config Module",e);
                } finally {
                        TestReporter.log("Test End: Delay Config Module Lunched Successfully");
                }
        }




}