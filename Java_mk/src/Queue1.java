/* * Java를 이용한 큐 구현 */
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
	
	/** * 데이터 입력 * * @param number */ 
	public void enQueue(int number) {
		if (tail == array.length - 1) 
			throw new RuntimeException("큐가 다 찼습니다.");
		// 입력시에 tail을 증가
		array[++tail] = number; 
		}
	/** * 데이터 반환 * * @return */
	
	
	public int deQueue(){
		if (tail == -1) throw new RuntimeException("큐에 데이터가 없습니다.");
		// 메모리 반환을 위한 초기화
		int temp = array[++head];
		array[head] = -1; 
		// head, tail이 같다면 인덱스 초기화
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
	

	public boolean isEmpty() {		//큐에 데이터가 없습니다.
		return (tail == -1);
	}
	
	public boolean isFull() {		//큐에 데이터가 다 찼습니다.
		return (tail == array.length-1);
	}
	
	public void showQueue() {
		for(int i = head+1; i <array.length; i++) {
			System.out.println(array[i]);
		}
	}
	
	
	}
	


