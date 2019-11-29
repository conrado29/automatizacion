package ejemplo;

import static org.junit.Assert.assertEquals;

import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class entradas {

	private WebDriver driver;
	
	@Before
	public void setUp() {
		System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");

		driver = new ChromeDriver();

		driver.manage().window().maximize();
		driver.get("https://www.choucairtesting.com/");	
		/* en esta seccion se crea el objeto driver se maximisa la ventana y se da el url que se desea accesar
		 * son los procesos que debes hacer antes de iniciar el test */
	}
	
	@Test
	public void testPage() {
		
	test();
		
		/* en esta seccion se hace todo lo que seria el proceso de prueba */
		
	}
	
	public void test() {
		for (int i=0;i<100;i++) {/* colocar cantidad de veces que quieras ejecutarlo */
			driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
			/* primero veo el titulo de la paguina principal y comparo si es el correcto */
			assertEquals("Choucair Testing",driver.getTitle());
			
			/* se da click en el link de servicio */
			WebElement Link = driver.findElement(By.linkText("Servicios"));
			Link.click();
			driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);
			/* primero veo el titulo de la seccion de servicios y comparo si es el correcto */
			assertEquals("Servicios – Choucair Testing",driver.getTitle());
			
				driver.navigate().to("https://www.choucairtesting.com/");
				driver.manage().timeouts().implicitlyWait(05, TimeUnit.SECONDS);
				
			}
	}
	

	@After
	public void tearDown() {
		driver.quit();
	}
	
	
	
	
}

