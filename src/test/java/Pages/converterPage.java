package Pages;

import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.Keys;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;

import junit.framework.Assert;

public class converterPage {
	WebDriver driver;
	String s;
	public converterPage(WebDriver driver)
	{
		this.driver=driver;
		PageFactory.initElements(driver, this);
		driver.manage().timeouts().implicitlyWait(25,TimeUnit.SECONDS);
	}
	@FindBy(xpath="//span[@class='tab-text'][contains(text(),'Convert')]")
	WebElement convertlink;
	@FindBy(xpath="//div[@class='currency-converter__GridContainer-zieln1-1 jdUeRL']//span[@class='amount-input']//input")
	WebElement amount;
	@FindBy(xpath="//button[contains(text(),'Convert')][@type='submit']")
	WebElement buttonconvert;
	@FindBy(xpath="//span[@class='tab-text'][contains(text(),'Charts')]")
	WebElement chartlink;
	@FindBy(xpath="//div[@class='currencycharts__SubmitZone-g04a00-2 dWeexL']//button[contains(text(),'View chart')]")
	WebElement buttonview;
	@FindBy(xpath="//div//p[@class='result__BigRate-sc-1bsijpp-1 iGrAod']")
	WebElement part1;
	@FindBy(xpath="//div//p[@class='result__BigRate-sc-1bsijpp-1 iGrAod']//span")
	WebElement part2;
	@FindBy(xpath="(//div[@class='currency-charts__ChartHeader-sc-1kf16vc-2 loAEFi']//p[@class='paragraph__Paragraph-sc-1y1xjre-0 fqOqID'])[2]")
	WebElement value;
	@FindBy(xpath="(//div[@class='base-combobox__InputWrapper-iyxb4f-4 hhBDpD'])[1]//ul//li[2]")
	WebElement list;
	@FindBy(xpath="(//div[@class='base-combobox__InputWrapper-iyxb4f-4 hhBDpD'])[1]//button[@class='nude-button']")
	WebElement arrowclick;
	@FindBy(xpath="//div//input[@id='midmarketFromCurrency']")
	WebElement fromcurrency;
	@FindBy(xpath="//div//input[@id='midmarketToCurrency']")
	WebElement tocurrency;
	 public String url() {
	        return driver.getCurrentUrl();
	        
	    }
	 
	 public void convertMoney(String amt,String from,String To) throws InterruptedException
	 {
		 convertlink.click();
		 amount.sendKeys(amt);
		// arrowclick.click();
		fromcurrency.sendKeys(from,Keys.ENTER);
		tocurrency.sendKeys(To,Keys.ENTER);

		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",buttonconvert);
		 
		s=driver.findElement(By.xpath("//div[@class='unit-rates___StyledDiv-sc-1dk593y-0 dEqdnx']//p[1]")).getText();
		
	 }
	 public void chartclick()
	 {
		 JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",chartlink);
		// JavascriptExecutor js=(JavascriptExecutor)driver;
		 js.executeScript("arguments[0].click()",buttonview);
		// chartlink.click();
		// buttonview.click();
	 }
	 public void verifyAmount() throws InterruptedException
	 {
		 //String s=driver.findElement(By.xpath("//div[@class='unit-rates___StyledDiv-sc-1dk593y-0 dEqdnx']//p[1]")).getText();
		 String s1=driver.findElement(By.xpath("(//div[@class='currency-charts__ChartHeader-sc-1kf16vc-2 loAEFi']//p)[3]")).getText();
		System.out.println(s1.length());
		 
		 Assert.assertEquals(s.substring(0,5),s1.substring(0,5));
		 System.out.println("The currency rate is  " + s1);
	 }

}
