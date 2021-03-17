package rest.todo.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import rest.todo.dao.CategorieDao;
import rest.todo.dao.ItemDao;
import rest.todo.model.Categorie;
import rest.todo.model.Item;

import java.util.ArrayList;
import java.util.List;

@Path("/items")
public class ItemsResource {

    @Context
    UriInfo uriInfo;

    @Context
    Request request;

    @Path("{item}")
    public ItemResource getItem(@PathParam("item") String id) {
        return new ItemResource(uriInfo, request, id);
    }

// recuperer tt les items
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON} )
    public List<Item> getall() {
        return new ArrayList<>(ItemDao.getInstance().getModel().values());
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response newItem(Item newItem) {
        String newId = Integer.toString(ItemDao.getInstance().getModel().size() + 1);
        ItemDao.getInstance().getModel().put(newId, newItem);
        String result = "Record entered: "+ ItemDao.getInstance().getModel().get(newId);
        return Response.status(201).entity(result).build();
    }

// liste de tt les items d'une categorie
//    @Path("Categorie")
//    @GET
//    @Produces(MediaType.APPLICATION_JSON)
//    public List<Item> getalll() {
//        Item item= ItemDao.instance.getModel().get(id);
//        return Itemdao.getAll();
//    }

}