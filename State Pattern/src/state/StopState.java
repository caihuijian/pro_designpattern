package state;

import context.Context;

public class StopState implements State {
	@Override
	public void open(Context context) {
	}

	@Override
	public void close(Context context) {
	}

	@Override
	public void run(Context context) {
	}

	@Override
	public void stop(Context context) {
		System.out.println("stop!!!");
		context.setState(this);
	}

	@Override
	public String toString() {
		return "stop";
	}
}
