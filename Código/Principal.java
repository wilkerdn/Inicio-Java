import java.util.Scanner;

import javax.swing.JOptionPane;

public class Principal {

	public static void main(String[] args) {
	/*
		int i = 3;
		float f = 4;
		double d = 6.7;
		char c = 'w';
		boolean b = true;
		String s = "Olá, mundo!";
		
		//saída de dados
		System.out.println(s);
		
		System.out.println("--------------------");
		//entrada de dados
		Scanner leitor = new Scanner(System.in);
		System.out.print("Digite um valor inteiro: ");
		i = leitor.nextInt();
		
		//estrutura de repetição
		System.out.println("--------------------");
		for(int j=0;j<10;j++) {
			System.out.println(j);
		}
		
		System.out.println("--------------------");
		do{
			
			System.out.println(i);
			i++;
		}while(i<9);
		
		System.out.println("--------------------");
		
		while(f<10) {
			System.out.println(f);
			f+=2;
		}
		
		//estrutura de condição
		System.out.println("--------------------");
		if(d<0){
			System.out.println("Negativo");
		}else if(d>0){
			System.out.println("Positivo");
		}else {
			System.out.println("Zero");
		}
		
		System.out.println("--------------------");
		
		switch(c) {
		case 'a':
			System.out.println("Caracter A");
			break;
		default:
			System.out.println("Valor padrão");
			break;
		}
		*/
		
		JOptionPane.showMessageDialog(null,"Olá, mundo!","Minha primeira caixinha",JOptionPane.ERROR_MESSAGE);
		String valor = JOptionPane.showInputDialog("Digite um valor inteiro: ");
		int valorConvertido = Integer.parseInt(valor);
		
		float valorf = Float.parseFloat(JOptionPane.showInputDialog("Digite um valor"));
		
		JOptionPane.showMessageDialog(null,"O valor da some é: "+(valorConvertido+valorf)+"\n OK!");
	}

}
