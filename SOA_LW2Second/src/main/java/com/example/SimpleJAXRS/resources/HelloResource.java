package com.example.SimpleJAXRS.resources;

import com.example.SimpleJAXRS.cruds.EmployeeCRUD;
import com.example.SimpleJAXRS.cruds.OrganizationCRUD;
import com.example.SimpleJAXRS.entities.Employee;
import com.example.SimpleJAXRS.entities.Organization;

import javax.ws.rs.GET;
import javax.ws.rs.Path;
import javax.ws.rs.PathParam;
import javax.ws.rs.Produces;
import javax.ws.rs.client.Client;
import javax.ws.rs.client.ClientBuilder;
import javax.ws.rs.client.Entity;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriBuilder;
import java.net.URI;
import java.util.List;

@Path("/")
public class HelloResource {
    @GET
    //@Produces("text/plain")
    public Response hello() {
        return Response.ok().entity("This is JAX-RS").build();
        //return Response.ok().status(200).build();
        //return "Hello, World!";
    }

}