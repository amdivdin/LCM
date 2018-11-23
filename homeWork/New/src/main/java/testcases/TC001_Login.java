package testcases;

import org.openqa.selenium.WebElement;
import org.testng.annotations.Test;

import wdMethods.SeMethods;

public class TC001_Login extends SeMethods{
	@Test
	public void login() {
		login();
		WebElement ele2 = locateElement("Linktext","Create Lead");
		
		click(ele2);
        WebElement ele3 = locateElement("id","createLeadForm_companyName");
        type(ele3,"CTS");
        WebElement ele4 = locateElement("id","createLeadForm_firstName");
        type(ele4,"Rupa");
        WebElement ele5 = locateElement("id","createLeadForm_lastName"); 
        type(ele5,"D");
        WebElement drop = locateElement("id","createLeadForm_dataSourceId");
        selectDropDownUsingText(drop,"Cold Call");
        WebElement click = locateElement("name","submitButton");
        click(click);
        
        
}
}







