package week4.day2;

import java.io.File;
import java.io.IOException;
import java.time.Duration;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.chrome.ChromeOptions;

public class FlightTicketSnapshot {

	
	public static void main(String[] args) throws InterruptedException, IOException {
		ChromeOptions opt = new ChromeOptions();
		opt.addArguments("--disable-notifications");
		opt.addArguments("--remote-allow-origins=*");
		ChromeDriver driver = new ChromeDriver(opt);
		driver.get("https://www.irctc.co.in/nget/train-search");
		driver.manage().window().maximize();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(30));
		driver.findElement(By.xpath("(//label[text()='FLIGHTS'])[2]")).click();
		File source= driver.getScreenshotAs(OutputType.FILE);
		File destination = new File ("./sanps/flighttickets.png");
		FileUtils.copyFile(source ,destination);
		
		
}}
