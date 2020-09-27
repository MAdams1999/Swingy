package Controllers;

import Controllers.Parsing.EventParsing;
import static Views.Gui.BaseWindow.hideBaseWindow;

public class Main {

		public static void main(String[] args) {
			System.out.println("This is Swingy please take a Swing");

			ApplicationControls.createWindow();
			ApplicationControls.status = 0;
			if (args.length >= 1 && args[0].contains("console")){
				hideBaseWindow();
			}
			EventData.readStdinAsync();
			EventParsing.instructionParse();

		}
}
