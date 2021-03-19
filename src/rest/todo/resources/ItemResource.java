package rest.todo.resources;

import javax.ws.rs.Consumes;
import javax.ws.rs.DELETE;
import javax.ws.rs.GET;
import javax.ws.rs.PUT;
import javax.ws.rs.Produces;
import javax.ws.rs.core.Context;
import javax.ws.rs.core.MediaType;
import javax.ws.rs.core.Request;
import javax.ws.rs.core.Response;
import javax.ws.rs.core.UriInfo;
import javax.xml.bind.JAXBElement;

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
    @Produces( {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON} )
    public Item getItem(){
        Item item = ItemDao.getInstance().getModel().get(id);
        if(item == null){
            throw new RuntimeException("Get: Article avec l'id " + id + " n'a pas été trouvé");
        }
        return item;
    }


    @GET
    @Produces( MediaType.TEXT_XML )
    public Item getItemHTML(){
        Item item = ItemDao.getInstance().getModel().get(id);
        if(item == null){
            throw new RuntimeException("Get: Article avec l'id " + id + " n'a pas été trouvé");
        }
        return item;
    }


    @PUT
    @Consumes( MediaType.APPLICATION_JSON )
    public Response putItem(JAXBElement<Item> item){
        Item i = item.getValue();
        return putAndGetResponse(i);
    }

    @DELETE
    public void deleteItem(){
        Item i = ItemDao.getInstance().getModel().remove(id);
        if(i == null){
            throw new RuntimeException("Delete : Article avec l'id "+ id + " n'a pas été trouvé");
        }
    }


    private Response putAndGetResponse(Item item){
        Response res;
        if(ItemDao.getInstance().getModel().containsKey(item.getId())){
            res = Response.noContent().build();
        }
        else {
            res = Response.created(uriInfo.getAbsolutePath()).build();
        }
        ItemDao.getInstance().getModel().put(item.getId(), item);
        return res;
    }
}
