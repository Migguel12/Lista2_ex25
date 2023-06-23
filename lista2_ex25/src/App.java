import java.util.Scanner;

public class App {
    public static void main(String[] args) throws Exception {
        Scanner ler = new Scanner(System.in);

        System.out.println("Ocorreu um crime nesse local e precisamos que você responda algumas perguntas com 'S'para Sim ou 'N'para Não.");

        System.out.print("Telefonou para a vítima? ");
        String p1 = ler.nextLine();
        System.out.println("");

        System.out.print("Esteve no local do crime? ");
        String p2 = ler.nextLine();
        System.out.println("");

        System.out.print("Mora perto da vítima? ");
        String p3 = ler.nextLine();
        System.out.println("");

        System.out.print("Devia para a vítima? ");
        String p4 = ler.nextLine();
        System.out.println("");

        System.out.print("Ja trabalhou com a vítima? ");
        String p5 = ler.nextLine();
        System.out.println("");

        ler.close();

        int resposta = 0;

        if("S".equalsIgnoreCase(p1)){
            resposta++;
        }
        if("S".equalsIgnoreCase(p2)){
            resposta++;
        }
        if("S".equalsIgnoreCase(p3)){
            resposta++;
        }
        if("S".equalsIgnoreCase(p4)){
            resposta++;
        }
        if("S".equalsIgnoreCase(p5)){
            resposta++;
        }

        if(resposta == 2){
            System.out.println("Suspeita");
        }

        else if(resposta == 3 || resposta == 4){
            System.out.println("Cúmplice");          
        }
        
        else if(resposta == 5){
            System.out.println("Assasino");
        }

        else{
            System.out.println("Inocente");
        }

        
    }
}
