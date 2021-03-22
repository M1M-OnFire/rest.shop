package rest.todo.resources;

import rest.todo.dao.AdminDao;
import rest.todo.model.Admin;

import javax.ws.rs.Consumes;
import javax.ws.rs.POST;
import javax.ws.rs.Path;
import javax.ws.rs.Produces;
import javax.ws.rs.core.*;
import java.util.Optional;
import java.util.function.BiPredicate;

@Path("/connexion")
public class AdminRessource {
    @Context
    UriInfo uriInfo;

    @Context
    Request request;
    String id;

    public AdminRessource(UriInfo uriInfo, Request request, String id) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.id = id;
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    @Produces({MediaType.APPLICATION_JSON})
    public Optional<Admin> connexion(Admin admin) {
        Optional<Admin> adminOptional;
        return adminOptional = AdminDao.getInstance().getModel().values().stream()
                .filter(e -> e.getPassword().equals(admin.getPassword()) && e.getUsername().equals(admin.getUsername()))
                .findFirst();
    }
}
