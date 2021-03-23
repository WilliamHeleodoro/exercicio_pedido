package aplicacao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Scanner;

import entidades.Clientes;
import entidades.Pedido;
import entidades.Pedido_Item;
import entidades.Produto;
import entidades.enums.OrderStatus;

public class Programa {

	public static void main(String[] args) throws ParseException {
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		

		System.out.println("Entre com os dados do cliente: ");
		System.out.print("Nome: ");
		String nome = sc.nextLine();
		System.out.print("Email: ");
		String email = sc.nextLine();
		System.out.print("Data de Nascimento: ");
		Date dtnascimento = sdf.parse(sc.nextLine());

		System.out.println("\nInformações do pedido: ");	
		System.out.print("Status do pedido: ");
		String status = sc.nextLine();

		Pedido pedido = new Pedido(new Date(), OrderStatus.valueOf(status), new Clientes(nome, email, dtnascimento));

		System.out.print("\nQuantos itens deseja inserir: ");
		int n = sc.nextInt();
		sc.nextLine();
		for (int i = 1; i <= n; i++) {
			System.out.println("\nEntre com os dados do produto " + i + ": ");
			System.out.print("Nome do produto: ");
			String nomeproduto = sc.nextLine();
			System.out.print("Preço: ");
			double preco = sc.nextDouble();
			System.out.print("Quantidade: ");
			int quantidade = sc.nextInt();
			sc.nextLine();
			
			pedido.adicionaItem(new Pedido_Item(quantidade, new Produto(nomeproduto, preco)));
		

		}
		
		System.out.println("\n\n" + pedido.toString());


	}

}
