package automation;

import org.openqa.selenium.chrome.ChromeDriver;

public class Github {

	public static void main(String[] args) throws InterruptedException {
		
		System.setProperty("webdriver.chrome.driver", "chromedriver.exe");
		
		ChromeDriver driver = new ChromeDriver();
		
		driver.manage().window().maximize();
		
		driver.get("https://github.com/");
		
		driver.findElementByXPath("//a[@href='/login']").click();
		Thread.sleep(5000);
		
		//enter your email in send keys

		driver.findElementByXPath("//input[@id='login_field']").sendKeys("ans2sqb@gmail.com"); 

		Thread.sleep(5000);
		
		//enter your password 
		driver.findElementByXPath("//input[@id='password']").sendKeys("password");
		
		driver.findElementByXPath("//input[@value='Sign in']").click();

	}

}
