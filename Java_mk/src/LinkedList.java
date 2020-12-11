
// List를 구성하는 Node 클래스
class ListNode{
    private String data;    // 데이터 저장 변수
    public ListNode link;    // 다른 노드를 참조할 링크 노드
    
    public ListNode() {
        this.data = null;
        this.link = null;
    }
    
    public ListNode(String data) {
        this.data = data;
        this.link = null;
    }
    
    public ListNode(String data, ListNode link) {
        this.data = data;
        this.link = link;
    }
    
    public String getData() {
        return this.data;
    }
}
public class LinkedList {
    
    private ListNode head;    // ListNode 타입의 head 노드 인스턴스 변수
    
    // LinkedList 생성자
    public LinkedList() {
        head = null;    // head 노드 초기화
    }
 
    // a만큼 수량 생성자
    public LinkedList(int a) {
    	for (int i = 0; i<a ; i++)
    	{
    		insertNode(a+"Stock");
    	}
    }
    
    // Node 삽입 (마지막에 삽입)
    public void insertNode(String data) {
        ListNode newNode = new ListNode(data);    // 새로운 노드 생성
        if(head == null) {
            // head 노드가 null인 경우 새로운 노드를 참조하도록 함
            this.head = newNode;
        } else {
            ListNode tempNode = head;
     
            while(tempNode.link != null) {
                tempNode = tempNode.link;    // 다음 노드를 참조
            }
            
            // tempNode(마지막 노드)의 link가 다음 노드를 참조하도록 함. 
            tempNode.link = newNode;
        }
    }
    
    
    // Node 삭제(마지막 노드 삭제)
    public void deleteNode() {
        ListNode preNode;
        ListNode tempNode;
        
        // head 노드가 null인 경우 모든 노드가 삭제되었으므로 return
        if(head == null) {
            return;
        }
        
        // head 노드의 link가 null인 경우
        // 노드가 1개 남았을 경우
        if(head.link == null) {
            // head에 null을 할당하여 남은 노드와의 연결을 끊음.
            head = null;
        } else {
            // preNode는 head가 가리키는 노드를 할당
            preNode = head;
            // tempNode는 head가 가리키는 노드의 다음 노드. 즉, preNode의 다음 노드를 할당
            tempNode = head.link;     
         
            while(tempNode.link != null) {
                preNode = tempNode;
                tempNode = tempNode.link;
            }
            // preNode의 link를 null로 만들어서 가장 마지막 노드를 삭제
            // 즉, preNode의 다음 노드인 tempNode로의 연결을 끊음.
            preNode.link = null;
        }
    }
    
    }
    
 
 
