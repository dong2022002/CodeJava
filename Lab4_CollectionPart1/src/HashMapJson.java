import java.util.HashMap;

import org.json.simple.JSONValue;

public class HashMapJson {
    HashMap<String,String> hashMap= new HashMap<>();
    String json;
    public HashMapJson() {
    }
    
    public void add(String key,String value){
       hashMap.put(key, value);
    }
   
    public void TaoJson(){
    json=JSONValue.toJSONString(hashMap);
    }
    public void out(){
         System.out.println(hashMap);   
    }

    @Override
    public String toString() {
        TaoJson();
        return json;
    }
}
