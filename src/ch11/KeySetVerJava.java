package ch11;

import java.util.HashMap;
import java.util.Map;

public class KeySetVerJava {
    public static void main(String[] args) {
        Map<String,String> map = new HashMap();
        map.put("a","jo");
        map.put("b","bo");
        for(String key: map.keySet()){
            System.out.println(key);
        }
    }
}
