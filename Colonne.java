import java.sql.SQLOutput;

public class Colonne {
    private Torre torre1 ;
    private Torre torre2;
    private Torre torre3;
    public Colonne (){
        torre1 = new Torre();
        torre2 = new Torre();
        torre3 = new Torre();
        IniziaGioco();
    }

    private void IniziaGioco (){
        torre1.push( new Disco (3));
        torre1.push( new Disco (2));
        torre1.push( new Disco (1));
    }

    public void sposta (int colonna1 , int colonna2 ){
        if (colonna1 == 1 ){
            Disco disco = torre1.top();
            torre1.pop();
            if(colonna2 == 2){
                torre2.push(disco);
            }else {
                torre3.push(disco);
            }
        }else if (colonna1 == 2){
            Disco disco = torre2.top();
            torre2.pop();
            if(colonna2 == 1){
                torre1.push(disco);
            }else {
                torre3.push(disco);
            }
        }else {
            Disco disco = torre3.top();
            torre3.pop();
            if(colonna2 == 1){
                torre1.push(disco);
            }else {
                torre2.push(disco);
            }
        }
    }

public void vittoria(){
        try{
            torre1.vittoria();
            torre2.vittoria();
            torre3.vittoria();
        }catch (IndexOutOfBoundsException e ){

        }

}

    public void stampa (){
torre1.stampa();
torre2.stampa();
torre3.stampa();


    }


}