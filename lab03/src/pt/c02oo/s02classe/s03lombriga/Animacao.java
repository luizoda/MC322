public class Animacao {
    AquarioLombriga lomb;
    String seq;
    int cur;
    Animacao(String seq) {
        this.seq = seq;
        int asz = (seq.charAt(0) - '0') * 10 + seq.charAt(1) - '0', lsz = (seq.charAt(2) - '0') * 10 + seq.charAt(3) - '0', pos = (seq.charAt(4) - '0') * 10 + seq.charAt(5) - '0';
        lomb = new AquarioLombriga(asz, lsz, pos);
        cur = 6;
    }
    String apresenta() {
        return lomb.apresenta();
    }
    void passo() {
        char at = seq.charAt(cur);
        cur++;
        if(at == 'C') lomb.crescer();
        else if(at == 'M') lomb.mover();
        else lomb.virar();
    }
}