import java.util.ArrayList;
import java.util.HashMap;

/**
 * Created by Davide Sordi
 * Using IntelliJ IDEA
 * Date: 12/11/2019
 * Time: 16.13
 * <p>
 * Class: discount
 * Project: Retail-Calculator
 */

public class discount {

	private HashMap<Integer, Double> discountMap;

	private ArrayList<Integer> values;
	private ArrayList<Double> rates;


	public discount() {
		values = new ArrayList<>();
		rates = new ArrayList<>();
		values.add(1000);
		values.add(5000);
		values.add(7000);
		values.add(10000);
		values.add(50000);

		rates.add(0.03);
		rates.add(0.05);
		rates.add(0.07);
		rates.add(0.1);
		rates.add(0.15);
	}

	public Double getDiscount(int total) {
		for (int i = 0; i < 5; i++) {
			if (total - values.get(i) < 0) {
				if (i == 0)
					return rates.get(0);
				else return rates.get(i);
			}
		}
		return -1.0;
	}
}
