package entidades;

public class Pedido_Item {
	private Integer quantidade;
	
	private Produto produto;
	
	
	public Pedido_Item(Integer quantidade, Produto produto) {
		this.quantidade = quantidade;
		this.produto = produto;
	}
	
	
	


	public Integer getQuantidade() {
		return quantidade;
	}





	public void setQuantidade(Integer quantidade) {
		this.quantidade = quantidade;
	}





	public double subTotal() {
		return  this.quantidade * produto.getPreco();
	}
	
	
	public String toString() {
		return produto.getNome()
				+ ", $" 
				+ String.format("%.2f", produto.getPreco()) 
				+ ", Quantidade: " 
				+ quantidade + 
				", Subtotal: $" 
				+ String.format("%.2f", subTotal());
	}
	

}
