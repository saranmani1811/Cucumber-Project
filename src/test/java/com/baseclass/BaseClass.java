package com.baseclass;

import java.io.File;
import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.List;
import java.util.Properties;
import java.util.Set;

import org.apache.commons.io.FileUtils;
import org.openqa.selenium.Alert;
import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.chrome.ChromeDriver;
import org.openqa.selenium.edge.EdgeDriver;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.ie.InternetExplorerDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;

import io.github.bonigarcia.wdm.WebDriverManager;

/**
 * 
 * @author Lenovo
 * @Description To maintain the all reusable methods
 * @Date 15/08/2022
 */
public class BaseClass {

	public static WebDriver driver;

	/**
	 * @Description lanunch browser
	 */

	public static void getDriver() {

		WebDriverManager.chromedriver().setup();
		driver = new ChromeDriver();
	}

	/**
	 * @Description load the url
	 * @param url
	 */

	public static void loadUrl(String url) {
		driver.get(url);

	}

	/**
	 * @Description perform to click
	 * @param element
	 */
	public static void click(WebElement element) {
		element.click();
	}

	/**
	 * @Description maximize the window
	 */
	public static void maximize() {
		driver.manage().window().maximize();
	}

	/**
	 * @Description print the statement
	 * @param value
	 */
	public void printStatement(String value) {
		System.out.println(value);
	}

	/**
	 * @Descriptin sleep
	 * @param ms
	 * @throws InterruptedException
	 */

	public void sleep(int ms) throws InterruptedException {
		Thread.sleep(ms);
	}

	/**
	 * @Description minimize the browser
	 */
	public static void minimize() {
		driver.manage().window().minimize();
	}

	/**
	 * @Description insert datas
	 * @param element
	 * @param data
	 */

	public void type(WebElement element, String data) {
		element.sendKeys(data);

	}

	/**
	 * @Description close the window
	 */

	public static void close() {
		driver.close();
	}

	/**
	 * @Description quit the window
	 */

	public static void closeAll() {
		driver.quit();
	}

	/**
	 * @Descriptio findElement by id
	 * @param id
	 * @return WebElement
	 */
	public WebElement findElementById(String id) {
		WebElement element = driver.findElement(By.id(id));
		return element;

	}

	/**
	 * @Description findElement by name
	 * @param name
	 * @return WebElement
	 */
	public WebElement findElementByName(String name) {
		WebElement element = driver.findElement(By.name(name));
		return element;
	}

	/**
	 * 
	 * @param name
	 * @return WebElement
	 */
	public WebElement findElementByClassname(String name) {
		WebElement element = driver.findElement(By.className(name));
		return element;

	}

	/**
	 * 
	 * @param xpath
	 * @return webElement
	 */
	public WebElement findElementByXpath(String xpath) {
		WebElement element = driver.findElement(By.xpath(xpath));
		return element;

	}

	/**
	 * 
	 * @param element
	 * @param value
	 */
	public void selectByVisibleText(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByVisibleText(value);
	}

	/**
	 * 
	 * @param element
	 * @param value
	 */
	public void selectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.selectByValue(value);
	}

	/**
	 * 
	 * @param element
	 * @param index
	 */
	public void selectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.selectByIndex(index);
	}

	/**
	 * 
	 * @param element
	 * @return List<WebElement>
	 */
	public List<WebElement> getOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> options = select.getOptions();
		return options;
	}

	/**
	 * 
	 * @param element
	 * @return List<WebElement>
	 */
	public List<WebElement> getAllSelectedOptions(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelected = select.getAllSelectedOptions();
		return allSelected;
	}

	/**
	 * 
	 * @param element
	 */
	public void deSelectAll(WebElement element) {
		Select select = new Select(element);
		select.deselectAll();
	}

	/**
	 * 
	 * @param element
	 * @param index
	 */
	public void deSelectByIndex(WebElement element, int index) {
		Select select = new Select(element);
		select.deselectByIndex(index);
	}

	/**
	 * 
	 * @param element
	 * @param text
	 */
	public void deselctByVisibleText(WebElement element, String text) {
		Select select = new Select(element);
		select.deselectByVisibleText(text);
	}

	/**
	 * 
	 * @param element
	 * @param value
	 */
	public void deSelectByValue(WebElement element, String value) {
		Select select = new Select(element);
		select.deselectByValue(value);
	}

	/**
	 * 
	 * @param element
	 * @return boolean
	 */
	public boolean isMultiple(WebElement element) {
		Select select = new Select(element);
		boolean multiple = select.isMultiple();
		return multiple;
	}

	/**
	 * 
	 * @param element
	 * @return string
	 */
	public String getText(WebElement element) {
		String text = element.getText();
		return text;
	}

	/**
	 * 
	 * @param element
	 * @param value
	 * @return String
	 */
	public String getAttributeValue(WebElement element, String value) {
		String attribute = element.getAttribute(value);
		return attribute;
	}

	/**
	 * 
	 * @param element
	 * @param attributeName
	 * @return String
	 */
	public String getAttributeName(WebElement element, String attributeName) {
		String attribute = element.getAttribute(attributeName);
		return attribute;
	}

	/**
	 * 
	 * @param element
	 * @return List<WebElement>
	 */
	public List<WebElement> getAllSelect(WebElement element) {
		Select select = new Select(element);
		List<WebElement> allSelectedOptions = select.getAllSelectedOptions();
		return allSelectedOptions;
	}

	/**
	 * 
	 * @param element
	 * @return WebElement
	 */
	public WebElement getFirst(WebElement element) {
		Select select = new Select(element);
		WebElement firstSelectedOption = select.getFirstSelectedOption();
		return firstSelectedOption;
	}

	/**
	 * 
	 * @param text
	 * @param element
	 */
	public void typeJs(String text, WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].setAttribute('value'," + text + ")", element);
	}

	/**
	 * 
	 * @param element
	 * @return Object
	 */
	public Object getJSAttribute(WebElement element) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		Object executeScript = executor.executeScript("arguments[0].getAttribute('value')", element);
		return executeScript;
	}

	/**
	 * 
	 * @param down
	 */
	public void scrollDown(WebElement down) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].ScrollIntoView(true)", down);
	}

	/**
	 * 
	 * @param up
	 */
	public void scrollUp(WebElement up) {
		JavascriptExecutor executor = (JavascriptExecutor) driver;
		executor.executeScript("arguments[0].ScrollIntoView(false)", up);
	}

	/**
	 * 
	 * @return String
	 */
	public String getTitle() {
		String title = driver.getTitle();
		return title;
	}

	/**
	 * 
	 * @param text
	 */
	public void text(String text) {
		Alert a = driver.switchTo().alert();
		a.sendKeys(text);
	}

	/**
	 * 
	 * @param element
	 */
	public void clear(WebElement element) {
		element.clear();
	}

	/**
	 * @Description accept the alert
	 */
	public void accept() {
		Alert al = driver.switchTo().alert();
		al.accept();
	}

	/**
	 * @Description dismiss the alert
	 */
	public void dismiss() {
		Alert al = driver.switchTo().alert();
		al.dismiss();

	}

	/**
	 * @Description insert the values in alert textbox
	 * @param text
	 */
	public void typeAlertText(String text) {
		Alert alert = driver.switchTo().alert();
		alert.sendKeys(text);
	}

	/**
	 * 
	 * @param index
	 */
	public void frameid(int index) {
		driver.switchTo().frame(index);

	}

	/**
	 * 
	 * @param name
	 */
	public void frameWeb(String name) {
		driver.switchTo().frame(name);
	}

	/**
	 * 
	 * @param element
	 */
	public void framename(WebElement element) {
		driver.switchTo().frame(element);
	}

	/**
	 * 
	 */
	public void parentFrame() {
		driver.switchTo().parentFrame();
	}

	/**
	 * 
	 */
	public void defaultContent() {
		driver.switchTo().defaultContent();
	}

	/**
	 * 
	 * @param text
	 * @return List<WebElement>
	 */
	public List<WebElement> frame(String text) {
		List<WebElement> findElements = driver.findElements(By.tagName(text));
		return findElements;
	}

	/**
	 * 
	 * @param element
	 */
	public void doubleClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.doubleClick(element).perform();
		;
	}

	/**
	 * 
	 * @param element
	 */
	public void contextClick(WebElement element) {
		Actions actions = new Actions(driver);
		actions.contextClick(element).perform();

	}

	/**
	 * 
	 * @param target
	 */
	public void moveToElement(WebElement target) {
		Actions actions = new Actions(driver);
		actions.moveToElement(target).perform();

	}

	/**
	 * 
	 * @param source
	 * @param destination
	 */
	public void dragDrop(WebElement source, WebElement destination) {
		Actions actions = new Actions(driver);
		actions.dragAndDrop(source, destination).perform();
	}

	/**
	 * 
	 * @param url
	 */
	public void windowurl(String id) {
		driver.switchTo().window(id);
	}

	/**
	 * 
	 * @return String
	 */
	public String getWindow() {
		String windowHandle = driver.getWindowHandle();
		return windowHandle;
	}

	/**
	 * 
	 * @return Set<String>
	 */
	public Set<String> getwindows() {
		Set<String> windowHandles = driver.getWindowHandles();
		return windowHandles;
	}

	/**
	 * 
	 * @return File
	 * @throws IOException
	 */
	public static File getScreenshot() throws IOException {
		TakesScreenshot tk = (TakesScreenshot) driver;
		File source = tk.getScreenshotAs(OutputType.FILE);
		File destination = new File("C:\\Users\\Lenovo\\Pictures\\Camera Roll\\Output");
		FileUtils.copyFile(source, destination);
		return source;
	}

	/**
	 * @Description refresh the Webpage
	 */
	public void refresh() {
		driver.navigate().refresh();
	}

	/**
	 * @Description quit the Webpage
	 */
	public static void quit() {
		driver.quit();
	}

	/**
	 * @Description back to the Webpage
	 */
	public void back() {
		driver.navigate().back();
	}

	/**
	 * @Description forward to the Webpage
	 */
	public void forward() {
		driver.navigate().forward();
	}

	/**
	 * @Description launch the url
	 * @param url
	 */
	public void navigateTo(String url) {
		driver.navigate().to(url);
	}

	/**
	 * 
	 * @param element
	 * @return boolean
	 */
	public boolean isDisplayed(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	/**
	 * 
	 * @param element
	 * @return boolean
	 */
	public boolean isSelected(WebElement element) {
		boolean displayed = element.isDisplayed();
		return displayed;
	}

	/**
	 * 
	 * @param element
	 * @return boolean
	 */
	public boolean isEnabled(WebElement element) {
		boolean displayed = element.isEnabled();
		return displayed;
	}

	/**
	 * 
	 * @param key
	 * @return
	 * @throws FileNotFoundException
	 * @throws IOException
	 */
	public static String getPropertyValue(String key) throws FileNotFoundException, IOException {
		Properties pro = new Properties();
		pro.load(new FileInputStream(System.getProperty("user.dir") + "\\config\\config.properties"));
		Object obj = pro.get(key);
		String value = (String) obj;
		return value;
	}

	/**
	 * 
	 * @param browserType
	 */
	public void getDriverType(String browserType) {
		switch (browserType) {
		case "chrome":
			WebDriverManager.chromedriver().setup();
			driver = new ChromeDriver();
			break;
		case "iedriver":
			WebDriverManager.iedriver().setup();
			driver = new InternetExplorerDriver();
			break;
		case "firefox":
			WebDriverManager.firefoxdriver().setup();
			driver = new FirefoxDriver();
			break;
		case "edge":
			WebDriverManager.edgedriver().setup();
			driver = new EdgeDriver();
			break;
		default:
			break;
		}

	}

	/**
	 * 
	 * @return byte[]
	 */
	public byte[] screenshotAsByte() {
		TakesScreenshot ts = (TakesScreenshot) driver;
		byte[] b = ts.getScreenshotAs(OutputType.BYTES);
		return b;
	}

}