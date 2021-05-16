package week5day1assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class Createleads extends BaseLeads {
    @Test
	public void createleads() {
    	driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Aspire Systems");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("JK");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("VAN");

		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("ASE");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("vmathi@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("04434553");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("Chennai");

		driver.findElement(By.className("smallSubmit")).click();
    	

	}

}
