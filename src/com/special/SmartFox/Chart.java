package com.special.SmartFox;

import android.app.Activity;
import android.graphics.Color;
import android.os.Bundle;

public class Chart extends Activity {
	public void onCreate(Bundle savedInstanceState) {
		super.onCreate(savedInstanceState);
		setContentView(R.layout.chart);
		
		String[] labels = new String[] {"Kit Kat", "Jelly Bean", "Ice Cream Sandwich", "Honeycomb", "Gingerbread", "Older"};
		double[] values = {7.8, 33, 25, 17, 11, 6.2};
		int[] colors = {Color.RED, Color.BLUE, Color.GREEN, Color.MAGENTA, Color.YELLOW, Color.GRAY};
		

}
}