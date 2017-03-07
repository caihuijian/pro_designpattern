package state;

import context.Context;

public interface State {
	public String toString();
	// ���ȵ����ſ�������
	public void open(Context context);

	// �����Źرն���
	public void close(Context context);

	// ��������״̬
	public void run(Context context);

	// ����ֹͣ״̬
	public void stop(Context context);
}
