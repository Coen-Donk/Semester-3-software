package org.acme.messages.components;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MinDur {

    @JsonProperty(value = "dv")
    private String dv;

    @JsonProperty(value = "dur")
    private int dur;

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }

    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }
}
