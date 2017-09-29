package com.test.resource;

import java.util.List;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.test.manager.TestManager;
import com.test.response.BeerInfoRO;

@Path("beer")
public class TestResource
{

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBeerCollection()
    {
        System.out.println("HM - this is a print to get the full beer list");

        List<BeerInfoRO> fullBeerList = TestManager.getBeerList();

        return Response.status(Response.Status.FORBIDDEN).entity(fullBeerList).build();
    }

    @Path("/{beer-id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBeerById()
    {
        System.out.println("HM - this is a print to get a beer by an id");

        BeerInfoRO specificBeer = TestManager.getSpecificBeer();

        return Response.status(Response.Status.OK).entity(specificBeer).build();
    }
}
