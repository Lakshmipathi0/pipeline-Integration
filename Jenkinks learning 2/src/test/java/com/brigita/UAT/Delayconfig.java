package com.brigita.UAT;

import org.testng.annotations.Test;

import com.brigita.base.DelayConfig;

public class Delayconfig extends DelayConfig {

@Test(priority = 1)
public void TC_001_Lunchthemodule(){
    lunchmodule("https://riderapp-admin.eateasy.ae/master/v3/overflow_delay_manageV1");

}
}
