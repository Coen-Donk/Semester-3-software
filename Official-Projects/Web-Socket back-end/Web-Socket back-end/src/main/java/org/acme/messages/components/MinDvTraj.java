package org.acme.messages.components;

import com.fasterxml.jackson.annotation.JsonProperty;

public class MinDvTraj {
    @JsonProperty(value = "c3")
    private String c3;
    @JsonProperty(value = "v_dep_earth")
    private String v_dep_earth;
    @JsonProperty(value = "dur_out")
    private int dur_out;
    @JsonProperty(value = "dur_total")
    private int dur_total;
    @JsonProperty(value = "dec_dep")
    private String dec_dep;
    @JsonProperty(value = "dur_at")
    private int dur_at;
    @JsonProperty(value = "vrel_arr_neo")
    private String vrel_arr_neo;
    @JsonProperty(value = "dv_dep_park")
    private String dv_dep_park;
    @JsonProperty(value = "v_arr_earth")
    private String v_arr_earth;
    @JsonProperty(value = "vrel_dep_neo")
    private String vrel_dep_neo;
    @JsonProperty(value = "dec_arr")
    private String dec_arr;
    @JsonProperty(value = "tid")
    private int tid;
    @JsonProperty(value = "dur_ret")
    private int dur_ret;
    @JsonProperty(value = "launch")
    private String launch;
    @JsonProperty(value = "dv_total")
    private String dv_total;
    @JsonProperty(value = "vrel_arr_earth")
    private String vrel_arr_earth;

    public String getC3() {
        return c3;
    }

    public void setC3(String c3) {
        this.c3 = c3;
    }

    public String getV_dep_earth() {
        return v_dep_earth;
    }

    public void setV_dep_earth(String v_dep_earth) {
        this.v_dep_earth = v_dep_earth;
    }

    public int getDur_out() {
        return dur_out;
    }

    public void setDur_out(int dur_out) {
        this.dur_out = dur_out;
    }

    public int getDur_total() {
        return dur_total;
    }

    public void setDur_total(int dur_total) {
        this.dur_total = dur_total;
    }

    public String getDec_dep() {
        return dec_dep;
    }

    public void setDec_dep(String dec_dep) {
        this.dec_dep = dec_dep;
    }

    public int getDur_at() {
        return dur_at;
    }

    public void setDur_at(int dur_at) {
        this.dur_at = dur_at;
    }

    public String getVrel_arr_neo() {
        return vrel_arr_neo;
    }

    public void setVrel_arr_neo(String vrel_arr_neo) {
        this.vrel_arr_neo = vrel_arr_neo;
    }

    public String getDv_dep_park() {
        return dv_dep_park;
    }

    public void setDv_dep_park(String dv_dep_park) {
        this.dv_dep_park = dv_dep_park;
    }

    public String getV_arr_earth() {
        return v_arr_earth;
    }

    public void setV_arr_earth(String v_arr_earth) {
        this.v_arr_earth = v_arr_earth;
    }

    public String getVrel_dep_neo() {
        return vrel_dep_neo;
    }

    public void setVrel_dep_neo(String vrel_dep_neo) {
        this.vrel_dep_neo = vrel_dep_neo;
    }

    public String getDec_arr() {
        return dec_arr;
    }

    public void setDec_arr(String dec_arr) {
        this.dec_arr = dec_arr;
    }

    public int getTid() {
        return tid;
    }

    public void setTid(int tid) {
        this.tid = tid;
    }

    public int getDur_ret() {
        return dur_ret;
    }

    public void setDur_ret(int dur_ret) {
        this.dur_ret = dur_ret;
    }

    public String getLaunch() {
        return launch;
    }

    public void setLaunch(String launch) {
        this.launch = launch;
    }

    public String getDv_total() {
        return dv_total;
    }

    public void setDv_total(String dv_total) {
        this.dv_total = dv_total;
    }

    public String getVrel_arr_earth() {
        return vrel_arr_earth;
    }

    public void setVrel_arr_earth(String vrel_arr_earth) {
        this.vrel_arr_earth = vrel_arr_earth;
    }
}
