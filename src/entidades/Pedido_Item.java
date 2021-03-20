package entidades;

public class Pedido_Item {
	private Integer quantidade;
	
	private Produto preco;
	
	public Pedido_Item(Integer quantidade, Produto preco) {
		this.quantidade = quantidade;
		this.preco = preco;
	}

	public Integer getQuantidade() {
		return quantidade;
	}

	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}

	public Produto getPreco() {
		return preco;
	}

	public void setPreco(Produto preco) {
		this.preco = preco;
	}
	
	
	public double subTotal() {
		return  this.quantidade * preco.getPreco();
	}
	

}
