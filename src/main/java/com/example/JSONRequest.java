package com.example;

import io.micronaut.core.annotation.Introspected;
import com.fasterxml.jackson.databind.annotation.JsonDeserialize;
import com.fasterxml.jackson.databind.annotation.JsonSerialize;

@Introspected
@JsonDeserialize
@JsonSerialize
public class JSONRequest {
    private Object json;
    private String filter;

    public Object getJson() {
        return json;
    }

    public void setJson(Object json) {
        this.json = json;
    }

    public String getFilter() {
        return filter;
    }

    public void setFilter(String filter) {
        this.filter = filter;
    }
}