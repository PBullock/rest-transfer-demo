package demo;

import com.fasterxml.jackson.annotation.JsonProperty;
import io.dropwizard.Configuration;

public class DemoConf extends Configuration{

    @JsonProperty
    private String consumableValue;

    public String getConsumableValue()
    {
        return consumableValue;
    }

}
