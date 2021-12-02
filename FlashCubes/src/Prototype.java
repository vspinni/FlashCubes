import java.awt.BorderLayout;
import java.awt.Color;
import java.awt.Dimension;
import java.awt.EventQueue;
import java.awt.Font;

import javax.swing.BorderFactory;
import javax.swing.JFrame;
import javax.swing.JPanel;
import javax.swing.SwingConstants;
import javax.swing.border.BevelBorder;
import javax.swing.border.Border;
import javax.swing.border.EmptyBorder;
import javax.swing.border.EtchedBorder;
import javax.swing.JLabel;
import net.miginfocom.swing.MigLayout;
import javax.swing.JButton;
import java.awt.GridLayout;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

import javax.swing.GroupLayout;
import javax.swing.GroupLayout.Alignment;
import javax.swing.LayoutStyle.ComponentPlacement;

public class Prototype extends JFrame {

	private JPanel contentPane;
	
	//Constants for the width and height of the window
	private final int WINDOW_WIDTH = 600;
	private final int WINDOW_HEIGHT = 600;
	
	//Label for the window
	private final String WINDOW_LABEL = "FlashCubes";
	
	private final String exampleQuestion = "What is the name of this course?";
	private final String exampleDefinition = "CS 411 Software Engineering";
	
	//The 2D FlashCube to be shown
	private static FlashCube exampleFlashCube;
	

	private static void initExample() {
		Side<String> front = new Side<String>("What is an example of a mammal?");
		Side<String> left = new Side<String>("dog");
		Side<String> right = new Side<String>("bat");
		Side<String> up = new Side<String>("lion");
		Side<String> back = new Side<String>("elephant");
		Side<String> down = new Side<String>("dolphin");
		
//		Side<String> front = new Side<String>("front");
//		Side<String> left = new Side<String>("left");
//		Side<String> right = new Side<String>("right");
//		Side<String> up = new Side<String>("up");
//		Side<String> back = new Side<String>("back");
//		Side<String> down = new Side<String>("down");

		exampleFlashCube = new FlashCube(front, back, left, right, up, down);
	}

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
		initExample();
		
		setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		setTitle(WINDOW_LABEL);
		setBounds(100, 100, WINDOW_WIDTH, WINDOW_HEIGHT);
		contentPane = new JPanel();
		contentPane.setBorder(new EmptyBorder(5, 5, 5, 5));
		setContentPane(contentPane);
		Border brdrDisplay = BorderFactory.createLineBorder(Color.black);
		
		
		JLabel lblDisplay = new JLabel();
		lblDisplay.setText(HelperMethods.htmlWrap(exampleFlashCube.getCurrentSide().toString()));
		
		lblDisplay.setOpaque(true);
		lblDisplay.setHorizontalAlignment(SwingConstants.CENTER);
		lblDisplay.setBackground(Color.white);
		lblDisplay.setMinimumSize(new Dimension(300, 300));
		lblDisplay.setPreferredSize(new Dimension(300, 300));
		lblDisplay.setMaximumSize(new Dimension(300, 300));
		lblDisplay.setFont(new Font("TimesRoman", 0, 24));
		lblDisplay.setForeground(Color.magenta);
		lblDisplay.setBorder(brdrDisplay);
		
		JButton btnLeft = new JButton("Flip Left");
		
		JButton btnRight = new JButton("Flip Right");
		
		JButton btnDown = new JButton("Flip Down");
		
		JButton btnUp = new JButton("Flip Up");
		
		JButton btnNext = new JButton("Next Cube!");
		
		JButton btnBack = new JButton("Flip Around");
		
		btnLeft.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	exampleFlashCube.flip(FlashCube.LEFT);
		        lblDisplay.setText(HelperMethods.htmlWrap(exampleFlashCube.getCurrentSide().toString()));
		    }
		});
		
		
		btnRight.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	exampleFlashCube.flip(FlashCube.RIGHT);
		        lblDisplay.setText(HelperMethods.htmlWrap(exampleFlashCube.getCurrentSide().toString()));
		    }
		});
		
		
		
		btnUp.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	exampleFlashCube.flip(FlashCube.UP);
		        lblDisplay.setText(HelperMethods.htmlWrap(exampleFlashCube.getCurrentSide().toString()));
		    }
		});
		
		
		
		btnDown.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	exampleFlashCube.flip(FlashCube.DOWN);
		        lblDisplay.setText(HelperMethods.htmlWrap(exampleFlashCube.getCurrentSide().toString()));
		    }
		});
		
		
		btnBack.addActionListener(new ActionListener() {

		    @Override
		    public void actionPerformed(ActionEvent e) {
		    	exampleFlashCube.flip(FlashCube.BACK);
		        lblDisplay.setText(HelperMethods.htmlWrap(exampleFlashCube.getCurrentSide().toString()));
		    }
		});
		
		
		
		
		
		GroupLayout gl_contentPane = new GroupLayout(contentPane);
		gl_contentPane.setHorizontalGroup(
			gl_contentPane.createParallelGroup(Alignment.TRAILING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGap(21)
					.addComponent(btnLeft)
					.addPreferredGap(ComponentPlacement.RELATED, 55, Short.MAX_VALUE)
					.addComponent(lblDisplay, GroupLayout.PREFERRED_SIZE, 311, GroupLayout.PREFERRED_SIZE)
					.addGap(29)
					.addComponent(btnRight)
					.addContainerGap())
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(266, Short.MAX_VALUE)
					.addComponent(btnUp)
					.addGap(243))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(436, Short.MAX_VALUE)
					.addComponent(btnNext)
					.addGap(51))
				.addGroup(gl_contentPane.createSequentialGroup()
					.addContainerGap(251, Short.MAX_VALUE)
					.addGroup(gl_contentPane.createParallelGroup(Alignment.TRAILING)
						.addComponent(btnBack)
						.addComponent(btnDown))
					.addGap(236))
		);
		gl_contentPane.setVerticalGroup(
			gl_contentPane.createParallelGroup(Alignment.LEADING)
				.addGroup(gl_contentPane.createSequentialGroup()
					.addGroup(gl_contentPane.createParallelGroup(Alignment.LEADING)
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(61)
							.addComponent(btnUp)
							.addPreferredGap(ComponentPlacement.UNRELATED)
							.addComponent(lblDisplay, GroupLayout.PREFERRED_SIZE, 310, GroupLayout.PREFERRED_SIZE))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(253)
							.addComponent(btnLeft))
						.addGroup(gl_contentPane.createSequentialGroup()
							.addGap(253)
							.addComponent(btnRight)))
					.addGap(18)
					.addComponent(btnDown)
					.addPreferredGap(ComponentPlacement.UNRELATED)
					.addComponent(btnBack)
					.addPreferredGap(ComponentPlacement.RELATED, 19, Short.MAX_VALUE)
					.addComponent(btnNext)
					.addGap(31))
		);
		contentPane.setLayout(gl_contentPane);
	}
}
