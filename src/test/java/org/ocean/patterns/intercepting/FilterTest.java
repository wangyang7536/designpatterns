package org.ocean.patterns.intercepting;

import static org.junit.Assert.assertEquals;

import org.junit.Test;

public class FilterTest {
    @Test
    public void test() {
        UserCache.addUser("123", "test");
        FilterChain filterChain = new FilterChain();
        filterChain.addFilter(new AuthenticationFilter());
        filterChain.addFilter(new AuthorizationFilter());
        filterChain.addFilter(new LoggingFilter());
        filterChain.addFilter(new EncryptionFilter());
        Application application = new Application();
        filterChain.setApplication(application);
        Request request = new Request("123", 100);
        Response response = null;
        try {
            response = filterChain.execute(request);
        } catch (FilterException e) {
            e.printStackTrace();
        }
        assertEquals(response.getAlteredValue(), 210);
    }
}
