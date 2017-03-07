package state;

import context.Context;

public class RunningState implements State {
	@Override
	public void open(Context context) {

	}

	@Override
	public void close(Context context) {

	}

	@Override
	public void run(Context context) {
		System.out.println("running!!!");
		context.setState(this);
	}

	@Override
	public void stop(Context context) {

	}
	
	@Override
	public String toString() {
		return "running";
	}

}
