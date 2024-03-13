import javax.swing.*;
import java.awt.*;
import java.awt.event.ActionEvent;
import java.awt.event.ActionListener;

public class CALCULATOR
{	
  static JTextField displayArea=new JTextField();
  
   static int operandA=0;
   static int operandB=0;
   static char operator=' ';
   static boolean isOperatorEntered=false;
   
	static int result=0;
	
  public static void main(String[] args)
	{
	  //Frame banako
	JFrame frame=new JFrame("Calculator");
	frame.setVisible(true);
	frame.setSize(400,550);
	frame.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
	 
	//textfield banako
	frame.add(displayArea,BorderLayout.NORTH);
	displayArea.setHorizontalAlignment(displayArea.RIGHT);
	displayArea.setPreferredSize(new Dimension(0,60));   //width=0, height=60
	
	//buttons banako
	JButton b9=new JButton("9");
	JButton b8=new JButton("8");
	JButton b7=new JButton("7");
	JButton b6=new JButton("6");
	JButton b5=new JButton("5");
	JButton b4=new JButton("4");
	JButton b3=new JButton("3");
	JButton b2=new JButton("2");
	JButton b1=new JButton("1");
	JButton b0=new JButton("0");
	JButton bplus=new JButton("+");
	JButton bminus=new JButton("-");
	JButton bmultiply=new JButton("*");
	JButton bdivide=new JButton("/");
	JButton bequal=new JButton("=");
	JButton bclear=new JButton("C");
	 
	//panel vaneko div banaye jhai
	JPanel bpanel=new JPanel(new GridLayout(4,4));
	
	//bpanel add gareko hamro frame ma
	frame.add(bpanel,BorderLayout.CENTER);
	bpanel.add(b9);
	bpanel.add(b8);
	bpanel.add(b7);
	bpanel.add(bclear);
	bpanel.add(b6);
	bpanel.add(b5);
	bpanel.add(b4);
	bpanel.add(bplus);
	bpanel.add(b3);
	bpanel.add(b2);
	bpanel.add(b1);
	bpanel.add(bminus);
	bpanel.add(bminus);
	bpanel.add(bdivide);
	bpanel.add(b0);
	bpanel.add(bmultiply);
	bpanel.add(bequal);
	
	ActionListener act=new ActionListener() {
		@Override
		public void actionPerformed(ActionEvent e)
		{
			switch(e.getActionCommand())
			{
			case "1":
				displayArea.setText(displayArea.getText()+1);  //1 lai overlap navaus vanera
				
				if(isOperatorEntered)
					operandB=operandB*10+1;
				else
					operandA=operandA*10+1;
				break;
				
			case "2":
				displayArea.setText(displayArea.getText()+2);  
				
				if(isOperatorEntered)
					operandB=operandB*10+2;
				else
					operandA=operandA*10+2;
				break;
				
			case "3":
				displayArea.setText(displayArea.getText()+3);  
				
				if(isOperatorEntered)
					operandB=operandB*10+3;
				else
					operandA=operandA*10+3;
				break;
				
			case "4":
				displayArea.setText(displayArea.getText()+4);  
				
				if(isOperatorEntered)
					operandB=operandB*10+4;
				else
					operandA=operandA*10+4;
				break;
				
			case "5":
				displayArea.setText(displayArea.getText()+5);  
				
				if(isOperatorEntered)
					operandB=operandB*10+5;
				else
					operandA=operandA*10+5;
				break;
				
			case "6":
				displayArea.setText(displayArea.getText()+6);  
				
				if(isOperatorEntered)
					operandB=operandB*10+6;
				else
					operandA=operandA*10+6;
				break;
				
			case "7":
				displayArea.setText(displayArea.getText()+7);  
				
				if(isOperatorEntered)
					operandB=operandB*10+7;
				else
					operandA=operandA*10+7;
				break;
				
			case "8":
				displayArea.setText(displayArea.getText()+8);  
				if(isOperatorEntered)
					operandB=operandB*10+8;
				else
					operandA=operandA*10+8;
				break;
				
			case "9":
				displayArea.setText(displayArea.getText()+9);  
				if(isOperatorEntered)
					operandB=operandB*10+9;
				else
					operandA=operandA*10+9;
				break;
				
			case "0":
				displayArea.setText(displayArea.getText()+0);  
				
				if(isOperatorEntered)
					operandB=operandB*10+0;
				else
					operandA=operandA*10+0;
				break;
				
			case "C":
				isOperatorEntered=false;
				operandA=0;
				operandB=0;
				result=0;
				displayArea.setText(null);
				break;
				
			case "+":
				if(isOperatorEntered==false)
				{
					isOperatorEntered=true;
					operator='+';
					displayArea.setText(displayArea.getText()+ "+"); 
					break;
					
				}
				
			
			case "-":
				if(isOperatorEntered==false)
				{
					isOperatorEntered=true;
					operator='-';
					displayArea.setText(displayArea.getText()+ "-"); 
					break;
					
				}
				
			case "*":
				if(isOperatorEntered==false)
				{
					isOperatorEntered=true;
					operator='*';
					displayArea.setText(displayArea.getText()+ "*"); 
					break;
					
				}
			case "/":
				if(isOperatorEntered==false)
				{
					isOperatorEntered=true;
					operator='/';
					displayArea.setText(displayArea.getText()+ "/"); 
					break;
					
				}
				
				
			case "=":
				if(isOperatorEntered==false) return;
				switch(operator)
				{
				case '+':
				{
					result=operandA+operandB;
					displayArea.setText(String.valueOf(result));
					break;
				}
				case '-':
				{
					result=operandA-operandB;
					displayArea.setText(String.valueOf(result));
					break;
				}
				case '*':
				{
					result=operandA*operandB;
					displayArea.setText(String.valueOf(result));
					break;
				}
				case '/':
				{
					result=operandA/operandB;
					displayArea.setText(String.valueOf(result));
					break;
				}
				}
				isOperatorEntered=false;
				operandA=result;
				operandB=0;
				
			}
			
		

}
};

   //adding actionlistener to the button
  b1.addActionListener(act);
  b2.addActionListener(act);
  b3.addActionListener(act);
  b4.addActionListener(act);
  b5.addActionListener(act);
  b6.addActionListener(act);
  b7.addActionListener(act);
  b8.addActionListener(act);
  b9.addActionListener(act);
  b0.addActionListener(act);
  bplus.addActionListener(act);
  bminus.addActionListener(act);
  bmultiply.addActionListener(act);
  bdivide.addActionListener(act);
  bequal.addActionListener(act);
  bclear.addActionListener(act);
	}
}
