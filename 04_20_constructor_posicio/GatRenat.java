/*
 * Protegint la posicio
 * Per accedir a la posició des de fòra de la classe
 * s'ha d'utilitzar els setters
*/

public class GatRenat {
    private int vides;
    public GatRenat() {
        vides = 7;
    }
    @Override
    public String toString() {
        return String.format("Vides: %d", vides);
    }
    public int getVides() { return vides; }
    public static void main(String[] args) {
        GatRenat renat = new GatRenat();
        System.out.println(renat);
    }
}