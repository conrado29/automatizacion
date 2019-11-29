package ejemplo;



import java.util.Iterator;
import java.util.List;
import java.util.concurrent.TimeUnit;

import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class enlacestest {


		private WebDriver driver;
		
		@Before
		public void setUp() {
			System.setProperty("webdriver.chrome.driver","/usr/bin/chromedriver");

			driver = new ChromeDriver();

			driver.manage().window().maximize();
			driver.get("https://www.choucairtesting.com/servicio/");	
			/* en esta seccion se crea el objeto driver se maximisa la ventana y se da el url que se desea accesar
			 * son los procesos que debes hacer antes de iniciar el test */
		}
		
		@Test
		public void testPage() {
			
			
			 List <WebElement> elements = driver.findElements (By.className("elementor-image-box-wrapper"));
		   
		       driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);
		       elements.get(0).click();
		       driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);
		       elements.get(1).click();
		       driver.manage().timeouts().implicitlyWait(03, TimeUnit.SECONDS);
		       elements.get(2).click();
		       
		       
		       
		    
			
			
			
			/* en esta seccion se hace todo lo que seria el proceso de prueba */
			
		}
		

		@After
		public void tearDown() {
			driver.quit();
		}
		


}
