package exercise7;

import exercise8.WeightsRecord;

/**
 * This class represent the middle-tier in the 3-tier architecture
 * 
 * @author emalianakasmuri
 *
 */
public class WeightCalculator {
	
	
	/**
	 * This method calculates weight on Mars
	 * 
	 * @param weight
	 * @return weight on mars
	 */
	public float calculateOnMars (Weight weight) {
		
		float weightOnMars = (weight.getOnEarth() / 9.81f) * 3.11f;
		
		return weightOnMars;
	}
	
	/**
	 * This method calculates weight on Mars
	 * 
	 * @param record
	 * @return
	 */
	public WeightsRecord calculateOnMars (WeightsRecord record) {
		
		float weightOnMars = 0;
		
		// Calculate weights for all records
		for (Weight weight:record.getWeights()) {
			
			weightOnMars = this.calculateOnMars(weight);
			weight.setOnMars(weightOnMars);
		}
		
		return record;
		
	}
	

}
