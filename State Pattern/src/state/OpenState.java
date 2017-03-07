package state;

import context.Context;

public class OpenState implements State {
	@Override
	public void open(Context context) {
		System.out.println("open!!!");
		context.setState(this);
	}

	@Override
	public void close(Context context) {
	}

	@Override
	public void run(Context context) {
	}

	@Override
	public void stop(Context context) {

	}
	
	@Override
	public String toString() {
		return "open";
	}

}
