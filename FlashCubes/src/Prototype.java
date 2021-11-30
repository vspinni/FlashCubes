import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Button;

import javax.swing.JLabel;

import org.eclipse.swt.SWT;
import org.eclipse.swt.widgets.Label;
import org.eclipse.swt.events.SelectionAdapter;
import org.eclipse.swt.events.SelectionEvent;


/*
 * A Prototype of a FlashCube -> This window displays a typical 2-sided flashcard as a 
 * starting representation. No finetuning has been done -> takes a simple FlashCube and treats
 * it as a card
 */

public class Prototype {

	protected Shell shell;
	
	//Constants for the width and height of the window
	private final int WINDOW_WIDTH = 900;
	private final int WINDOW_HEIGHT = 750;
	
	//Label for the window
	private final String WINDOW_LABEL = "FlashCubes";
	
	private final String exampleQuestion = "What is the name of this course?";
	private final String exampleDefinition = "CS 411 Software Engineering";
	
	//The 2D FlashCube to be shown
	private final FlashCube exampleFlashCube = new FlashCube(exampleQuestion, exampleDefinition);
	

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Prototype window = new Prototype();
			window.open();
		} catch (Exception e) {
			e.printStackTrace();
		}
	}

	/**
	 * Open the window.
	 */
	public void open() {
		Display display = Display.getDefault();
		createContents();
		shell.open();
		shell.layout();
		while (!shell.isDisposed()) {
			if (!display.readAndDispatch()) {
				display.sleep();
			}
		}
	}

	/**
	 * Create contents of the window.
	 */
	protected void createContents() {
		shell = new Shell();
		shell.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
		shell.setText(WINDOW_LABEL);
		
		Label lblDisplay = new Label(shell, SWT.NONE);
		lblDisplay.setBounds(240, 170, 424, 240);
		lblDisplay.setText(exampleFlashCube.getQuestion());
		
		Button btnFlip = new Button(shell, SWT.NONE);
		btnFlip.addSelectionListener(new SelectionAdapter() {
			@Override
			public void widgetSelected(SelectionEvent e) {
				lblDisplay.setText(exampleFlashCube.flip());
			}
		});
		btnFlip.setBounds(400, 550, 105, 35);
		btnFlip.setText("Flip!");

	}
}
