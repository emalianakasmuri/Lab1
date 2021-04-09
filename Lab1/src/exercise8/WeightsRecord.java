package exercise8;

import java.util.List;

import exercise7.Weight;


/**
 * This class represents a list of human weights records
 * @author emalianakasmuri
 *
 */
public class WeightsRecord {
	
	private List<Weight> weights;

	/**
	 * @return the weights
	 */
	public List<Weight> getWeights() {
		return weights;
	}

	/**
	 * @param weights the weights to set
	 */
	public void setWeights(List<Weight> weights) {
		this.weights = weights;
	}

}
