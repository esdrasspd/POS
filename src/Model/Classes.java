package Model;

import view.FrmBrandProd;
import view.FrmCatProd;
import view.FrmLogin;
import view.FrmMenuOptions;
import view.FrmUsers;
import view.FrmClients;
import view.FrmMeasuresProd;
import view.FrmMethodPayment;
import view.FrmProviders;
import view.FrmSectionProd;
import view.FrmProd;
import view.FrmShopping;
import view.FrmSales;

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
     
     public static void ExecuteClients()
     {
         FrmClients Clientes = new FrmClients();
         Clientes.setVisible(true);
     }
     
     public static void ExecuteMethodPayment()
     {
         FrmMethodPayment Payment = new FrmMethodPayment();
         Payment.setVisible(true);
     }
     
     public static void ExecuteSectionProd()
     {
         FrmSectionProd SectionProd = new FrmSectionProd();
         SectionProd.setVisible(true);
     }
     
     public static void ExecuteBrandProd()
     {
         FrmBrandProd Brand = new FrmBrandProd();
         Brand.setVisible(true);
     }
     
     public static void ExecuteMeasureProd()
     {
         FrmMeasuresProd Measure = new FrmMeasuresProd();
         Measure.setVisible(true);
     }
     
     public static void ExecuteProviders()
     {
         FrmProviders Provider = new FrmProviders();
         Provider.setVisible(true);
     }
     
     public static void ExecuteProducts()
     {
         FrmProd Products = new FrmProd();
         Products.setVisible(true);
     }
     
     public static void ExecuteShopping()
     {
         FrmShopping shopping = new FrmShopping();
         shopping.setVisible(true);
     }
     
     public static void ExecuteSales()
     {
         FrmSales sales = new FrmSales();
         sales.setVisible(true);
     }
}
