package com.ofss.domain;

public class Canon340 implements PrinterDriver, WifiPlugin {

	@Override
	public void print() {
		System.out.println("Canon340 is printing");
	}

	@Override
	public void wifiPrint() {
		System.out.println("Canon340 is priting with WIFI");
	}

}
