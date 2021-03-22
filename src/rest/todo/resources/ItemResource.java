package rest.todo.resources;

import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;

import rest.todo.dao.CategorieDao;
import rest.todo.dao.ItemDao;
import rest.todo.model.Item;

public class ItemResource {

    @Context
    UriInfo uriInfo;

    @Context
    Request request;
    String id;

    public ItemResource(UriInfo uriInfo, Request request, String id) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.id = id;
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public Item getItem(){
        Item item = ItemDao.getInstance().get(id);
        if(item == null){
            throw new RuntimeException("Get: Article avec l'id " + id + " n'a pas été trouvé");
        }
        return item;
    }

    @DELETE
    public Response deleteItem(){
        Item item = ItemDao.getInstance().get(id);

        if(item == null){
            return Response.status(Response.Status.NOT_FOUND).build();
        }

        ItemDao.getInstance().delete(item);
        CategorieDao.getInstance().deleteItem(item);
        return Response.status(Response.Status.OK).build();
    }

}
