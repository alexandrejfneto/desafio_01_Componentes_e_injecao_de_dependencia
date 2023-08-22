package com.alejfneto.desafio_01.entities;

public class Order {
	private Integer code;
	private Double basic;
	private Double discount;
	
	public Order () {
	}

	public Order(Integer code, Double basic, Double discount) {
		this.code = code;
		this.basic = basic;
		this.discount = discount;
	}

	public Double getBasic() {
		return basic;
	}

	public void setBasic(Double basic) {
		this.basic = basic;
	}

	public Double getDiscount() {
		return discount;
	}

	public void setDiscount(Double discount) {
		this.discount = discount;
	}

	public Integer getCode() {
		return code;
	}

	@Override
	public String toString() {
		return "Pedido código "+ code +" Valor Total: R$ ";
	}
	
}
