package challenge;

import java.util.Arrays;
import java.util.List;

public class CriptografiaCesariana implements Criptografia {

	@Override
	public String criptografar(String texto) {

		if (texto.isEmpty()) {
			throw new IllegalArgumentException();
		}

		if (texto.equals(null)) {
			throw new NullPointerException();
		}

		try {

			int lenght = texto.length();
			Integer n[] = new Integer[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
			List<Integer> numeros = Arrays.asList(n);
			StringBuilder textoCifrado = new StringBuilder();

			for (int l = 0; l < lenght; l++) {
				int letraCifradaASCII;
				int letraASCII = ((int) texto.charAt(l));
				if (letraASCII != 32 && !numeros.contains(letraASCII)) {
					letraCifradaASCII = ((int) texto.charAt(l)) + 3;
				} else {
					letraCifradaASCII = letraASCII;
				}

				while (letraCifradaASCII > 126)
					letraCifradaASCII -= 94;

				textoCifrado.append((char) letraCifradaASCII);
			}

			texto = textoCifrado.toString().toLowerCase();

			return texto;

		} catch (Exception e) {
			throw new UnsupportedOperationException("esse method nao esta implementado aainda");
		}

	}

	@Override
	public String descriptografar(String texto) {

		if (texto.isEmpty()) {
			throw new IllegalArgumentException();
		}

		if (texto.equals(null)) {
			throw new NullPointerException();
		}

		try {

			int lenght = texto.length();
			Integer n[] = new Integer[] { 48, 49, 50, 51, 52, 53, 54, 55, 56, 57 };
			List<Integer> numeros = Arrays.asList(n);
			StringBuilder textoCifrado = new StringBuilder();

			for (int l = 0; l < lenght; l++) {
				int letraCifradaASCII;
				int letraASCII = ((int) texto.charAt(l));
				if (letraASCII != 32 && !numeros.contains(letraASCII)) {
					letraCifradaASCII = ((int) texto.charAt(l)) - 3;
				} else {
					letraCifradaASCII = letraASCII;
				}

				while (letraCifradaASCII > 126)
					letraCifradaASCII -= 94;

				textoCifrado.append((char) letraCifradaASCII);
			}

			texto = textoCifrado.toString().toLowerCase();

			return texto;

		} catch (Exception e) {
			throw new UnsupportedOperationException("esse method nao esta implementado aainda");
		}

	}
}
