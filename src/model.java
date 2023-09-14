
import java.util.ArrayList;
import java.util.Iterator;
import java.util.Map;
import java.util.Scanner;
import login.PessoaFisica;
import login.PessoaJuridica;
import managers.PessoaJuridicaRepo;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template

/**
 *
 * @author matheus rodrigues
**/
public class model {

    /**
     * @param args the command line arguments
     * @throws java.lang.Exception
     */
    public static void main(String[] args) throws Exception {
        System.out.println("RUNNING... \n");

        var p1 = new PessoaFisica(1, "matheus rodrigues", "111.111.111-00", 20);
        var p2 = new PessoaFisica(2, "joao guilherme", "222.222.222-00", 21);
        var p3 = new PessoaJuridica(3, "cripto agents", "333.333.333.00", 23, "23.443.434/4323-0-999");
        var p4 = new PessoaJuridica(4, "cosmic", "444.444.444.00", 34, "54.455.334/4983-0-999");
        var PJuridica = new PessoaJuridicaRepo();
        var PFisica = new PessoaFisicaRepo();
        PFisica.inserir(p1);
        PFisica.inserir(p2);
        PFisica.persistir("fisica.txt");
        
        System.out.println("DADOS DE PESSOA FISICA ARMAZENADOS...  ");
        
        PJuridica.inserir(p3);
        PJuridica.inserir(p4);
        PJuridica.persistir("juridica.txt");

        System.out.println("DADOS DE PESSOA JURIDICA ARMAZENADOS...  \n");
        
        var PFisicaTotal = PFisica.obterTodos().iterator();
        var PJuridicaTotal = PJuridica.obterTodos().iterator();
        
 
       PFisicaTotal.forEachRemaining((action) -> {  
        System.out.print("NOME: " + action.getNome() + '\n');
        System.out.print("IDADE: " + action.getIdade()+ '\n');
        System.out.print("CPF: " + action.getCpf() + '\n');
       });
        
        PJuridicaTotal.forEachRemaining((action) -> {  
        System.out.print("ID: " + action.getId()+ '\n'); 
        System.out.print("NOME: " + action.getNome() + '\n');
        System.out.print("CNPJ " + action.getCnpj()+ '\n');
       });
        


       

  

        // TODO code application logic here
    }

}
