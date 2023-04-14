import javax.swing.JOptionPane;
public class First_degree_equation{
    public static void main(String[] args){
        String a,b;
        String notify ="You have just entered: ";
        a = JOptionPane.showInputDialog(null,"Please input a: ", "Input a",JOptionPane.INFORMATION_MESSAGE);
    notify += a + " and ";
        b = JOptionPane.showInputDialog(null,"Please input b: ", "Input b",JOptionPane.INFORMATION_MESSAGE);
    notify += b;
        double Num1 = Double.parseDouble(a);
        double Num2 = Double.parseDouble(b);
        if (Num1 == 0){
            if (Num2 == 0){
                JOptionPane.showMessageDialog(null, "Inf root", "Answers", JOptionPane.INFORMATION_MESSAGE);
            }
            else{
                JOptionPane.showMessageDialog(null, "No root", "Answers", JOptionPane.INFORMATION_MESSAGE);
            }
        }
        else {
            JOptionPane.showMessageDialog(null, Num2/Num1, "Answers", JOptionPane.INFORMATION_MESSAGE);
        }
        
        System.exit(0);
    }
}