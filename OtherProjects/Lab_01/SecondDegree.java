import javax.swing.JOptionPane;
public class SecondDegree {
    public static void main(String[] args){
        String a =JOptionPane.showInputDialog(null, "Enter a", "Sol second Order",
        JOptionPane.INFORMATION_MESSAGE);
        String b = JOptionPane.showInputDialog(null, "Enter b", "Sol second Order",
        JOptionPane.INFORMATION_MESSAGE);
        String c = JOptionPane.showInputDialog(null, "Enter c", "Sol second Order",
        JOptionPane.INFORMATION_MESSAGE);
        double a1 = Double.parseDouble(a);
        double b1 = Double.parseDouble(b);
        double c1 = Double.parseDouble(c);
    if (a1 == 0){
    if (b1 == 0){
        if (c1 == 0){
            JOptionPane.showMessageDialog(null, "Inf root", "Answers"
            , JOptionPane.INFORMATION_MESSAGE);
        }
        else{
            JOptionPane.showMessageDialog(null, "No root", "Answers"
            , JOptionPane.INFORMATION_MESSAGE);
        }
    }
    else {
        JOptionPane.showMessageDialog(null,"A single root is x = "+ c1/b1, "Answers"
        , JOptionPane.INFORMATION_MESSAGE);
    }
    }
    else {
        double delta = b1*b1-4*a1*c1;
        if (delta < 0){
            JOptionPane.showMessageDialog(null, "No root", "Answers", 1);
        }
        else if (delta == 0){
            JOptionPane.showMessageDialog(null, "Double root is x ="+ -b1/(2*a1),"Answers", 1);
        }
        else {
            JOptionPane.showMessageDialog(null, "x1 = "+(-b1+Math.sqrt(delta))/(2*a1)+",x2 = "+(-b1-Math.sqrt(delta))/(2*a1), "Answers", 1);
        }
        }
    System.exit(0);
    }
}
