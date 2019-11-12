/**
 * Created by Davide Sordi
 * Using IntelliJ IDEA
 * Date: 12/11/2019
 * Time: 16.08
 * <p>
 * Class: utility
 * Project: Retail-Calculator
 */

public class utility {

	private int numberOfProd;
	private State s;
	private String stateString;



	public utility(String stateString){
		this.s=new State();
		this.stateString=stateString;
	}

	public int getNumberOfProd() {
		return numberOfProd;
	}

	public void setNumberOfProd(int numberOfProd) {
		this.numberOfProd = numberOfProd;
	}

	public double getTotal(){
		double total = 0;
		total+= numberOfProd;

		Double discount = s.getDiscountByState(this.stateString);

		return total;
	}
}
