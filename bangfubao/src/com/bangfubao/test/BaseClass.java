package com.bangfubao.test;

import com.bangfubao.utils.ViewFetcher;
import com.bangfubao.utils.tools;
import com.robotium.solo.Solo;
import android.app.Activity;
import android.test.ActivityInstrumentationTestCase2;
import android.util.Log;
import android.view.View;
import android.widget.EditText;
import android.widget.TextView;
import junit.framework.AssertionFailedError;
import org.junit.Test;

public class BaseClass extends ActivityInstrumentationTestCase2 {

	public Solo solo;

	public Activity activity;
	
	private ViewFetcher viewFetcher;

	private static Class<?> launchActivityClass;

	private static String mainActiviy = "com.anbang.pay.StartPageActivity";

	private static String packageName = "com.anbang.pay";

	protected static final String TAG = "log";
	
	 

	static {

		try {

			launchActivityClass = Class

					.forName(mainActiviy);

		} catch (ClassNotFoundException e) {

			throw new RuntimeException(e);

		}

	}

	@SuppressWarnings("unchecked")

	public BaseClass() {

		super(packageName, launchActivityClass);

	}

	@Override

	protected void setUp() throws Exception {
		
		this.activity = getActivity();
	    solo = new Solo(getInstrumentation(),this.activity);
	    this.viewFetcher=new ViewFetcher(solo,this.getInstrumentation());
	    //solo.getConfig().screenshotSavePath = Environment.getExternalStorageDirectory() + "/Robotium-Screenshots/" + this.getClass().getSimpleName() + "/";
	    Log.i(TAG, solo.getConfig().screenshotSavePath);
		super.setUp();
		tools.wakeUpAndUnlock(activity);
		this.login("13716983483");

	}

	@Override

	public void tearDown() throws Exception {

		try {

			this.solo.finishOpenedActivities();

		} catch (Throwable e) {

			e.printStackTrace();

		}

		this.activity.finish();

		super.tearDown();

	}

	@Override

	public void runTest() throws Throwable {
		
		int i = 2;
		while (i > 0) {
			try {
				Log.i(TAG, "begin");
				super.runTest();
				break;

			} catch (Throwable e) {
				if (i > 1) {
					Log.i(TAG, "fail,重跑" + i);
					i--;
					tearDown();
					setUp();
					continue;

				} else {
					solo.takeScreenshot(this.getClass().getSimpleName());
					throw e;

				}

			}

		}

	}
	
		public void enterPayPwd() {
	
			solo.clickOnScreen(48, 1307);
			solo.clickOnScreen(113, 1486);
			solo.clickOnScreen(748, 1681);
			solo.clickOnScreen(539, 1490);
			solo.clickOnScreen(25, 1780);
			solo.clickOnScreen(47, 1299);
			solo.clickOnScreen(150, 1299);
			solo.clickOnScreen(267, 1299);
			solo.clickOnScreen(381, 1299);
		}
	
		public void enterPwd() {

		solo.clickOnScreen(161, 1306);
		solo.clickOnScreen(113, 1486);
		solo.clickOnScreen(748, 1681);
		solo.clickOnScreen(539, 1490);
		solo.clickOnScreen(25, 1780);
		solo.clickOnScreen(47, 1299);
		solo.clickOnScreen(150, 1299);
		solo.clickOnScreen(267, 1299);
		solo.clickOnScreen(381, 1299);

	}

	public void enterPwdHw() {
		//w
		solo.clickOnScreen(161, 1196);
		//a
		solo.clickOnScreen(110, 1376);
		//n
		solo.clickOnScreen(745, 1552);
		//g
		solo.clickOnScreen(543, 1376);
		//切换键
		solo.clickOnScreen(44, 1692);
		//1
		solo.clickOnScreen(40, 1196);
		//2
		solo.clickOnScreen(165, 1200);
		//3
		solo.clickOnScreen(271, 1189);
		//4
		solo.clickOnScreen(381, 1204);
	}

	public void enterPayPwdHw() {
		solo.clickOnScreen(51, 1193);
		solo.clickOnScreen(110, 1376);
		solo.clickOnScreen(745, 1552);
		solo.clickOnScreen(543, 1376);
		solo.clickOnScreen(44, 1692);
		solo.clickOnScreen(40, 1196);
		solo.clickOnScreen(165, 1200);
		solo.clickOnScreen(271, 1189);
		solo.clickOnScreen(381, 1204);

	}
	
	public void Unlock(View view) throws Exception{
		
		viewFetcher.touchLock(view, 1, 3, 5, 4, 7);
		solo.sleep(2000);
		
	}

	protected String getValue(String id) {
		String value;
		TextView view = null;
		view = (TextView) solo.getView(id);
		value = (String) view.getText();
		// return Integer.parseInt(money.trim());
		return value;
	}

	protected void equalsValue(String id, String s) {
		TextView view = null;
		view = (TextView) solo.getView(id);
		assertEquals(s, view.getText());
		solo.sleep(5);

	}

	protected int clickByStringId(String id, int t) {
		int number;
		View view;
		if (id == "") {
			return -1;
		}
		number = solo.getCurrentActivity().getResources().getIdentifier(id, "id",
				solo.getCurrentActivity().getPackageName());
		view = solo.getView(number);
		solo.clickOnView(view);
		solo.sleep(t);
		return 0;
	}

	protected int enterValueById(String id, String s, int t) {

		int ctrl;
		EditText v;
		if (s == "") {
			return -1;
		}
		ctrl = solo.getCurrentActivity().getResources().getIdentifier(id, "id",
				solo.getCurrentActivity().getPackageName());
		v = (EditText) solo.getView(ctrl);
		solo.enterText(v, s);
		solo.sleep(t);
		return 0;
	}

	public void dragScreen(int n, int t) {

		for (int i = 1; i <= n; i++) {
			solo.drag(947, 440, 231, 433, 1);
			solo.sleep(t);
		}

	}

	public void login(String username) {
		solo.sleep(3000);
		this.dragScreen(2, 1000);
		try {
				solo.getCurrentActivity().getResources().getIdentifier("startBtn", "id",solo.getCurrentActivity().getPackageName());
				this.clickByStringId("startBtn", 1000);
				this.enterValueById("login_tel", username, 1);
				this.clickByStringId("login_password", 1);
				this.enterPwdHw();
				solo.sleep(1000);
				solo.clickOnButton("用户登录");
				//this.clickByStringId("reset_btn", 1000);
				View v = solo.getView("nine_con");
				for(int i=0;i<2;i++){
					try {
						this.Unlock(v);
					} catch (Exception e) {
						// TODO Auto-generated catch block
						e.printStackTrace();
					}
				}
				this.clickByStringId("btn_cancel", 1000);
			

		} catch (AssertionFailedError e) {
			Log.i(TAG, "非首次登录！");
			
			if(solo.searchText("手势密码")){
				View v2 = solo.getView("nine_con");
				try {
					this.Unlock(v2);
				} catch (Exception e1) {
					e1.printStackTrace();
				}
			}else{
				this.enterValueById("login_tel", username, 1);
				this.clickByStringId("login_password", 1);
				this.enterPwdHw();
				solo.sleep(1000);
				solo.clickOnButton("用户登录");
			}
		

		}

	}

}
