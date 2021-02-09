package rest.todo.resources;

import rest.todo.dao.CategorieDao;
import rest.todo.model.Categorie;

import javax.ws.rs.*;
import javax.ws.rs.core.*;
import javax.xml.bind.JAXBElement;

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
            throw new RuntimeException("Get: Article avec l'id " + id + " n'a pas été trouvé");
        }
        return categorie;
    }


    @GET
    @Produces( MediaType.TEXT_XML )
    public Categorie getCategorieHTML(){
        Categorie categorie = CategorieDao.getInstance().getModel().get(id);
        if(categorie == null){
            throw new RuntimeException("Get: Article avec l'id " + id + " n'a pas été trouvé");
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
            throw new RuntimeException("Delete : Article avec l'id "+ id + " n'a pas été trouvé");
        }
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
