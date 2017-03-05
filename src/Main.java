
public class Main {
	public static void main(String[] args) {
		//初始化网吧管理对象
		InternetBarManager manager = new InternetBarManager();
		//新建一个person对象
		Person person = new Person("dylan");
		
		System.out.println("dylan 进行上机操作");
		manager.registerObserver(person);
		
		//充值
		manager.recharge(5);
		
		System.out.println("dylan 进行下机操作");
		manager.unregisterObserver();
	}
}
