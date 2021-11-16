
import java.util.Scanner;
public class Principal {
public static void main(String[]args){
        Scanner entradaUsuario = new Scanner (System.in);
        Dado dado = new Dado();
        
        int count = 0;
        boolean acertou = false;
        String entrada;
        
        System.out.println("jogo do dado");
        System.out.print("Teste sua sorte e descubra em quantas jogadas você consegue tirar o número 6");
        System.out.println("O jogo termina quando você Tirar o número seis ou atingir 10 tentativas");
        
        while(count < 10 && acertou == false){
            System.out.println("Tentativa de número: "+count);
            System.out.print("Escreva 'jogar' para tentar: ");
            
            entrada = entradaUsuario.nextLine();
            
            if("jogar".equalsIgnoreCase(entrada)){
                count++;
                dado.JogarDado();
                System.out.println("Você tirou: "+dado.getNumero());
            if(dado.getNumero()==6){
                acertou = true;
        }
        }
        }
        if(acertou == true){
            System.out.println("Parabens!!!! Você acertou em "+count+" jogadas");    
        }else{
            System.out.println("Que pena!!!!! Tente novamente");
        }
    }
    
}