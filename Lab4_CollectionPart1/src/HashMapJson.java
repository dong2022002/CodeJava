import java.util.HashMap;

import org.json.simple.JSONValue;

public class HashMapJson {
    HashMap<String, String> hashMap = new HashMap<>();
    String json;

    public String getJson() {
        return json;
    }

    public void setJson(String json) {
        this.json = json;
    }
    
    

    public void add(String key, String value) {
        hashMap.put(key, value);
    }

    public void TaoJson() {
        json = JSONValue.toJSONString(hashMap);
    }

    @Override
    public String toString() {
        TaoJson();
        return json;
    }
}
