package com.bangfubao.test;

import android.util.Log;
import android.widget.TextView;

public class Transfer_Card  extends BaseClass{
	
	public void testTransfer_Card() throws Exception  {
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
		solo.clickOnText("账户转账");
		this.clickByStringId("btn_transfer_to_bankcard", 1);
		this.enterValueById("edt_bankno", "xxxxxxxxxxxx", 1);
		//this.clickByStringId("text_bank_name", 2);
		//solo.clickOnText("请选择发卡行");
		this.clickByStringId("text_bank_name", 3);
		solo.clickOnText("中国工商银行");
		this.enterValueById("input_transfer_money", "1", 1);
		this.clickByStringId("btn_transfer_next", 1);
		this.clickByStringId("edt_payPwd", 1);
		this.enterPayPwdHw();
		this.clickByStringId("btn_commit_pay", 2);
		this.clickByStringId("btn_finish", 2);
		// 计算提现成功后的金额
		b = a - 1;
		// 转换该金额为字符串
		va = String.valueOf(b);
		Log.i(TAG, va);
		values = this.getValue("textView4");
		value = values.split("\\.");
		Log.i(TAG, value[0]);
		assertEquals(value[0], va);

	}
	

}
