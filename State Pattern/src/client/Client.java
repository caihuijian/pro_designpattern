package client;

import state.CloseState;
import state.OpenState;
import state.RunningState;
import state.StopState;
import context.Context;

public class Client {
	public static void main(String[] args) {
		Context context = new Context();
		new OpenState().open(context);
		new CloseState().close(context);
		new RunningState().run(context);
		new StopState().stop(context);
	}
}
