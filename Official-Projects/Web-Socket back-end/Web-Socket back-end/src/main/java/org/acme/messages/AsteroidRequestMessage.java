package org.acme.messages;

public class AsteroidRequestMessage {
    
    private String data;

    public AsteroidRequestMessage(){

    }

    public String getData(){
        return this.data;
    }

    public void setData(String _data){
        this.data = _data;
    }
}
