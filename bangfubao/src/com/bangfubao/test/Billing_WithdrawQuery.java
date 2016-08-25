package com.bangfubao.test;

public class Billing_WithdrawQuery extends BaseClass{
	
	public void testBilling_WithdrawQuery(){
		boolean expected = true ;
		this.clickByStringId("iv_detail", 3000);
		this.clickByStringId("btn_withdraw_inquiry", 3000);
		solo.takeScreenshot("提现查询-验证");
		solo.sleep(1000);
		boolean actual = solo.searchText("邦付宝-提现",0,true,true);
		assertEquals("提现查询列表显示失败！", actual, expected);
		
	}

}
