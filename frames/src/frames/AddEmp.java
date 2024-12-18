package frames;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.firefox.FirefoxDriver;

public class AddEmp {

	public static void main(String[] args) throws InterruptedException{
		WebDriver driver=new FirefoxDriver();
		driver.navigate().to("http://183.82.125.5/nareshit/login.php");
		driver.findElement(By.xpath("//input[@type='text']")).sendKeys("suresh");
		driver.findElement(By.xpath("//input[@type='password']")).sendKeys("suresh123");
		driver.findElement(By.xpath("//input[@type='Submit']")).click();
		Thread.sleep(5000);
		driver.switchTo().frame("rightMenu");
		driver.findElement(By.xpath("//*[@id='standardView']/div[3]/div[1]/input[1]")).click();
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@id='txtEmpLastName']")).sendKeys("suresh");
		Thread.sleep(2000);
		driver.findElement(By.xpath("//*[@name='txtEmpFirstName']")).sendKeys("selenium");
		driver.findElement(By.xpath("//*[@id='btnEdit']")).click();
		Thread.sleep(2000);
		System.out.println("New Employee Added");
		driver.switchTo().defaultContent();
		driver.findElement(By.xpath("//*[@id='option-menu']/li[3]/a")).click();
		driver.close();
	}
}
