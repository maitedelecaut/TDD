package iut.tdd;

import java.util.HashMap;

public class RomanNumerals {
	public String convertToRoman(String arabe) {
		int nb = Integer.parseInt(arabe);
		String retour = "";

		HashMap <Integer, String> map = new HashMap<>();
		map.put(1, "I");
		map.put(4, "IV");
		map.put(5, "V");
		map.put(9, "IX");
		map.put(10, "X");
		
		while (nb > 0) {
			if (nb < 4 ) {
				retour = retour + "I";
				nb = nb - 1;
			}

			else if (nb == 4) {
				retour = retour + "IV";
				nb = nb - 4;
			}

			else if (nb >= 5 && nb < 9) {
				retour = retour + "V";
				nb -= 5;
			}

			else if (nb == 9) {
				retour = retour + "IX";
				nb = nb - 9;
			}

			else if (nb == 10) {
				retour = retour + "X";
				nb = nb - 10;
			}

			else if (nb > 10 && nb < 40) {
				retour = retour + "X";
				nb = nb - 10;
			}

		}
		return retour;
	}

	public String convertFromRoman(String roman) {
		return "1";
	}

}
