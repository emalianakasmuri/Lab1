package exercise7;

/**
 * This class manage communication between front-end and back-end
 * @author emalianakasmuri
 *
 */
public class WeightAppDelegator {
	
	/**
	 * This method calculates weight in Mars
	 * @param weightOnEarth
	 * @return
	 */
	public String calculateOnMars (String weightOnEarth) {
		
		// Parse input to float
		float kgOnEarth = Float.parseFloat(weightOnEarth);
		
		// Wrap in object
		Weight weight = new Weight();
		weight.setOnEarth(kgOnEarth);
		
		// Calculate weight on Mars
		WeightCalculator weightCalculator = new WeightCalculator();
		float kgOnMars = weightCalculator.calculateOnMars(weight);
		
		// Format to two decimal places
		String weightOnMars = String.format("%.2f", kgOnMars); 
		
		return weightOnMars;
	}
	
	
	
	
	

}
