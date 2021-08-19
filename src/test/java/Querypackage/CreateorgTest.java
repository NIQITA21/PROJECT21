package Querypackage;

import org.openqa.selenium.By;
import org.testng.annotations.Test;

import com.objectrepository.CreateorganizationPage;
import com.objectrepository.HomePage;

import Generic.Base_class;
import Generic.Java_utility;

public class CreateorgTest extends Base_class{

	@Test
	public void createorganisation() throws InterruptedException
	{    HomePage hp=new HomePage(driver);
		CreateorganizationPage crp=new CreateorganizationPage(driver);
		hp.Homepagegeneric();
		
		crp.getCreateorgbutton().click();
		
		Java_utility ju=new Java_utility();
		String orgname = "Saphire"+ju.Ran_data();
		System.out.println(orgname);
		driver.findElement(By.xpath("//input[@name='accountname']")).sendKeys(orgname);
//		driver.findElement(By.xpath("//input[@name='employees']")).sendKeys("nikita");
//		driver.findElement(By.xpath("//input[@name='email2']")).sendKeys("abc@gmail.com");
//		driver.findElement(By.xpath("//input[@name='website']")).sendKeys("www.sapphire.in");
//		crp.getMemberofplusicon().click();
//		Set<String> id = driver.getWindowHandles();
//	    for(String we:id)
//	    {
//	 	  String title = driver.switchTo().window(we).getTitle();
//	 	  if(title.contains("Accounts"))
//	 	  {
//	 		  break;
//	 	  }
//	    }
//		
//		driver.findElement(By.xpath("//a[.='sellow491']")).click();
//		
//		Alert a=driver.switchTo().alert();
//		String ale = a.getText();
//		System.out.println(ale);
//		a.accept();
//		String ele = driver.getWindowHandle();
//		System.out.println(ele);
//		driver.switchTo().window(ele);
//		driver.findElement(By.xpath("//input[@name='phone']")).sendKeys("9999934343");
//		driver.findElement(By.xpath("//input[@name='fax']")).sendKeys("88788");
//		
//		driver.findElement(By.xpath("//input[@name='otherphone']")).sendKeys("9879879191");
//		driver.findElement(By.xpath("//input[@name='email1']")).sendKeys("xyz@gmail.com");
//
//		driver.findElement(By.xpath("//input[@name='ownership']")).sendKeys("world");
//		Thread.sleep(1000);
//		
//		driver.findElement(By.xpath("//input[@name='siccode']")).sendKeys("56998");
//		Thread.sleep(1000);
//		driver.findElement(By.xpath("//input[@name='annual_revenue']")).sendKeys("4million");
//		Thread.sleep(1000);
		crp.getSavebtn().click();
	}
}
