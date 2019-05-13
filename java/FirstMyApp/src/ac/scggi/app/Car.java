package ac.scggi.app;

public class Car {
	String manufacturer;//������
	String color;
	int price;
	String oilType;
	String transType;
	String name;
	// ������, ������ �Լ�(constructor)
	// �ν��Ͻ��� ������ �� ����Ǵ� �Լ�.
	// ������ �Լ��� �������� ����
	public Car(String manufacturer, String color, int price, String oilType, String transType, String name) {
		// this�� ���������� �ν��Ͻ� ������ ����
		// shadowing : ������ �̸��� ������ ���, �ν��Ͻ� ������ ���������� ���ؼ� �������� ��.
		this.manufacturer = manufacturer;
		this.color = color;
		this.price = price;
		this.oilType = oilType;
		this.transType = transType;
		this.name = name;
	}
	// �ν��ϼ� �Լ�
	public void showInfo() {
		System.out.println(manufacturer);
		System.out.println(color);
		System.out.println(price);
		System.out.println(oilType);
		System.out.println(transType);
		System.out.println(name);
	}
}