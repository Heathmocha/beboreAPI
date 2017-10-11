package com.bebore.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bebore.manager.BeboreManager;
import com.bebore.response.BeerInfoRO;

@Path("beers")
public class BeersResource
{

    @Inject
    BeboreManager beboreManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBeerCollection()
    {
        System.out.println("HM - this is a print to get the full beer list - yay!");

        List<BeerInfoRO> fullBeerList = beboreManager.getBeerList();

        return Response.status(Response.Status.OK).entity(fullBeerList).build();
    }

    @Path("/{beer-id}")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getBeerById(@PathParam("beer-id") int beerId)
    {
        System.out.println("HM - this is a print to get a beer by an id");

        BeerInfoRO specificBeer = beboreManager.getSpecificBeer(beerId);

        return Response.status(Response.Status.OK).entity(specificBeer).build();
    }
}
