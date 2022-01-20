package util;

import java.util.HashMap;

public class AccessCounter {
    
    private final HashMap<String, Integer> acceses= new HashMap();
    static final private AccessCounter INSTANCE = new AccessCounter();

    private AccessCounter() {
    }
    
    public static AccessCounter getInstance(){
        return INSTANCE;
    }
    
    public Integer increment(String key){
        final Integer count;
        if (this.acceses.containsKey(key)){
            count = this.acceses.get(key) + 1;
        }
        else{
            count = 1;
        }
        this.acceses.put(key, count);
        
        return count;
    }
}
