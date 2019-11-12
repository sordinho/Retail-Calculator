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

	public float getProdPrice() {
		return prodPrice;
	}

	public void setProdPrice(float prodPrice) {
		this.prodPrice = prodPrice;
	}

	private float prodPrice;
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
		double total;

		Double discount = s.getDiscountByState(this.stateString);
		total=this.numberOfProd*this.prodPrice;

		total+=(total*discount/100);
		discount d = new discount();
		double discount2=d.getDiscount(total);
		total-=(discount2);

		return total;
	}
}
