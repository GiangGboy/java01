/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Model;

import java.util.List;
import java.util.ArrayList;

/**
 *
 * @author admin
 */
public class UserDao {
    List<User> ls = new ArrayList<>();
    public UserDao(){
        ls.add(new User("admin", "16022001" ,true));
        ls.add(new User("Giang", "16022001" ,true));
        ls.add(new User("Dat", "14012001" ,true));
        ls.add(new User("duydamdang", "25082001" ,true));
        ls.add(new User("giasng", "12345" ,true));
        
        
    }
    public boolean checkLogin(String username,String pass){
        for(User u : ls){
            if(u.getUsername().equals(username)
                    && u.getPassword().equals(pass)){
                return true;
                
                
            }
            return false;
        }
        return false;
    }
    
    
}
