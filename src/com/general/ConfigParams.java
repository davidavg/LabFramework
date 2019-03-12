package com.general;

import java.io.IOException;

import javax.xml.parsers.DocumentBuilder;
import javax.xml.parsers.DocumentBuilderFactory;
import javax.xml.parsers.ParserConfigurationException;

import org.apache.logging.log4j.Logger;
import org.w3c.dom.Document;
import org.w3c.dom.Element;
import org.w3c.dom.Node;
import org.w3c.dom.NodeList;
import org.xml.sax.SAXException;

public class ConfigParams {
	
	final String CONFIG_PATH = "src/config/config.xml";
	//Logging logging = new Logging();
	//Logger log = logging.initLogger(this.getClass().getName());
	
	public String[] setDefaultValues() {
		
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		String[] params = new String[2];
		
		try {
			
			//Open  XML config file
			//log.debug("Open XML config file");
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(CONFIG_PATH);
			
			//Read Browser
			//log.debug("Read Browser");
			NodeList browser = doc.getElementsByTagName("browser");
			Node browserNode = browser.item(0);
			if(browserNode.getNodeType()==Node.ELEMENT_NODE) {
				Element browserElement = (Element) browserNode;
				//bf.setBrowser(browserElement.getTextContent());
				params[0]=browserElement.getTextContent();
			}
			
			//Read test URL
			//log.debug("Read test URL");
			NodeList url = doc.getElementsByTagName("testUrl");
			Node urlNode = url.item(0);
			if(urlNode.getNodeType()==Node.ELEMENT_NODE) {
				Element urlElement = (Element) urlNode;
				//bf.setUrl(urlElement.getTextContent());
				params[1]=urlElement.getTextContent();
			}
			
			
		} catch (ParserConfigurationException e) {
			//log.error("Error while parsing the file - " + e);
			e.printStackTrace();
		} catch (SAXException e) {
			//log.error(e);
			e.printStackTrace();
		} catch (IOException e) {
			//log.error(e);
			e.printStackTrace();
		}
		
		//log.debug("setDefaultValues() finished correctly");
		return params;
	}
	
	public String getParam(String strParam) {
		DocumentBuilderFactory factory = DocumentBuilderFactory.newInstance();
		
		try {
			//Open  XML config file
			//log.debug("Open XML config file");
			DocumentBuilder builder = factory.newDocumentBuilder();
			Document doc = builder.parse(CONFIG_PATH);
			
			//Read given param
			//log.debug("Read " + strParam);
			NodeList browser = doc.getElementsByTagName(strParam);
			Node browserNode = browser.item(0);
			if(browserNode.getNodeType()==Node.ELEMENT_NODE) {
				Element browserElement = (Element) browserNode;
				return browserElement.getTextContent();
			}
			
		} catch (ParserConfigurationException e) {
			//log.error("Error while parsing the file - " + e);
			e.printStackTrace();
		} catch (SAXException e) {
			//log.error(e);
			e.printStackTrace();
		} catch (IOException e) {
			//log.error(e);
			e.printStackTrace();
		}

		//log.debug("getParam(String) finished correctly");
		return "not found";
		
	}
}
