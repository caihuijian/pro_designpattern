package media;

import java.util.ArrayList;

public class Media {
	static Media s_instance = null;

	// Create Singleton
	public static Media getInstance() {
		synchronized (Media.class) {
			if (null == s_instance) {
				s_instance = new Media();
			}
			return s_instance;
		}
	}

	private Media() {
	}
	
	public void play(){
		//this is just for test
		sendPlayingMessageActivitis("play one song copelete ");
	}

	public interface PlayingListener {
		public void onMediaPlayNotify(String process);
	}

	private final ArrayList<PlayingListener> m_MediaPlayListeners = new ArrayList<PlayingListener>();

	private void sendPlayingMessageActivitis(String process) {
		String notifyInfo = process;// this can be object
		for (int i = 0; i < m_MediaPlayListeners.size(); i++) {
			m_MediaPlayListeners.get(i).onMediaPlayNotify(notifyInfo);
		}
	}

	/* Add listener function */
	public void addMediaPlayerListener(PlayingListener listener) {
		synchronized (m_MediaPlayListeners) {
			// if current listener is null
			if (null == listener)
				return;
			// if do not contains this listener, add to the memberSDUSBNotifyID
			if (!m_MediaPlayListeners.contains(listener)) {
				m_MediaPlayListeners.add(listener);
			}
		}
	};

	/* Remove the listener */
	public void removeMediaPlayerListener(PlayingListener listener) {
		synchronized (m_MediaPlayListeners) {
			// if current listener is null
			if (null == listener)
				return;
			int iIndex = m_MediaPlayListeners.indexOf(listener);
			if (iIndex >= 0) {
				m_MediaPlayListeners.remove(iIndex);
			}

		}
	};

}
