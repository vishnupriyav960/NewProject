package org.test;

import java.util.Date;

import org.Base.BaseClass;
import org.junit.After;
import org.junit.AfterClass;
import org.junit.Before;
import org.junit.BeforeClass;
import org.junit.Ignore;
import org.junit.Test;
import org.pojo.LoginPage;

public class Sample extends BaseClass {
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
fill(l.getTextUsername(), "Vishnu");
fill(l.getTextPassword(), "456789");
btnClick(l.getBtnLogin());
pageLoad();
}
@Test
public void tc2() throws InterruptedException {
loadUrl("https://www.facebook.com/");
maxWindow();
LoginPage l = new LoginPage();
fill(l.getTextUsername(), "Bala");
fill(l.getTextPassword(), "456789");
btnClick(l.getBtnLogin());
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
