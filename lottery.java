import java.util.Random;
import javax.swing.JTextField;
import java.util.*;
import java.awt.event.*;


public class lottery implements ActionListener {
	lottery(JTextField result){
		outputtmp=result;
	}
	private JTextField outputtmp;

	public void actionPerformed(ActionEvent e) {

        int max=69;
        int min=1;
        int tmp=0;
        String output;
        
        Random random = new Random();
        int s = random.nextInt(max)%(max-min+1) + min;
        int max2 = 26;
        
        int sp = random.nextInt(max2)%(max2-min+1) + min;
        output = "special number is "+sp+" - ";
        //System.out.println("special number is "+sp);
        int[] out = new int[6];

        for(int i=0;i<5;i++){
        		
        	while(out[0]==s||out[1]==s||out[2]==s||out[3]==s||out[4]==s)//find if there's any repeat
        		s = random.nextInt(max)%(max-min+1) + min;
        	    out[i]=s;
        	    output = output+out[i]+" ";
        }
        outputtmp.setText(output);
    }
}
