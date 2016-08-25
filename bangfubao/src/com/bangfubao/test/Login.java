package com.bangfubao.test;

public class Login extends BaseClass {
	
	public void testLogin() throws Exception {
		solo.searchText("账户总额");
		solo.sleep(3);
		solo.clickOnText("设置");
		this.clickByStringId("btn_psw_manager",1000);
		if(solo.searchText("设置手势密码")){
			this.clickByStringId("switch1",1000);
			this.clickByStringId("pay_password",1000);
			this.enterPwdHw();
			this.clickByStringId("confirm",1000);
		}else{
			solo.goBack();
			solo.clickOnText("账户管理");
			solo.clickOnButton("安全退出");
			solo.clickOnButton("确定");
		}
		

	}

}
