import java.util.HashMap;
import java.util.Map;


public class FrequencyOfLargePara {
    public static void main(String args[]){
        String str1 = "Paranoids are notparanoid because they are paranoid but because they keep putting themselves deliberately into paranoid avoidable situations";

        Map<String, Integer> Mymap = new HashMap<>();
        String[] words = str1.split(" ");
        for(String word : words){
            if(Mymap.containsKey(word))
                Mymap.put(word, Mymap.get(word) +1);
            else 
                Mymap.put(word, 1);
        }
        System.out.println(Mymap);

    }
}
