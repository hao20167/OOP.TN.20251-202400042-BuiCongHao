package com.hust.kstn.test;

import com.hust.kstn.models.*;
public class CartTest {
	public static void main(String[] args) {
		Cart cart = new Cart();
		DigitalVideoDisc tgt = new DigitalVideoDisc("TOREM");
		cart.removeDVD(tgt);
		cart.print();
		for (int i = 1; i <= 25; i++) {
			DigitalVideoDisc ith = new DigitalVideoDisc("OHMAGAT222" + Integer.toString(i));
			cart.addDVD(ith);
			cart.print();
			if (i == 15) {
				cart.removeDVD(ith);
				cart.print();
			}
		}
		cart.removeDVD(tgt);
		cart.print();
		
		cart.clearCart();
		DigitalVideoDisc disc1 = new DigitalVideoDisc("DELULU007");
		DigitalVideoDisc disc2 = new DigitalVideoDisc("TRULULU002");
		cart.addDVD(disc1, disc2);
		cart.print();
		
		DigitalVideoDisc []discs = new DigitalVideoDisc[20];
		for (int i = 0; i < 20; i++) {
			discs[i] = new DigitalVideoDisc("TEMPORA_" + Integer.toString(i + 1));
		}
		cart.addDVD(discs);
		cart.print();
	}
}
