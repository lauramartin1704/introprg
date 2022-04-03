 public class UsaAscensor {
     public static int llegeixEnter() {
         String resposta = Entrada.readLine();
         //if (! UtilString.esEnter(resposta)) {
         //    return -2;
         //}
         return Integer.parseInt(resposta);
     }
     public static void main(String[] args) {
         Ascensor ascensor = new Ascensor();

         System.out.println("Pis inicial");
         ascensor.setPis(llegeixEnter());
         System.out.printf("Inicialment l'ascensor està %s%n", ascensor.getEstat());

         // aturat a pujant
         boolean resposta = ascensor.arrencaAmunt();
         System.out.printf("En arrencar amunt l'ascensor respon %b i està %s%n",
                 resposta, ascensor.getEstat());
		
         // demanem que baixi sense aturar
         resposta = ascensor.arrencaAbaix();
         System.out.printf("En arrencar a baix l'ascensor respon %b i està %s%n",
                 resposta, ascensor.getEstat());

         // passem del pis indicat al la planta baixa
         System.out.println("Anant a la planta baixa quan està " + ascensor.getEstat());
         while (! ascensor.estaAbaix()) {
             ascensor.arrencaAbaix();
             ascensor.seguentPis();       // passa al següent pis
             System.out.println("\t ara està "+ ascensor.getEstat());
         }
         ascensor.aturat();
         System.out.printf("Està %s. Final de trajecte!%n", ascensor.getEstat());
     }
 }
