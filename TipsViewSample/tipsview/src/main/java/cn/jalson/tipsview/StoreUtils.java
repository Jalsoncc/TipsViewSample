package cn.jalson.tipsview;
import android.content.Context;
import android.content.SharedPreferences;

/**
 * @Description:
 * @Copyright:Copyright (c) 2016
 * @File: StoreUtils.java
 * @Author: fangchao
 * @Create ：16/3/9 下午12:00
 * @Package: cn.jalson.tipsview
 * @Version: 1.0
 */
public class StoreUtils {
	private Context context;

	public StoreUtils(Context context) {
		this.context = context;

	}

	boolean hasShown(int id) {
		return context.getSharedPreferences("showtips", Context.MODE_PRIVATE).getBoolean("id" + id, false);
	}

	void storeShownId(int id) {
		SharedPreferences internal = context.getSharedPreferences("showtips", Context.MODE_PRIVATE);
		internal.edit().putBoolean("id" + id, true).apply();
	}
}
