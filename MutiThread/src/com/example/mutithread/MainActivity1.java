package com.example.mutithread;

import java.io.IOException;
import java.net.MalformedURLException;
import java.net.URL;

import android.R.drawable;
import android.support.v7.app.ActionBarActivity;
import android.widget.ImageView;
import android.graphics.drawable.Drawable;
import android.os.Bundle;
import android.os.Handler;
import android.os.Message;
import android.os.SystemClock;

public class MainActivity1 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main1);
		loadImage2("http://www.baidu.com/img/baidu_logo.gif", R.id.i1);
		loadImage2("http://www.chinatelecom.com.cn/images/logo_new.gif",
				R.id.i2);
		loadImage2("http://cache.soso.com/30d/img/web/logo.gif", R.id.i3);
		loadImage2("http://csdnimg.cn/www/images/csdnindex_logo.gif", R.id.i4);
	}

	final Handler handler2 = new Handler() {
		@Override
		public void handleMessage(Message msg) {
			((ImageView) findViewById(msg.arg1))
					.setImageDrawable((Drawable) msg.obj);
		}
	};

	public void loadImage2(final String url, final int id) {
		Thread thread = new Thread() {
			@Override
			public void run() {
				super.run();
				Drawable drawable = null;
				try {
					drawable = Drawable.createFromStream(
							new URL(url).openStream(), "image.png");

					// 模拟网络延时
					SystemClock.sleep(2000);

					// 更新UI需要放到主线程
					Message message = handler2.obtainMessage();
					message.arg1 = id;
					message.obj = drawable;
					handler2.sendMessage(message);

				} catch (MalformedURLException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				} catch (IOException e) {
					// TODO Auto-generated catch block
					e.printStackTrace();
				}
			}
		};
		thread.start();
		thread = null;

	}
}
