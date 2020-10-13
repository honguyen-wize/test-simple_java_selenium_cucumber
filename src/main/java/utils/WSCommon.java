package utils;

import ws_model.DaraBaseShelfWs;
import com.google.gson.Gson;
import org.apache.http.HttpResponse;
import org.apache.http.client.methods.HttpGet;
import org.apache.http.impl.client.CloseableHttpClient;
import org.apache.http.impl.client.HttpClientBuilder;

import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.util.ResourceBundle;

public class WSCommon {
    private static ResourceBundle resourceBundle = ResourceBundle.getBundle("env_"+System.getProperty("env"));

    public static DaraBaseShelfWs getDaraShelfAPI() throws Exception{
        String json;
        String urlDaraBaseShelf = resourceBundle.getString("api_host")+"/"+resourceBundle.getString("api_dara_shelf_id");
        urlDaraBaseShelf += "?fields=count_views,detail,source_url";

        json = getjSonFromRequest(urlDaraBaseShelf);
        Gson gson = new Gson();
        DaraBaseShelfWs daraBaseShelfWs = gson.fromJson(json, DaraBaseShelfWs.class);

        return daraBaseShelfWs;
    }

    public static String getjSonFromRequest(String url) throws Exception{
        StringBuilder builder = new StringBuilder();
        CloseableHttpClient client = HttpClientBuilder.create().build();

        HttpGet request = new HttpGet(url);
        request.setHeader("Content-Type", "application/json");
        request.setHeader("Authorization", resourceBundle.getString("api_authorization"));

        HttpResponse response = client.execute(request);
        BufferedReader bufReader = new BufferedReader(new InputStreamReader(
                    response.getEntity().getContent()));

        String line;

         while ((line = bufReader.readLine()) != null) {
             builder.append(line);
             builder.append(System.lineSeparator());
         }
        return builder.toString();
    }

//    public static Map<String,String> getRequestHeaders(){
//        ResourceBundle resource = ResourceBundle.getBundle(System.getProperty("config.file"));
//        Map<String, String> headers = new HashMap();
//        headers.put("X-BeQuietPlease", resource.getString("ws_model.cert"));
//
//        return headers;
//    }
}
