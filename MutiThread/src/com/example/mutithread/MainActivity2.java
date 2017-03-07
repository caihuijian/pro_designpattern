package com.example.mutithread;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;

import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.SystemClock;

public class MainActivity2 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		loadImage3("http://www.baidu.com/img/baidu_logo.gif", R.id.i1);
		loadImage3("http://www.chinatelecom.com.cn/images/logo_new.gif",
				R.id.i2);
		loadImage3("http://cache.soso.com/30d/img/web/logo.gif", R.id.i3);
		loadImage3("http://csdnimg.cn/www/images/csdnindex_logo.gif", R.id.i4);
	}

	private ExecutorService executorService = Executors.newFixedThreadPool(5);
	private Handler handler = new Handler();

	// 引入线程池来管理多线程
	public void loadImage3(final String url, final int id) {
		executorService.submit(new Runnable() {

			@Override
			public void run() {
				try {
					final Drawable drawable = Drawable.createFromStream(
							new URL(url).openStream(), "image.png");

					// 模拟网络延时
					SystemClock.sleep(2000);

					handler.post(new Runnable() {
						public void run() {
							if (null != drawable) {
								((ImageView) findViewById(id))
										.setImageDrawable(drawable);
							}
						}
					});

				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}

			}
		});
	}
}
