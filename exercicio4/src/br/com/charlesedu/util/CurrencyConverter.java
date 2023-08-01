package br.com.charlesedu.util;

public class CurrencyConverter {
	public static double convert(double dolarPrice, double dolarValue) {
		return dolarValue * dolarPrice + 0.06 * dolarValue * dolarPrice;
	}
}
