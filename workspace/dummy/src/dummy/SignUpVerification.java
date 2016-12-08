package dummy;

import java.io.File;
import java.io.InterruptedIOException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.Set;
import java.util.concurrent.TimeUnit;

import org.openqa.selenium.By;
import org.openqa.selenium.OutputType;
import org.openqa.selenium.TakesScreenshot;
//import org.openqa.selenium.JavascriptExecutor;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;
import org.openqa.selenium.interactions.Actions;
import org.openqa.selenium.support.ui.Select;
import org.testng.Assert;

import com.google.common.collect.HashMultimap;
import com.sun.jna.platform.FileUtils;
import com.thoughtworks.selenium.webdriven.commands.GetLocation;
import com.thoughtworks.selenium.webdriven.commands.GetXpathCount;




//import com.thoughtworks.selenium.webdriven.commands.GetText;


public class SignUpVerification {
	
	public static String firstName="First name";
	
	
	public static WebElement first_Name,last_NAme,email_Add,cmail_add,house_Name,street_Add,street_Add2,
	city,state,postal_Code,country,time_Zone,add_Apic,user_Name,pswd,cpswd,sec_ChlngQ,sec_ChlngA;
	
	public static String first_Name_txt,last_NAme_txt,email_Add_txt,cmail_add_txt,house_Name_txt,street_Add_txt,street_Add2_txt,
	city_txt,state_txt,postal_Code_txt,country_txt,time_Zone_txt,add_Apic_txt,user_Name_txt,pswd_txt,cpswd_txt,sec_ChlngQ_txt,sec_ChlngA_txt,
	
	 first_Name_astric,last_NAme_astric,email_Add_astric,cmail_add_astric,house_Name_astric,street_Add_astric,street_Add2_astric,
		city_astric,state_astric,postal_Code_astric,country_astric,time_Zone_astric,add_Apic_astric,user_Name_astric,pswd_astric,cpswd_astric,sec_ChlngQ_astric,sec_ChlngA_astric;
    
	public void singup_lables(){
		//first_Name_ele=wd.findelement;
		
	}

	public static void verifyLabel(){
    	 
     }
	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver wd= new FirefoxDriver();
wd.get("https://demo.mynexia.com/account/signup");
Thread.sleep(5000);


List<WebElement> elelist= wd.findElements(By.xpath(".//div[@class='formLabel']"));
int i=elelist.size();
System.out.println(i);
for (WebElement ele :elelist) {
	
/*
	if(elelist.get(j).getText().contains(firstName)&&elelist.get(j).getText().endsWith("*")&&first_Name_ele.isDisplayed()){
		Assert.assertEquals(actual, expected);
	}
	else if(){
		
	}
}
	System.out.println(ele.getText());
	System.out.println(ele.getAttribute("id"));
	if (){
	*/	
	System.out.println(ele.getAttribute("id"));
	
	}


WebElement house_help= wd.findElement(By.xpath("//img[@class='tooltip-button']"));
Actions action = new Actions(wd);
action.clickAndHold(house_help).build().perform();
Thread.sleep(2000);
WebElement p_node= wd.findElement(By.xpath("div[@class='helpiq-tip tooltip-wrap']"));
WebElement tooltip= p_node.findElement(By.xpath(".//div[@class='tooltip']"));
String ToolTipText =tooltip.getAttribute("title");
//String ToolTipText =house_help.getAttribute("title"); // Get the value of Tooltip by getAttribute command
//String ToolTipText =house_help.getText();
//Assert.assertEquals(ToolTipText, "Makesure to create a custom name for your home.This is not only a way to personalize your account, but it also will help you easily distinguish between multiple homes on an account. ");
System.out.println("Tooltip value is: " + ToolTipText);
	
	}


	
























//wd.manage().timeouts().implicitlyWait(60,TimeUnit.SECONDS);
/*System.out.println(wd.findElement(By.xpath("//a[@class='push_button   main simple action']")).getText());
wd.findElement(By.xpath("//a[@class='push_button   main simple action']")).click();
wd.manage().timeouts().implicitlyWait(50,TimeUnit.SECONDS);
//WebElement ImageFile=wd.findElement(By.xpath("//img[contains(@src,'/assets/nexia-log')]"));
*/


/*WebElement bmw=wd.findElement(By.xpath("//div[@class='section-content']"));

List<WebElement> mangu=bmw.findElements(By.tagName("input"));
int j=mangu.size();
System.out.println(j);

//HashMap<Integer, Web> hmap=new HashMap<Integer,String>();
//Integer i=0;
for(WebElement jojo:mangu){
	System.out.println(jojo.getAttribute("id"));
	if(jojo.getAttribute("id").equalsIgnoreCase("account_first_name")){
		jojo.sendKeys("harami");
		
	}
}*/


	
	
	//WebElement firstname=hmap.get(0),lastname=hmap.get(2),mail=hmap.get(4),cmail=hmap.get(6);
	/*firstname.sendKeys("asdf");
	lastname.sendKeys("zxc");
	mail.sendKeys("qwsdcv@gmail.com");
	cmail.sendKeys("qwsdcv@gmail.com");*/
	


/*for(WebElement changu:mangu){
System.out.println(changu.getAttribute("color"));
List<WebElement> elementlist= changu.findElements(By.cssSelector(".formField required"));
int j=elementlist.size();
System.out.println(j);
for (WebElement tubas:elementlist){
	List<WebElement> radas=tubas.findElements(By.cssSelector(".formLabel"));
	int k =radas.size();
	System.out.println(k);
 for (WebElement lama:radas){
	List<WebElement> ele=lama.findElements(By.tagName("span"));
	int l= ele.size();
	System.out.println(l);
	HashMap<Integer, String> hmap=new HashMap<Integer,String>();
	//Integer i=0;
	
	for(WebElement jojo:ele){
		//hmap.put(i, jojo.getText());
		//i++;
		System.out.println(jojo.getText());
	}
	Set set= hmap.entrySet();
	Iterator iterator =set.iterator();
	while(iterator.hasNext()) {
	    Map.Entry mentry2 = (Map.Entry)iterator.next();
	    System.out.print("Key is: "+mentry2.getKey() + " & Value is: "+ mentry2.getValue());

  }
}
*/
/*wd.findElement(By.xpath("//input[@id='account_first_name']")).sendKeys("asdf");
wd.findElement(By.xpath("//input[@id='account_last_name']")).sendKeys("zxc");
wd.findElement(By.xpath("//input[@id='account_email']")).sendKeys("qwsdcv@gmail.com");
wd.findElement(By.xpath("//input[@id='account_email_confirmation']")).sendKeys("qwsdcv@gmail.com");*/





//wd.findElement(By.xpath("//input[@id='account_primary_contact_phone_number']")).sendKeys("1234567890");
/*WebElement parnt=wd.findElement(By.xpath("//form[@id='account-signup-form']"));
WebElement child=parnt.findElement(By.xpath("//div[@data-section='home-info']"));
WebElement gchld=child.findElement(By.xpath("//div[contains(@style,'display: block;')]"));
WebElement grandchld=gchld.findElement(By.xpath("a[contains(tabindex,'820')]"));
grandchld.click();*/
//List<WebElement> links= wd.findElements(By.tagName("a"));
//System.out.println(links.size());

/*for (WebElement link:links)

{

	if(link.getText().equalsIgnoreCase("Continue")){
		link.click();
		break;
	}

}*/



/*wd.findElement(By.xpath("//input[@id='account_house_name']")).sendKeys("qweasdhjkk");
wd.findElement(By.xpath("//input[@id='account_house_street_address']")).sendKeys("mk8u7890jk");

wd.findElement(By.xpath("//input[@id='account_house_address2']")).sendKeys("vbnm,fghj7");

wd.findElement(By.xpath("//input[@id='account_house_city']")).sendKeys("Alaska");
	
new Select(wd.findElement(By.xpath("//select[@id='account_house_state']"))).selectByVisibleText("Alaska");

wd.findElement(By.xpath("//input[@id='account_house_postal_code']")).sendKeys("123456");
new Select(wd.findElement(By.xpath("//select[@id='account_house_country_code']"))).selectByVisibleText("United States");
new Select(wd.findElement(By.xpath("//select[@id='account_house_time_zone']"))).selectByVisibleText("(GMT-05:00) Eastern Time (US & Canada)");
new Select(wd.findElement(By.xpath("//select[@id='account_house_state']"))).selectByVisibleText("Alaska");
*/

//wd.findElement(By.xpath("//a[@class='push_button main next-step action']")).click();////*[@id='account-signup-form']/div[3]/div[2]/div[1]/div/div[1]/span[3]/label/a/img


/*

WebElement house_help= wd.findElement(By.xpath("//img[@class='tooltip-button']"));
Actions action = new Actions(wd);
action.clickAndHold(house_help).build().perform();
Thread.sleep(2000);
WebElement p_node= wd.findElement(By.xpath("div[@class='helpiq-tip tooltip-wrap']"));
WebElement tooltip= p_node.findElement(By.xpath(".//div[@class='tooltip']"));
String ToolTipText =tooltip.getAttribute("title");
//String ToolTipText =house_help.getAttribute("title"); // Get the value of Tooltip by getAttribute command
//String ToolTipText =house_help.getText();
//Assert.assertEquals(ToolTipText, "Makesure to create a custom name for your home.This is not only a way to personalize your account, but it also will help you easily distinguish between multiple homes on an account. ");
/System.out.println("Tooltip value is: " + ToolTipText);*/
	
//public void screenShot() throws InterruptedIOException, InterruptedException{

	/*File scr=((TakesScreenshot)wd).getScreenshotAs(OutputType.FILE);
    File dest= new File(""+timestamp()+".png");
    */
    
    
	

public static String timestamp() {
    return new SimpleDateFormat("yyyy-MM-dd HH-mm-ss").format(new Date());
}
	
}
