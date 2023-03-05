import java.util.HashMap;
import java.util.Map;
import java.util.TreeMap;

public class MapReview {
    public static void main(String[] args) {
    // create hash map
       Map<Integer,String>studentMap=new HashMap<>();
       studentMap.put(1,"Jack");
        studentMap.put(2,"Julia");
        studentMap.put(3,"Jack");

        String str="JJavaDeveloper";
        System.out.println(findFirstNonRepeating(str));
    }
    public static Character findFirstNonRepeating(String str){
     //create HashMap:this will cost me space complexity
        Map<Character,Integer>letter=new HashMap<>();
        //count the frequency of chars
        int count;
        for (Character ch:str.toCharArray()){
            if(letter.containsKey(ch)){
                count=letter.get(ch);
                letter.put(ch,count+1);
            }else letter.put(ch,1);
        }
        //start from the begining and check if there is a char with frequency 1
       for (Character ch:str.toCharArray()){
           if(letter.get(ch)==1)return ch;
       }
        return null;
    }
}
