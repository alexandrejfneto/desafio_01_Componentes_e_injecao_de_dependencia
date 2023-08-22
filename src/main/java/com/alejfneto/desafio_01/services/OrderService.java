package com.alejfneto.desafio_01.services;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.alejfneto.desafio_01.entities.Order;

@Service
public class OrderService {
	
	@Autowired
	ShippingService shippingService;
	
	public Double total (Order order) {
		return order.getBasic() 
				-(order.getBasic()* order.getDiscount())
				+shippingService.shipment(order);
	}

}
