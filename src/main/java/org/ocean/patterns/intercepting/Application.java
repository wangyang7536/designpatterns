package org.ocean.patterns.intercepting;

public class Application {
    public Response execute(Request request) {
        Response response = new Response(request.getUserId(),request.getValue());
        return response;
    }
}
