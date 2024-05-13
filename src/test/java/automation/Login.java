package automation;

import io.github.bonigarcia.wdm.WebDriverManager;

import java.time.Duration;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.support.ui.Select;

public class Login {

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
		
		
		WebDriverManager.firefoxdriver().setup();
		WebDriver driver = new FirefoxDriver();
		
		driver.get("https://trytestingthis.netlify.app/");
		driver.manage().window().maximize();
		
		//First Name
		driver.findElement(By.id("fname")).sendKeys("Maliha");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		//Last Name
		driver.findElement(By.id("lname")).sendKeys("Mehjabin"); 
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		//Radio Button
		WebElement radiobutton = driver.findElement(By.id("female")); 
		radiobutton.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		//DropDown
		WebElement testdropdown = driver.findElement(By.id("option")); 
		Select dropdown = new Select(testdropdown);
		dropdown.selectByIndex(3);
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		//Check Box
		WebElement testcheckbox1 = driver.findElement(By.name("option1"));
		testcheckbox1.click();
		
		WebElement testcheckbox2 = driver.findElement(By.name("option3"));
		testcheckbox2.click();
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
		
		
		//Select File
        WebElement chooseFile = driver.findElement(By.id("myfile"));
		chooseFile.sendKeys("C:\\Users\\USER\\Documents\\Slenium4\\download.jpeg");
		driver.manage().timeouts().implicitlyWait(Duration.ofSeconds(3));
	
		//Submit
		driver.findElement(By.className("btn-success")).click();	
		
		driver.quit();
	}

}
