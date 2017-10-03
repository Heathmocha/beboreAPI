package com.test.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

@ApplicationPath("/")
public class TestApplication extends Application
{

    private Set<Object> singletons = new HashSet<Object>();
    private Set<Class<?>> classes = new HashSet<Class<?>>();

    @Override
    public Set<Class<?>> getClasses()
    {
        classes.add(com.test.resource.TestResource.class);

        return classes;
    }

    public Set<Object> getSingletons()
    {
        return singletons;
    }

}
