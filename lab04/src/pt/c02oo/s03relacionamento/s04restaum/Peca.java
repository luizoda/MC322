package pt.c02oo.s03relacionamento.s04restaum;

public class Peca {
	boolean vivo;
	public Peca(boolean vivo) {
		this.vivo = vivo;
	}
	void troca() {
		if(this.vivo == true) {
			this.vivo = false;
		}
		else {
			this.vivo = true;
		}
	}
	boolean estado() {
		return vivo;
	}
}
