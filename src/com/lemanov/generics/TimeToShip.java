package com.lemanov.generics;

public class TimeToShip {

	public static void main(String[] args) {
		Box<Nokia> boxNokia = new Box<>();
		Box<Blackberry> boxBlackberry = new Box<>();
		
		//Create a shipment of Nokia phones
		ShippingOrder<String, Box<Nokia>> sho1 = new ShippingOrder<>("phone1", boxNokia);
		
		//Create a shipment of Blackberry phones
		ShippingOrder<String, Box<Blackberry>> sho2 = new ShippingOrder<>("phone1", boxBlackberry);

	}

}
