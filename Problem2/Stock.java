import java.util.Scanner;

public class Stock{
	/*design a class named Stock that contains:
       	A string data field named symbol for the stock’s symbol.;
       	A string data field named name for the stock’s name.;
      	A double data field named previousClosingPrice that stores the stock price for the previous day.;
      	A double data field named currentPrice that stores the stock price for the current time.;
       	A constructor that creates a stock with the specified symbol and name;
       	A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.*/

	private String symbol = "";
	private String name = "";
	private double previousClosingPrice = 0;
	private double currentPrice = 0;

	//Get stock's name
	public void getStockName(Scanner input){
		System.out.print("Enter the stock's name: ");
		this.name = input.nextLine();
	}

	//Get stock's symbol
	public void getStockSymbol(Scanner input){
		System.out.print("Enter the symbol for the stock: ");
		this.symbol = input.next();
	}

	//Get yesterday's closing price
	public void getLastPrice(Scanner input){
		System.out.print("Enter yesterday's closing price: ");
		this.previousClosingPrice = input.nextDouble();
	}

	//Get current price
	public void getNewPrice(Scanner input){
		System.out.print("Enter today's price: ");
		this.currentPrice = input.nextDouble();
	}

	//Display the stock's name, symbol, yesterday's closing price, and current price
	public void makeStock(){
		System.out.println("\nStock: " + this.name + "(" + this.symbol + ")" +
					"\nYesterday's closing price: " + this.previousClosingPrice +
					"\nToday's price: " + this.currentPrice);
	}

	//Get the percentage of change
	public void getChangePercent(){
		double changeInPrice = this.previousClosingPrice - this.currentPrice;
		double percentChange = 100 * ((this.previousClosingPrice - this.currentPrice) / this.previousClosingPrice);

		if(changeInPrice > 0){
			System.out.println("The price saw a decrease of " +  Math.abs(percentChange) + " percent");
		}
		else if(changeInPrice < 0){
			percentChange *= -1;
			System.out.println("The price saw an increase of " + percentChange + " percent");
		}
		else{
			System.out.println("The price didn't change");
		}
	}
}
