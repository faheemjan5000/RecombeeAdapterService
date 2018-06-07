package introsde.project.adopter.recombee.soap;


import java.util.ArrayList;
import java.util.List;

import javax.jws.WebMethod;
import javax.jws.WebParam;
import javax.jws.WebResult;
import javax.jws.WebService;
import javax.jws.soap.SOAPBinding;
import javax.jws.soap.SOAPBinding.Style;
import javax.jws.soap.SOAPBinding.Use;

import introsde.project.adopter.recombee.model.Evaluation;
import introsde.project.adopter.recombee.model.ItemObject;
import introsde.project.adopter.recombee.model.RecombeeDBType;


@WebService
@SOAPBinding(style = Style.DOCUMENT, use=Use.LITERAL)
public interface RecombeeInterface {
	
	@WebMethod(operationName="addUser")
    @WebResult(name="boolean") 
	public boolean addUser(
			@WebParam(name="dbName") RecombeeDBType db,
			@WebParam(name="userId") String userId,
			@WebParam(name="preitem") ArrayList<String> preitem
			);
	
//	@WebMethod(operationName="additem")
//    @WebResult(name="String") 
//	public ItemObject addItem(
//			@WebParam(name="dbName") RecombeeDBType db,
//			@WebParam(name="itemId") String itemId,
//			@WebParam(name="itemType") String itemType,
//			@WebParam(name="location") String location
//			);	
	
	@WebMethod(operationName="addRating")
    @WebResult(name="boolean") 
    public boolean addNewRating(
    		@WebParam(name="dbName") RecombeeDBType db,
    		@WebParam(name="rating") Evaluation rating
    		);
	
//	@WebMethod(operationName="modifyRating")
//    @WebResult(name="boolean") 
//    public boolean modifyRating(
//    		@WebParam(name="dbName") RecombeeDBType db,
//    		@WebParam(name="rating") Evaluation rating
//    		);
	
	
	
	@WebMethod(operationName="getUserRatings")
    @WebResult(name="ratingList") 
    public List<Evaluation> getUserRatings(
    		@WebParam(name="dbName") RecombeeDBType db,
    		@WebParam(name="userId") String userId
    		);
	
	@WebMethod(operationName="getRec4User")
    @WebResult(name="recommendations") 
    public List<ItemObject> getRecommendations(
    		@WebParam(name="dbName") RecombeeDBType db,
    		@WebParam(name="userId") String userId,
    		@WebParam(name="quantity") int quantity
    		);
	
//	@WebMethod(operationName="getItem")
//    @WebResult(name="ListOfPropertiesofItems") 
//    public ItemObject getItem(
//    		@WebParam(name="dbName") RecombeeDBType db,
//    		@WebParam(name="itemName") String ItemName
//    		);
	
	@WebMethod(operationName="getItemsByType")
    @WebResult(name="StringList") 
    public List<ItemObject> getItemsByType(
    		@WebParam(name="dbName") RecombeeDBType db,
    		@WebParam(name="itemName") String ItemType
    		);
	
	@WebMethod(operationName="getAllItem")
    @WebResult(name="StringList") 
    public List<ItemObject> getAllItem(
    		@WebParam(name="dbName") RecombeeDBType db
    		);
	
	@WebMethod(operationName="getItemRatings")
    @WebResult(name="ratingList") 
    public List<Evaluation> getItemRatings(
    		@WebParam(name="dbName") RecombeeDBType db,
    		@WebParam(name="itemId") String itemId
    		);
	
	
//	@WebMethod(operationName="resetBD")
//	@WebResult(name="boolean") 
//    public boolean resetDB(
//    		@WebParam(name="dbName") RecombeeDBType db
//    		);
//	
	@WebMethod(operationName="initBD")
	@WebResult(name="boolean") 
    public boolean initDB(
    		@WebParam(name="dbName") RecombeeDBType db
    		);
	
	
//	@WebMethod(operationName="addFoodBatch")
//    @WebResult(name="int") 
//    public int addFoodBatch(
//    		@WebParam(name="interactions") ArrayList<Request> interactions
//    		);
//	
//	@WebMethod(operationName="addMovieBatch")
//    @WebResult(name="int") 
//    public int addMovieBatch(
//    		@WebParam(name="interactions") ArrayList<Request> interactions
//    		);

}
