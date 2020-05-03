package tutorial6;

import static org.junit.jupiter.api.Assertions.assertEquals;

import org.junit.jupiter.api.AfterAll;
import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;

public class MinWebTest {
	static WebDriver wd = new FirefoxDriver(); // launch the browser
	
	@BeforeAll
	public static void setUpAll() {
		// execute the test <x = 0, y = 0, z = 0, submitButton = click> and check the output message is correct
		System.setProperty("webdriver.gecko.driver","geckodriver");
		// edit the next line to enter the location of "min.html" on your file system
		wd.get("file:///Users/diaoqinyu/Desktop/EE461L/tutorial6_testing/min.html");
	}
	
	@BeforeEach
	public void setUpEach() {
		WebElement we = wd.findElement(By.id("x"));
		we.clear(); // clear x
		we = wd.findElement(By.id("y"));
		we.clear(); // clear y
		we = wd.findElement(By.id("z"));
		we.clear(); // clear z
	}
	
	@Test
	public void t0() { // (x = 0, y = 0, z = 0, computeButton = click)
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter a representative for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter a representative for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("0"); // enter a representative for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); //click the button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText(); // read the output text
		assertEquals("min(0, 0, 0) = 0", output);
		for(;;) {}
	}
	
	@Test
	public void t1() { // (x = 0, y = 0, z = 1, computeButton = click)
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter a representative for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter a representative for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("1"); // enter a representative for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); //click the button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText(); // read the output text
		assertEquals("min(0, 0, 1) = 0", output);
	}
	
	@Test
	public void t2() { // (x = -1, y = 1, z = 1, computeButton = don’t click)
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("-1"); // enter a representative for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("1"); // enter a representative for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("1"); // enter a representative for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText(); // read the output text
		assertEquals("min(0, 0, 1) = 0", output); // expected value is the result from the last click
	}
	
	@Test
	public void t3() { // (x = 1, y = 1, z = -1, computeButton = click)
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1"); // enter a representative for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("1"); // enter a representative for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1"); // enter a representative for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); //click the button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText(); // read the output text
		assertEquals("min(1, 1, -1) = -1", output);
	}
	
	@Test
	public void t4() { // (x = 1, y = 0, z = -1, computeButton = don’t click)
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("1"); // enter a representative for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("0"); // enter a representative for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1"); // enter a representative for z
		we = wd.findElement(By.id("computeButton"));
		
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText(); // read the output text
		assertEquals("min(1, 1, -1) = -1", output); // expected value is the result from the last click
	}
	
	@Test
	public void t5() { // (x = 0, y = -1, z = -1, computeButton = click)
		WebElement we = wd.findElement(By.id("x"));
		we.sendKeys("0"); // enter a representative for x
		we = wd.findElement(By.id("y"));
		we.sendKeys("-1"); // enter a representative for y
		we = wd.findElement(By.id("z"));
		we.sendKeys("-1"); // enter a representative for z
		we = wd.findElement(By.id("computeButton"));
		we.click(); //click the button
		WebElement result = wd.findElement(By.id("result"));
		String output = result.getText(); // read the output text
		assertEquals("min(0, -1, -1) = -1", output);
		int array[] = {1,2,3,4};
		
	}
	
	@AfterAll
	public static void cleanUpAll() {
		wd.quit(); // close the browser window
	}
}
