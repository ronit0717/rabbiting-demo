package io.qkr.rabbitingdemo;
import com.fasterxml.jackson.annotation.JsonIgnoreProperties;
import com.fasterxml.jackson.annotation.JsonProperty;

import java.io.Serializable;

@JsonIgnoreProperties(ignoreUnknown = true)
public class QkrDemoMessage implements Serializable {
    private final String text;

    public QkrDemoMessage(@JsonProperty("text") final String text) {
        this.text = text;
    }

    public String getText() {
        return text;
    }

    @Override
    public String toString() {
        return "DemoMessage{" +
                "text='" + text + '\'' +
                '}';
    }
}
