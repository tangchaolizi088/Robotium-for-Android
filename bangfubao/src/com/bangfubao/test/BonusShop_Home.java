package com.bangfubao.test;

public class BonusShop_Home extends BaseClass {
	
	public void testBonusShop_Home(){
		boolean expected = true ;
		this.clickByStringId("iv_house", 1000);
		this.clickByStringId("ry_Integral", 1000);
		this.clickByStringId("tv_exchange", 2000);
		solo.takeScreenshot("积分商城-验证");
		solo.sleep(1000);
		boolean actual = solo.searchText("积分商城");
		assertEquals("打开商城失败！", actual, expected);
		
	}

}
