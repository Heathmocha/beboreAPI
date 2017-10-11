package com.bebore.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class BeboreApplication extends Application
{

    private Set<Object> singletons = new HashSet<Object>();
    private Set<Class<?>> classes = new HashSet<Class<?>>();

    @Override
    public Set<Class<?>> getClasses()
    {
        classes.add(com.bebore.resource.BeersResource.class);
        classes.add(com.bebore.resource.ReviewsResource.class);

        return classes;
    }

    public Set<Object> getSingletons()
    {
        return singletons;
    }

}
