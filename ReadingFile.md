import java.io.*;

public class Test {
public static void main(String [] args) {

    // The name of the file to open.
    String fileName = "temp.txt";
    int counter = 0;

    // This will reference one line at a time
    String line = null;
    FileReader fileReader = null;

    try {
        // FileReader reads text files in the default encoding.
        fileReader = 
            new FileReader(fileName);

        // Always wrap FileReader in BufferedReader.
        BufferedReader bufferedReader = 
            new BufferedReader(fileReader);

        while((line = bufferedReader.readLine()) != null) {
            counter++;
            if(counter == 3 || counter == 8 || counter == 12)
            {
               // do your code
            }
        }   

    }
    catch(FileNotFoundException ex) {
        System.out.println(
            "Unable to open file '" + 
            fileName + "'");                
    }
    catch(IOException ex) {
        System.out.println(
            "Error reading file '" 
            + fileName + "'");                  
        // Or we could just do this: 
        // ex.printStackTrace();
    }
    finally
    {
        if(fileReader != null){
           // Always close files.
           bufferedReader.close();            
        }
    }
}
}


Streams

try (Stream<String> lines = Files.lines(Paths.get(CSV_FILE))) {
    List<List<String>> records = lines.map(line -> Arrays.asList(line.split(COMMA_DELIMITER)))
      .collect(Collectors.toList());
}