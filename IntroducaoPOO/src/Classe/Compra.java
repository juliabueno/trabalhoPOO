package Classe;

public class Compra implements InterfacePrincipal{


	public String cliente;
	
	private Double saldo;
	
	private Double pagamento;
	
	public Compra(String cliente, Double saldo, Double pagamento) {
		super();
		this.setCliente("Cliente não selecionado");
		this.setPagamento(0.0);
		this.setSaldo(0.0);
	}

	private String getCliente() {
		return cliente;
	}

	private void setCliente(String cliente) {
		String name = cliente;
		this.cliente = name;
	}

	private Double getSaldo() {
		return saldo;
	}

	private void setSaldo(Double saldo) {
		this.saldo = saldo;
	}

	private Double getPagamento() {
		return pagamento;
	}

	private void setPagamento(Double pagamento) {
		this.pagamento = pagamento;
	}

	@Override
	public void comprarProduto() {
		System.out.println ("Produtos: Arroz 10.00, Bolacha 5.00, Suco 8.00");
		
	}

	@Override
	public void pagarProduto() {

		
	}

	@Override
	public void saldoFinal() {
	
		
	}
	
	

}
