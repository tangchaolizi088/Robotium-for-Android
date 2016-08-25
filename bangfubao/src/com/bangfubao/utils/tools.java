package com.bangfubao.utils;

import java.io.BufferedReader;
import java.io.BufferedWriter;
import java.io.File;
import java.io.FileReader;
import java.io.FileWriter;

import android.app.KeyguardManager;
import android.content.Context;
import android.os.Environment;
import android.os.PowerManager;
import android.util.Log;

public class tools {

	private static final String TAG = "log";

	public void writen(String f, String content) {
		try {
			File file = new File(Environment.getExternalStorageDirectory(), f);
			BufferedWriter bw = new BufferedWriter(new FileWriter(file));
			bw.write(content);
			bw.flush();
			Log.i("log", "写入成功");
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	public static boolean isSdCardExist() {
		return Environment.getExternalStorageState().equals(Environment.MEDIA_MOUNTED);
	}

	public static String getSdCardPath() {
		boolean exist = isSdCardExist();
		String sdpath = "";
		if (exist) {
			sdpath = Environment.getExternalStorageDirectory().getAbsolutePath();
		} else {
			sdpath = "不适用";
		}
		return sdpath;

	}

	public static String getvalue(String t) {
		try {
			File file = new File(Environment.getExternalStorageDirectory(), t);
			BufferedReader br = new BufferedReader(new FileReader(file));
			String readline = "";
			StringBuffer sb = new StringBuffer();
			while ((readline = br.readLine()) != null) {
				System.out.println("readline:" + readline);
				sb.append(readline);
			}
			br.close();

			Log.i(TAG, "读取成功：" + sb.toString());
			return sb.toString();
		} catch (Exception e) {
			e.printStackTrace();
		}
		return null;

	}

	@SuppressWarnings("deprecation")
	public static void wakeUpAndUnlock(Context context) {

		KeyguardManager km = (KeyguardManager) context.getSystemService(Context.KEYGUARD_SERVICE);

		KeyguardManager.KeyguardLock kl = km.newKeyguardLock("unLock");

		kl.disableKeyguard();
	

		PowerManager pm = (PowerManager) context.getSystemService(Context.POWER_SERVICE);

		PowerManager.WakeLock wl = pm.newWakeLock(PowerManager.ACQUIRE_CAUSES_WAKEUP | PowerManager.SCREEN_DIM_WAKE_LOCK, "log");

		wl.acquire();

		wl.release();
	}

}
