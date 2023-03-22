package org.acme;

import com.fasterxml.jackson.core.JsonPointer;
import com.fasterxml.jackson.databind.JsonNode;
import org.acme.APICaller;
import org.acme.messages.AsteroidDataMessage;
import org.acme.messages.AsteroidRequestMessage;

import com.fasterxml.jackson.core.JsonProcessingException;
import com.fasterxml.jackson.databind.JsonMappingException;
import com.fasterxml.jackson.databind.ObjectMapper;

import javax.websocket.server.ServerEndpoint;
import javax.websocket.Session;

import java.io.IOException;
import java.util.Iterator;
import java.util.Map;

public class SocketHandler{

    private String apiUrl = "https://ssd-api.jpl.nasa.gov/nhats.api?des=";

    ObjectMapper objectMapper = new ObjectMapper();

    public SocketHandler(){
        
    }
    
    public void sendMessageToClient(Session session, String message) {
        session.getAsyncRemote().sendObject(message, result ->  {
            if (result.getException() != null) {
                System.out.println("Unable to send message: " + result.getException());
            }
        });
    }

    // public String getResponseCode() throws IOException {
    //     APICaller apiCaller = new APICaller("https://ssd-api.jpl.nasa.gov/nhats.api?des=2021%20JG6");
    //     apiCaller.doGetRequest("hello");
    //     return "";
    // }

    private AsteroidRequestMessage mapMessageToObject(String data) throws JsonMappingException, JsonProcessingException{
        return objectMapper.readValue(data, AsteroidRequestMessage.class);
    }

    private AsteroidDataMessage mapNasaDataToAsteroidObject(String asteroidData) throws IOException {
        System.out.println(asteroidData);
//        return objectMapper.readValue(asteroidData, AsteroidDataMessage.class);
        String asteroidDataNew = "{\"obs_flag\":\" \",\"orbit_id\":\"18\",\"radar_obs_g\":null,\"obs_start\":\"2023-03-22\",\"n_via_traj\":1082523,\"des\":\"2021 JG6\",\"obs_mag\":\"23.69\",\"occ\":\"3\",\"min_size\":\"28\",\"computed\":\"2023-01-26\",\"min_dur_traj\":{\"v_arr_earth\":\"11.633\",\"launch\":\"2040-06-04\",\"dv_total\":\"11.973\",\"dec_dep\":\"-27.934\",\"tid\":700490,\"dur_total\":82,\"dur_at\":8,\"vrel_arr_earth\":\"0.000\",\"vrel_arr_neo\":\"4.242\",\"v_dep_earth\":\"2.882\",\"dur_ret\":33,\"c3\":\"8.304\",\"dur_out\":41,\"dec_arr\":\"28.518\",\"dv_dep_park\":\"3.553\",\"vrel_dep_neo\":\"4.179\"},\"min_dv_traj\":{\"dec_dep\":\"10.450\",\"dv_total\":\"5.316\",\"tid\":45266,\"dur_total\":386,\"dur_at\":72,\"launch\":\"2020-05-28\",\"v_arr_earth\":\"12.000\",\"dur_out\":145,\"dec_arr\":\"10.702\",\"vrel_dep_neo\":\"0.763\",\"dv_dep_park\":\"3.600\",\"dur_ret\":169,\"c3\":\"9.373\",\"vrel_arr_neo\":\"0.930\",\"v_dep_earth\":\"3.061\",\"vrel_arr_earth\":\"0.023\"}, \"fullname\":\"       (2021 JG6)\", \"min_dv\":{\"dv\":\"5.316\",\"dur\":386},\"min_dur\":{\"dv\":\"11.973\",\"dur\":82}, \"signature\":{\"version\":\"1.3\",\"source\":\"NASA/JPL NHATS Data API\"}}";
        System.out.println("v");
        AsteroidDataMessage adm = objectMapper.readValue(asteroidData, AsteroidDataMessage.class);
        System.out.println(adm.getFullname());
        System.out.println("Reached this line");
        return adm;
    }

    public String getAsteroidData(String data) throws IOException{
        AsteroidRequestMessage asm = mapMessageToObject(data);
        APICaller apiCaller = new APICaller(apiUrl + asm.getData().toUpperCase());
        String asteroidDataString =  apiCaller.doGetRequest();
        return mapNasaDataToAsteroidObject(asteroidDataString).getFullname();
    }
}