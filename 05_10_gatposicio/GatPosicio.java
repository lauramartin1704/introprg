/*
 * Clase GatPosicio que mitjançant enum indica la posició de GatRenat
 */
 public enum GatPosicio {
     DRET,
     ASSEGUT,
     ESTIRAT;
     /*
     DRET    (1),
     ASSEGU  (2),
     ESTIRAT (3);
     
     private int codi;
     
     private GatPosicio(int codi) {
         this.codi = codi;
     }
     
     public int getCodi() {
         return codi;
     }
     
     public static GatPosicio fromCodi(int posicioInt) {
	for (GatPosicio posicio: GatPosicio.values()) {
            if (posicio.getCodi() == codi) {
                return posicio;
            }    
        }
        throw new IllegalArgumentException(String.format("Valor \"%s\" no suportat per GatPosicio", posicioInt));
     }
     */
     public static GatPosicio fromString(String posicioString) {
	for (GatPosicio posicio: GatPosicio.values()) {
            if (posicio.name().equalsIgnoreCase(posicioString)) {
                return posicio;
            }    
        }
        throw new IllegalArgumentException(String.format("Valor \"%s\" no suportat per GatPosicio", posicioString));
     }
     

 }
