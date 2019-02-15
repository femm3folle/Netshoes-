package Netshows.pages;

import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TelaLoginNetshoes {
	private static WebDriverWait espera;
	private WebDriver driver;

	public TelaLoginNetshoes(WebDriver driver) {
		this.driver =driver;
		espera = new WebDriverWait(driver, 21);
	}
	
	@Test 
	public void entrarNetshoes() {
		WebElement lnkEntrar;
		WebElement lnkLogin;
		lnkEntrar = driver.findElement(By.linkText("Entrar"));
		lnkEntrar.click();
		lnkLogin = driver.findElement(By.linkText("Login"));
		lnkLogin.click();
	}

}
