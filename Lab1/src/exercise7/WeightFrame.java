package exercise7;

import java.awt.BorderLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JTextField;

/**
 * This class receive input from user and display result to the user.
 * 
 * @author emalianakasmuri
 *
 */
public class WeightFrame extends JFrame implements ActionListener {
	
	
	
	/**
	 * 
	 */
	private static final long serialVersionUID = 1L;
	
	JTextField txtEarthWeight = new JTextField(20);
	JTextField txtMarsWeight = new JTextField(20);
	JButton btnCalculate = new JButton("Calculate");
	
	/**
	 * Constructor
	 * 
	 * Load GUI components upon visibility on screen
	 */
	public WeightFrame () {
		
		this.setTitle("How much do you weight on Mars?");
		this.setSize(700, 100);
		
		this.setDefaultCloseOperation(EXIT_ON_CLOSE);
		
		loadComponents();
		
		// Register button to listener
		btnCalculate.addActionListener(this);
		
		
	}
	
	/**
	 * Arrange GUI components on frame
	 */
	private void loadComponents() {
		
		JPanel northPanel = this.loadNorthComponents();
		this.add(northPanel, BorderLayout.NORTH);
		
		JPanel southPanel = this.loadCenterComponents();
		this.add(southPanel, BorderLayout.CENTER);
		
	}
	
	/**
	 * Loading GUI components for BorderLayout.North region
	 * @return
	 */
	private JPanel loadNorthComponents() {
		
		// Create components
		JPanel northPanel = new JPanel();
		JLabel label = new JLabel("Enter your weight (kg): ");
		
		// Add to panel
		northPanel.add(label);
		northPanel.add(txtEarthWeight);
		northPanel.add(btnCalculate);
		
		return northPanel;
	}
	
	/**
	 * Loading GUI components for BorderLayout.CENTER region
	 * @return
	 */
	private JPanel loadCenterComponents() {
		
		// Create components
		JPanel southPanel = new JPanel();
		JLabel label = new JLabel("Your weight on Mars (kg): ");
		
		// Add to panel
		southPanel.add(label);
		southPanel.add(txtMarsWeight);
		
		return southPanel;
		
	}

	@Override
	/**
	 * Process user request
	 */
	public void actionPerformed(ActionEvent e) {
		
		// Get weight in earth and removed entailing spaces
		String earthWeight = txtEarthWeight.getText().strip();
		
		// Calculate weight on Mars
		WeightAppDelegator delegator = new WeightAppDelegator();
		String marsWeight = delegator.calculateOnMars(earthWeight);
		
		// Display weight on Mars
		txtMarsWeight.setText(marsWeight);
		txtMarsWeight.setEditable(false);
		
	}
	

}
