package practice.java.introduction;

import java.text.NumberFormat;
import java.util.Locale;
import java.util.Scanner;

/**
 * @title Java Currency Formatter
 *
 * @date 21 sie 2020
 *
 * @author Lukasz Janus
 *
 */
public class JavaCurrencyFormatter {

	public static void main(String[] args) {

		Scanner scanner = new Scanner(System.in);
		double payment = scanner.nextDouble();
		scanner.close();

		double money = payment;

		Locale locale = new Locale("en", "US");
		NumberFormat formatter = NumberFormat.getCurrencyInstance(locale);
		String moneyString = formatter.format(money);
		System.out.println("US: " + moneyString);

		locale = new Locale("en", "IN");
		formatter = NumberFormat.getCurrencyInstance(locale);
		moneyString = formatter.format(money);
		System.out.println("India: " + moneyString);

		locale = new Locale("en", "CN");
		formatter = NumberFormat.getCurrencyInstance(locale);
		moneyString = formatter.format(money);

		NumberFormat china = NumberFormat.getCurrencyInstance(Locale.CHINA);
		// System.out.println(china.getCurrency());
		System.out.println("China: " + china.format(payment));

		locale = new Locale("fr", "FR");
		formatter = NumberFormat.getCurrencyInstance(locale);
		moneyString = formatter.format(money);
		System.out.println("France: " + moneyString);
	}
}