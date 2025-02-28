import java.sql.SQLOutput;
import java.util.ArrayList;

public class Torre {

    private ArrayList<Disco> lista ;

    public Torre (){
        lista = new ArrayList<>();
    }

    public void push (Disco disco ){
        lista.add(disco);

    }

    public Disco pop (){
        int num = lista.size();
        if ( num > 0 ){
            return lista.remove(num - 1);
        }
        return null;
    }

    public Disco top (){
        int num = lista.size();
        if ( num > 0 ){
            return lista.get(num - 1);

        }
        return null;

    }

public void vittoria(){
        if (lista.get(0).getGrandezza() == 1 &&lista.get(1).getGrandezza() == 2 && lista.get(2).getGrandezza() == 3){
            System.out.println("   HAI VINTOOOOO !!!! ");
        }
}

    public void stampa (){
        for (int i = lista.size() -1 ; i >= 0 ; i -- ){
            System.out.println(lista.get(i).getGrandezza());

        }
    }


}