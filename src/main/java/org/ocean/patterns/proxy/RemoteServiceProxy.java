package org.ocean.patterns.proxy;

/**
 * Author: ocean
 * Date: 3/30/23 2:04 PM
 */

public class RemoteServiceProxy implements RemoteService{
    private final RemoteService remoteService;
    private String cachedData;

    public RemoteServiceProxy(RemoteService remoteService) {
        this.remoteService = remoteService;
    }
    @Override
    public String getData() {
        if(cachedData == null) {
            return remoteService.getData();
        }
        return cachedData;
    }
}
