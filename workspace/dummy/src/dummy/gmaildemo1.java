package dummy;

import java.util.List;

import org.openqa.selenium.By;
import org.openqa.selenium.WebDriver;
import org.openqa.selenium.WebElement;
import org.openqa.selenium.firefox.FirefoxDriver;


public class gmaildemo1 {
	

	public static void main(String[] args) throws InterruptedException {
		// TODO Auto-generated method stub
WebDriver wd = new FirefoxDriver();
wd.manage().deleteAllCookies();
wd.get("https://accounts.google.com/");
wd.findElement(By.id("Email")).sendKeys("smrutiranjanswain2");
wd.findElement(By.id("next")).click();
Thread.sleep(8000);
//WebElement parent=wd.findElement(By.xpath("//[@id='password-shown']"));
WebElement parent=wd.findElement(By.xpath(".//div[@class='slide-in']"));
WebElement child=parent.findElement(By.xpath("//div[@id='password-shown']"));
child.findElement(By.xpath("//input[@id='Passwd']")).sendKeys("bgt%^YHN");

wd.findElement(By.id("signIn")).click();
wd.findElement(By.xpath("//a[contains(@title,'Google apps')]")).click();

WebElement pt= wd.findElement(By.xpath("//div[@role='region']"));
WebElement chd= pt.findElement(By.xpath("//ul[@class='gb_ja gb_ca']"));
List<WebElement> options = wd.findElements(By.tagName("td"));
int len=options.size();
String[] cellData= new String[len];
int i=0;

for (WebElement cell: options){
    
cellData[i]=cell.getText();
System.out.println(cellData[i]);
i++;

/*if (cell.getText().equals("gmail")){
	   cell.click();
	  break;
	   }
     }*/

  }
	}
}
