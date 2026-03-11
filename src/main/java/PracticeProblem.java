import java.io.IOException;
import java.nio.file.Files;
import java.util.List;
import java.nio.file.Path;
import java.nio.file.Paths;
import java.nio.file.StandardOpenOption;
public class PracticeProblem {

	public static void main(String[] args) {

	}
	
    public static String getName(int line, String file) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(file));
            
            if (line < 1 || line > lines.size()) {
                return "";
            }
            
            String targetLine = lines.get(line - 1);
            String[] parts = targetLine.split(" ");
            
            
            if (parts.length >= 2) {
                return parts[0] + " " + parts[1];
            }
            
            return "";
        } catch (IOException e) {
            return ""; 
		}
    }

    public static int getAge(int line, String file) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(file));
            
            
            if (line < 1 || line > lines.size()) {
                return -1;
            }
            
            String targetLine = lines.get(line - 1);
            String[] parts = targetLine.split(" ");
            
            
            if (parts.length >= 3) {
                return Integer.parseInt(parts[2]);
            }
            
            return -1;
        } catch (IOException | NumberFormatException e) {
            return -1; 
        }
	}
    
    public static int getNumber(int line, String file) {
        try {
            List<String> lines = Files.readAllLines(Paths.get(file));
            
         
            if (line < 1 || line > lines.size()) {
                return -1;
            }
            
            String targetLine = lines.get(line - 1);
            String[] parts = targetLine.split(" ");
            
           
            if (parts.length >= 4) {
                return Integer.parseInt(parts[3]);
            }
            
            return -1;
        } catch (IOException | NumberFormatException e) {
            return -1; 
    }
    
}
 public static void fileAppend(String output, String filename) {
        try {
            Path path = Paths.get(filename);
    
            Files.writeString(path, output, StandardOpenOption.APPEND, StandardOpenOption.CREATE);    
        } catch (IOException e) {
            System.err.println("An IOException occurred: " + e.getMessage());
            e.printStackTrace();
        }
    }
}
