import database.DBConnection;
import gui.GUI;

public class CashOTrack {
	
	public static void main(String[] args)
	{
		GUI.startGUI(args);
		DBConnection.getInstance();
	}
}
