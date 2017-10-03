package com.test.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.test.manager.TestManager;
import com.test.response.BeerInfoRO;

@Path("beer")
public class TestResource
{

    @Inject 
    TestManager testManager;
    
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBeerCollection()
    {
        System.out.println("HM - this is a print to get the full beer list - yay!");

        List<BeerInfoRO> fullBeerList = testManager.getBeerList();

        return Response.status(Response.Status.OK).entity(fullBeerList).build();
    }

    @Path("/{beer-id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBeerById(@PathParam("beer-id") int beerId)
    {
        System.out.println("HM - this is a print to get a beer by an id");

        BeerInfoRO specificBeer = testManager.getSpecificBeer(beerId);

        return Response.status(Response.Status.OK).entity(specificBeer).build();
    }
}
