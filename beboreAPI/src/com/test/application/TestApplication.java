package com.test.application;

import java.util.HashSet;
import java.util.Set;

import javax.ws.rs.ApplicationPath;
import javax.ws.rs.core.Application;

import com.test.resource.TestResource;

@ApplicationPath("/")
public class TestApplication extends Application
{

    private Set<Object> singletons = new HashSet<Object>();
    private Set<Class<?>> classes = new HashSet<Class<?>>();

    public Set<Class<?>> getClasses()
    {
        classes.add(TestResource.class);

        return classes;
    }

    public Set<Object> getSingletons()
    {
        return singletons;
    }

}
