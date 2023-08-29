// Nome: Vitor da Silva Areão
// Data: 29/08/2023

public class Maratonista extends Pessoa implements Corredor{
   public Maratonista() {
            setNome(getNome());
            
    }



         public void correr(){
            System.out.println(getNome()+ " Começou a correr...");
         }

    
        }
    
