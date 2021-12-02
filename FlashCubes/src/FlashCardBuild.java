import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;
import java.util.ArrayList;

import javax.swing.Box;
import javax.swing.JButton;
import javax.swing.JFrame;
import javax.swing.JLabel;
import javax.swing.JPanel;
import javax.swing.JScrollPane;
import javax.swing.JTextArea;
import javax.swing.ScrollPaneConstants;
import javax.swing.SwingUtilities;
import java.awt.LayoutManager;

public class FlashCardBuild {

	private JFrame frame;
	private JTextArea term;
	private JTextArea defOne;
	private JTextArea defTwo;
	private JTextArea defThree;
	private JTextArea defFour;
	private JTextArea defFive;
	private ArrayList<FlashCard> cardList;

	/**
	 * Launch the application.
	 */
	public static void main(String[] args) {
		EventQueue.invokeLater(new Runnable() {
			public void run() {
				try {
					FlashCardBuild window = new FlashCardBuild();
					window.frame.setVisible(true);
				} catch (Exception e) {
					e.printStackTrace();
				}
			}
		});
	}

	/**
	 * Create the application.
	 */
	public FlashCardBuild() {
		initialize();
	}

	/**
	 * Initialize the contents of the frame.
	 */
	private void initialize() {
		frame = new JFrame();
		frame.setBounds(100, 100, 450, 300);
		frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		
		// Create a JPanel
		JPanel mainPanel = new JPanel();
		
		// Create Text Areas
		term = new JTextArea(6, 20);
		term.setLineWrap(true);
		term.setWrapStyleWord(true);
		term.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
		
		defOne = new JTextArea(6, 20);
		defOne.setLineWrap(true);
		defOne.setWrapStyleWord(true);
		defOne.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
		
		defTwo = new JTextArea(6, 20);
		defTwo.setLineWrap(true);
		defTwo.setWrapStyleWord(true);
		defTwo.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
		
		defThree = new JTextArea(6, 20);
		defThree.setLineWrap(true);
		defThree.setWrapStyleWord(true);
		defThree.setFont(new Font("Helvetica Neue", Font.BOLD, 20));

		defFour = new JTextArea(6, 20);
		defFour.setLineWrap(true);
		defFour.setWrapStyleWord(true);
		defFour.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
		
		defFive = new JTextArea(6, 20);
		defFive.setLineWrap(true);
		defFive.setWrapStyleWord(true);
		defFive.setFont(new Font("Helvetica Neue", Font.BOLD, 20));
		
		// JscrollPane
		JScrollPane scrollPane = setPane(term);
		JScrollPane scrollPaneOne = setPane(defOne);
		JScrollPane scrollPaneTwo = setPane(defTwo);
		JScrollPane scrollPaneThree = setPane(defThree);
		JScrollPane scrollPaneFour = setPane(defFour);
		JScrollPane scrollPaneFive = setPane(defFive);
		
		JButton nextButton = new JButton("Next Card");
		
		// Create labels
		JLabel termLabel = new JLabel("<html>Welcome to FlashCubes!<br>Enter a Term</html>");
		JLabel defLabelOne = new JLabel("Enter the first definition");
		JLabel defLabelTwo = new JLabel("Enter the second definition");
		JLabel defLabelThree = new JLabel("Enter the third definition");
		JLabel defLabelFour = new JLabel("Enter the fourth definition");
		JLabel defLabelFive = new JLabel("Enter the fifth definition");
		
		// add Components to JPanel
		mainPanel.add(termLabel);
		mainPanel.add(scrollPane);
		mainPanel.add(defLabelOne);
		mainPanel.add(scrollPaneOne);
		mainPanel.add(defLabelTwo);
		mainPanel.add(scrollPaneTwo);
		mainPanel.add(defLabelThree);
		mainPanel.add(scrollPaneThree);
		mainPanel.add(defLabelFour);
		mainPanel.add(scrollPaneFour);
		mainPanel.add(defLabelFive);
		mainPanel.add(scrollPaneFive);
		mainPanel.add(nextButton);
		
		JScrollPane pane = new JScrollPane(mainPanel);
		pane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		pane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_AS_NEEDED);
		
		// add to Frame
		frame.getContentPane().add(pane);
		frame.setSize(400, 500);
		frame.setVisible(true);
		
	}
	
	public static JScrollPane setPane(JTextArea jtext) {
		JScrollPane scrollPane = new JScrollPane(jtext);
		scrollPane.setVerticalScrollBarPolicy(ScrollPaneConstants.VERTICAL_SCROLLBAR_ALWAYS);
		scrollPane.setHorizontalScrollBarPolicy(ScrollPaneConstants.HORIZONTAL_SCROLLBAR_NEVER);
		
		return scrollPane;
	}

}
