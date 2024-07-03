public class Selenium_grid_differentMachines {
	WebDriver driver;
	
	@Test
	public void test3() throws MalformedURLException {

		
		ChromeOptions co=new ChromeOptions();
		driver=new RemoteWebDriver(new URL("http://localhost:4444"),co);
driver.get("https://www.amazon.in");
		
				
	}
		
	@Test
	public void test4() throws MalformedURLException {

		
		FirefoxOptions fo=new FirefoxOptions();
		driver=new RemoteWebDriver(new URL("http://172.19.16.1:4444"),fo);
	driver.get("https://www.flipkart.com");
			
	}

}
