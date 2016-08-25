package com.bangfubao.test;

import android.util.Log;

public class BangYingBao_Income extends BaseClass{
	
public void testBangYingBao_Income() throws Exception{
		
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
		solo.clickOnText("邦盈宝");
		this.clickByStringId("rb_transfer_in_byb", 1);
		this.enterValueById("edt_bofrechargeMoney","100", 1);
		this.clickByStringId("btn_bof_chengeoverIn", 1);
		this.clickByStringId("edt_payPwd", 1);
		this.enterPayPwdHw();
		this.clickByStringId("btn_commit_pay", 1);
		this.clickByStringId("btn_next", 2);
		// 计算提现成功后的金额
		b = a - 100;
		// 转换该金额为字符串
		va = String.valueOf(b);
		Log.i(TAG, va);
		values = this.getValue("textView4");
		value = values.split("\\.");
		Log.i(TAG, value[0]);
		assertEquals(value[0], va);
		
		
	}

}
