package com.nest.Pages;

import org.openqa.selenium.WebElement;
import org.openqa.selenium.support.FindBy;
import org.openqa.selenium.support.PageFactory;
import org.openqa.selenium.support.ui.Select;

import com.nest.Utilies.PageUtils;
import com.nest.base.Base;

public class AddEmployeePage extends Base
{
	
	@FindBy(id="ContentPlaceHolder1_txtName")
		private WebElement name;
	
	@FindBy(id="ContentPlaceHolder1_txtEmployeeId")
		private WebElement employee_id;
	
	@FindBy(id="ContentPlaceHolder1_txtPassword")
		private WebElement password;
	
	@FindBy(id="ContentPlaceHolder1_txtConfirmPassword")
		private WebElement confirm_password;
	
	@FindBy(id="ContentPlaceHolder1_txtEmail")
		private WebElement email;
	 
	@FindBy(id="ContentPlaceHolder1_txtMobileNumber")
		private WebElement mobileNum;
	
	@FindBy(id="ContentPlaceHolder1_drpDesignation")
		private WebElement select_designation;
	
	@FindBy(id="ContentPlaceHolder1_drpEmployeeType")
		private WebElement select_employeeType;
	
	@FindBy(id="ContentPlaceHolder1_drpReportingTo")
    private WebElement select_reporting;

    @FindBy(id="ContentPlaceHolder1_ChkReportingStaff")
    private WebElement check_staff;

    @FindBy(id="ContentPlaceHolder1_drpGroup")
    private WebElement select_member;

    @FindBy(id="ContentPlaceHolder1_txtAddress")
    private WebElement address;

    @FindBy(id="ContentPlaceHolder1_btnSubmit")
    private WebElement submitButton;

    @FindBy(id="Reset")
    private WebElement resetButton;

    @FindBy(id="ContentPlaceHolder1_btnBack")
    private WebElement backButton;
	
	
	public AddEmployeePage()
	{
		PageFactory.initElements(driver,this);
	}
	
	public  void Read(String nme,String id,String pass, String cpass, String emailid,String num,String designation,
			String emptype ,String reporting,String adds,String member) throws InterruptedException
	{
		PageUtils.SendInput(name, nme);
		PageUtils.SendInput(employee_id, id);
		PageUtils.SendInput(password, pass);
		PageUtils.SendInput(confirm_password, cpass);
		PageUtils.SendInput(email, emailid);
		PageUtils.SendInput(mobileNum, num);
		Select select1 = new Select (select_designation);
		select1.selectByVisibleText(designation);
		Select select2 = new Select (select_employeeType);
		select2.selectByVisibleText(emptype);
		Select select3 = new Select (select_reporting);
		select3.selectByVisibleText(reporting);
		
		//chackbox
		PageUtils.Clickele(check_staff);
		PageUtils.SendInput(address, adds);
		Select select4 = new Select (select_member);
		select4.selectByVisibleText(member);
		PageUtils.Clickele(submitButton);
		//PageUtils.Clickele(resetButton);
		//PageUtils.Clickele(backButton);
	}
	
//	public  void InvalidRead(String nme,String id,String pass, String cpass, String emailid,String num,String designation,
//			String emptype ,String reporting,String adds,String member) throws InterruptedException
//	{
//		PageUtils.SendInput(name, nme);
//		PageUtils.SendInput(employee_id, id);
//		PageUtils.SendInput(password, pass);
//		PageUtils.SendInput(confirm_password, cpass);
//		PageUtils.SendInput(email, emailid);
//		PageUtils.SendInput(mobileNum, num);
//		Select select1 = new Select (select_designation);
//		select1.selectByVisibleText(designation);
//		Select select2 = new Select (select_employeeType);
//		select2.selectByVisibleText(emptype);
//		Select select3 = new Select (select_reporting);
//		select3.selectByVisibleText(reporting);
//		
//		//chackbox
//		PageUtils.Clickele(check_staff);
//		PageUtils.SendInput(address, adds);
//		Select select4 = new Select (select_member);
//		select4.selectByVisibleText(member);
//		//PageUtils.Clickele(submitButton);
//		//PageUtils.Clickele(resetButton);
//		PageUtils.Clickele(backButton);
//	}


}
