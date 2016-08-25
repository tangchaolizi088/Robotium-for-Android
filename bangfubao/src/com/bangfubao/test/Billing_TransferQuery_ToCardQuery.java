package com.bangfubao.test;

public class Billing_TransferQuery_ToCardQuery extends BaseClass {
	
	public void testBilling_TransferQuery_ToCardQuery(){
		boolean expected = true ;
		this.clickByStringId("iv_detail", 3000);
		this.clickByStringId("btn_transfer_query", 3000);
		this.clickByStringId("btn_search_transfer_to_bankcard", 3000);
		solo.takeScreenshot("转账查询-验证");
		solo.sleep(1000);
		boolean actual = solo.searchText("邦付宝-转账",0,true,true);
		assertEquals("转账查询列表显示失败！", actual, expected);
		
	}

}
