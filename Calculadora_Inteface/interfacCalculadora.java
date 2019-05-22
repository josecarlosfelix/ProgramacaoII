package Calculadora_Inteface;

import java.awt.Dimension;
	import java.awt.FlowLayout;
	import java.awt.event.ActionEvent;
	import java.awt.event.ActionListener;
	
	import javax.swing.JButton;
	import javax.swing.JFrame;
	import javax.swing.JOptionPane;
	import javax.swing.JTextField;
	
	public class interfacCalculadora extends JFrame {
	
		//Criando os Botões da calculadora 
		
		private JButton botao1;
		private JButton botao2;
		private JButton botao3;
		private JButton botao4;
		private JButton botao5;
		private JButton botao6;
		private JButton botao7;
		private JButton botao8;
		private JButton botao9;
		private JButton botao0;
		private JButton botaoMais;
		private JButton botaoMenos;
		private JButton botaoVezes;
		private JButton botaoDividi;
		private JTextField campoDeTexto;
		private JButton botaoIgual;
		private JButton botaoDel;
		private JButton botaoApagar;
	
		public interfacCalculadora() {
			super("CALCULADORA");
			setLayout(new FlowLayout());
			setDefaultCloseOperation(EXIT_ON_CLOSE);
	
			campoDeTexto = new JTextField();
			campoDeTexto.setPreferredSize(new Dimension(135, 30));
			this.add(campoDeTexto);
	
			BotaoHandler handler = new BotaoHandler();
	
			botao1 = new JButton("1");
			botao1.addActionListener(handler);
			add(botao1);
	
			botao2 = new JButton("2");
			botao2.addActionListener(handler);
			add(botao2);
	
			botao3 = new JButton("3");
			botao3.addActionListener(handler);
			add(botao3);
	
			botao4 = new JButton("4");
			botao4.addActionListener(handler);
			add(botao4);
	
			botao5 = new JButton("5");
			botao5.addActionListener(handler);
			add(botao5);
	
			botao6 = new JButton("6");
			botao6.addActionListener(handler);
			add(botao6);
	
			botao7 = new JButton("7");
			botao7.addActionListener(handler);
			add(botao7);
	
			botao8 = new JButton("8");
			botao8.addActionListener(handler);
			add(botao8);
	
			botao9 = new JButton("9");
			botao9.addActionListener(handler);
			add(botao9);
	
			botao0 = new JButton("0");
			botao0.addActionListener(handler);
			add(botao0);
	
			botaoMais = new JButton("+");
			botaoMais.addActionListener(handler);
			add(botaoMais);
	
			botaoMenos = new JButton("-");
			botaoMenos.addActionListener(handler);
			add(botaoMenos);
	
			botaoVezes = new JButton("*");
			botaoVezes.addActionListener(handler);
			add(botaoVezes);
	
			botaoDividi = new JButton("/");
			botaoDividi.addActionListener(handler);
			add(botaoDividi);
	
			botaoIgual = new JButton("=");
			botaoIgual.addActionListener(handler);
			add(botaoIgual);
			
			botaoDel = new JButton ("Limpar");
			botaoDel.addActionListener(handler);
			add(botaoDel);
	
			botaoApagar = new JButton ("Apagar");
			botaoApagar.addActionListener(handler);
			add(botaoApagar);
			
		}
	
		private class BotaoHandler implements ActionListener {
	
			private int op1;
			private int op2;
			private int operacao;
			private boolean limpar;
			private int resul;
	
			private final int SOMA = 1;
			private final int SUBTRACAO = 2;
			private final int MULTIPLICACAO = 3;
			private final int DIVISAO = 4;
	
			public void actionPerformed(ActionEvent event) {
				String textoVisor = campoDeTexto.getText();
				
				if (event.getSource() == botao1) {
					if (limpar) {
						textoVisor = "";
						limpar = false;
					}campoDeTexto.setText(textoVisor + "1");
					
				} else if (event.getSource() == botao2) {
					if(limpar){
						textoVisor = "";
						limpar = false;
				}campoDeTexto.setText(textoVisor + "2");
					
					
				} else if (event.getSource() == botao3) {
					if(limpar){
						textoVisor = "";
						limpar = false;
				}campoDeTexto.setText(textoVisor + "3");
				
				
				} else if (event.getSource() == botao4) {
					if(limpar){
						textoVisor = "";
						limpar = false;
				}campoDeTexto.setText(textoVisor + "4");
				
				
				} else if (event.getSource() == botao5) {
					if(limpar){
						textoVisor = "";
						limpar = false;
				}campoDeTexto.setText(textoVisor + "5");
				
				
				} else if (event.getSource() == botao6) {
					if(limpar){
						textoVisor = "";
						limpar = false;
				}campoDeTexto.setText(textoVisor + "6");
				
				
				} else if (event.getSource() == botao7) {
					if(limpar){
						textoVisor = "";
						limpar = false;
				}campoDeTexto.setText(textoVisor + "7");
				
				
				} else if (event.getSource() == botao8) {
					if(limpar){
						textoVisor = "";
						limpar = false;
				}campoDeTexto.setText(textoVisor + "8");
				
				
				} else if (event.getSource() == botao9) {
					if(limpar){
						textoVisor = "";
						limpar = false;
				}campoDeTexto.setText(textoVisor + "9");
				
				
				} else if (event.getSource() == botao0) {
					if(limpar){
						textoVisor = "";
						limpar = false;
				}campoDeTexto.setText(textoVisor + "0");
				
				
				} else if (event.getSource() == botaoMais) {
					op1 = Integer.parseInt(textoVisor);
					operacao = SOMA;
					limpar = true;
					
				} else if (event.getSource() == botaoIgual) {
					op2 = Integer.parseInt(textoVisor);
					
					if (operacao == SOMA) {
						resul = op1 + op2;
					}
					if ( operacao == SUBTRACAO) {
						resul = op1 - op2;
					}
					if (operacao == MULTIPLICACAO) {
						resul = op1 * op2;
					}
					if ( operacao == DIVISAO) {
						resul = op1 / op2;
					}
					campoDeTexto.setText(String.valueOf(resul));
					//campoTexto.setText(String + ""); Assim também funciona
				}   else if (event.getSource() == botaoMenos) {
					op1 = Integer.parseInt(textoVisor);
					operacao = SUBTRACAO;
					limpar = true;
					
				}    else if (event.getSource() == botaoVezes) {
					op1 = Integer.parseInt(textoVisor);
					operacao = MULTIPLICACAO;
					limpar = true;
					
				}   else if (event.getSource() == botaoDividi) {
					op1 = Integer.parseInt(textoVisor);
					operacao = DIVISAO;
					limpar = true;
					
				}	else if (event.getSource() == botaoDel) { //limpar
					campoDeTexto.setText(String.valueOf(resul = 0));
					limpar = true;
					
				}   else if (event.getSource() == botaoApagar) { //apagar
					if(!textoVisor.isEmpty()) {
					String novo = textoVisor.substring(0, textoVisor.length() - 1);
					campoDeTexto.setText(novo);
					}

				}
				
				
			}
		}
	}