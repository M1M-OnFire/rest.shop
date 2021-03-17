package rest.todo.dao;

import rest.todo.model.Admin;
import java.util.HashMap;
import java.util.Map;

public class AdminDao {
    private static AdminDao instance = null;
    private final Map<String, Admin> contentProvider = new HashMap<>();
    private AdminDao() {
        contentProvider.put("1", new Admin("Admin", Admin.hashPassword("admin")));
    }

    public static AdminDao getInstance() {
        if(instance == null){
            instance = new AdminDao();
        }
        return instance;
    }

    public Map<String, Admin> getModel(){
        return contentProvider;
    }
}
