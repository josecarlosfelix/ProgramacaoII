package automatos;

import javax.swing.JOptionPane;

public class Exemplos {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite a palavra do automatos: ");
		nome+="?"; 
		String start = "q0";
		for (int i=0; i <nome.length(); i++){
			start = jesus(start, nome.charAt(i));
			if(start.equals("Não foi reconhecido")){
				break; 
			}
			
		}
		
		JOptionPane.showConfirmDialog(null, start);
		
	}
	
	public static String jesus(String es, char a){
		
		if(es.equals("q0")&& a== 'a'){
			return "q3";
		}
		return es;
		
		
	}

}
