package com.general;

import org.apache.logging.log4j.Logger;
import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;

public class BasicFunctions {
	
	private String strBrowser, strUrl;
	public WebDriver driver;
	public WebDriverWait wait;
	Logging logging = new Logging();
	Logger log = logging.initLogger(this.getClass().getName());
	
	public BasicFunctions() {
		ConfigParams cp = new ConfigParams();
		String[] params = cp.setDefaultValues();
		strBrowser = params[0];
		strUrl = params[1];
	}
	
	
	public boolean openBroswer() {
		switch(strBrowser.toUpperCase()) {
			case "CHROME": 
				//System.out.println("--> BasicFunctions --> Open Chrome"); 
				log.info("Open Chrome");
				driver = new ChromeDriver();
				break;
			case "IE": 
				//System.out.println("--> BasicFunctions --> Open IE"); 
				log.info("Open IE");
				driver = new InternetExplorerDriver();
				return true;
			case "FIREFOX": 
			case "MOZILLA":	
				//System.out.println("--> BasicFunctions --> Open FireFox"); 
				log.info("Open FireFox");
				driver = new FirefoxDriver();
				break;
			case "EDGE":
				//System.out.println("--> BasicFunctions --> Open Edge");
				log.info("Open Edge");
				driver = new EdgeDriver();
				break;
			default: //System.out.println("Browser is either invalid or not specified");
					 log.error("Browser is either invalid or not specified");
			return false;
		}
		
		//System.out.println("--> BasicFunctions --> Maximize Window");
		log.info("Maximize Window");
		driver.manage().window().maximize();
		
		return true;
	}
	
	public boolean openBroswer(String strBrowser) {
		switch(strBrowser.toUpperCase()) {
			case "CHROME": 
				//System.out.println("--> BasicFunctions --> Open Chrome"); 
				log.info("Open Chrome");
				driver = new ChromeDriver();
				break;
			case "IE": 
				//System.out.println("--> BasicFunctions --> Open IE"); 
				log.info("Open IE");
				driver = new InternetExplorerDriver();
				return true;
			case "FIREFOX": 
			case "MOZILLA":	
				//System.out.println("--> BasicFunctions --> Open FireFox"); 
				log.info("Open FireFox");
				driver = new FirefoxDriver();
				break;
			case "EDGE":
				//System.out.println("--> BasicFunctions --> Open Edge");
				log.info("Open Edge");
				driver = new EdgeDriver();
				break;
			default: //System.out.println("Browser is either invalid or not specified");
					 log.error("Browser is either invalid or not specified");
			return false;
			}
		
		//System.out.println("--> BasicFunctions --> Maximize Window");
		log.info("Maximize Window");
		driver.manage().window().maximize();
		
		return true;
	}
	
	public void navigateTo() {
		//System.out.println("--> BasicFunctions --> Navigate to " + strUrl);
		log.info("Navigate to " + strUrl);
		driver.get(strUrl);
	}
	
	public void navigateTo(String strUrl) {
		//System.out.println("--> BasicFunctions --> Navigate to " + strUrl);
		log.info("Navigate to " + strUrl);
		driver.get(strUrl);
	}
	
	public boolean navigateAndWait(By objBy) {
		//System.out.println("--> BasicFunctions --> Navigate to " + strUrl);
		log.info("Navigate to " + strUrl);
		driver.get(strUrl);
		//System.out.println("--> BasicFunctions --> Wait for element " + strID + "to be visible");
		
		setTimeOut();
		
		try {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(objBy)));
		}catch(Exception e){
			//System.out.println(e);
			log.error(e);
			return false;
		}
		
		return true;
		
		/*switch (strBy.toUpperCase()) {
		case "ID": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(strID)))); break;
		case "CLASS": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(strID)))); break;
		case "LINK": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(strID)))); break;
		case "NAME": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(strID)))); break;
		case "TAG": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName(strID)))); break;
		case "XPATH": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(strID)))); break;
		case "CSS": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(strID)))); break;
		}*/
		
	}
	
	public boolean navigateAndWait(By objBy, int timeOutInSeconds) {
		//System.out.println("--> BasicFunctions --> Navigate to " + strUrl);
		log.info("Navigate to " + strUrl);
		driver.get(strUrl);
		//System.out.println("--> BasicFunctions --> Wait for element " + strID + "to be visible");
		
		setTimeOut(timeOutInSeconds);
		
		try {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(objBy)));
		}catch(Exception e){
			//System.out.println(e);
			log.error(e);
			return false;
		}
		
		return true;
		
		/*switch (strBy.toUpperCase()) {
		case "ID": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.id(strID)))); break;
		case "CLASS": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.className(strID)))); break;
		case "LINK": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.linkText(strID)))); break;
		case "NAME": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.name(strID)))); break;
		case "TAG": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.tagName(strID)))); break;
		case "XPATH": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.xpath(strID)))); break;
		case "CSS": 
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(By.cssSelector(strID)))); break;
		}*/
		
	}
	
	public void closeBroswer() {
		//System.out.println("--> BasicFunctions --> Close Broswer");
		log.info("Close Broswer");
		driver.quit();
	}
	
	public void closeBroswer(WebDriver driver) {
		//System.out.println("--> BasicFunctions --> Close Broswer");
		log.info("Close Broswer");
		driver.quit();
	}
	
	public void refresh() {
		driver.navigate().refresh();
	}
	
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	
	
	public void setTimeOut() {
		wait = new WebDriverWait(driver, 10);
	}
	
	public void setTimeOut(int timeOutInSeconds) {
		try {
			wait = new WebDriverWait(driver, timeOutInSeconds);
		}catch(NumberFormatException nfe) {
			System.out.println("Unable to set timeout due to " + nfe);
			log.error("Unable to set timeout due to " + nfe);
		}catch(Exception e) {
			System.out.println("Unable to set timeout due to " + e);
			log.error("Unable to set timeout due to " + e);
		}
	}
	
	public boolean verifyPresenceAndVisibility(By objBy) {
		//System.out.println("--> BasicFunctions --> Wait for element");
		log.info("Wait for element");
		///System.out.println("--> BasicFunctions --> Wait for element " + strID + "to be visible");
		
		setTimeOut();
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(objBy));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(objBy)));
		}catch(Exception e){
			//System.out.println(e);
			log.error(e);
			return false;
		}
		
		return true;
	}
	
	public boolean verifyPresenceAndVisibility(By objBy, int timeOutInSeconds) {
		//System.out.println("--> BasicFunctions --> Wait for element");
		log.info("Wait for element");
		///System.out.println("--> BasicFunctions --> Wait for element " + strID + "to be visible");
		
		setTimeOut(timeOutInSeconds);
		
		try {
			wait.until(ExpectedConditions.presenceOfElementLocated(objBy));
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(objBy)));
		}catch(Exception e){
			//System.out.println(e);
			log.error(e);
			return false;
		}
		
		return true;
	}
	
	public boolean verifyVisibility(By objBy) {
		//System.out.println("--> BasicFunctions --> Wait for element");
		log.info("Wait for element");
		///System.out.println("--> BasicFunctions --> Wait for element " + strID + "to be visible");
		
		setTimeOut();
		
		try {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(objBy)));
		}catch(Exception e){
			//System.out.println(e);
			log.error(e);
			return false;
		}
		
		return true;
	}
	
	public boolean verifyVisibility(By objBy, int timeOutInSeconds) {
		//System.out.println("--> BasicFunctions --> Wait for element");
		log.info("Wait for element");
		///System.out.println("--> BasicFunctions --> Wait for element " + strID + "to be visible");
		
		setTimeOut(timeOutInSeconds);
		
		try {
			wait.until(ExpectedConditions.visibilityOf(driver.findElement(objBy)));
		}catch(Exception e){
			//System.out.println(e);
			log.error(e);
			return false;
		}
		
		return true;
	}
	
	public void setBrowser(String browser) {
		this.strBrowser = browser;
	}
	
	public String getBrowser() {
		return this.strBrowser;
	}
	
	public void setUrl(String url) {
		this.strUrl = url;
	}
	
	public String getUrl() {
		return this.strUrl;
	}
}
