package com.gscience.gscienceIT.math.parseNumbers;

import java.text.NumberFormat;
import java.text.ParseException;
import java.util.Locale;

public class NumbersUtility {
	
	/**
	 * Parse the amerikan number notation to double value.
	 * By changing the locale location to US.And back to the previous location.
	 *  
	 * @param numberString
	 * @return
	 * @throws ParseException
	 */
	public static  double parseAmerikanNumberToDouble(String numberString) throws ParseException  {
		
		Locale currentLocale = Locale.getDefault();
		
		Locale.setDefault(Locale.US);

		double  number = 
				NumberFormat.getNumberInstance(Locale.US).
				parse(numberString).doubleValue();
		
		Locale.setDefault(currentLocale);
		
		return number;
	}
	
}
