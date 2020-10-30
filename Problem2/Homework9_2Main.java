import java.util.Scanner;

public class Homework9_2Main{
	public static void main(String[] args){
		//Modified 9.2

		Scanner input = new Scanner(System.in);

		Stock business = new Stock();

		business.getStockName(input);

		business.getStockSymbol(input);

		business.getLastPrice(input);

		business.getNewPrice(input);

		business.displayStock();

		business.getChangePercent();

		input.close();
	}
}
