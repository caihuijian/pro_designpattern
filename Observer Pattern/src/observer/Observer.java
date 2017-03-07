package observer;

import subject.Subject;

public abstract class Observer {
	protected Subject subject;

	public abstract void update();
}
