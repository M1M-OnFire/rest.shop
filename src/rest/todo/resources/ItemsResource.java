package rest.todo.resources;

import javax.ws.rs.*;
import javax.ws.rs.core.*;

import rest.todo.dao.CategorieDao;
import rest.todo.dao.ItemDao;
import rest.todo.dto.ItemCategorieDTO;
import rest.todo.model.Item;

import java.util.Set;

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
    @Produces(MediaType.APPLICATION_JSON )
    public Set<ItemCategorieDTO> getall() {
        return ItemDao.getInstance().getAllItemCategorie();
    }

    @POST
    @Consumes({MediaType.APPLICATION_JSON})
    public Response newItem(ItemCategorieDTO itemCategorieDTO) {
        ItemDao.getInstance().add(itemCategorieDTO.getItem());
        CategorieDao.getInstance()
                .get(itemCategorieDTO.getCategorieId())
                .addItem(itemCategorieDTO.getItem());
        return Response.status(201).build();
    }

    @PUT
    @Consumes( MediaType.APPLICATION_JSON )
    public Response putItem(Item i){
        return putAndGetResponse(i);
    }

    private Response putAndGetResponse(Item item){
        Response res;

        if(!ItemDao.getInstance().getAll().contains(item)){
            res = Response.noContent().status(Response.Status.NOT_FOUND).build();
        }
        else {
            res = Response.created(uriInfo.getAbsolutePath()).status(Response.Status.ACCEPTED).build();
            ItemDao.getInstance().update(item);
            CategorieDao.getInstance().updateItem(item);
        }
        return res;
    }


}