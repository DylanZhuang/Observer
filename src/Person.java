
public class Person implements InternetBarService{
	private String name;
	
	public Person(String name) {
		this.name = name;
	}

	@Override
	public void onRecharge(int money) {
		System.out.println(name + " ��ֵ" + money + "Ԫ�ɹ�");
	}
}
