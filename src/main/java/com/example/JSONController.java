package com.example;

import com.jayway.jsonpath.JsonPath;

import com.jayway.jsonpath.InvalidJsonException;
import io.micronaut.http.HttpResponse;
import io.micronaut.http.MediaType;
import io.micronaut.http.annotation.Body;
import io.micronaut.http.annotation.Controller;
import io.micronaut.http.annotation.Post;

@Controller("/json")
public class JSONController {

    @Post(consumes = MediaType.APPLICATION_JSON)
    public HttpResponse<?> index(@Body JSONRequest jsonRequest) {
        try {
            String filter = jsonRequest.getFilter();
            Object json = jsonRequest.getJson();
            String books = JsonPath.parse(json)
                    .read(filter).toString();

            return HttpResponse.ok(books);
        } catch (InvalidJsonException e) {
            JSONResponse jsonResponse = new JSONResponse();
            jsonResponse.setError("Invalid JSON Input");
            return HttpResponse.badRequest(jsonResponse);
        } catch (Exception e) {
            JSONResponse jsonResponse = new JSONResponse();
            jsonResponse.setError(e.getMessage());
            return HttpResponse.badRequest(jsonResponse);
        }
    }
}
