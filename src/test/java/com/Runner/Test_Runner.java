package com.Runner;

import java.io.IOException;

import org.openqa.selenium.WebDriver;

import com.baseclass.base_class;
import com.pom.Address;
import com.pom.Cart;
import com.pom.Choose_Option;
import com.pom.Choose_Tshirt;
import com.pom.Confirm_Order;
import com.pom.Home_Page;
import com.pom.Login_Page;
import com.pom.Pay_Mode;
import com.pom.Payment;
import com.pom.Summary;

   public class Test_Runner extends base_class{
       
	   public static WebDriver driver =browserLaunch("chrome");
	   public static Home_Page hp= new Home_Page(driver);
       public static Login_Page lp=new Login_Page(driver);
       public static Choose_Option shirt =new Choose_Option(driver);
       public static Choose_Tshirt T_shirt = new Choose_Tshirt(driver);
       public static Cart f =new Cart(driver);
	   public static Summary s =new Summary(driver);
	   public static Address a =new Address(driver);
	   public static Payment p =new Payment(driver);
	   public static Pay_Mode pm =new Pay_Mode(driver);
	   public static Confirm_Order corder =new Confirm_Order(driver);
		
	   public static void main(String[] args) throws InterruptedException, IOException {
	      sleep(5000);
	      url("http://automationpractice.com/index.php");
	      
	      sleep(5000);
	      click(hp.getSignin_Btn());
	      
	      Thread.sleep(3000);
	      input(lp.getEmail(),"peermohaideen777@gmail.com");
	      input(lp.getPassword(),"peer78678678");
	      click(lp.getSignin_btn());
	   
	      click(shirt.getTshirt()); 
	      
	      implicit(90);
	      jsexecutor(T_shirt.getT_shirt());
	      action("click", T_shirt.getT_shirt());
	      
	      sleep(5000);
	      driver.switchTo().frame(f.getCart());
	      action("click",f.getCart1());
	      
	      explicit(90,null,"elementlocated","//div[@id='layer_cart']/div/div[2]/div[4]/a/span");
	      action("click",f.getProceed());
	      
	      click(s.getSummary());
	      click(a.getAddress());
	      click(s.getShipping());
	      click(s.getAgree());
	      click(p.getPayment());
	      click(pm.getPay_Mode());
	      
	      Thread.sleep(3000);
	      jsexecutor( corder.getOrder());
	      
	      sleep(4000);
	      screenshot("C:\\Users\\AVITA\\eclipse-workspace\\Dec_Mini_Project\\Screenshot");
	  
	  }
   
  }
	      
	   
	      