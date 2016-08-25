package com.bangfubao.test;

public class Billing_RechargeQuery extends BaseClass {
	
	public void testBilling_RechargeQuery(){
		boolean expected = true ;
		this.clickByStringId("iv_detail", 3000);
		solo.takeScreenshot("账单-验证");
		solo.sleep(1000);
		boolean actual = solo.searchText("交易成功",0,true,true);
		assertEquals("获取账单列表失败！", actual, expected);
		
	}

}
