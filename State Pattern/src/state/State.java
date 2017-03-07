package state;

import context.Context;

public interface State {
	public String toString();
	// 首先电梯门开启动作
	public void open(Context context);

	// 电梯门关闭动作
	public void close(Context context);

	// 电梯运行状态
	public void run(Context context);

	// 电梯停止状态
	public void stop(Context context);
}
