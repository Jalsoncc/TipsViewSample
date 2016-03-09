package cn.jalson.tipsview;
import android.app.Activity;
import android.graphics.drawable.Drawable;
import android.view.View;

/**
 * @Description:
 * @Copyright:Copyright (c) 2016
 * @File: TipsBuilder.java
 * @Author: fangchao
 * @Create ：16/3/9 下午12:01
 * @Package: cn.jalson.tipsview
 * @Version: 1.0
 */
public class TipsBuilder {
	TipsView TipsView;

	public TipsBuilder(Activity activity) {
		this.TipsView = new TipsView(activity);
	}

	/**
	 * Set highlight view. All view will be highlighted
	 * 
	 * @param v
	 *            Target view
	 * @return TipsBuilder
	 */
	public TipsBuilder setTarget(View v) {
		this.TipsView.setTarget(v);
		return this;
	}

	/**
	 * Set highlighted view with custom center and radius
	 * 
	 * @param v
	 *            Target View
	 * @param x
	 *            circle center x according target
	 * @param y
	 *            circle center y according target
	 * @param radius
	 * @return
	 */
	public TipsBuilder setTarget(View v, int x, int y, int radius) {
		TipsView.setTarget(v, x, y, radius);

		return this;
	}

	public TipsView build() {
		return TipsView;
	}

	public TipsBuilder setTitle(String text) {
		this.TipsView.setTitle(text);
		return this;
	}

	public TipsBuilder setDescription(String text) {
		this.TipsView.setDescription(text);
		return this;
	}

	public TipsBuilder displayOneTime(int showtipId) {
		this.TipsView.setDisplayOneTime(true);
		this.TipsView.setDisplayOneTimeID(showtipId);
		return this;
	}

	public TipsBuilder setCallback(TipsViewInterface callback) {
		this.TipsView.setCallback(callback);
		return this;
	}

	public TipsBuilder setDelay(int delay) {
		TipsView.setDelay(delay);
		return this;
	}

	public TipsBuilder setTitleColor(int color) {
		TipsView.setTitle_color(color);
		return this;
	}

	public TipsBuilder setDescriptionColor(int color) {
		TipsView.setDescription_color(color);
		return this;
	}
	
	public TipsBuilder setDrawable(Drawable drawable) {
		TipsView.setDrawable(drawable);
		return this;
	}
	public TipsBuilder setCircle(boolean isCircle) {
		TipsView.setCircle(isCircle);
		return this;
	}

	public TipsBuilder setBackgroundColor(int color) {
		TipsView.setBackground_color(color);
		return this;
	}

	public TipsBuilder setCircleColor(int color) {
		TipsView.setCircleColor(color);
		return this;
	}

	public TipsBuilder setButtonVisibble(boolean visible){
		TipsView.setButtonVisible(visible);
		return this;
	}

	public TipsBuilder setButtonText(String text){
		TipsView.setButtonText(text);
		return this;
	}

	public TipsBuilder setButtonTextColor(int color){
		TipsView.setButtonTextColor(color);
		return this;
	}
}
