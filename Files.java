import javax.swing.*;
import java.io.File;
import java.io.FileNotFoundException;


public class Files extends JFileChooser{
	private JFileChooser directoryWindow = new JFileChooser();

        //constructor for FileChooser



	public class FileChooser extends JFileChooser {
//	private JFileChooser directoryWindow = new JFileChooser();

		//default constructor for FileChooser
		public FileChooser () {

		}

		public String run () throws FileNotFoundException {
			String filePath = "";
			//set default directory for directoryWindow
			setCurrentDirectory(new File("C:\\Users\\users\\eclipse-workspace\\Comp 167"));

			// fileChooser has 3 options: file is selected, chooser is exited, or an error
			int options = showOpenDialog(new JFrame());

			// if a file is selected in fileChooser, then complete the if statement
			if (options == APPROVE_OPTION) {
				File file = getSelectedFile();
				System.out.println("Selected file is: " + file.getPath());
				filePath = file.getAbsolutePath();
			}
			if (options == CANCEL_OPTION) {
				System.exit(0);
			}
			setVisible(true);
			return filePath;

		}

	}

}
