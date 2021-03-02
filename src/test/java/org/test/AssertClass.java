package org.test;
import java.util.Date;

import org.Base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Assert;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.openqa.selenium.WebElement;
import org.pojo.LoginPage;

public class AssertClass extends BaseClass {
	@BeforeClass	
	public static void beforeClass() {
	launchDriver();
	}
	@AfterClass
	public static void afterClass() {
	closeBrowser();
	}
	@Before
	public void before() {
	System.out.println("Time:"+new Date());
	}
	@After
	public void after() {
	System.out.println("Time:"+new Date());
	}
	@Test
	public void tc1() throws InterruptedException {
	loadUrl("https://www.facebook.com/");
	maxWindow();
	LoginPage l = new LoginPage();
	WebElement username = l.getTextUsername();
	fill(username, "Vishnu");
	String user = username.getAttribute("value");
	System.out.println(user);
	Assert.assertEquals("Verify username", "vishnu", user);
	WebElement password = l.getTextPassword();
	fill(password, "456789");
	System.out.println(	Attribute(l.getTextPassword(), "value"));
	WebElement btnLogin = l.getBtnLogin();
	btnClick(btnLogin);
	pageLoad();
	}
	@Test
	public void tc2() throws InterruptedException {
	loadUrl("https://www.facebook.com/");
	maxWindow();
	String pageUrl = pageUrl();
	System.out.println(pageUrl);
	boolean b = pageUrl.contains("book");
	Assert.assertTrue(b);
	}
	@Ignore
	@Test
	public void tc3() throws InterruptedException {
	loadUrl("https://www.facebook.com/");
	maxWindow();
	LoginPage l = new LoginPage();
	fill(l.getTextUsername(), "Rahul");
	fill(l.getTextPassword(), "456789");
	btnClick(l.getBtnLogin());
}
}
