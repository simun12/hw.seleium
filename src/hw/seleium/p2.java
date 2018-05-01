package hw.seleium;

import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.safari.SafariDriver;

public class p2 {

	public static void main(String[] args) {
		WebDriver driver= new SafariDriver();
		driver.get("htpps:www.facebook.com");
	}

}
