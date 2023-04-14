import javax.swing.JOptionPane;
public class ShowTwoNumbers{
    public static void main(String[] args){
        String Number1,Number2;
        String notify ="You have just entered: ";
        Number1 = JOptionPane.showInputDialog(null,"Please input the first number: ", "Input the first number",JOptionPane.INFORMATION_MESSAGE);
    notify += Number1 + " and ";
        Number2 = JOptionPane.showInputDialog(null,"Please input the second number: ", "Input the second number",JOptionPane.INFORMATION_MESSAGE);
    notify += Number2;
        double Num1 = Double.parseDouble(Number1);
        double Num2 = Double.parseDouble(Number2);
        JOptionPane.showMessageDialog(null,notify,"Show Two Numbers",JOptionPane.INFORMATION_MESSAGE);
        System.exit(0);
    }
}