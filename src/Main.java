
public class Main {
	public static void main(String[] args) {
		//��ʼ�����ɹ������
		InternetBarManager manager = new InternetBarManager();
		//�½�һ��person����
		Person person = new Person("dylan");
		
		System.out.println("dylan �����ϻ�����");
		manager.registerObserver(person);
		
		//��ֵ
		manager.recharge(5);
		
		System.out.println("dylan �����»�����");
		manager.unregisterObserver();
	}
}
