package logic;

import Forms.FrmIUMain;
import Forms.FrmLogin;


public class Classes {
    
    public static void ExecuteLogin() {
        FrmLogin login = new FrmLogin();
        login.setVisible(true);
    }
    
    public static void ExecuteIUMain() {
        FrmIUMain iu = new FrmIUMain();
        iu.setVisible(true);
    }
    
}
