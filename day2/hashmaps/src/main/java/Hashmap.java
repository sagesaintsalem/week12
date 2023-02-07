import java.util.HashMap;

public class Hashmap {

    public static void main(String[]args){
        HashMap<String, Integer> ages = new HashMap<>();

        ages.put("Alice", 23);
        ages.put("Bella", 28);
        ages.put("Oliver", 8);

        Integer aliceAge = ages.get("Alice");
        String output = "Alice is " + aliceAge.toString();
        System.out.println(output);

        boolean whoIsIt = ages.containsValue(28);

        System.out.println(whoIsIt);



    }
}
