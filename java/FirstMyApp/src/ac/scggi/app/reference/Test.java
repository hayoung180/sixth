package ac.scggi.app.reference;

public class Test {
	// �ν��Ͻ� �Լ�
	public void pupAge() {
		int age = 0; // �ʱ�ȭ ���� �ʰ� ���� ���� �߻�
		age = age + 7;
		System.out.println("Puppy age is : " + age);
	}

	public static void main(String args[]) {
		Test test = new Test();
		test.pupAge();
	}
}