package com.bangfubao.test;

import android.util.Log;

public class Billing_SpendingQuery  extends BaseClass{

	public void testBilling_SpendingQuery(){
		boolean expected = true ;
		this.clickByStringId("iv_detail", 3000);
		this.clickByStringId("btn_consumer_inquiries", 3000);
		this.clickByStringId("btn_search_consume", 3000);
		solo.takeScreenshot("消费查询-验证");
		solo.sleep(1000);
		boolean actual = solo.searchText("消费查询",0,true,true);
		assertEquals("消费查询列表显示失败！", actual, expected);
		
	}
}
