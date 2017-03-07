package state;

import context.Context;

public class CloseState implements State {
	@Override
	public void open(Context context) {

	}

	@Override
	public void close(Context context) {
		System.out.println("close!!!");
		context.setState(this);
	}

	@Override
	public void run(Context context) {
	}

	@Override
	public void stop(Context context) {

	}

	@Override
	public String toString() {
		return "close";
	}
}
