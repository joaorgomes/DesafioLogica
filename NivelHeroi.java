import java.util.Scanner;

public class NivelHeroi{
    public static void main(String[] args) {
    
        Scanner leitor = new Scanner(System.in);
        int xpHeroi;
        String nomeHeroi = "";
        
        String parada = "s";
        while(parada.equals("s")){
            System.out.print("Digite o nome do Heroi: ");
            nomeHeroi = leitor.nextLine();
            System.out.print("Digite o xp do Heroi: ");
            xpHeroi = Integer.parseInt(leitor.nextLine());
            if(xpHeroi < 1000){
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Ferro");               
            }else if(xpHeroi < 2001){
                 System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Bronze");
            }else if(xpHeroi < 5001){
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Prata");
            }else if(xpHeroi < 7001){
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Ouro");
            }else if(xpHeroi < 8001 ){
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Platina");
            }else if(xpHeroi < 9001){
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Ascentente");
            }else if(xpHeroi < 10001 ){
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Imortal");
            }else {
                System.out.println("O Herói de nome " + nomeHeroi + " está no nível de Radiante");
                
            }
            System.out.println("Deseja continuar S[Sim]  N[Não]");
            String decisao = leitor.nextLine();
            if(decisao.equalsIgnoreCase("n")){
                parada = decisao;
            }
    
        
        }
    
    }

}