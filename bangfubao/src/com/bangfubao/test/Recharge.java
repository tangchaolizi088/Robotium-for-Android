package com.bangfubao.test;

import android.util.Log;
import com.bangfubao.utils.*;

public class Recharge extends BaseClass {
	
	public void testRecharge() throws Exception {

		String values;
		solo.sleep(3000);
		// 获取账号金额
		values = this.getValue("textView4");
		// 打印当前金额
		Log.i(TAG, values);
		solo.searchText("账户总额");
		solo.sleep(3);
		solo.clickOnText("账户充值");
		this.clickByStringId("text_bank_name", 1);
		this.enterValueById("edt_amt","10.01", 1);
		this.clickByStringId("edt_pass", 1);
		this.enterPayPwdHw();
		this.clickByStringId("btn_next", 1);
		this.clickByStringId("btn_code", 60000);
		solo.waitForText("验证码已发送，10分钟内有效");
		String vl = tools.getvalue("sb.txt");
		Log.i(TAG, vl);
		this.enterValueById("edt_smscode",vl, 1);
		this.clickByStringId("btn_ok", 5000);
		solo.getCurrentActivity();
		this.clickByStringId("btn_finish", 1000);
		solo.waitForText("充值已受理,请关注余额变化!");
		

	}

}
