package week3.day3;

import org.openqa.selenium.By;
import org.openqa.selenium.chrome.ChromeDriver;

public class LearnSelenium {
	public static void main(String[] args) {
		
		ChromeDriver driver=new ChromeDriver();
		driver.get("http://leaftaps.com/opentaps/control/main");
		driver.manage().window().maximize();
		
		driver.findElement(By.id("username")).sendKeys("Demosalesmanager");
		driver.findElement(By.id("password")).sendKeys("crmsfa");
		driver.findElement(By.className("decorativeSubmit")).click();
		String text = driver.findElement(By.tagName("h2")).getText();
		System.out.println(text);
		driver.findElement(By.linkText("CRM/SFA")).click();
		driver.findElement(By.linkText("Leads")).click();
		driver.findElement(By.partialLinkText("Create")).click();
		driver.findElement(By.id("createLeadForm_companyName")).sendKeys("Testleaf");
		driver.findElement(By.id("createLeadForm_firstName")).sendKeys("maddy");
		driver.findElement(By.id("createLeadForm_firstNameLocal")).sendKeys("madhavan");
		driver.findElement(By.id("createLeadForm_personalTitle")).sendKeys("mr");
		driver.findElement(By.id("createLeadForm_generalProfTitle")).sendKeys("Project");
		driver.findElement(By.id("createLeadForm_annualRevenue")).sendKeys("3.5LPA");
		driver.findElement(By.id("createLeadForm_sicCode")).sendKeys("55335");
		driver.findElement(By.id("createLeadForm_description")).sendKeys("This is testleaf organisation");
		driver.findElement(By.id("createLeadForm_importantNote")).sendKeys("best organisation");
		driver.findElement(By.id("createLeadForm_parentPartyId")).sendKeys("babu");
		driver.findElement(By.id("createLeadForm_lastName")).sendKeys("V");
		driver.findElement(By.id("createLeadForm_lastNameLocal")).sendKeys("V");
		driver.findElement(By.id("createLeadForm_birthDate")).sendKeys("02-04-2001");
		driver.findElement(By.id("createLeadForm_departmentName")).sendKeys("testing");
		driver.findElement(By.id("createLeadForm_numberEmployees")).sendKeys("15");
		driver.findElement(By.id("createLeadForm_tickerSymbol")).sendKeys("T");
		driver.findElement(By.id("createLeadForm_primaryPhoneCountryCode")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryPhoneAreaCode")).sendKeys("431");
		driver.findElement(By.id("createLeadForm_primaryPhoneExtension")).sendKeys("91");
		driver.findElement(By.id("createLeadForm_primaryEmail")).sendKeys("madhavan2401@gmail.com");
		driver.findElement(By.id("createLeadForm_primaryPhoneNumber")).sendKeys("6379466330");
		driver.findElement(By.id("createLeadForm_primaryPhoneAskForName")).sendKeys("maddy");
		driver.findElement(By.id("createLeadForm_primaryWebUrl")).sendKeys("http://leaftaps.com/opentaps/control/main");
		driver.findElement(By.id("createLeadForm_generalToName")).sendKeys("aravind");
		driver.findElement(By.id("createLeadForm_generalAttnName")).sendKeys("hari");
		driver.findElement(By.name("generalAddress1")).sendKeys("119,Big Street");
		driver.findElement(By.name("generalAddress2")).sendKeys("Ammoor");
		driver.findElement(By.id("createLeadForm_generalCity")).sendKeys("Ranipet");
		driver.findElement(By.id("createLeadForm_generalPostalCode")).sendKeys("632501");
		driver.findElement(By.id("createLeadForm_generalPostalCodeExt")).sendKeys("632401");
		//driver.findElement(By.name("submitButton")).click();
		
	
		
		
		
	}

}
