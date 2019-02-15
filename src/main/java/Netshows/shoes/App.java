package Netshows.shoes;

import static org.junit.Assert.assertTrue;

import org.junit.AfterClass;
import org.junit.BeforeClass;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

import Netshows.pages.TelaInicio;
import Netshows.pages.TelaLoginNetshoes;

public class App {
	private static WebDriver driver;
	private static WebDriverWait espera;

	@BeforeClass
	public static void setUp() {
		System.setProperty("webdriver.chrome.driver", System.getProperty("user.dir") + "\\driver\\chromedriver.exe");
		driver = new ChromeDriver();
		espera = new WebDriverWait(driver, 21);
		driver.get("https://www.netshoes.com.br");
	}

	public void entrarNetshoes() {
		WebElement lnkEntrar;
		WebElement lnkLogin;
		lnkEntrar = driver.findElement(By.linkText("Entrar"));
		lnkEntrar.click();
		lnkLogin = driver.findElement(By.linkText("Login"));
		lnkLogin.click();
	}

	public void loginNetshoes() {
		WebElement lnkCheck;

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

	@Test
	public void fazerLogin()

	{
		entrarNetshoes();
		loginNetshoes();
		sairNetshoes();
		assertTrue(validaExit());

	}
	
	@Test
	public void fazerLoginPageObject()

	{   
		TelaInicio telaInicio = new TelaInicio(driver);
		TelaLoginNetshoes telaLoginNetshoes = telaInicio.entrarNetshoes();
		telaLoginNetshoes.loginNetshoes();
	    telaInicio.sairNetshoes();
	    assertTrue(telaInicio.validaExit());
		
	}

	@AfterClass
	public static void tearDown()

	{
		// driver.close();
	}
}