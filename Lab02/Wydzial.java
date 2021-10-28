import java.util.ArrayList;
public class Wydzial{

    private ArrayList<Student>lista_studentow;

    Wydzial(){
        lista_studentow = new ArrayList<Student>();
    }

    public void Dodaj(Student student){
        if(Czy_jest_w_bazie(student)==false){
        lista_studentow.add(student);
        }
    }

    public void Wypisz(){
        for(int i=0; i<lista_studentow.size(); i++){
            lista_studentow.get(i).Wypisz_studenta();
            
        }
    }

    public boolean Czy_jest_w_bazie(Student student){
        /** forEach */
        boolean state=false;;
        for(int i=0; i<lista_studentow.size(); i++){ 
        if(student.Get_ID() == lista_studentow.get(i).Get_ID()) {state = true;}
        }
        
        return state;
    }
    
}