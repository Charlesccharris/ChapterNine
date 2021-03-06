public class Homework9_2Main{
	public static void main(String[] args){
		/*Modified 9.2
		(The Stock class)
		Following the example of the Circle class in Section 9.2,

		design a class named Stock that contains:
		A string data field named symbol for the stock’s symbol.;
		A string data field named name for the stock’s name.;
		A double data field named previousClosingPrice that stores the stock price for the previous day.;
		A double data field named currentPrice that stores the stock price for the current time.;
		A constructor that creates a stock with the specified symbol and name;
		A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.
		Make a UML diagram for the class in the comments in the top of the class,
		and then implement the class.

		Write a test program that creates a Stock object with the stock symbol ORCL,
		the name Oracle Corporation,
		and the previous closing price of 34.5.
		Set a new current price to 34.35 and display the price-change percentage.*/

		Stock business = new Stock("ORCL", "Oracle Corporation");
		business.previousClosingPrice = 34.5;
		business.currentPrice = 34.45;
		double percentChange = business.getChangePercent();

		System.out.println("Stock: " + business.name + "(" + business.symbol + ")");
		System.out.println("Yesterday's closing price: " + business.previousClosingPrice +
					"\nToday's price: " + business.currentPrice);
                System.out.print("The price saw a decrease of ");
               	System.out.printf("%.2f", percentChange);
               	System.out.println("%");
	}
}
