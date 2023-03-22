package org.acme.messages.components;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MinDv {

    @JsonProperty(value = "dur")
    private int dur;

    @JsonProperty(value = "dv")
    private String dv;

    public int getDur() {
        return dur;
    }

    public void setDur(int dur) {
        this.dur = dur;
    }

    public String getDv() {
        return dv;
    }

    public void setDv(String dv) {
        this.dv = dv;
    }
}
