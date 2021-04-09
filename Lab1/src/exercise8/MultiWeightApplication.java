package exercise8;

/**
 * This class is the main starting point to the application
 * 
 * @author emalianakasmuri
 *
 */
public class MultiWeightApplication {

	public static void main(String[] args) {
		
		System.out.println("Launching Multiple Weights Application");
		
		MultiWeightsFrame multiWeightFrame = new MultiWeightsFrame(); 
		
		// Put frame in the center of screen
		multiWeightFrame.pack();
		multiWeightFrame.setLocationRelativeTo(null);
		multiWeightFrame.setVisible(true);
		

	}

}
