package rest.todo.resources;

import rest.todo.dao.CategorieDao;
import rest.todo.dao.ItemDao;
import rest.todo.model.Categorie;
import rest.todo.model.Item;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.bind.JAXBElement;
import java.util.List;

public class CategorieRessource {
    @Context
    UriInfo uriInfo;

    @Context
    Request request;
    String id;

    public CategorieRessource(UriInfo uriInfo, Request request, String id) {
        this.uriInfo = uriInfo;
        this.request = request;
        this.id = id;
    }

    @GET
    @Produces( {MediaType.APPLICATION_XML, MediaType.APPLICATION_JSON} )
    public Categorie getCategorie(){
        Categorie categorie = CategorieDao.getInstance().getModel().get(id);
        if(categorie == null){
            throw new RuntimeException("Get: Categorie avec l'id " + id + " n'a pas été trouvé");
        }
        return categorie;
    }

    @GET
    @Path("sous-categories")
    @Produces({MediaType.APPLICATION_JSON})
    public List<Categorie> getSousCategorie() {
        Categorie categorie = CategorieDao.getInstance().getModel().get(id);
        if(categorie == null){
            throw new RuntimeException("Get: Categorie avec l'id " + id + " n'a pas été trouvé");
        }
        return categorie.getSousCategorie();
    }


    @GET
    @Produces( MediaType.TEXT_XML )
    public Categorie getCategorieHTML(){
        Categorie categorie = CategorieDao.getInstance().getModel().get(id);
        if(categorie == null){
            throw new RuntimeException("Get: Categorie avec l'id " + id + " n'a pas été trouvé");
        }
        return categorie;
    }


    @PUT
    @Consumes( MediaType.APPLICATION_XML )
    public Response putCategorie(JAXBElement<Categorie> categorie){
        Categorie i = categorie.getValue();
        return putAndGetResponse(i);
    }

    @DELETE
    public void deleteCategorie(){
        Categorie i = CategorieDao.getInstance().getModel().remove(id);
        if(i == null){
            throw new RuntimeException("Delete : Categorie avec l'id "+ id + " n'a pas été trouvé");
        }
    }

    @GET
    @Produces(MediaType.APPLICATION_JSON)
    public List<Item> getItems(){
        return CategorieDao.getInstance().getModel().get(id).getItems();
    }


    private Response putAndGetResponse(Categorie categorie){
        Response res;
        if(CategorieDao.getInstance().getModel().containsKey(categorie.getId())){
            res = Response.noContent().build();
        }
        else {
            res = Response.created(uriInfo.getAbsolutePath()).build();
        }
        CategorieDao.getInstance().getModel().put(categorie.getId(), categorie);
        return res;
    }
}
