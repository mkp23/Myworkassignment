package week2.day1;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;
import org.openqa.selenium.support.ui.Select;

public class EditLead {
	
	public static void main(String[] args) throws InterruptedException {
		ChromeOptions options =new ChromeOptions();
		options.addArguments("--remote-allow-origins=*");
		
		ChromeDriver driver =new ChromeDriver(options);
		driver.get("http://leaftaps.com/opentaps/control/login");
		driver.manage().window().maximize();
		driver.findElement(By.id("username")).sendKeys("DemoCSR");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		Thread.sleep(3000);
		driver.findElement(By.className("decorativeSubmit")).click();
		driver.findElement(By.partialLinkText("CRM")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.linkText("Create Lead")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Motorola");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("MANISH");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("PANDEY");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("manish");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("Media Team");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("Lucky to Work in Media Team");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("pandeym.349@gmail.com");
		//need to check video for more clarity
		WebElement state = driver.findElement(By.id("createLeadForm_generalStateProvinceGeoId"));
		Select stateid = new Select(state);
		stateid.selectByVisibleText("New York");
		Thread.sleep(3000);

		driver.findElement(By.name("submitButton")).click();
		driver.findElement(By.linkText("Edit")).click();
		driver.findElement(By.id("updateLeadForm_description")).clear();
		driver.findElement(By.id("updateLeadForm_importantNote")).sendKeys("All are good");
		driver.findElement(By.name("submitButton")).click();
		
		String sub = driver.getTitle();

		System.out.println(sub);

		Thread.sleep(3000);
		//Assignment 3(Duplicate)
		driver.findElement(By.linkText("Duplicate Lead")).click();
		
		WebElement compname = driver.findElement(By.id("createLeadForm_companyName"));
		compname.clear();
		compname.sendKeys("Testleaf");

		WebElement firstname = driver.findElement(By.id("createLeadForm_firstName"));
		firstname.clear();
		firstname.sendKeys("Nishant");
		
		Thread.sleep(3000);

		driver.findElement(By.name("submitButton")).click();

		System.out.println("MANISH");

		Thread.sleep(3000);

		driver.close();
	

	}

}
