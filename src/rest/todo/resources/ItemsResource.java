package rest.todo.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.UriInfo;

import rest.todo.dao.ItemDao;
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
    public ItemResource getTodo(@PathParam("item") String id) {
        return new ItemResource(uriInfo, request, id);
    }

// recuperer tt les items
    @GET
    @Produces({MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON} )
    public List<Item> getall() {
        return new ArrayList<>(ItemDao.getInstance().getModel().values());
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