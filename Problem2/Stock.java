import java.util.Scanner;

public class Stock{
/*      ---------------------------------------
                         Stock
        ---------------------------------------
        stockSymbol: String
        stockName: String
        previousClosingPrice: double
        currentPrice: double
        ---------------------------------------
        +getStockName(input: Scanner): void
        +getStockSymbol(input: Scanner): void
        +getLastPrice(input: Scanner): void
        +getNewPrice(input: Scanner): void
        +makeStock(): void
        +getChangePercent(): void
        ---------------------------------------
*/
	private String symbol = "";
	private String name = "";
	private double previousClosingPrice = 0;
	private double currentPrice = 0;

	public void getStockName(Scanner input){
		System.out.print("Enter the stock's name: ");
		this.name = input.nextLine();
	}

	public void getStockSymbol(Scanner input){
		System.out.print("Enter the symbol for the stock: ");
		this.symbol = input.next();
	}

	public void getLastPrice(Scanner input){
		System.out.print("Enter yesterday's closing price: ");
		this.previousClosingPrice = input.nextDouble();
	}

	public void getNewPrice(Scanner input){
		System.out.print("Enter today's price: ");
		this.currentPrice = input.nextDouble();
	}

	public void displayStock(){
		System.out.println("\nStock: " + this.name + "(" + this.symbol + ")" +
					"\nYesterday's closing price: " + this.previousClosingPrice +
					"\nToday's price: " + this.currentPrice);
	}

	public void getChangePercent(){
		double changeInPrice = this.previousClosingPrice - this.currentPrice;
		double percentChange = 100 * ((this.previousClosingPrice - this.currentPrice) / this.previousClosingPrice);
		percentChange = Math.abs(percentChange);
		if(changeInPrice > 0){
			System.out.print("The price saw a decrease of ");
			System.out.printf("%.2f", percentChange);
			System.out.println("%");
		}
		else if(changeInPrice < 0){
			System.out.print("The price saw an increase of ");
			System.out.printf("%.2f", percentChange);
			System.out.println("%");
		}
		else{
			System.out.println("The price didn't change");
		}
	}
}
