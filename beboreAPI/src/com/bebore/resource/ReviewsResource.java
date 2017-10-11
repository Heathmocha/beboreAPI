package com.bebore.resource;

import java.util.List;

import javax.inject.Inject;
import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;

import com.bebore.manager.BeboreManager;
import com.bebore.response.BeerInfoRO;

@Path("reviews")
public class ReviewsResource
{

    @Inject
    BeboreManager testManager;

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Response getReviewCollection()
    {
        System.out.println("HM - this is a print where we about to get your reviews!!!");

        List<BeerInfoRO> fullBeerList = null;

        return Response.status(Response.Status.OK).entity(fullBeerList).build();
    }

}
