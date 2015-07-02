package de.gb.coderetreat;

public class PatternMatcher
{

	public static boolean isAliveInNextRound(String pattern)
	{
		if(matchesOrMatchesReverse(pattern, "xx0|0x0|000")) return true;
		if(matchesOrMatchesReverse(pattern, "x0x|0x0|000")) return true;
		if(matchesOrMatchesReverse(pattern, "x00|xx0|000")) return true;
		if(matchesOrMatchesReverse(pattern, "xx0|000|0x0")) return true;
		if(matchesOrMatchesReverse(pattern, "xx0|00x|000")) return true;
		if(matchesOrMatchesReverse(pattern, "x00|x0x|000")) return true;

		return false;
	}
	
	
	private static boolean matchesOrMatchesReverse(String input, String pattern){
		if(input.equals(pattern)) return true;
		if(input.equals(reverseString(pattern))) return true;
		return false;
	}

	
	private static String reverseString(String string)
	{
		String reversed = "";
		for (Character iterable_element : string.toCharArray())
		{
			reversed = iterable_element + reversed;
		}
		return reversed;
	}

}
