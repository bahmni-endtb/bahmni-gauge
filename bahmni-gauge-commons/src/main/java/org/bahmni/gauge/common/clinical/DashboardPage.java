package org.bahmni.gauge.common.clinical;

import org.bahmni.gauge.common.BahmniPage;
import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.How;

import java.util.List;

public class DashboardPage extends BahmniPage {

	@FindBy(how= How.CSS, using = ".btn--success")
    public WebElement clinical;

	@FindBy(how = How.CSS, using = ".dashboard")
	public List<WebElement> dashboards;

	@FindBy(how = How.CSS, using = ".patient-dashboard")
	public WebElement dashboardSections;
	
	@FindBy(how= How.CSS, using = ".bacteriology-dashboard")
    public WebElement bacteriology_results;

	public void selectDashboard(String name) {
		for (WebElement dashboard : dashboards) {
			WebElement dashboardLink = dashboard.findElement(By.tagName("a"));
			if (dashboardLink != null && dashboardLink.getText().equals(name)) {
				dashboardLink.click();
			}
		}
	}

	public WebElement findElementById(String id) {
		return dashboardSections.findElement(By.id(id));
	}
}
