package pt.c02oo.s02classe.s03lombriga;

public class AppLombriga {

   public static void main(String[] args) {
      Toolkit tk = Toolkit.start();
      String lombrigas[] = tk.recuperaLombrigas();
      for (int l = 0; l < lombrigas.length; l++) {
    	  Animacao anima = new Animacao(lombrigas[l]);
    	  tk.gravaPasso("=====");
    	  tk.gravaPasso(anima.apresenta());
    	  for(int j = anima.cur; j < anima.seq.length(); j++) {
    		  anima.passo();
    		  tk.gravaPasso(anima.apresenta());
    	  }
      }
      tk.stop();
   }

}
