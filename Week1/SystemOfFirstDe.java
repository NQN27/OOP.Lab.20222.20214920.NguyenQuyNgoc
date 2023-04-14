import javax.swing.JOptionPane;

import org.xml.sax.ext.DefaultHandler2;
public class SystemOfFirstDe{
    public static void main(String[] args){
        String a,b,c,d,e,f;

        a = JOptionPane.showInputDialog(null,"Please input a11: ", "Input a11"
        ,JOptionPane.INFORMATION_MESSAGE);
        b = JOptionPane.showInputDialog(null,"Please input a12: ", "Input a12"
        ,JOptionPane.INFORMATION_MESSAGE);
        c = JOptionPane.showInputDialog(null,"Please input b1: ", "Input b1"
        ,JOptionPane.INFORMATION_MESSAGE);
        d = JOptionPane.showInputDialog(null,"Please input a21: ", "Input a21"
        ,JOptionPane.INFORMATION_MESSAGE);
        e = JOptionPane.showInputDialog(null,"Please input a22: ", "Input a22"
        ,JOptionPane.INFORMATION_MESSAGE);
        f = JOptionPane.showInputDialog(null,"Please input b2: ", "Input b2"
        ,JOptionPane.INFORMATION_MESSAGE);

        double a11 = Double.parseDouble(a);
        double a12 = Double.parseDouble(b);
        double b1 = Double.parseDouble(c);
        double a21 = Double.parseDouble(d);
        double a22 = Double.parseDouble(e);
        double b2 = Double.parseDouble(f);
        double det1 = a11*a22-a12*a21;
        double det2 = b1*a22-b2*a12;
        double det3 = a11*b2-a21*b1;
        if ( det1 == 0){
            if (det2 ==0 && det3 ==0){
                JOptionPane.showMessageDialog(null, "Inf root","Answers",
                JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "No root", "Answers",
                JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, "x1 = "+det2/det1+"and x2 = "+det3/det1,"Answers",
                JOptionPane.INFORMATION_MESSAGE);

        }
        
        System.exit(0);
    }
}