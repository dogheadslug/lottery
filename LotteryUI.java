import java.awt.Container;
import java.awt.GridLayout;
import javax.swing.*;

class LotteryUI {
public static void main(String[] args) {
   JFrame frame = new JFrame("Have a try");
   Container pane = frame.getContentPane();
   
   //create components
   JTextField result = new JTextField(20);
   JButton go = new JButton("GO");
   
   //layout add components
   pane.setLayout(new GridLayout(1, 3));
   
   //add all the components
   pane.add(go);
   //pane.add(new JLabel("Result:"));
   pane.add(result);
   
   //listener
   lottery listener = new lottery(result);
   go.addActionListener(listener);
   frame.pack();
   frame.setVisible(true);
   }
}
