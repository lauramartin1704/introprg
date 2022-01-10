
/* Llibreria externa
 * esEnter: comprova un número
 */ 
 
public class UtilString{
    
    public static boolean esEnter(String text){
        
        if (text.isEmpty()) return false;
        for (int i = 0; i < text.length(); i++){
            if (text.charAt(0) == '-' || text.charAt(0) == '+') {
            }else if (Character.isDigit(text.charAt(i)) && Character.isDigit(text.charAt(2))){
            
                continue;
            } else {
                return false;
            }
       } 
       return true;
    }  
}
