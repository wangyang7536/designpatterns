package org.ocean.patterns.intercepting;

import java.util.ArrayList;
import java.util.List;

public class FilterChain {
    private List<Filter> filters = new ArrayList<>();
    private Application application;

    public void addFilter(Filter filter) {
        filters.add(filter);
    }

    public void setApplication(Application application) {
        this.application = application;
    }

    public Response execute(Request request) throws FilterException {
        for (Filter filter : filters) {
            filter.handle(request);
        }
        Response response = application.execute(request);
        return response;
    }
}
