public class Selenium_grid_demo_samemachine {
	
	WebDriver driver;
	
@Test
public void test1() throws MalformedURLException {
	EdgeOptions eo=new EdgeOptions();
				driver=new RemoteWebDriver(new URL("http://172.19.16.1:4444"),eo);
	driver.get("https://www.flipkart.com");
			
}
	
@Test
public void test2() throws MalformedURLException {
	//WebDriverManager.edgedriver().setup();
	EdgeOptions eo=new EdgeOptions();
				driver=new RemoteWebDriver(new URL("http://172.19.16.1:4444"),eo);
	driver.get("https://www.flipkart.com");
	

}

}
