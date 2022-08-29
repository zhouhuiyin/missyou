package map;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class MapDemo3 {
    public static void main(String[] args) {
        String requestUri;
        String queryString=null;
        String uri = "/myweb/index.html?username=zhangsan&password=test123&age=19";
        Map<String,String> parameters = new HashMap<>();
        if(uri.contains("?")){
             requestUri = uri.substring(0,uri.indexOf("?"));
             queryString = uri.substring(uri.lastIndexOf("?")+1);
            String[] query = queryString.split("&");
            for(String parameter : query){
                String[] p = parameter.split("=");
                parameters.put(p[0],p[1]);
            }

        }else {
             requestUri = uri;
        }
        System.out.println(requestUri);
        System.out.println(parameters);
        System.out.println(queryString);
    }
}
