package works.alga.estudos.jogomegasena;

import java.util.Scanner;

/*A Mega-Sena é o jogo que paga milhões de reais para o acertador dos 
 * números sorteados.Em um jogo comum, os jogadores devem marcar 6 números 
 * entre os 60 disponíveis, sendo de 1 a 60. Na empresa que você trabalha, 
 * o pessoal se juntou para fazer um bolão. Um bolão acontece quando várias
 * pessoas se unem para jogarem várias combinações de números em conjunto. 
 * Se algum jogo for contemplado, o valor do prêmio é dividido entre todos
 * os participantes. Como um bom programador, você sugeriu e se dispôs a 
 * desenvolver um pequeno software para gerar os números a serem marcados 
 * nos jogos. Todos concordaram, agora você tem um importante trabalho pela 
 * frente.Faça um programa em Java que recebe como parâmetro do usuário a 
 * quantidade de jogos a serem feitos, gera e exibe na tela a sequência de 
 * números de cada jogo. e a classe Math para gerar números aleatórios e fazer
 * arredondamentos. Lembre-se de verificar se não existem números repetidos em 
 * uma sequência, pois os 6 números devem ser únicos. Se levar esse desafio a 
 * sério, jogar na Mega-Sena e ganhar, não esqueça de nós! ;)*/

public class JogoSorteio {
	
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		
		System.out.println("digite o nome do jogador: ");
		String jogador = sc.nextLine();
		System.out.println("quantos jogos você quer que sejam gerados? ");
		int quantidade = 6;
		
		
		System.out.println("sorteando jogo de --> " + jogador);
		for (int i = 1; i < quantidade + 1; i++) {
			double bola = Math.random() * 60;
			double bolas[] = new double[7];
			for (double b : bolas) {
				if (b != bola) {
					bolas[i] = bola;
				}
			}
			System.out.println("bola " + i + ": " + Math.ceil(bola));
		}
		
	}

}
