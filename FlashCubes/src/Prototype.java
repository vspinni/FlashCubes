import java.awt.BorderLayout;
import java.awt.EventQueue;

import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.border.EmptyBorder;

public class Prototype extends JFrame {

	private JPanel contentPane;
	
	//Constants for the width and height of the window
	private final int WINDOW_WIDTH = 900;
	private final int WINDOW_HEIGHT = 750;
	
	//Label for the window
	private final String WINDOW_LABEL = "FlashCubes";
	
	private final String exampleQuestion = "What is the name of this course?";
	private final String exampleDefinition = "CS 411 Software Engineering";
	
	//The 2D FlashCube to be shown
	//private final FlashCube exampleFlashCube = new FlashCube(exampleQuestion, exampleDefinition);
	


	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					Prototype frame = new Prototype();
					frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the frame.
	 */
	public Prototype() {
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setBounds(100, 100, 450, 300);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		contentPane.setLayout(new BorderLayout(0, 0));
		setContentPane(contentPane);
	}

}
