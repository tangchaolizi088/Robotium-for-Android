package com.bangfubao.main;
import com.bangfubao.test.BangYingBao_Income;
import com.bangfubao.test.BangYingBao_Manager;
import com.bangfubao.test.BangYingBao_Output;
import com.bangfubao.test.Billing_Detail;
import com.bangfubao.test.Billing_OtherQuery;
import com.bangfubao.test.Billing_RechargeQuery;
import com.bangfubao.test.Billing_SpendingQuery;
import com.bangfubao.test.Billing_TransferQuery_PayinQuery;
import com.bangfubao.test.Billing_TransferQuery_PayoutQuery;
import com.bangfubao.test.Billing_TransferQuery_ToCardQuery;
import com.bangfubao.test.Billing_WithdrawQuery;
import com.bangfubao.test.BonusShop_Home;
import com.bangfubao.test.BonusShop_Manager;
import com.bangfubao.test.Book_Flight;
import com.bangfubao.test.CreditCard_Other;
import com.bangfubao.test.CreditCard_Self;
import com.bangfubao.test.Login;
import com.bangfubao.test.Recharge;
import com.bangfubao.test.Transfer_Account;
import com.bangfubao.test.Transfer_Card;
import com.bangfubao.test.Withdraw;
import junit.framework.TestSuite;

public class BangFuBaoSuite {
	
	public static TestSuite getTestSuite(){
		
		TestSuite suite = new TestSuite();
		suite.addTestSuite(Login.class);
		suite.addTestSuite(Transfer_Card.class);
		suite.addTestSuite(Recharge.class);
		suite.addTestSuite(Withdraw.class);
		suite.addTestSuite(CreditCard_Other.class);
		suite.addTestSuite(CreditCard_Self.class);
		suite.addTestSuite(Transfer_Account.class);
		suite.addTestSuite(BangYingBao_Income.class);
		suite.addTestSuite(BangYingBao_Output.class);
		suite.addTestSuite(BonusShop_Manager.class);
		suite.addTestSuite(BonusShop_Home.class);
		suite.addTestSuite(Book_Flight.class);
		suite.addTestSuite(BangYingBao_Manager.class);
		suite.addTestSuite(Billing_RechargeQuery.class);
		suite.addTestSuite(Billing_WithdrawQuery.class);
		suite.addTestSuite(Billing_TransferQuery_PayoutQuery.class);
		suite.addTestSuite(Billing_TransferQuery_PayinQuery.class);
		suite.addTestSuite(Billing_TransferQuery_ToCardQuery.class);
		suite.addTestSuite(Billing_SpendingQuery.class);
		suite.addTestSuite(Billing_OtherQuery.class);
		suite.addTestSuite(Billing_Detail.class);
		return suite;
		
	}
	


}
