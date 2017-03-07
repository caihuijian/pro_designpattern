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

public class MainActivity3 extends ActionBarActivity {

	@Override
	protected void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.activity_main2);
		loadImage4("http://www.baidu.com/img/baidu_logo.gif", R.id.i1);
		loadImage4("http://www.chinatelecom.com.cn/images/logo_new.gif",
				R.id.i2);
		loadImage4("http://cache.soso.com/30d/img/web/logo.gif", R.id.i3);
		loadImage4("http://csdnimg.cn/www/images/csdnindex_logo.gif", R.id.i4);
	}

	private AsyncImageLoader3 asyncImageLoader3 = new AsyncImageLoader3();

	// �����̳߳أ��������ڴ滺�湦��,�����ⲿ���÷�װ�˽ӿڣ��򻯵��ù���
	private void loadImage4(final String url, final int id) {
		// ���������ͻ�ӻ�����ȡ��ͼ��ImageCallback�ӿ��з���Ҳ���ᱻִ��
		Drawable cacheImage = asyncImageLoader3.loadDrawable(url,
				new AsyncImageLoader3.ImageCallback() {
					// ��μ�ʵ�֣������һ�μ���urlʱ���淽����ִ��
					public void imageLoaded(Drawable imageDrawable) {
						((ImageView) findViewById(id))
								.setImageDrawable(imageDrawable);
					}
				});
		if (cacheImage != null) {
			((ImageView) findViewById(id)).setImageDrawable(cacheImage);
		}
	}
}
