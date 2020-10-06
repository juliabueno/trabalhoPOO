package Classe;

public class Venda implements InterfaceVenda {


	private String caixa;
	
	private Double troco;
	
	private Double valorTotal;

	public Venda(String caixa, Double troco, Double valorTotal) {
		super();
		this.setCaixa("o caixa não foi selecionado");
		this.setTroco(0.0);
		this.setValorTotal(0.0);
	}

	private String getCaixa() {
		return caixa;
	}

	private void setCaixa(String caixa) {
		this.caixa = caixa;
	}

	private Double getTroco() {
		return troco;
	}

	private void setTroco(Double troco) {
		this.troco = troco;
	}

	private Double getValorTotal() {
		return valorTotal;
	}

	private void setValorTotal(Double valorTotal) {
		this.valorTotal = valorTotal;
	}

	@Override
	public void venderProduto() {

		
	}

	@Override
	public void receberPagamento() {
	
		
	}

	@Override
	public void saldoFinalVenda() {

		
	}
	
	
	
}
