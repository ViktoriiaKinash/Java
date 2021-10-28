import java.util.*;
public class Student{

    private int ID;
    private String Imie;
    private String Nazwisko;

    Student(int _id, String _imie, String _nazwisko){
        ID=_id;
        Imie=_imie;
        Nazwisko=_nazwisko;

    }

    public void Wypisz_studenta(){
        System.out.println("ID: "+ID+ "Imie: "+ Imie + "Nazwisko: "+Nazwisko);
    }

    public int Get_ID(){
        return ID;
    }

    }
    
