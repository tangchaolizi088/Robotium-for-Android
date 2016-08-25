package com.bangfubao.test;

public class Billing_OtherQuery extends BaseClass{
	
	public void testBilling_OtherQuery(){
		boolean expected = true ;
		this.clickByStringId("iv_detail", 3000);
		this.clickByStringId("btn_consumer_inquiries", 3000);
		this.clickByStringId("btn_search_other", 3000);
		solo.takeScreenshot("其他查询-验证");
		solo.sleep(1000);
		boolean actual = solo.searchText("其他账单",0,true,true);
		assertEquals("其他查询列表显示失败！", actual, expected);
		
	}

}
