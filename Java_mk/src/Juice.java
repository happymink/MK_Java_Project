

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
		private static int [] Stock = {50,3,3,3,3};
		
		public void setindex(int index) {
			this.index = index;
		}
		
		public int getindex() {
			return index;
		}
		
		public void setStock(int a, int index) {
			this.Stock[index] =a;
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
			this.Profit_money += price;
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
		
		public void setCoinWallet(int index) {
			CoinWallet[index] += 1;
		}
		
		public void setMinusCoin(int index, int count) {
			CoinWallet[index] -= 1;
		}
		
		public void setPlusCoin(int index, int count) {
			CoinWallet[index] += 1;
		}
		
		public String getpassword() {
			return password;
		}
		
		public void setpassword(String password) {
			this.password= password;
		}
		
		
	}


