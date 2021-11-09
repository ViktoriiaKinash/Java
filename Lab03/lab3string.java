import java.util.*;
import java.lang.String;

/** @author Viktoria Kinash */
public class lab3string{

    public static int dlugosc(String slowo){ 
    /** @param obiekt klasy String
    *   @return  dlugosc ciagu - ilosc literek w slowie
    *   korzysta z metody length() klasy String
    */
        return slowo.length();
    }

    public static int ile_razy_literka_wystepuje(String slowo, char literka){ 
    /** @param obiekt klasy String i znak char
    *   @return ile razy dany znak wystepuje w ciagu
    *   korzysta z metody charAt() klasy String, ktora zwraca wartosc char podanego indeksu w string-u 
    */
        int ilerazy=0;
        for (int i=0; i<slowo.length(); i++){
            if(literka == slowo.charAt(i)){
                ilerazy++;
            }
        }
        return ilerazy;
    }

    public static boolean czy_takie_same(String slowo1, String slowo2){
    /** @param dwa obiekty klasy String
    *   @return true jezeli dwa slowa sa identyczne
    *   korzysta z metody compareTo() klasy String
    */
        int logic = slowo1.compareTo(slowo2);
        boolean log_b = false;
        if(logic == 0){
            log_b = true;
        }
        return log_b;
    }

     public static String wspak(String slowo){
    /** @param obiekt klasy String
    *   @return slowo napisane wspak
    *   korzysta z metody reverse() klasy String
    */
        StringBuffer noweSlowo = new StringBuffer(slowo);
        return new String(noweSlowo.reverse());
    }

     public static boolean czy_plaindrom(String slowo){
    /**  @param obiekt klasy String
    *    @return true jezeli słowo  czytane wspak jest takie samo
    *    korzysta z wczesniej zaimplemetowanych metod klasy lab3string
    */
        String Wspak = lab3string.wspak(slowo);
        return lab3string.czy_takie_same(Wspak, slowo);
    }

    public static boolean czy_abecadlowe(String slowo){
    /** @param obiekt klasy String
    *   @return true jezeli literki w slowie sa w alfabetycznym porzadku
    *korzysta z kodow ASCII
    */
        boolean logic = true;
        for(int i=0; i < slowo.length() - 1; i++){
            if(slowo.charAt(i) > slowo.charAt(i+1)) {
                logic = false;
            }
        }
        return logic;
        
    }

    public static String rot13(String slowo){
        String result = "";
        for (int i = 0; i < slowo.length(); i++) {
            if (slowo.charAt(i) >= 'a' && slowo.charAt(i) <= 'z') {
                int c = ((slowo.charAt(i) + 13) % 'z');
                if (c < 'a') {
                    c += 'a' - 1;
                }
                result += (char)(c);
            } else if (slowo.charAt(i) >= 'A' && slowo.charAt(i) <= 'Z') {
                int c = ((slowo.charAt(i) + 13) % 'Z');
                if (c < 'A') {
                    c += 'A' - 1;
                }
                result += (char)(c);
            } else {
                result += slowo.charAt(i);
            }
        }
        return result;

    }

    }
    