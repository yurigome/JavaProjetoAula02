package repositories;

import java.io.PrintWriter;

import entities.Funcionario;

public class FuncionarioRepositories {

	public void exportarParaTxt(Funcionario funcionario) {

		try {
			//criando arquivo txt
			PrintWriter printWriter= new PrintWriter("c:\\temp\\funcionario_" + funcionario.getId()+".txt");
			
			//escrevendo os dados do funcionario dentro do arquivo
			
			
			printWriter.write("\nID DO FUNCIONARIO :"+ funcionario.getId());
			printWriter.write("\nNome :"+ funcionario.getNome());
			printWriter.write("\nCPF :"+ funcionario.getCpf());
			printWriter.write("\nMatricula :"+ funcionario.getMatricula());
			printWriter.write("\nSalário :"+ funcionario.getSalario());
			printWriter.write("\nSigla da DEPTO:"+ funcionario.getDepartarmento().getSigla());
			printWriter.write("\nDescricao do DEPTO:"+ funcionario.getDepartarmento().getDescricao());
			
			printWriter.flush();
			printWriter.close();
			
			System.out.println("\nArquivo txt foi gravado com sucesso");
		}
		
		catch(Exception e){
		
			System.out.println("\nFalha ao gravar arquivo TXT");
			System.out.println("\nERRO: " +e.getMessage());
		
	}
}
}