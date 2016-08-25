package com.bangfubao.test;
import android.util.Log;

public class CreditCard_Self extends BaseClass{
	

	public void testCreditCard_Self() throws Exception {

		int a;
		int b;
		String[] value;
		String values;
		String va;
	
		solo.sleep(3000);
		// 获取账号金额
		values = this.getValue("textView4");
		// 打印当前金额
		Log.i(TAG, values);
		// 分割小数点取整数
		value = values.split("\\.");
		a = Integer.parseInt(value[0].trim());
		solo.searchText("账户总额");
		solo.sleep(3);
		solo.clickOnText("信用卡还款");
		this.clickByStringId("tv_bankNM", 1);
		solo.clickOnText("中国建设银行");
		this.enterValueById("edt_bankNo", "xxxxxxxxxx", 1);
		this.enterValueById("edt_name", "xxxxx", 1);
		this.enterValueById("edt_payment", "10", 1);
		this.clickByStringId("btn_submit", 1);
		this.clickByStringId("pay_password", 1);
		this.enterPayPwdHw();
		this.clickByStringId("btn_confirm", 1);
		this.clickByStringId("btn_finish", 2);
		// 计算提现成功后的金额
		b = a - 10;
		// 转换该金额为字符串
		va = String.valueOf(b);
		Log.i(TAG, va);
		values = this.getValue("textView4");
		value = values.split("\\.");
		Log.i(TAG, value[0]);
		assertEquals(value[0], va);

        
	}
}
