package models;

import models.Role.Role;
import models.Role.SystemAdminRole;
import models.User.UserAccount;

/**
 *
 * @author rrheg
 */
public class ConfigureASystem {
    
    public static EcoSystem configure(){
        
        EcoSystem system = EcoSystem.getInstance();
        
        UserAccount ua = system.getUserAccountDirectory().createUserAccount("sysadmin", "sysadmin", new SystemAdminRole());
                
        return system;
    }
    
}
