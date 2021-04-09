package exercise8;

import java.util.ArrayList;
import java.util.List;
import java.util.StringTokenizer;

import exercise7.Weight;
import exercise7.WeightCalculator;


/**
 * This class handle delegation of request between front-end and back-end.
 * This class represents a controller class in MVC layer
 * 
 * @author emalianakasmuri
 *
 */
public class MultiWeightsAppDelegator {
	
	
	/**
	 * This method calculate a series of human weights on Mars
	 * @param earthWeights
	 * @return formatted result
	 */
	public String calculateWeights (String earthWeights) {
		
		List<Weight> weights = new ArrayList<Weight>();
		
		// Tokenize data
		StringTokenizer tokens = new StringTokenizer(earthWeights, ";");
		while (tokens.hasMoreTokens()) {
			
			String dataWeight = tokens.nextToken();
			
			// Wrap data in object
			Weight weight = new Weight();
			weight.setOnEarth(Float.parseFloat(dataWeight));
			
			// Add to list
			weights.add(weight);
			
		} 
		
		// Wrap in record
		WeightsRecord record = new WeightsRecord();
		record.setWeights(weights);
		
		// Calculate weight on Mars
		WeightCalculator weightCalculator = new WeightCalculator();
		record = weightCalculator.calculateOnMars(record);
		
		// Format output
		String result = "";
		for (Weight weight:record.getWeights()) {
			
			result += "  Earth Weight: " + weight.getOnEarth() + "kg \tMars Weight: " 
					+ String.format("%.2f", weight.getOnMars()) + "kg\n";
			
		}
		
		return result;
	}

}
