package com.bangfubao.test;

import com.robotium.solo.By;

public class Book_Flight extends BaseClass{
	
	public void testBook_Flight(){
		
		boolean expected = true ;
		solo.clickOnText("机票预订");
		solo.sleep(5000);
		solo.clickOnWebElement(By.xpath("//input[@id='startaddr']"));
		solo.clickOnWebElement(By.xpath("//div[@id='dftlist']/ul[@class='clearfix'][1]/li[5]"));
		solo.clickOnWebElement(By.xpath("//input[@id='finishaddr']"));
		solo.clickOnWebElement(By.xpath("//div[@id='dftlist']/ul[@class='clearfix'][1]/li[4]"));
		solo.clickOnWebElement(By.xpath("//input[@id='search_gn_btn']"));
		solo.sleep(5000);
		solo.takeScreenshot("机票检索界面-验证");
		boolean actual = solo.searchText("机票预订");
		assertEquals("机票预订进入失败！", actual, expected);
		
	}

}
