package i5.las2peer.services.res;

import java.util.*;
import org.json.simple.*;
import org.json.simple.parser.ParseException;

public class classes {

    class S11 {

    public S11() {}
    
    private String test;

    public void settest(String setValue) {
        this.test = setValue;
    }

    public String gettest() {
        return this.test;
    }

    public JSONObject toJSON() {

        JSONObject jo = new JSONObject();
        jo.put("test", this.test); 

        return jo;
    }

    public void fromJSON(String jsonString) throws ParseException {
        JSONObject jsonObject = (JSONObject) JSONValue.parseWithException(jsonString);
        this.test = (String) jsonObject.get("test"); 

    }

}

    
}
