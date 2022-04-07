package pt.c02oo.s02classe.s03lombriga;

public class AppLab03 {
    public static void main(String args[]) {
        String aquario = "080403MCMVM";
        Animacao at = new Animacao(aquario);
        int sz = aquario.length();
        for(int i = 6; i < sz; i++) {
            System.out.println(at.apresenta());
            at.passo();
        }
        System.out.println(at.apresenta());
    }
}
