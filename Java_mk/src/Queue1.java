/* * Java�� �̿��� ť ���� */
public class Queue1 extends Object{
	
	private int[] array;
	private int head;
	private int tail;
	private int size;
//	public Queue1(int size){
//		
//		head = -1;
//		tail = -1; 
//		this.size = size;
//		array = new int[this.size];
//		}
	public Queue1(){}
	
	
	public void Creat_Queue(int size){
	
	head = -1;
	tail = -1; 
	this.size = size;
	array = new int[this.size];
	}
	
	/** * ������ �Է� * * @param number */ 
	public void enQueue(int number) {
		if (tail == array.length - 1) 
			throw new RuntimeException("ť�� �� á���ϴ�.");
		// �Է½ÿ� tail�� ����
		array[++tail] = number; 
		}
	/** * ������ ��ȯ * * @return */
	
	
	public int deQueue(){
		if (tail == -1) throw new RuntimeException("ť�� �����Ͱ� �����ϴ�.");
		// �޸� ��ȯ�� ���� �ʱ�ȭ
		int temp = array[++head];
		array[head] = -1; 
		// head, tail�� ���ٸ� �ε��� �ʱ�ȭ
		if (head == tail) {
			head = -1;
			tail = -1; 
			} 
		return temp;
		}
	
	public int Queuelength() {
		return (tail-head);
	}
	
	
	
	public void fillQueue(int a) {
		for(int i = 0 ; i < a; i++) {
			
			enQueue(i);
			
		}
	}
	

	public boolean isEmpty() {		//ť�� �����Ͱ� �����ϴ�.
		return (tail == -1);
	}
	
	public boolean isFull() {		//ť�� �����Ͱ� �� á���ϴ�.
		return (tail == array.length-1);
	}
	
	public void showQueue() {
		for(int i = head+1; i <array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	}
	


