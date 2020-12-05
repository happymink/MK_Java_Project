

	public class Juice extends Object{
		
		
		private static String name;
		private static int price;
		private static int money;
		private static int Profit_money;
		private static String password="12345";
		private int index;
		private String [] product_name = {"생수", "일반 커피", "이온 음료", "고급 커피", "탄산 음료"};
		private int [] product_price = {450, 500, 550, 700, 750}; 
		private static int [] CoinWallet = {5,5,5,5,5};
		private static int [] Stock = {3,3,3,3,3};
		
		LinkedList Stock0 = new LinkedList();    // 연결 리스트 생성
        LinkedList Stock1 = new LinkedList();
        LinkedList Stock2 = new LinkedList();
        LinkedList Stock3 = new LinkedList();
        LinkedList Stock4 = new LinkedList();
        
      
        
		public void setindex(int index) {
			this.index = index;
		}
		
		public int getindex() {
			return index;
		}
		
		public void setStock(int index,int a) {
			this.Stock[index] =a;
		}
		
		public void setMiounsStock(int index) {
			this.Stock[index] -=1 ;
		}
	
		
		public int getStock(int index) {
			return Stock[index];
		}
		
		public String getproductname(int i) {
			return product_name[i];
		}
		
		public void setproductname(int a, String b) {
			this.product_name[a]  = b;
			}
		
		public int getproductprice(int i) {
			return product_price[i];
		}
		
		public void setproductprice(int a, int b) {
			this.product_price[a]  = b;
			}
		
		public int getProfit_money() {
			return Profit_money;
		}
		
		public void setProfit_money(int price) {
			this.Profit_money = price;
		}
		
		public String getName() {
			return name;
		}
		public void setName(String name) {
			this.name = name;
		}
		
		public int getPrice() {
			return price;
		}
		public void setPrice(int price) {
			this.price = price;
		}
		public int getMoney() {
			return money;
		}
		public void setMoney(int money) {
			this.money = money;
		}
		
		public int getCoinWallet(int index) {
			return CoinWallet[index];
		}
		
		public void setCoinWallet(int index, int a) {
			this.CoinWallet[index] = a;
		}
		
		public void setMinusCoin(int index) {
			CoinWallet[index] -= 1;
		}
		
		public void setPlusCoin(int index) {
			CoinWallet[index] += 1;
		}
		
		public String getpassword() {
			return password;
		}
		
		public void setpassword(String password) {
			this.password= password;
		}
		
		public void PlusStock(String name) {
			if (name==getproductname(0)) {
			Stock0.insertNode( product_name[0]);
			Stock[0] +=1 ;
			} else if (name== getproductname(1)) {
				 Stock1.insertNode( product_name[1]);
				 Stock[1] +=1 ;
			} else if (name== getproductname(2)) {
				 Stock2.insertNode( product_name[2]);
				 Stock[2] +=1 ;
			} else if (name== getproductname(3)) {
				 Stock3.insertNode( product_name[3]);
				 Stock[3] +=1 ;
			} else if (name== getproductname(4)) {
				 Stock4.insertNode( product_name[4]);
				 Stock[4] +=1 ;
		}
		}
		
	
		public void MiounsStock(String name) {
			if (name== product_name[0]) {
			 Stock0.deleteNode();
			 Stock[0] -=1 ;
			} else if (name== product_name[0]) {
			 Stock1.deleteNode();
			 Stock[1] -=1 ;
			} else if (name== product_name[0]) {
				 Stock2.deleteNode();
				 Stock[2] -=1 ;
			} else if (name== product_name[0]) {
				 Stock3.deleteNode();
				 Stock[3] -=1 ;
			} else if (name== product_name[0]) {
					 Stock4.deleteNode();
					 Stock[4] -=1 ;
		}
		}
			
		
		public void CreatList() {
			for (int i = 0; i < 3 ; i++)
			{
				Stock0.insertNode(product_name[0]);
				Stock1.insertNode(product_name[1]);
				Stock2.insertNode(product_name[2]);
				Stock3.insertNode(product_name[3]);
				Stock4.insertNode(product_name[4]);
			}
		}
		
	}


