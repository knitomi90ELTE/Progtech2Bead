package homework.app;

import homework.db.init.DatabaseInitializer;
import homework.gui.MainLayout;
import javax.swing.SwingUtilities;
//import BusinessLogic;

public class Main {

	public static void main(String[] args) {
//		SwingUtilities.invokeLater(new Runnable(){
//			 @Override
//			 public void run(){
//				 new MainLayout().setVisible(true);
//			 }
//		});
            DatabaseInitializer.getInstance().init();
	}
}
