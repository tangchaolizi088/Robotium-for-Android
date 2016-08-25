package com.bangfubao.test;

import junit.framework.AssertionFailedError;

public class Billing_Detail extends BaseClass {
	
	public void testBilling_Detail(){
		boolean expected = true ;
		this.clickByStringId("iv_detail", 3000);
		
		if(solo.searchText("邦付宝-充值")){
			solo.clickOnView(solo.getText("邦付宝-充值"));
			solo.takeScreenshot("账单详情-验证");
			solo.sleep(1000);
			boolean actual = solo.searchText("交易号：",0,true,true);
			assertEquals("获取账单列表失败！", actual, expected);
		}else{
			throw new AssertionFailedError("无记录！");
		}
		
		}
		
	

}
