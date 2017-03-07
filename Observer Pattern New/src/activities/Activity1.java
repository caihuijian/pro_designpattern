package activities;

import media.Media;
import media.Media.PlayingListener;

public class Activity1 {
	public void Listen() {
		Media.getInstance().addMediaPlayerListener(new PlayingListener() {

			@Override
			public void onMediaPlayNotify(String process) {
				System.out.println("activity1 listen" + process);
			}
		});
	}
}
