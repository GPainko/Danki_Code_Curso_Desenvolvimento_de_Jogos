package programa_leitura;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main(String[] args) {
		Scanner in = new Scanner(System.in);
		String nome;
		Random rand = new Random();
		System.out.print("Seja Bem-vindo ao jogo:insira seu nome:");
		nome = in.nextLine();
		System.out.print("Seja Bem-vindo " + nome);
		System.out.print("Você deseja ir para qual lado?(w,a,s,d)");
		String comando = in.nextLine();
		if(comando.equals("w")) {
			System.out.println("Você está indo para frente");
			System.out.println("Vc encontrou uma inimigo,oq deseja fazer(a = atacar,c=correr)");
			comando = in.nextLine();
			if(rand.nextInt(100) < 75) {
				System.out.println("Vc ganhou o jogo");
			}else {
				System.out.println("Vc perdeu o jogo");
			}
		}else if(comando.equals("a")){
			System.out.println("Você está indo para esquerda");
			System.out.println("Vc encontrou uma inimigo,oq deseja fazer(a = atacar,c=correr)");
			comando = in.nextLine();
			if(rand.nextInt(100) < 45) {
				System.out.println("Vc ganhou o jogo");
			}else {
				System.out.println("Vc perdeu o jogo");
			}
		}else if(comando.equals("s")){
			System.out.println("Você está indo para tras");
			System.out.println("Vc encontrou uma inimigo,oq deseja fazer(a = atacar,c=correr)");
			comando = in.nextLine();
			if(rand.nextInt(100) < 50) {
				System.out.println("Vc ganhou o jogo");
			}else {
				System.out.println("Vc perdeu o jogo");
			}
			
		}else if(comando.equals("d")){
			System.out.println("Você está indo para direita");
			System.out.println("Vc encontrou uma inimigo,oq deseja fazer(a = atacar,c=correr)");
			comando = in.nextLine();
			if(rand.nextInt(100) < 95) {
				System.out.println("Vc ganhou o jogo");
			}else {
				System.out.println("Vc perdeu o jogo");
			}
		}else {
			System.out.println("o jogo acabou");
		}
	}
}
