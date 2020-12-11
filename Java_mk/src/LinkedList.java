
// List�� �����ϴ� Node Ŭ����
class ListNode{
    private String data;    // ������ ���� ����
    public ListNode link;    // �ٸ� ��带 ������ ��ũ ���
    
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
    
    private ListNode head;    // ListNode Ÿ���� head ��� �ν��Ͻ� ����
    
    // LinkedList ������
    public LinkedList() {
        head = null;    // head ��� �ʱ�ȭ
    }
 
    // a��ŭ ���� ������
    public LinkedList(int a) {
    	for (int i = 0; i<a ; i++)
    	{
    		insertNode(a+"Stock");
    	}
    }
    
    // Node ���� (�������� ����)
    public void insertNode(String data) {
        ListNode newNode = new ListNode(data);    // ���ο� ��� ����
        if(head == null) {
            // head ��尡 null�� ��� ���ο� ��带 �����ϵ��� ��
            this.head = newNode;
        } else {
            ListNode tempNode = head;
     
            while(tempNode.link != null) {
                tempNode = tempNode.link;    // ���� ��带 ����
            }
            
            // tempNode(������ ���)�� link�� ���� ��带 �����ϵ��� ��. 
            tempNode.link = newNode;
        }
    }
    
    
    // Node ����(������ ��� ����)
    public void deleteNode() {
        ListNode preNode;
        ListNode tempNode;
        
        // head ��尡 null�� ��� ��� ��尡 �����Ǿ����Ƿ� return
        if(head == null) {
            return;
        }
        
        // head ����� link�� null�� ���
        // ��尡 1�� ������ ���
        if(head.link == null) {
            // head�� null�� �Ҵ��Ͽ� ���� ������ ������ ����.
            head = null;
        } else {
            // preNode�� head�� ����Ű�� ��带 �Ҵ�
            preNode = head;
            // tempNode�� head�� ����Ű�� ����� ���� ���. ��, preNode�� ���� ��带 �Ҵ�
            tempNode = head.link;     
         
            while(tempNode.link != null) {
                preNode = tempNode;
                tempNode = tempNode.link;
            }
            // preNode�� link�� null�� ���� ���� ������ ��带 ����
            // ��, preNode�� ���� ����� tempNode���� ������ ����.
            preNode.link = null;
        }
    }
    
    }
    
 
 
