package com.general;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.support.ui.ExpectedConditions;
import org.openqa.selenium.support.ui.WebDriverWait;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class BasicFunctions {
	
	private String strBrowser, strUrl;
	public WebDriver driver;
	public WebDriverWait wait;
	
	public BasicFunctions() {
		readConfigXML();
	}
	
	
	public boolean openBroswer() {
		switch(strBrowser.toUpperCase()) {
			case "CHROME": 
				System.out.println("--> BasicFunctions --> Open Chrome"); 
				driver = new ChromeDriver();
				break;
			case "IE": 
				System.out.println("--> BasicFunctions --> Open IE"); 
				driver = new InternetExplorerDriver();
				break;
			case "FIREFOX": 
			case "MOZILLA":	
				System.out.println("--> BasicFunctions --> Open FireFox"); 
				driver = new FirefoxDriver();
				break;
			default: System.out.println("Browser is either invalid or not specified");
			return false;
		}
		
		System.out.println("--> BasicFunctions --> Maximize Window");
		driver.manage().window().maximize();
		
		return true;
	}
	
	public boolean openBroswer(String strBrowser) {
		switch(strBrowser.toUpperCase()) {
			case "CHROME": 
				System.out.println("--> BasicFunctions --> Open Chrome"); 
				driver = new ChromeDriver();
				break;
			case "IE": 
				System.out.println("--> BasicFunctions --> Open IE"); 
				driver = new InternetExplorerDriver();
				break;
			case "FIREFOX": 
			case "MOZILLA":	
				System.out.println("--> BasicFunctions --> Open FireFox"); 
				driver = new FirefoxDriver();
				break;
			default: System.out.println("Browser is either invalid or not specified");
			return false;
		}
		
		System.out.println("--> BasicFunctions --> Maximize Window");
		driver.manage().window().maximize();
		
		return true;
	}
	
	public void navigateTo() {
		System.out.println("--> BasicFunctions --> Navigate to " + strUrl);
		driver.get(strUrl);
	}
	
	public void navigateTo(String strUrl) {
		System.out.println("--> BasicFunctions --> Navigate to " + strUrl);
		driver.get(strUrl);
	}
	
	public void navigateAndWait(String strBy, String strID) {
		System.out.println("--> BasicFunctions --> Navigate to " + strUrl);
		driver.get(strUrl);
		System.out.println("--> BasicFunctions --> Wait for element " + strID + "to be visible");
		
		setTimeOut();
		switch (strBy.toUpperCase()) {
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
		}
		
	}
	
	public void navigateAndWait(String strBy, String strID, int timeOutInSeconds) {
		System.out.println("--> BasicFunctions --> Navigate to " + strUrl);
		driver.get(strUrl);
		System.out.println("--> BasicFunctions --> Wait for element " + strID + "to be visible");
		
		setTimeOut(timeOutInSeconds);
		switch (strBy.toUpperCase()) {
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
		}
		
	}
	
	public void closeBroswer() {
		System.out.println("--> BasicFunctions --> Close Broswer");
		driver.quit();
	}
	
	public void closeBroswer(WebDriver driver) {
		System.out.println("--> BasicFunctions --> Close Broswer");
		driver.quit();
	}
	
	public void refresh() {
		driver.navigate().refresh();
	}
	
	public void refresh(WebDriver driver) {
		driver.navigate().refresh();
	}
	
	private void readConfigXML() {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		try {
			//Open  XML config file
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse("src/config/config.xml");
			
			//Read Browser
			NodeList browser = doc.getElementsByTagName("browser");
			Node browserNode = browser.item(0);
			if(browserNode.getNodeType()==Node.ELEMENT_NODE) {
				Element browserElement = (Element) browserNode;
				strBrowser = browserElement.getTextContent();
			}

			//Read test URL
			NodeList url = doc.getElementsByTagName("testUrl");
			Node urlNode = url.item(0);
			if(urlNode.getNodeType()==Node.ELEMENT_NODE) {
				Element urlElement = (Element) urlNode;
				strUrl = urlElement.getTextContent();
			}
			
		} catch (ParserConfigurationException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (SAXException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
	}
	
	public void setTimeOut() {
		wait = new WebDriverWait(driver, 10);
	}
	
	public void setTimeOut(int timeOutInSeconds) {
		wait = new WebDriverWait(driver, timeOutInSeconds);
	}
}
