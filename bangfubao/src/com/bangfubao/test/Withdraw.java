package com.bangfubao.test;


import android.util.Log;

public class Withdraw extends BaseClass {
	

	public void  testWithdraw() throws Exception {
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
		solo.clickOnText("账户提现");
		this.clickByStringId("text_bank_name", 1);
		this.enterValueById("input_withdraw_money", "10", 1);
		this.clickByStringId("btn_withdraw_next", 1);
		this.clickByStringId("edt_payPwd", 2);
		this.enterPayPwdHw();
		this.clickByStringId("btn_commit_pay", 2);
		solo.searchText("10.00元");
		this.clickByStringId("btn_finish", 1);
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
