import java.util.Scanner;

public class Stock{
	/*design a class named Stock that contains:
       	A string data field named symbol for the stock’s symbol.;
       	A string data field named name for the stock’s name.;
      	A double data field named previousClosingPrice that stores the stock price for the previous day.;
      	A double data field named currentPrice that stores the stock price for the current time.;
       	A constructor that creates a stock with the specified symbol and name;
       	A method named getChangePercent() that returns the percentage changed from previousClosingPrice to currentPrice.*/

/*      ---------------------------------------
                         Stock
        ---------------------------------------
        stockSymbol: String
        stockName: String
        previousClosingPrice: double
        currentPrice: double
        ---------------------------------------
	Stock(newSymbol: String, newName: String)
        +getChangePercent(): void
        ---------------------------------------
*/
	String symbol = "";
	String name = "";
	double previousClosingPrice = 0;
	double currentPrice = 0;

	Stock(String newSymbol, String newName){
		name = newName;
		symbol = newSymbol;
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
                        System.out.print("The price saw a decrease of ");
                        System.out.printf("%.2f", percentChange);
                        System.out.println("%");
		}
		else{
			System.out.println("The price didn't change");
		}
	}
}
