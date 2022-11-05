package Model;

import java.awt.Image;
import javax.swing.Icon;
import javax.swing.ImageIcon;
import javax.swing.JLabel;

public class AddImage {
    public static void SetImageLabel(JLabel labelName, String rout){
        ImageIcon image = new ImageIcon(rout);
        Icon icon = new ImageIcon(image.getImage().getScaledInstance(labelName.getWidth(), labelName.getHeight(), Image.SCALE_DEFAULT));
        labelName.setIcon(icon);
       
    } //codigo para poder arreglar las imagenes del login  
}
