package rest.todo.resources;

import rest.todo.dao.CategorieDao;
import rest.todo.model.Categorie;
import rest.todo.model.Item;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.bind.JAXBElement;
import java.util.Set;


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
    @Produces( {MediaType.APPLICATION_JSON} )
    public Categorie getCategorie(){
        Categorie categorie = CategorieDao.getInstance().get(id);
        if(categorie == null){
            throw new RuntimeException("Get: Categorie avec l'id " + id + " n'a pas été trouvé");
        }
        return categorie;
    }

    @GET
    @Produces({MediaType.APPLICATION_JSON})
    @Path("/items")
    public Set<Item> getItems(){
        return CategorieDao.getInstance().getItems(id);
    }

}
