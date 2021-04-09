package exercise7;

/**
 * This class is the main starting point to the application
 * 
 * @author emalianakasmuri
 *
 */
public class WeightApplication {

	public static void main(String[] args) {
		
		System.out.println("Launching Weight Application");
		
		WeightFrame weightFrame = new WeightFrame(); 
		
		// Put frame in the center
		weightFrame.pack();
		weightFrame.setLocationRelativeTo(null);
		weightFrame.setVisible(true);
		
		System.out.println("End of application");

	}

}
