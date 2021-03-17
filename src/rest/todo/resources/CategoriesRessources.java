package rest.todo.resources;


import rest.todo.dao.CategorieDao;
import rest.todo.model.Categorie;
import javax.ws.rs.*;
import javax.ws.rs.core.*;
import java.util.ArrayList;
import java.util.List;

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
    @Produces({MediaType.APPLICATION_JSON, MediaType.APPLICATION_XML})
    public List<Categorie> getTodosBrowser() {
        return new ArrayList<>(CategorieDao.getInstance().getModel().values());
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response newCategorie(Categorie newCategorie) {
        String newId = Integer.toString(CategorieDao.getInstance().getModel().size() + 1);
        CategorieDao.getInstance().getModel().put(newId, newCategorie);
        String result = "Record entered: "+ CategorieDao.getInstance().getModel().get(newId);
        return Response.status(201).entity(result).build();
    }

    @Path("{categorie}")
    public CategorieRessource getCategorie(@PathParam("categorie") String id) {
        return new CategorieRessource(uriInfo, request, id);
    }
}

