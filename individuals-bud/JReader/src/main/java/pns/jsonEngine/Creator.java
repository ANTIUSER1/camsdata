package pns.jsonEngine;

import com.google.gson.Gson;
import com.google.gson.JsonElement;

import java.util.HashSet;
import java.util.Set;

public class Creator {
    Gson gson= new Gson();
    Set<ITT>obj = new HashSet<ITT>();
    public JsonElement make(ITT obj){
        JsonElement res =gson.toJsonTree(obj);
        return res;
    }
    public JsonElement make( ){
        for(int k=0;k<5;k++){
            obj.add(new TstObj());
        }
        JsonElement res =gson.toJsonTree(obj);
        return res;
    }
    public Gson getGson() {
        return gson;
    }

    public Set<ITT> getObj() {
        return obj;
    }
}
