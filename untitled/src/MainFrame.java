import javax.swing.*;
import javax.swing.border.Border;
import java.awt.*;
import java.awt.BorderLayout;
@SuppressWarnings("serial")
public class MainFrame extends JFrame {
	
	public static final int width = 800;
	public static final int height = 500;
	
	private AddStudent addStudent;
	private EditStudent editStudent;
	
	public MainFrame() {
		this.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		this.setSize(width, height);
		this.setTitle("Student Check-in");
		this.setResizable(false);
		
		this.add(createMainPanel());
		
		this.setLocationRelativeTo(null);
	}
	
	public static void main(String[] args) {
		new MainFrame().setVisible(true);
	}
	
	private JPanel createMainPanel() {
		JPanel mainPanel = new JPanel(new BorderLayout());

		return mainPanel;
	}
}
