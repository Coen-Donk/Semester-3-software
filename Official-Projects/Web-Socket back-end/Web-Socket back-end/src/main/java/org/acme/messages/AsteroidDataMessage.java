package org.acme.messages;

import com.fasterxml.jackson.annotation.JsonProperty;
import org.acme.messages.components.*;

public class AsteroidDataMessage {

    private String obs_mag;

    @JsonProperty(value = "min_dv")
    private MinDv min_dv;

    private String occ;
    private String min_size;
    private String computed;
    @JsonProperty(value = "min_dv_traj")
    private MinDvTraj min_dv_traj;
    private String des;
    private String radar_obs_g;
    private int n_via_traj;
    @JsonProperty(value = "min_dur_traj")
    private MinDurTraj min_dur_traj;
    private String obs_flag;
    private String fullname;
    private String obs_start;
    private String radar_snr_g;
    @JsonProperty(value = "min_dur")
    private MinDur min_dur;
    private String orbit_id;
    private String obs_end;
    @JsonProperty(value = "signature")
    private Signature signature;
    private String max_size;
    private String radar_obs_a;
    private String radar_snr_a;
    private String h;

    public AsteroidDataMessage(){
        
    }

    public String getObs_mag() {
        return obs_mag;
    }

    public void setObs_mag(String obs_mag) {
        this.obs_mag = obs_mag;
    }

    public MinDv getMin_dv() {
        return min_dv;
    }

    public void setMin_dv(MinDv min_dv) {
        this.min_dv = min_dv;
    }

    public String getOcc() {
        return occ;
    }

    public void setOcc(String occ) {
        this.occ = occ;
    }

    public String getMin_size() {
        return min_size;
    }

    public void setMin_size(String min_size) {
        this.min_size = min_size;
    }

    public String getComputed() {
        return computed;
    }

    public void setComputed(String computed) {
        this.computed = computed;
    }

    public MinDvTraj getMin_dv_traj() {
        return min_dv_traj;
    }

    public void setMin_dv_traj(MinDvTraj min_dv_traj) {
        this.min_dv_traj = min_dv_traj;
    }

    public String getDes() {
        return des;
    }

    public void setDes(String des) {
        this.des = des;
    }

    public String getRadar_obs_g() {
        return radar_obs_g;
    }

    public void setRadar_obs_g(String radar_obs_g) {
        this.radar_obs_g = radar_obs_g;
    }

    public int getN_via_traj() {
        return n_via_traj;
    }

    public void setN_via_traj(int n_via_traj) {
        this.n_via_traj = n_via_traj;
    }

    public MinDurTraj getMin_dur_traj() {
        return min_dur_traj;
    }

    public void setMin_dur_traj(MinDurTraj min_dur_traj) {
        this.min_dur_traj = min_dur_traj;
    }

    public String getObs_flag() {
        return obs_flag;
    }

    public void setObs_flag(String obs_flag) {
        this.obs_flag = obs_flag;
    }

    public String getFullname() {
        return fullname;
    }

    public void setFullname(String fullname) {
        this.fullname = fullname;
    }

    public String getObs_start() {
        return obs_start;
    }

    public void setObs_start(String obs_start) {
        this.obs_start = obs_start;
    }

    public String getRadar_snr_g() {
        return radar_snr_g;
    }

    public void setRadar_snr_g(String radar_snr_g) {
        this.radar_snr_g = radar_snr_g;
    }

    public MinDur getMin_dur() {
        return min_dur;
    }

    public void setMin_dur(MinDur min_dur) {
        this.min_dur = min_dur;
    }

    public String getOrbit_id() {
        return orbit_id;
    }

    public void setOrbit_id(String orbit_id) {
        this.orbit_id = orbit_id;
    }

    public String getObs_end() {
        return obs_end;
    }

    public void setObs_end(String obs_end) {
        this.obs_end = obs_end;
    }

    public Signature getSignature() {
        return signature;
    }

    public void setSignature(Signature signature) {
        this.signature = signature;
    }

    public String getMax_size() {
        return max_size;
    }

    public void setMax_size(String max_size) {
        this.max_size = max_size;
    }

    public String getRadar_obs_a() {
        return radar_obs_a;
    }

    public void setRadar_obs_a(String radar_obs_a) {
        this.radar_obs_a = radar_obs_a;
    }

    public String getRadar_snr_a() {
        return radar_snr_a;
    }

    public void setRadar_snr_a(String radar_snr_a) {
        this.radar_snr_a = radar_snr_a;
    }

    public String getH() {
        return h;
    }

    public void setH(String h) {
        this.h = h;
    }
}
