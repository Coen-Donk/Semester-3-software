import org.acme.SocketHandler;

import org.acme.messages.AsteroidDataMessage;

import org.acme.messages.components.*;
import org.assertj.core.api.Assertions;

import org.junit.jupiter.api.BeforeAll;
import org.junit.jupiter.api.Test;
import org.mockito.Mockito;

import javax.websocket.RemoteEndpoint;
import javax.websocket.SendHandler;
import javax.websocket.Session;
import java.io.IOException;

import static org.mockito.ArgumentMatchers.any;
import static org.mockito.ArgumentMatchers.eq;


class SocketHandlerTest {
    static AsteroidDataMessage adm;
    SocketHandler socketHandler = new SocketHandler();

    @BeforeAll
    static void createAdmAndAsm(){
        AsteroidDataMessage _adm = new AsteroidDataMessage();

        MinDv _minDv = new MinDv();
        _minDv.setDur(386);
        _minDv.setDv("5.316");

        MinDur _minDur = new MinDur();
        _minDur.setDur(82);
        _minDur.setDv("11.973");

        Signature _sig = new Signature();
        _sig.setSource("1.3");
        _sig.setVersion("NASA/JPL NHATS Data API");

        MinDurTraj _minDurTraj = new MinDurTraj();
        _minDurTraj.setVrel_arr_neo("4.242");
        _minDurTraj.setDec_dep("-27.934");
        _minDurTraj.setDv_total("11.937");
        _minDurTraj.setDec_arr("28.518");
        _minDurTraj.setDur_out(41);
        _minDurTraj.setVrel_dep_neo("4.179");
        _minDurTraj.setDur_ret(33);
        _minDurTraj.setLaunch("2040-06-04");
        _minDurTraj.setV_dep_earth("2.882");
        _minDurTraj.setDur_total(82);
        _minDurTraj.setVrel_arr_earth("0.000");
        _minDurTraj.setDur_at(8);
        _minDurTraj.setV_arr_earth("11.633");
        _minDurTraj.setC3("8.304");
        _minDurTraj.setDv_dep_park("3.553");
        _minDurTraj.setTid(700490);

        MinDvTraj _minDvTraj = new MinDvTraj();
        _minDvTraj.setVrel_arr_neo("0.930");
        _minDvTraj.setDec_dep("10.450");
        _minDvTraj.setDv_total("5.316");
        _minDvTraj.setDec_arr("10.702");
        _minDvTraj.setDur_out(145);
        _minDvTraj.setVrel_dep_neo("0.763");
        _minDvTraj.setDur_ret(169);
        _minDvTraj.setLaunch("2020-05-28");
        _minDvTraj.setV_dep_earth("3.061");
        _minDvTraj.setDur_total(386);
        _minDvTraj.setVrel_arr_earth("0.023");
        _minDvTraj.setDur_at(72);
        _minDvTraj.setV_arr_earth("12.000");
        _minDvTraj.setC3("9.373");
        _minDvTraj.setDv_dep_park("3.600");
        _minDvTraj.setTid(45266);


        _adm.setComputed("2023-01-26");
        _adm.setDes("2021 JG6");
        _adm.setRadar_snr_a("110");
        _adm.setOrbit_id("18");
        _adm.setMin_dv(_minDv);
        _adm.setRadar_obs_a("2041-12-31");
        _adm.setMin_size("28");
        _adm.setSignature(_sig);
        _adm.setOcc("3");
        _adm.setObs_end("2023-03-30");
        _adm.setMin_dur_traj(_minDurTraj);
        _adm.setMax_size("124");
        _adm.setH("24.0");
        _adm.setRadar_snr_g(null);
        _adm.setObs_start("2023-03-28");
        _adm.setRadar_obs_g(null);
        _adm.setMin_dur(_minDur);
        _adm.setMin_dv_traj(_minDvTraj);
        _adm.setN_via_traj(1082523);
        _adm.setFullname("       (2021 JG6)");
        _adm.setObs_mag("23.91");
        _adm.setObs_flag(" ");

        adm = _adm;
    }

    @Test
    void testReceiveAsteroidDataJson() throws IOException {
        Assertions.assertThat(socketHandler.getAsteroidData("{\"data\":\"2021 JG6\"}"))
                .contains("\"obs_mag\":\"23.98\"")
                .contains("\"min_dv\":")
                .contains("\"fullname\":\"       (2021 JG6)\"")
                .contains("\"n_via_traj\":1082523");
    }
    @Test
    void testSendOnMessage(){
        Session session = Mockito.mock(Session.class);
        RemoteEndpoint.Async asyncRemote = Mockito.mock(RemoteEndpoint.Async.class);
        Mockito.when(session.getAsyncRemote()).thenReturn(asyncRemote);

        // Call the sendMessageToClient method with a test message
        String testMessage = "Hello, world!";
        socketHandler.sendMessageToClient(session, testMessage);

        // Verify that the message was sent successfully
        Mockito.verify(asyncRemote).sendObject(eq(testMessage), any(SendHandler.class));
    }
}
