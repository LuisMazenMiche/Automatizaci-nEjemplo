package com.qualitystream.tutorial;


import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;

public class PG1 {
	public static void main(String[] args) {
        // declaration and instantiation of objects/variables
    	//System.setProperty("webdriver.firefox.marionette","C:\\geckodriver.exe");
		//WebDriver driver = new FirefoxDriver();
		//comment the above 2 lines and uncomment below 2 lines to use Chrome
		
		String URLBase = "http://demo.guru99.com/test/newtours/";
		System.setProperty("webdriver.chrome.driver", "src/test/resources/chromedriver/chromedriver"); //ubicación del driver 
		WebDriver driver = new ChromeDriver();
		driver.get(URLBase);
        
		 WebElement usuario = driver.findElement(By.id(""));
		 WebElement password = driver.findElement(By.id(""));
		 usuario.sendKeys("luis.sanchez@michelada.io");
		 password.sendKeys("123456");
		 
		 
		 //radio botton is selected
		 
		 WebElement radio1 =  driver.findElement(By.id("vfb-7-1"));
		 
		 radio1.click();
		 
		 
		 usuario.submit();
		 
		 driver.quit();
		}
		    
    }

	/*
	 * //seleccionar links en paginas
		String theLinkText = driver.findElement(By
				.partialLinkText("EGIS"))
				.getText();
		System.out.println(theLinkText);
		 theLinkText = driver.findElement(By					
                .partialLinkText("egis"))			
                .getText();		
        System.out.println(theLinkText);
        
        driver.findElement(By.partialLinkText("Inside")).click();					
        System.out.println(driver.getTitle());					
        driver.navigate().back();
	 */

	/*import org.openqa.selenium.support.ui.Select;
	 * //Puedes selecionar multiples opciones si te deja el select
		Select drpCountry =  new Select(driver.findElement(By.name("country")));
		drpCountry.selectByVisibleText("ANTARTICA");
		  drpCountry.deselectByIndex(1);
				driver.close();	
				
				//selectByValue()
				if (drpCountry.isMultiple() ){
					//do something 
				}
	 */
	/*
	 * imagenes on Link? investigvar bien el selector 
	 * //click on the "Facebook" logo on the upper left portion		

		WebElement image = driver.findElement(By.cssSelector("a[title=\"Go to Facebook home\"]"));
		image.click();
		//verify that we are now back on Facebook's homepage		
		if (driver.getTitle().equals("Facebook - log in or sign up")) {							
            System.out.println("We are back at Facebook's homepage");					
        } else {			
            System.out.println("We are NOT in Facebook's homepage");					
        }
	 */

	/*
	 * Radioboton y checkbox
	 * 
		WebElement radioBotton1 = driver.findElement(By.id("vfb-7-1"));
		radioBotton1.click();

		WebElement checkBox1 = driver.findElement(By.id("vfb-6-2"));		
		for (int contador = 0; contador< 2 ; contador++ ) {
			checkBox1.click();
			System.out.println(radioBotton1.isSelected());
			}
			driver.quit();
	 */
	/*
	 * Submitting forms
	 * WebElement email = driver.findElement(By.name("user[email]"));
		email.clear();
		email.sendKeys("");
		email.submit();		
	 */
	/*
	 * Buscar en una pagina de guru 99 trae el número de radiobotons y despues imprime cada uno de sus nombres
	 * driver.manage().window().maximize();

		driver.get("http://demo.guru99.com/test/ajax.html");
		
		 List<WebElement> elements = driver.findElements(By.name("name"));
		    System.out.println("Number of elements:" +elements.size());

		    for (int i=0; i<elements.size();i++){
		      System.out.println("Radio button text:" + elements.get(i).getAttribute("id"));
	 */
	
	/*
	 * String baseUrl = "http://demo.guru99.com/test/newtours/";
        String expectedTitle = "Welcome: Mercury Tours";
        String actualTitle = "";

        // launch Fire fox and direct it to the Base URL
        driver.get(baseUrl);

        // get the actual value of the title
        actualTitle = driver.getTitle();

        
         * compare the actual title of the page with the expected one and print
         * the result as "Passed" or "Failed"
         
        if (actualTitle.contentEquals(expectedTitle)){
            System.out.println("Test Passed!");
        } else {
            System.out.println("Test Failed");
        }
        
        //Buscar un elemento de la pagina
        WebElement loginLink = driver.findElement(By.linkText("Login"));
        WebElement loginLink2 =  driver.findElement(By.id("e"));
       *
	 */

	/* 
	 * Listas!
	 * WebElement elementName = driver.findElement(By.LocatorStrategy("LocatorValue"));

		List<WebElement> elementName = driver.findElements(By.LocatorStrategy("LocatorValue"));
	 */

