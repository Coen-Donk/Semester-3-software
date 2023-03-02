package org.acme;

import java.net.*;
import java.util.Map;
import java.io.*;
import java.nio.charset.StandardCharsets;

public class APICaller{

    private URL resourceUrl;
    private HttpURLConnection resourceConnection;

    public APICaller(String _resourceUrl) throws IOException {
        this.resourceUrl = new URL(_resourceUrl);
        this.resourceConnection = (HttpURLConnection) resourceUrl.openConnection();
    }

    public String doGetRequest() throws IOException {
        this.resourceConnection.setRequestMethod("GET");
        int responseCode = this.resourceConnection.getResponseCode();
        if(responseCode == HttpURLConnection.HTTP_OK){
            InputStream inputStream = this.resourceConnection.getInputStream();
            String content = new String(inputStream.readAllBytes(), StandardCharsets.UTF_8);
            return content;
        }
        return "error";
    }

    public String getResourceUrl(){
        return this.resourceUrl.toString();
    }

    public void setResourceUrl(String newResourceUrl) throws IOException {
        this.resourceUrl = new URL(newResourceUrl);
    }
}