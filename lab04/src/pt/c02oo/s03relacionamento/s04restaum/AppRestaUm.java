package pt.c02oo.s03relacionamento.s04restaum;

public class AppRestaUm {
	
   public static void main(String[] args) {
      AppRestaUm.executaJogo(null, null);
   }
   
   public static void executaJogo(String arquivoEntrada, String arquivoSaida) {
      Toolkit tk = Toolkit.start(arquivoEntrada, arquivoSaida);
      String commands[] = tk.retrieveCommands();
      Tabuleiro board = new Tabuleiro();
      tk.writeBoard("Tabuleiro inicial", board.show());
      for(int i = 0; i < commands.length; i++) {
    	  board.joga(commands[i]);
    	  tk.writeBoard("source: " + commands[i].substring(0, 2) + ";" + " target: " + commands[i].substring(3, 5), board.show());
      }
      tk.stop();
   }
   
}