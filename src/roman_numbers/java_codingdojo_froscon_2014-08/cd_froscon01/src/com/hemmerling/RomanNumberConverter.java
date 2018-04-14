package com.hemmerling;

import java.util.ArrayList;
import java.util.List;

public class RomanNumberConverter {
	
	private class Mapping {
		public Mapping(int value, String label) {
			this.value = value;
			this.label = label;
		}
		public int value;
		public String label;
	}

	private static List<Mapping> mappings = new ArrayList<>();
	{
		mappings.add(new Mapping(1000, "M"));
		mappings.add(new Mapping(900, "CM"));
		mappings.add(new Mapping(500, "D"));
		mappings.add(new Mapping(100, "C"));
		mappings.add(new Mapping(90, "XC"));
		mappings.add(new Mapping(50, "L"));
		mappings.add(new Mapping(40, "XL"));
		mappings.add(new Mapping(10, "X"));
		mappings.add(new Mapping(9, "IX"));
		mappings.add(new Mapping(5, "V"));
		mappings.add(new Mapping(4, "IV"));
		mappings.add(new Mapping(1, "I"));
	}
	
	public String convertArabicToRoman(int arabicNumber) {
		final StringBuffer romanNumber = new StringBuffer();
		int remainder = arabicNumber;
		for(Mapping mapping : mappings){
			if(remainder == 0){
				return romanNumber.toString();
			}
			while(remainder >= mapping.value){
				remainder -= mapping.value;
				romanNumber.append(mapping.label);
			}		
		}
		return romanNumber.toString();  
	}

}
