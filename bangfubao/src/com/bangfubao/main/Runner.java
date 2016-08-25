package com.bangfubao.main;

import android.test.InstrumentationTestRunner;
import junit.framework.TestSuite;

public class Runner extends InstrumentationTestRunner {
	@Override
	public TestSuite getTestSuite(){
		TestSuite suite = new TestSuite();
		suite.addTest(BangFuBaoSuite.getTestSuite());
		return suite;
		
	}

}
