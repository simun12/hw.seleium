package hw.seleium;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.safari.SafariDriver;


public class part2 {

	public static void main(String[] args) {
		
		WebDriver driver=new SafariDriver();
		driver.get("http:yahoo.com");
		driver.findElement(By.xpath("//a[@id='mega-bottombar-mail']")).click();
		driver.findElement(By.xpath("//*[@tabindex='1']")).sendKeys("samin");
		driver.findElement(By.xpath("//*[@value='Next']")).click();

	}

}
