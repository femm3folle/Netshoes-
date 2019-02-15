package Netshows.pages;

//import org.junit.After;
//import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class TelaInicio {
	private static WebDriver driver;
	private static WebDriverWait espera;
     
	
	public TelaInicio(WebDriver driver) {
		TelaInicio.driver =driver;
		espera = new WebDriverWait(driver, 21);
	}

	public void loginNetshoes() {
		WebElement lnkCheck;

		driver = null;
		WebElement txtNome = driver.findElement(By.id("username"));
		txtNome.sendKeys("22889474895");
		WebElement txtPw = driver.findElement(By.id("password"));
		txtPw.sendKeys("rsi123456");
		lnkCheck = driver.findElement(By.id("login-button"));
		lnkCheck.click();
	}

	public void sairNetshoes() {
		WebElement lnkIrineu;
		WebElement lnkExit;
		lnkIrineu = espera.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Olá")));
		// lnkIrineu = driver.findElement(By.linkText("#header-user-logged"));
		lnkIrineu.click();
		lnkExit = driver.findElement(By.linkText("Sair"));
		lnkExit.click();
	}
     
	public boolean validaExit() {
		WebElement lnkEntrarValidacao;

		lnkEntrarValidacao = espera.until(ExpectedConditions.presenceOfElementLocated((By.partialLinkText("Entrar"))));
		return lnkEntrarValidacao.isEnabled();
	}

}
