public class Stock(Scanner input){
	/*design a class named Stock that contains:
       	A string data field named symbol for the stock’s symbol.;
       	A string data field named name for the stock’s name.;
      	A double data field named previousClosingPrice that stores the stock price for the previous day.;
      	A double data field named currentPrice that stores the stock price for the current time.;
       	A constructor that creates a stock with the specified symbol and name;
       	A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.*/

	private String symbol = "";
	private String name = "";
	private double previousClosingPrice;
	private double currentPrice;

	public void getStockSymbol(Scanner input){
		System.out.print("Enter the symbol for the stock: ");
		this.symbol = input.next();
	}

	public void getStockName(Scanner input){
		System.out.print("Enter the stock's name: ");
		this.name = input.next();
	}

	public double getLastPrice(){

	}
}
