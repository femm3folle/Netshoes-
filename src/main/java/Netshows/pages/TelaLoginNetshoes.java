package Netshows.pages;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;

public class TelaLoginNetshoes {
	//private static WebDriverWait espera;
	private WebDriver driver;

	public TelaLoginNetshoes(WebDriver driver) {
		this.driver = driver;
		//espera = new WebDriverWait(driver, 21);
	}

	public TelaInicio loginNetshoes() {
		WebElement lnkCheck;

		WebElement txtNome = driver.findElement(By.id("username"));
		txtNome.sendKeys("22889474895");
		WebElement txtPw = driver.findElement(By.id("password"));
		txtPw.sendKeys("rsi123456");
		lnkCheck = driver.findElement(By.id("login-button"));
		lnkCheck.click();
		return new TelaInicio(driver);
	}
}
