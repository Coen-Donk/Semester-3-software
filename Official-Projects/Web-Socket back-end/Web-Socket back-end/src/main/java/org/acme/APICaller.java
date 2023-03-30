package org.acme;

import java.net.*;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class APICaller{

    private URL resourceUrl;
    private HttpURLConnection resourceConnection;

    public APICaller(String _resourceUrl) throws IOException {
        this.resourceUrl = new URL(_resourceUrl);
        this.resourceConnection = (HttpURLConnection) resourceUrl.openConnection();
    }

    private boolean checkForValidNasaData(String data){
        return data.contains("{\"error\":\"specified object not found\"}");
    }

    public String doGetRequest() throws IOException {
        this.resourceConnection.setRequestMethod("GET");
        int responseCode = this.resourceConnection.getResponseCode();
        if(responseCode == HttpURLConnection.HTTP_OK){
            InputStream inputStream = this.resourceConnection.getInputStream();
            String content = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            if(checkForValidNasaData(content)){
                return "object not found";
            }
            return content;
        }
        return "error";
    }
}