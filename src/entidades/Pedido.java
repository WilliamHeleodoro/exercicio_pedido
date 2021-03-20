package entidades;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import entidades.enums.OrderStatus;

public class Pedido {
	private Date dtpedido;
	private OrderStatus status;
	
	private Clientes cliente;
	
	private List<Pedido_Item> items = new ArrayList<>();
	
	
	public Pedido(Date dtpedido, OrderStatus status, Clientes cliente) {
		this.dtpedido = dtpedido;
		this.status = status;
		this.cliente = cliente;
	}


	public Date getData() {
		return dtpedido;
	}


	public void setData(Date data) {
		this.dtpedido = data;
	}


	public OrderStatus getStatus() {
		return status;
	}


	public void setStatus(OrderStatus status) {
		this.status = status;
	}
	
	
	public void adicionaItem (Pedido_Item item) {
		items.add(item);
	}
	
	public void removeItem (Pedido_Item item) {
		items.remove(item);
	}
	
	public double total() {
		double soma = 0;
		for(Pedido_Item x: items) {
			soma = soma + x.subTotal();
		}
		
		return soma;
	}
	
	
	
	

}
