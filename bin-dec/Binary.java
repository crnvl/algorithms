
import java.lang.Math.*;
/**
 * @author angelsflyinhell
 * @version 1.0.0
 */
public class Binary
{
    public static String toBin(int decimal) {
        String binary = "";

        while(decimal != 0) {
            binary += decimal % 2;
            decimal = decimal / 2;
        }
        return new StringBuilder(binary).reverse().toString();
    }
    
    public static int toDec(String binary) {
        String[] chars = binary.split("");
        
        int dec = 0;
        for(int i = 0; chars.length > i; i++) {
            if(Integer.parseInt(chars[i]) == 1) {
                dec += Math.pow(2, chars.length - i - 1);
            }
        }
        return dec;
    }
}
