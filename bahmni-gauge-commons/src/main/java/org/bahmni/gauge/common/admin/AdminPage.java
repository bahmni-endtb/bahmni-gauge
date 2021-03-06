package org.bahmni.gauge.common.admin;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

public class AdminPage extends BahmniPage {

    public static final String URL = BASE_URL.concat("/admin#/dashboard");

    @FindBy(how= How.CSS, using = ".button[href=\"#/ordersetdashboard\"] i")
    public WebElement orderSet;

    public void clickOrderSet(){
        orderSet.click();
    }

}
