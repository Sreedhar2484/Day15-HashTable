import java.util.HashMap;
import java.util.Map;

public class Frequency {
    public static void main(String args[]){
        String str = "To be or not to be";

        //Declaraing a hashmap 
        Map<String, Integer> hashMap = new HashMap<>();
        // Splitting the words and storing them in array
        String[] words = str.split(" ");
        //System.out.println(words)
        for(String word : words){
            //Asking hasmap contains the key or not will return null if not
            Integer integer = hashMap.get(word);
            if(integer == null)
            //storing the word as key and its occurence as value
                hashMap.put(word, 1);
            else 
            //incrementing the value if the word is present in hashmap
                hashMap.put(word, integer+1);
        }
        System.out.println(hashMap);
    }
}
