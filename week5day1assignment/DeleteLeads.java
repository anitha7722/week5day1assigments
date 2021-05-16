package week5day1assignment;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

public class DeleteLeads extends BaseLeads{
	@Test(enabled = false)
	public void deleteleads() throws InterruptedException {

		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//span[text()='Phone']")).click();
		driver.findElement(By.xpath("//input[@name='phoneNumber']")).sendKeys("04434553");
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		Thread.sleep(2000);
		String FirstLead = driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId'])[1]")).getText();
		System.out.println("First Lead ID" + FirstLead);
		Thread.sleep(1000);
		driver.findElement(By.xpath("(//div[@class='x-grid3-cell-inner x-grid3-col-partyId']//a)[1]")).click();
		Thread.sleep(1000);
		driver.findElement(By.xpath("//a[@class='subMenuButtonDangerous']")).click();
		driver.findElement(By.linkText("Find Leads")).click();
		driver.findElement(By.xpath("//input[@name='id']")).sendKeys(FirstLead);
		driver.findElement(By.xpath("//button[text()='Find Leads']")).click();
		boolean recordsDisplay1 = driver.findElement(By.xpath("//div[@class='x-paging-info']")).isDisplayed();

		if(!recordsDisplay1)
		{
			System.out.println("Not Verified");
		}
		{
			System.out.println("Verified");
		}
	}

}
