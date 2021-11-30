import org.eclipse.swt.widgets.Display;
import org.eclipse.swt.widgets.Shell;
import org.eclipse.swt.widgets.Text;
import org.eclipse.swt.SWT;

public class Initial {

	protected Shell shell;
	private Text txtPoop;
	
	//Constants for the width and height of the window
	private final int WINDOW_WIDTH = 900;
	private final int WINDOW_HEIGHT = 750;
	
	//Label for the window
	private final String WINDOW_LABEL = "FlashCubes";

	/**
	 * Launch the application.
	 * @param args
	 */
	public static void main(String[] args) {
		try {
			Initial window = new Initial();
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
		
		txtPoop = new Text(shell, SWT.BORDER);
		txtPoop.setText("poop");
		txtPoop.setBounds(48, 106, 80, 31);

	}
}
