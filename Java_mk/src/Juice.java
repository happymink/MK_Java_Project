

	public class Juice extends Object{
		private static String name;
		private static int price;
		private static int money;
		private static int Profit_money;
		private int index;
		private static int [] CoinWallet = {5,5,5,5,5};

		
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
	}


