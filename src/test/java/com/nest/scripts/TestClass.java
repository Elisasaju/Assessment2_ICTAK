package com.nest.scripts;

import java.io.IOException;

import org.testng.annotations.Test;

import com.nest.Pages.*;
import com.nest.Utilies.ExcelUtility;
import com.nest.Utilies.PageUtils;
import com.nest.base.Base;
import com.nest.constants.AutomationConstants;

import junit.framework.Assert;


public class TestClass extends Base
{
 LoginPage logobj;
 HomePage hmeobj;
 AddEmployeePage empadd;

@Test(priority=2)
public  void Credentials() throws Exception
{
	logobj=new LoginPage();
	String emailid=ExcelUtility.ReadData(0, 0);
	System.out.println(emailid);
	String password=ExcelUtility.ReadData(0, 1);
	System.out.println(password);
	
	logobj.SetCredentials(emailid,password);
	Assert.assertEquals(com.nest.constants.AutomationConstants.ExceptedEmail, emailid);
	Assert.assertEquals(com.nest.constants.AutomationConstants.ExceptedPassword, password);
	String adminurl=getDriver().getCurrentUrl();
	Assert.assertEquals(AutomationConstants.ExceptedAdminUrl, adminurl);
	}


@Test(priority=1)

public  void InvaildCredentials() throws Exception
{
	logobj=new LoginPage();
	String invaildemailid=ExcelUtility.ReadData(1, 0);
	System.out.println(invaildemailid);
	String invaildpassword=ExcelUtility.ReadData(1, 1);
	System.out.println(invaildpassword);
	logobj.SetCredentials(invaildemailid, invaildpassword);
	Assert.assertEquals(AutomationConstants.ExceptedInvaildEmail,invaildemailid);
	Assert.assertEquals(AutomationConstants.ExceptedInvaildPassword,invaildpassword);
	System.out.println(logobj.invalidLogin.getText());
	Assert.assertEquals(AutomationConstants.ExceptedInvalidLogin, logobj.invalidLogin.getText());
	
	

}
@Test(priority=3)
public  void HomePageClicks() throws Exception
{
	hmeobj= new HomePage();
	hmeobj.MovetoPage();
	hmeobj.AddEmp();
}

@Test(priority=4)
public void AddEmployee() throws IOException, InterruptedException
{

	empadd= new AddEmployeePage();
	String nme=ExcelUtility.ReadData(2, 0);
	String empid=ExcelUtility.ReadData(2, 1);
	String password=ExcelUtility.ReadData(2, 2);
	String conpass=ExcelUtility.ReadData(2, 3);
	String email=ExcelUtility.ReadData(2, 4);
	String phn=ExcelUtility.ReadData(2, 5);
	String des=ExcelUtility.ReadData(2, 6);
	String emptype=ExcelUtility.ReadData(2, 7);
	String reporting=ExcelUtility.ReadData(2, 8);
	String address=ExcelUtility.ReadData(2, 9);
	String member=ExcelUtility.ReadData(2, 10);
	
	empadd.Read(nme,empid,password,conpass,email,phn,des,emptype,reporting,address,member);
	
	Assert.assertEquals(AutomationConstants.ExpName,nme);
	Assert.assertEquals(AutomationConstants.ExpEmployee_id,empid);
	Assert.assertEquals(AutomationConstants.ExpAddPassword,password);
	Assert.assertEquals(AutomationConstants.ExpconfirmPass,conpass);
	Assert.assertEquals(AutomationConstants.ExpEmail,email);
	Assert.assertEquals(AutomationConstants.ExpMobNum,phn);
	Assert.assertEquals(AutomationConstants.ExpDesignation,des);
	Assert.assertEquals(AutomationConstants.ExpType,emptype);
	Assert.assertEquals(AutomationConstants.ExpReporting,reporting);
	Assert.assertEquals(AutomationConstants.ExpAddress,address);
	Assert.assertEquals(AutomationConstants.ExpMember,member);
	
}

@Test(priority=5)
public void ListEmployee() throws InterruptedException
{
	hmeobj= new HomePage();
	hmeobj.MovetoPage();
	hmeobj.ListEmp();
	}

//@Test(priority=4)
//public void AddEmployeeInvalid() throws IOException, InterruptedException
//{
//
//	empadd= new AddEmployeePage();
//	String nme=ExcelUtility.ReadData(3, 0);
//	String empid=ExcelUtility.ReadData(3, 1);
//	String password=ExcelUtility.ReadData(3, 2);
//	String conpass=ExcelUtility.ReadData(3, 3);
//	String email=ExcelUtility.ReadData(3, 4);
//	String phn=ExcelUtility.ReadData(3, 5);
//	String des=ExcelUtility.ReadData(3, 6);
//	String emptype=ExcelUtility.ReadData(3, 7);
//	String reporting=ExcelUtility.ReadData(3, 8);
//	String address=ExcelUtility.ReadData(3, 9);
//	String member=ExcelUtility.ReadData(3, 10);
//	
//	empadd.InvalidRead(nme,empid,password,conpass,email,phn,des,emptype,reporting,address,member);
//	
//	Assert.assertEquals(AutomationConstants.InExpName,nme);
//	Assert.assertEquals(AutomationConstants.InExpEmployee_id,empid);
//	Assert.assertEquals(AutomationConstants.InExpAddPassword,password);
//	Assert.assertEquals(AutomationConstants.InExpconfirmPass,conpass);
//	Assert.assertEquals(AutomationConstants.InExpEmail,email);
//	Assert.assertEquals(AutomationConstants.InExpMobNum,phn);
//	Assert.assertEquals(AutomationConstants.InExpDesignation,des);
//	Assert.assertEquals(AutomationConstants.InExpType,emptype);
//	Assert.assertEquals(AutomationConstants.InExpReporting,reporting);
//	Assert.assertEquals(AutomationConstants.InExpAddress,address);
//	Assert.assertEquals(AutomationConstants.InExpMember,member);
//	
//}


}
