import javax.swing.JFrame;
import javax.swing.JOptionPane;

public class PickCurrency 
	{

		static String name;
		static JFrame frame = new JFrame();
		static int YoN;
		
		public static void getName()
		{
			name = JOptionPane.showInputDialog("Hello, What is your name?");
			JOptionPane.showMessageDialog(frame, "Hi " + name);
		}
		
		public static void wannaPlay()
		{
			
			YoN = JOptionPane.showConfirmDialog(frame, 
					"Would you like to convert some currency"+ name, 
					"?", JOptionPane.YES_NO_CANCEL_OPTION,
					JOptionPane.QUESTION_MESSAGE);
			
			if (YoN == JOptionPane.YES_OPTION)
				{
					//rest of code
				}
			else if (YoN == JOptionPane.NO_OPTION)
				{
					System.exit(YoN);
				}
			else if (YoN ==JOptionPane.CANCEL_OPTION)
				{
					System.exit(YoN);
				}
		}
		
		
		
	}
