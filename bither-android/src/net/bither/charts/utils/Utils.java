package net.bither.charts.utils;

import java.text.DecimalFormat;

public class Utils {

	private Utils() {

	}

	public static String formatDoubleToString(double num) {
		DecimalFormat formate = new DecimalFormat("0.00");
		return formate.format(num);
	}
}
