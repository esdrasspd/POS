package logic;

import Forms.FrmCatProd;
import Forms.FrmLogin;
import Forms.FrmMenuOptions;
import Forms.FrmUsers;

/**
 *
 * @author Esdras Abel Sapón Díaz
 */

public class Classes {
    
    public static void ExecuteLogin() {
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }
    
    public static void ExecuteMenuOptions() {
        FrmMenuOptions MenuOptions = new FrmMenuOptions();
        MenuOptions.setVisible(true);
    }
     
     public static void ExecuteUsers(){
         FrmUsers Users = new FrmUsers();
         Users.setVisible(true);
     }
     
     public static void ExecuteCatProd() {
         FrmCatProd CatProd = new FrmCatProd();
         CatProd.setVisible(true);
     }
}
