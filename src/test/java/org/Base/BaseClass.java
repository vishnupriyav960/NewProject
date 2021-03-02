package org.Base;

import java.io.File;
import java.io.IOException;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import io.github.bonigarcia.wdm.WebDriverManager;

public class BaseClass {
		public static WebDriver driver;
		public static String parId;
		
		public static WebDriver LaunchBrowser() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;
		}
		public static WebDriver launchDriver() {
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			return driver;
		}
		public static void pageLoad() {
			driver.manage().timeouts().pageLoadTimeout(20, TimeUnit.SECONDS);
		}
		public static void loadUrl(String url) {
			driver.get(url);
		}
		public static void maxWindow() {
			driver.manage().window().maximize();
		}
		public static void closeBrowser() {
			driver.quit();
		}
		public static String pageTitle() {
			String title = driver.getTitle();
			return title;
		}
		public static String pageUrl() {
			String currentUrl = driver.getCurrentUrl();
			return currentUrl;
		}
		public static void fill(WebElement e, String text) {
			e.sendKeys(text);
		}
		public static void btnClick(WebElement e) {
			e.click();
		}
		public static String Text(WebElement e) {
			String t = e.getText();
			return t;
		}
		public static String Attribute(WebElement e, String value) {
			String a = e.getAttribute(value);
			return a;
		}
		public static void movetoElement(WebElement e) {
			Actions a = new Actions(driver);
			a.moveToElement(e).perform();
		}
		public static void draganddrop(WebElement e, WebElement element) {
			Actions a= new Actions(driver);
			a.dragAndDrop(e, element).perform();
		}
		public static void contextclick(WebElement e) {
			Actions a= new Actions(driver);
			a.contextClick(e).perform();
		}
		public static void doubleclick(WebElement e) {
			Actions a= new Actions(driver);
			a.doubleClick(e).perform();
		}
		public static void scrollup(WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(false)", e);
		}
		public static void scrolldown(WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].scrollIntoView(true)", e);
		}
		public static void jsclick(WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			js.executeScript("arguments[0].click()",e);
		}
		public static String getAttribute(WebElement e) {
			JavascriptExecutor js = (JavascriptExecutor)driver;
			Object o1 = js.executeScript("return arguments[0].getAttribute('value')", e);
			String s1 =(String)o1;
			return s1;
		}
		public static void getScreenshot(String pathname) throws IOException {
			TakesScreenshot tk = (TakesScreenshot)driver;
			File src = tk.getScreenshotAs(OutputType.FILE);
			File dest = new File(pathname);
			FileUtils.copyFile(src, dest);
		}
		public static void acceptSimpletext() {
			Alert a = driver.switchTo().alert();
			a.accept();
		}
		public static void acceptConfirmAlert() {
			Alert a = driver.switchTo().alert();
			a.accept();
		}
		public static void dismissConfirmAlert() {
			Alert a = driver.switchTo().alert();
			a.dismiss();
		}
		public static void acceptPromptAlert(String text) {
			Alert a = driver.switchTo().alert();
			 a.sendKeys(text);
			 a.accept();
		}
		public static void dismissPromptAlert(String text) {
			Alert a = driver.switchTo().alert();
			 a.sendKeys(text);
			 a.dismiss();
		}
		public static String getAlertText() {
			Alert a = driver.switchTo().alert();
			String t = a.getText();
			return t;
		}
		public void switchFrame(String id) {
			driver.switchTo().frame(id);
		}
		public void swtchFrame(String name) {
			driver.switchTo().frame(name);
		}
		public void switchFrame(WebElement e) {
			driver.switchTo().frame(e);
		}
		public void switchFrame(int index) {
			driver.switchTo().frame(index);
		}
		public static void comeoutofFrame() {
			driver.switchTo().parentFrame();
		}
		public static void comeoutofFrametomain() {
			driver.switchTo().defaultContent();
		}
		public static void selectbyIndex(WebElement element, int index) {
			Select s =new Select(element);
			s.selectByIndex(index);
		}
		public static void selectbyVisibleText(WebElement element, String text) {
			Select s =new Select(element);
			s.selectByVisibleText(text);
		}
		public static void selectbyValue(WebElement element, String value) {
			Select s =new Select(element);
			s.selectByValue(value);
		}
		public static void deselectbyIndex(WebElement element, int index) {
			Select s =new Select(element);
			s.deselectByIndex(index);
		}
		public static void deselectbyVisibleText(WebElement element, String text) {
			Select s =new Select(element);
			s.deselectByVisibleText(text);
		}
		public static void deselectbyValue(WebElement element, String value) {
			Select s =new Select(element);
			s.deselectByValue(value);
		}
		public static boolean multipeCheck(WebElement element) {
			Select s =new Select(element);
			boolean b = s.isMultiple();
			return b;
		}
		public static String getFirstSelectedOption(WebElement element) {
			Select s =new Select(element);
			WebElement firstSelectedOption = s.getFirstSelectedOption();
			return firstSelectedOption.getText();
		}
		public static void deselectAll(WebElement element) {
			Select s =new Select(element);
			s.deselectAll();
		}
		public static String getParentWindowId() {
			parId = driver.getWindowHandle();
			return parId;
		}
		public static Set<String> getallWindowsId() {
			Set<String> allId = driver.getWindowHandles();
			return allId;
		}
		public static void switchWindow() {
			Set<String> allId = driver.getWindowHandles();
			for (String eachId : allId) {
				if (!eachId.equals(parId)) {
					driver.switchTo().window(eachId);
				}
			}	
		}
		}
