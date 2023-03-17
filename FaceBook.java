package week2.day2;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FaceBook {

	
		public static void main(String[] args) throws InterruptedException {
			
			ChromeOptions options =new ChromeOptions();
			options.addArguments("--remote-allow-origins=*");
			ChromeDriver driver = new ChromeDriver(options);
			
			driver.get("https://en-gb.facebook.com/");
			driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		 driver.findElement(By.xpath("//a[text()='Create new account']")).click();
		 driver.findElement(By.xpath("//input[@name='firstname']")).sendKeys("Manish");
		 driver.findElement(By.xpath("//input[@name='lastname']")).sendKeys("Pandey");
		 driver.findElement(By.xpath("//input[@name='reg_email__']")).sendKeys("pandey@gmail.com");
		 driver.findElement(By.xpath("//input[@id='password_step_input']")).sendKeys("maniskp");
		  driver.findElement(By.xpath("//select[@id='day']")).sendKeys("20");
		  driver.findElement(By.xpath("//select[@id='month']")).sendKeys("Nov");
		  driver.findElement(By.xpath("//select[@id='year']")).sendKeys("1996");
		  driver.findElement(By.xpath("(//input[@name='sex'])[1]")).click();
		 

	}

}
