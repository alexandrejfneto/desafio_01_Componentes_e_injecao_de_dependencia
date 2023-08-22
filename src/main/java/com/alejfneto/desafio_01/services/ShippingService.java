package com.alejfneto.desafio_01.services;

import org.springframework.stereotype.Service;

import com.alejfneto.desafio_01.entities.Order;

@Service
public class ShippingService {
	
	public static Double shipment(Order order) {
		if (order.getBasic()<100) {
			return 20.0;
		}else
			if (order.getBasic()>=100.0 && order.getBasic()<200.0) {
				return 12.0;
			}
			else {
				return 0.0;
			}
	}
	
}
