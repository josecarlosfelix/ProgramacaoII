package automatos;

import javax.swing.JOptionPane;

public class xena {
	public static void main(String[] args) {
		
		String nome = JOptionPane.showInputDialog("Digite a palavra do automato: ");
		nome+= "?";
		String start = "q0";
		for (int i = 0; i < nome.length(); i++) {
			start = jesus(start, nome.charAt(i));
			if(start.equals("Não foi reconhecido o automato")){
				break;
			}
		}
	
		JOptionPane.showMessageDialog(null, start);
	}
		
	

	public static String jesus(String es, char a){
		
		if(es.equals("q0")&& a=='a'){
			return"q3";
			
		}
		
		if(es.equals("q0")&& a=='b'){
			return"q1";
			
		}
		
		if(es.equals("q0")&& a=='c'){
			return"q2";
			
		}
		
		if(es.equals("q1")&& a=='a'){
			return"q5";
			
		}
		
		if(es.equals("q1")&& a=='b'){
			return"q4";
			
		}
		
		if(es.equals("q1")&& a=='c'){
			return"q1";
			
		}
		
		if(es.equals("q2")&& a=='a'){
			return"q5";
			
		}
		
		if(es.equals("q2")&& a=='b'){
			return"q6";
			
		}
		
		if(es.equals("q2")&& a=='c'){
			return"q2";
			
		}
		
		if(es.equals("q3")&& a=='a'){
			return"q5";
			
		}
		
		if(es.equals("q3")&& a=='b'){
			return"q6";
			
		}
		
		if(es.equals("q3")&& a=='c'){
			return"q7";
			
		}
		
		if(es.equals("q4")&& a=='a'){
			return"q9";
			
		}
		
		if(es.equals("q4")&& a=='b'){
			return"q8";
			
		}
		
		if(es.equals("q4")&& a=='c'){
			return"q2";
			
		}
		
		if(es.equals("q5")&& a=='a'){
			return"q5";
			
		}
		
		if(es.equals("q5")&& a=='b'){
			return"q6";
			
		}
		
		if(es.equals("q5")&& a=='c'){
			return"q2";
			
		}
		
		if(es.equals("q6")&& a=='a'){
			return"q5";
			
		}
		
		if(es.equals("q6")&& a=='b'){
			return"q5";
			
		}
		
		if(es.equals("q6")&& a=='c'){
			return"q2";
			
		}
		
		if(es.equals("q7")&& a=='a'){
			return"q5";
			
		}
		
		if(es.equals("q7")&& a=='b'){
			return"q6";
			
		}
		
		if(es.equals("q7")&& a=='c'){
			return"q7";
			
		}
		
		if(es.equals("q8")&& a=='a'){
			return"q9";
			
		}
		
		if(es.equals("q8")&& a=='b'){
			return"q8";
			
		}
		
		if(es.equals("q8")&& a=='c'){
			return"q2";
			
		}
		
		if(es.equals("q9")&& a=='a'){
			return"q5";
			
		}
		
		if(es.equals("q9")&& a=='b'){
			return"q6";
			
		}
		
		if(es.equals("q9")&& a=='c'){
			return"q2";
			
			
		}
		
		// Estados Finais do automato
		
		if(es.equals("q1")&& a=='?'){
			return"Reconhecido";
			
		}
		
		if(es.equals("q5")&& a=='?'){
			return"Reconhecido";
			
		}
		
		if(es.equals("q9")&& a=='?'){
			return"Reconhecido";
			
		}
		
		if(es.equals("q4")&& a=='?'){
			return"Reconhecido";
			
		}
		
		if(es.equals("q3")&& a=='?'){
			return"Reconhecido";
			
		}
		
		if(es.equals("q7")&& a=='?'){
			return"Reconhecido";
			
		}
		
		if(es.equals("q6")&& a=='?'){
			return"Reconhecido";
			
		}
		
		if(es.equals("q8")&& a=='?'){
			return"Reconhecido";
			
		}
		
		
		return"Não foi reconhecido o automato";
	}
}
