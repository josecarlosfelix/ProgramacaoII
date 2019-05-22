package Calculadora_Inteface;

import javax.swing.JFrame;

public class claculadoraTeste {
	
	public static void main(String[] args){ 

		 interfacCalculadora inter = new interfacCalculadora(); 
		 inter.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		 inter.setSize(160, 290); 
		 inter.setResizable(false);
	     inter.setVisible(true); 
}

	

	
}