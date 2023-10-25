

public static void main(String[] args) {

    Scanner leitor = new Scanner(System.in);
    int xpHeroi = null;
    String nomeHeroi = "";
    
    String parada = "n";
    while(parada.equals("n")){
        System.out.print("Digite o nome do Heroi ou 's' para sair: ");
        nomeHeroi = leitor.nextLine();
        System.out.print("Digite o xp do Heroi: ");
        xpHeroi = Integer.parseInt(leitor.nextLine());

    }  

    }

}