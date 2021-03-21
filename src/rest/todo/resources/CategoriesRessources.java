package rest.todo.resources;


import rest.todo.dao.CategorieDao;
import rest.todo.dto.CategorieDTO;
import rest.todo.model.Categorie;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.List;
import java.util.Set;
import java.util.stream.Collectors;

@Path("/categories")
public class CategoriesRessources {
    // Allows to insert contextual objects into the class,
    // e.g. ServletContext, Request, Response, UriInfo
    @Context
    UriInfo uriInfo;
    @Context
    Request request;

    // Return the list of categories to the user in the browser
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Set<CategorieDTO> getAll() {
        return CategorieDao.getInstance().getAll().stream()
                .map(CategorieDTO::from)
                .collect(Collectors.toSet());
    }

    @Path("{categorie}")
    public CategorieRessource getCategorie(@PathParam("categorie") String id) {
        return new CategorieRessource(uriInfo, request, id);
    }
}

