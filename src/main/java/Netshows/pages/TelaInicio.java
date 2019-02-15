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

	public TelaLoginNetshoes entrarNetshoes() {
		WebElement lnkEntrar;
		WebElement lnkLogin;
		lnkEntrar = driver.findElement(By.linkText("Entrar"));
		lnkEntrar.click();
		lnkLogin = driver.findElement(By.linkText("Login"));
		lnkLogin.click();
		return new TelaLoginNetshoes(driver);
	}



	public TelaInicio sairNetshoes() {
		WebElement lnkIrineu;
		WebElement lnkExit;
		lnkIrineu = espera.until(ExpectedConditions.elementToBeClickable(By.partialLinkText("Olá")));
		// lnkIrineu = driver.findElement(By.linkText("#header-user-logged"));
		lnkIrineu.click();
		lnkExit = driver.findElement(By.linkText("Sair"));
		lnkExit.click();
		return this;
	}
     
	public boolean validaExit() {
		WebElement lnkEntrarValidacao;

		lnkEntrarValidacao = espera.until(ExpectedConditions.presenceOfElementLocated((By.partialLinkText("Entrar"))));
		return lnkEntrarValidacao.isEnabled();
	}

}
