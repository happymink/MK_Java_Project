
public class practice {
	public static void main(String[] args) {
		
		Book book1 = new Book("JAVA", 20, "GROOM");
		book1.Print();
		
	}
}

class Book{
	String Name;
	int page;
	String Author;
	
	Book(String inputName, int inputPage, String inputAuthor){
		Name = inputName;
		page = inputPage;
		Author = inputAuthor;
	}
	
	void Print() {
		System.out.println(Name + "/" + Author + "/" + page);
	}
}