package rest.todo.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;
import rest.todo.dao.ItemDao;
import rest.todo.model.Categorie;
import rest.todo.model.Item;

import java.util.ArrayList;
import java.util.List;
import java.util.Set;

@Path("Items")
public class ItemsResource {

    @Context
    UriInfo uriInfo;

    @Context
    Request request;
    String id;

    public ItemsResource(UriInfo uriInfo, Request request, String id) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.id = id;
    }
// recuperer tt les items
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Item> getall() {
        return Itemdao.getAll();
    }
// liste de tt les items d'une categorie

    @Path("Categorie")
    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Set<Item> getall() {
        Item item= ItemDao.instance.getModel().get(id);
        return Itemdao.getAll();
    }

}