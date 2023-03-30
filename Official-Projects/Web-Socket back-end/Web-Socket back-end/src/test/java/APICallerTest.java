import org.acme.APICaller;
import org.assertj.core.api.Assertions;
import org.junit.Assert;
import org.junit.jupiter.api.Test;

import java.io.IOException;

public class APICallerTest {

    @Test
    public void testValidGetRequestOutput() throws IOException {
        String validResourceUrl = "https://ssd-api.jpl.nasa.gov/nhats.api?des=2021 JG6";
        APICaller api = new APICaller(validResourceUrl);
        String actualData = api.doGetRequest();

        Assertions.assertThat(actualData)
                .contains("\"obs_mag\":\"23.98\"")
                .contains("\"min_dv\":")
                .contains("\"fullname\":\"       (2021 JG6)\"")
                .contains("\"n_via_traj\":1082523");
    }

    @Test
    public void testInvalidObjectGetRequestOutput() throws IOException {
        String invalidResourceUrl = "https://ssd-api.jpl.nasa.gov/nhats.api?des=0221 JG6";
        APICaller api = new APICaller(invalidResourceUrl);
        String errorMessage = "object not found";
        String actualData = api.doGetRequest();

        Assert.assertEquals(errorMessage, actualData);
    }

    @Test
    public void testInvalidGetRequestOutput() throws IOException {
        String invalidResourceUrl = "https://ssd-api.jpl.nasa.gov/nhats.api?es=0221 JG6";
        APICaller api = new APICaller(invalidResourceUrl);
        String errorMessage = "error";
        String actualData = api.doGetRequest();

        Assert.assertEquals(errorMessage, actualData);
    }
}
