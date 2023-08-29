// Nome: Vitor da Silva Areão
// Data: 29/08/2023

public class Estradista extends Pessoa implements Ciclista{
     public  Estradista (){
            setNome(getNome());
        }


         public void pedalar(){
            System.out.println(getNome() + " Pedala em estradas...");
         }

    
        }
    
