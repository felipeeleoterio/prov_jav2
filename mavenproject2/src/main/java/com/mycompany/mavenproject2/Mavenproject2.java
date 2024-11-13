 /*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 */

package com.mycompany.mavenproject2;
import java.util.Scanner;
/**       
 *
 * @author HOME
 */
public class Mavenproject2 {

public static void main(String[] args) {
        Scanner ler = new Scanner(System.in);
        double Cexpre = 0.75;double Ccapp= 1.00; double Ccleite = 1.25;
        double tot; int pedido; int QTDCex = 0; int QTDCca =0; int QTDCCleite=0;
        double valorT=0.0;
        System.out.println("1-Cafe expresso = 0.75");
        System.out.println("2-Cafe capuccino = 1.00");
        System.out.println("3-Cafe com leite = 1.25");
        System.out.println("4- total da compra");
        System.out.println("Qual cafe deseja ?");
        pedido = ler.nextInt();
         if(pedido == 1){
           QTDCex=QTDCex+1; 
           valorT = valorT + 0.75;
        }
       else if(pedido == 2){
           QTDCca=QTDCca+1; 
           valorT = valorT + 1.00;
        }
      else if(pedido == 3){
           QTDCCleite=QTDCCleite+1;
           valorT = valorT + 1.25;
        }
        while(pedido != 4){
            if(pedido == 4){
                break;
                
            }
        System.out.println("Qual cafe deseja ?");
        pedido = ler.nextInt();
        if(pedido == 1){
           QTDCex=QTDCex+1; 
           valorT = valorT + 0.75;
        }
       else if(pedido == 2){
           QTDCca=QTDCca+1; 
           valorT = valorT + 1.00;
        }
      else if(pedido == 3){
           QTDCCleite=QTDCCleite+1;
           valorT = valorT + 1.25;
        }
    }
        System.out.println("O valor total a ser pago é");
        System.out.println(valorT);
        System.out.println("Foi pedido " + QTDCex + " cafes expressos" );
        System.out.println("Foi pedido " + QTDCca + " cafes capuccino" );
        System.out.println("Foi pedido " + QTDCCleite + " cafes com leite" );
}

}



 public static void main(String[] args) {
 Scanner s = new Scanner (System.in);
        String nomeJ1;
        String nomeJ2;
        String dicas[] = new String [5];
        String filme;
        String resp;
        int chances = 5;
        System.out.println("Nome do jogador 1: ");
        nomeJ1 = s.next();
        System.out.println("Nome do filme: ");
        filme = s.next();
        for(int i = 0; i < 5; i++){
            System.out.println("Dica "+(i+1)+": ");
            dicas[i] = s.next();
        }
        System.out.println("Nome do jogador 2: ");
        nomeJ2 = s.next();
        for(int i = 0; i < 5; i++){
            System.out.println("Dica "+(i+1)+": "+dicas[i]);
            System.out.println("Nome do filme: ");
            resp = s.next();
            if(!resp.equals(filme)){
                chances--;
            }
            else{
                System.out.println("Jogador 2 venceu!");
            }
        }
        if(chances == 0){
            System.out.println("Jogador 1 venceu!");
        }
}

public static void main(String[] args) {
        String num = JOptionPane.showInputDialog("Digite um numero: ");
        int n = Integer.parseInt(num);
        JOptionPane.showMessageDialog(null, "O antecessor: "+(n-1));
        JOptionPane.showMessageDialog(null, "O sucessor: "+(n+1));
    }
public class Pergunta05 {
    public static void main(String[] args) {
        final int USUARIO = 1234;
        final int SENHA = 9999;
        int entradaUsuario;
        int entradaSenha;
        Scanner in;
        
        System.out.print("Insira o codigo do usuario: ");
        in = new Scanner(System.in);
        
        entradaUsuario = in.nextInt();
        if (entradaUsuario == USUARIO) {
            System.out.print("Insira a senha do usuario: ");
            in = new Scanner(System.in);

            entradaSenha = in.nextInt();
            if (entradaSenha == SENHA) {
                System.out.print("Acesso permitido!");
            } else {
                System.out.print("Senha incorreta");
            }
        } else {
            System.out.print("Usuario invalido!");
        }
                
    }

public static void main(String[] args) {
 int[] nums;
        int soma = 0, N = 0;
        double media;
        Scanner in;
        
        System.out.print("Digite o valor de numeros a serem inseridos: ");
        in = new Scanner(System.in);
        N = in.nextInt();
        
        nums = new int[N];
        for (int i = 0; i < nums.length; i++) {
            System.out.printf("Insira o %s. valor: ", (i+1));
            in = new Scanner(System.in);
            soma += nums[i] = in.nextInt();
        }
        media = (double)soma / N;
        System.out.printf("""
                          Numeros cadastrados!
                          
                          Media: %1.2f
                          Soma: %d
                          Quantiadade de numeros inseridos: %d
                          """, media, soma, N);
    }


import java.util.Scanner;
import java.io.IOException;
import java.io.FileWriter;
import java.io.PrintWriter;

public class Pergunta08 {
    public static void main(String[] args) throws IOException {
        int num;
        Scanner in = new Scanner(System.in);
        
        System.out.print("Digite o numero para calcular a tabuada: ");
        num = in.nextInt();
        StringBuilder strTabuada = new StringBuilder(String.format("----- TABUADA DE %s -----\n", num));
        
        for (int d = 1; d <= 10; d++) {
            strTabuada.append(String.format("%d x %d = %d\n", num, d, num*d));
        }
        
        FileWriter arquivo = new FileWriter("C:\\Users\\t.baiense\\Desktop\\TABUADA.txt");
        PrintWriter impressora = new PrintWriter(arquivo);
        impressora.println(strTabuada.toString());
        arquivo.close();
        System.out.println("Arquivo escrito!");
    }

public class Quest_9 {

    public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        System.out.println("Ganho/hora trabalhada: ");
        float ganhoHora = s.nextInt();
        System.out.println("Horas trabalhadas no mes: ");
        float horas = s.nextInt();
        float salarioBruto = ganhoHora*horas;
        float impostoRenda = salarioBruto*0.11f;
        float inss = salarioBruto*0.08f;
        float sindicato = salarioBruto*0.05f;
        float salarioLiquido = salarioBruto-(impostoRenda+inss+sindicato);
        System.out.println("\nSalario bruto: "+salarioBruto);
        System.out.println("Imposto de renda: "+impostoRenda);
        System.out.println("INSS: "+inss);
        System.out.println("Sindicato: "+sindicato);
        System.out.println("Salario liquido: "+salarioLiquido);
    }


     public static void main(String[] args) {
        Scanner s = new Scanner (System.in);
        int vet[] = new int [11];
        for(int i = 0; i < 10; i++){
            System.out.println("Digite um numero: ");
            vet[i] = s.nextInt();
        }
        for(int j = 0; j < 10; j++){
            for(int i = 0; i < 10; i++){
                if(vet[j] < vet[i]){
                    int aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
            }
        }
        System.out.println("\n");
        for(int i = 0; i < 10; i++){
            System.out.println(vet[i]);
        }
        System.out.println("Digite mais um numero: ");
        vet[10] = s.nextInt();
        for(int j = 0; j < 11; j++){
            for(int i = 0; i < 11; i++){
                if(vet[j] < vet[i]){
                    int aux = vet[j];
                    vet[j] = vet[i];
                    vet[i] = aux;
                }
            }
        }
        System.out.println("\n");
        for(int i = 0; i < 11; i++){
            System.out.println(vet[i]);
        }
    }

public static void main(String[] args) throws IOException {
        int qtdProd;
        String[] nomeProd;
        double[] precoProd;
        Scanner in;
        
        System.out.print("Quantos produtos deseja cadastrar: ");
        in = new Scanner(System.in);
        qtdProd = in.nextInt();
        
        nomeProd = new String[qtdProd];
        precoProd = new double[qtdProd];
        StringBuilder strProdutos = new StringBuilder("---- PRODUTOS ----\n");
        for (int p = 0; p < qtdProd; p++) {
            System.out.printf("Nome do produto %d: ", (p+1));
            in = new Scanner(System.in);
            nomeProd[p] = in.nextLine().trim();
            strProdutos.append(nomeProd[p]);
            
            System.out.printf("Preco do produto %d: ", (p+1));
            in = new Scanner(System.in);
            precoProd[p] = in.nextDouble();
            System.out.println("\nProduto cadastrado!\n");
            strProdutos.append(String.format(" (R$ %1.2f)\n", precoProd[p]));
        }
        System.out.println("\nCadastro finalizado!\n");
        
        String produtos = strProdutos.toString();
        JOptionPane.showMessageDialog(null, produtos);
        FileWriter arquivo = new FileWriter("./PRODUTOS.txt");
        PrintWriter impressora = new PrintWriter(arquivo);
        impressora.println(produtos);
        arquivo.close();

}