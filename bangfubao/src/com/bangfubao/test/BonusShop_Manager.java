package com.bangfubao.test;

public class BonusShop_Manager extends BaseClass{
	 
	public void testBonusShop_Manager(){
		boolean expected = true ;
		solo.clickOnText("积分商城");
		solo.sleep(3000);
		solo.takeScreenshot("积分商城-验证");
		solo.sleep(1000);
		boolean actual = solo.searchText("积分商城");
		assertEquals("打开商城失败！", actual, expected);
		
	}

}
