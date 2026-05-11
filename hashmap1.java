import java.io.File;
import java.io.PrintWriter;
import java.util.HashMap;
import java.util.Scanner;

public class hashmap1{
public static void main(String[] args) throws Exception {

HashMap<String, Integer> map = new HashMap<>();  
    File file = new File("D://ECOM_DATASHEET.txt");  

    Scanner reader = new Scanner(file);  

    if (reader.hasNextLine()) reader.nextLine();  

    while (reader.hasNextLine()) {  

        String[] dataRow = reader.nextLine().split("\\s+");  

        String itemName = dataRow[7] + " " + dataRow[8];  
        int quantity = Integer.parseInt(dataRow[9]);  

        map.put(itemName, map.getOrDefault(itemName, 0) + quantity);  
    }
    reader.close();  


    map.put("Product E", map.getOrDefault("Product E", 0) + 100);  


    PrintWriter dataWriter = new PrintWriter(new File("Final_list.txt"));  


    for (String itemKey : map.keySet()) {  
        dataWriter.println(itemKey + " " + map.get(itemKey));  
    }  

    dataWriter.close();  

    System.out.println("Updated successfully!");  
}

}
