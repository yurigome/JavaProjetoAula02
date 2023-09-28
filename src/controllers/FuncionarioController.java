package controllers;

import java.util.Scanner;
import java.util.UUID;

import entities.Departamento;
import entities.Funcionario;
import repositories.FuncionarioRepositories;

public class FuncionarioController {

	/*
	 * Metodo para realizar o cadastro do funcionario
	 */

	public void casdastraFuncionario() {
		
		try {
			System.out.println("\nCadastro de funcionario\n");

			// criando um objeto

			Funcionario funcionario = new Funcionario();
			funcionario.setDepartarmento(new Departamento());
		
			
			// gerando um ID aleatorio para o funcionario

			funcionario.setId(UUID.randomUUID());
			
			// criando um objeto para a classe scanner

			Scanner scanner = new Scanner(System.in);

			System.out.print("Nome do funcionario:");
			funcionario.setNome(scanner.nextLine());

			System.out.print("cpf:");
			funcionario.setCpf(scanner.nextLine());

			System.out.print("Matricula");
			funcionario.setMatricula(scanner.nextLine());

			System.out.print("Salario:");
			funcionario.setSalario(Double.parseDouble(scanner.nextLine()));

			funcionario.getDepartarmento().setId(UUID.randomUUID());
			
			System.out.print("Sigla do departamento");
			funcionario.getDepartarmento().setDescricao(scanner.nextLine());
			
			System.out.print("Descrição");
			funcionario.getDepartarmento().setDescricao(scanner.nextLine());
			
			FuncionarioRepositories funcionarioRepositories=new FuncionarioRepositories();
			
			funcionarioRepositories.exportarParaTxt(funcionario);
			
			scanner.close();
		}
		
		catch(Exception e){
			System.out.println("\nERRO AO CADASTRAR FUNCIONARIO" + e.getMessage());
			
		}
		
		
	
	
	}

}
