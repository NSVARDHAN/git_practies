package com.TM.TestCases;

import org.testng.annotations.Test;

import com.TM.Libriary.BaseClass;
import com.TM.Libriary.ClassElements;

public class LoginScreen extends BaseClass {

	@Test(priority = 2)
	public void loginFunction() {

		clickElement(ClassElements.link_Login);
		testSendkeys(ClassElements.text_UserName, "asdcb1wm1234@gmail.com");
		testSendkeys(ClassElements.text_lPassword, "1234qwer");
		clickElement(ClassElements.btn_Login);


		
	}

	@Test(priority = 1)
	public void regFunction() {
		clickElement(ClassElements.link_Register);
		clickElement(ClassElements.btn_MaleGender);
		testSendkeys(ClassElements.text_FirstName, "Testing");
		testSendkeys(ClassElements.text_Lastname, "Selenium");
		selectByText(ClassElements.drop_Day,"26");
		selectByText(ClassElements.drop_month,"August");
		selectByText(ClassElements.drop_Year,"2018");
		testSendkeys(ClassElements.text_email,"asdcb1wm1234@gmail.com");
		testSendkeys(ClassElements.text_CompanyName,"TestingMasters");
		testSendkeys(ClassElements.text_Password,"1234qwer");
		testSendkeys(ClassElements.text_ConfPassword,"1234qwer");
		clickElement(ClassElements.btn_Register);
		clickElement(ClassElements.link_Logout);
		
	}


}
