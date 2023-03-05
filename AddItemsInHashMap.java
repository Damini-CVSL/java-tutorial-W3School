import java.util.HashMap;

public class AddItemsInHashMap{
    public static void main(String[] args){
        HashMap<String , String> capitalCities = new HashMap<String , String>();

        capitalCities.put("India" , "Delhi");
        capitalCities.put("Germany" , "berlin");
        capitalCities.put("Usa" , "Washinton DC");
        capitalCities.put("Norway" , "Oslo");
        System.out.println(capitalCities);
    }
}