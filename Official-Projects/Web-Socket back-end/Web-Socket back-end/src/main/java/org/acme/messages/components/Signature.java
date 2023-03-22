package org.acme.messages.components;

import com.fasterxml.jackson.annotation.JsonProperty;

public class Signature {

    @JsonProperty(value = "version")
    private String version;
    @JsonProperty(value = "source")
    private String source;

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getSource() {
        return source;
    }

    public void setSource(String source) {
        this.source = source;
    }
}
