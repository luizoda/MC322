package pt.c02oo.s03relacionamento.s04restaum;

public class Tabuleiro {
	Peca tb[][] = new Peca[7][7];
	public Tabuleiro() {
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if(((i > 1 && i < 5) || (j > 1 && j < 5)) && (i != 3 || j != 3)) {
					tb[i][j] = new Peca(true);
				}
				else {
					tb[i][j] = new Peca(false);
				}
			}
		}
	}
	void joga(String s) {
		int a, b, c, d, e, f;
		b = s.charAt(0) - 'a'; a = s.charAt(1) - '1';
		f = s.charAt(3) - 'a'; e = s.charAt(4) - '1';
		c = (a + e) / 2; d = (b + f) / 2;
		if(((a > 1 && a < 5) || (b > 1 && b < 5)) && ((e > 1 && e < 5) || (f > 1 && f < 5)) && tb[a][b].estado() && tb[c][d].estado() && !tb[e][f].estado()) {
			tb[a][b].troca(); tb[c][d].troca(); tb[e][f].troca();
		}
		else System.out.println("Movimento invalido");
	}
	char[][] show() {
		char resp[][] = new char[7][7];
		for(int i = 0; i < 7; i++) {
			for(int j = 0; j < 7; j++) {
				if((i > 1 && i < 5) || (j > 1 && j < 5)) {
					if(tb[i][j].estado()) resp[i][j] = 'P';
					else resp[i][j] = '-';
				}
				else resp[i][j] = ' ';
			}
		}
		return resp;
	}
}
