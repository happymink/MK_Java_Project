package class6;

public class MathEx {

	public static void main(String[] args) {
		double a = 3.5;
		System.out.println(Math.PI); //������ ��� ���
		System.out.println(Math.ceil(a));//�ø�
		System.out.println(Math.floor(a));//����
		System.out.println(Math.sqrt(9)); //������
		System.out.println(Math.exp(2)); //e�� 2��
		System.out.println(Math.round(3.14)); //�ݿø�
		
		
		//[1,45] ������ ������ ���� 5�� �߻�
		
		System.out.println("�̹��� ����� ��ȣ�� ");
		for(int i = 0; i<5; i++)
			System.out.print((int)(Math.random()*45+1)+" "); //���� �߻�
	}
}