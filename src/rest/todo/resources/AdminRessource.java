package rest.todo.resources;

import rest.todo.dao.AdminDao;
import rest.todo.model.Admin;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;
import java.util.Optional;

@Path("/connexion")
public class AdminRessource {
    @Context
    UriInfo uriInfo;

    @Context
    Request request;

    @POST
    @Produces(MediaType.APPLICATION_JSON )
    @Consumes(MediaType.APPLICATION_JSON )
    public Admin connexion(Admin admin) {
        return AdminDao.getInstance().getModel().values().stream()
            .filter(e -> e.getUsername().equals(admin.getUsername()) && e.getPassword().equals(admin.getPassword()))
            .findFirst()
            .orElse(null);
    }
}
