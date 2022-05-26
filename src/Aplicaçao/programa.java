package Aplicaçao;

import java.text.ParseException;
import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.Locale;
import java.util.Scanner;

import Entidades.Contratos;
import Entidades.Departamento;
import Entidades.Trabalhador;
import EntidadesEnum.NivelTrabalhador;

public class programa {

	public static void main(String[] args) throws ParseException {
		
		Locale.setDefault(Locale.US);
		Scanner sc = new Scanner(System.in);
		SimpleDateFormat sdf = new SimpleDateFormat("dd/MM/yyyy");
		
		System.out.println("Entre com o nome do departamento: ");
		String nomeDepartamento = sc.nextLine();
		System.out.println("Entre com os dados do trabalhador: ");
		System.out.print("Nome:");
		String nomeTrabalhador = sc.nextLine();
		System.out.print("Nivel:");
		String nivelTrabalhador = sc.nextLine();
		System.out.print("Salario base:");
		double salarioBase = sc.nextDouble();
		Trabalhador trabalhador = new Trabalhador(nomeTrabalhador, NivelTrabalhador.valueOf(nivelTrabalhador), salarioBase, new Departamento(nomeDepartamento));
		
		System.out.print("Quantos contratos o trabalhador vai ter: ");
		int n = sc.nextInt();
		
		for (int i=1; i <= n; i++) {
			System.out.println("Entre com o contrato " + i + ": ");
			System.out.println("Data (DD/MM/YYYY): ");
		    Date contratoData = sdf.parse(sc.next());
		    System.out.print("Valor por hora: ");
		    double valorHora = sc.nextDouble();
		    System.out.print("Duraçao (horas):");
		    int horas = sc.nextInt();
		    Contratos  contratos = new Contratos(contratoData, valorHora, horas);
		    trabalhador.addContrato(contratos);
			
		}
		
		 System.out.println();
		 System.out.print("Entre com o mes e ano para calcular o salario: ");
		 String mesEano = sc.next();
		 int mes = Integer.parseInt(mesEano.substring(0, 2));
		 int ano = Integer.parseInt(mesEano.substring(3));
		 System.out.println("Nome: " + trabalhador.getNome());
		 System.out.println("Departamento: " + trabalhador.getDepartamento().getNome());
		 System.out.println("Renda: " + mesEano + ": " + trabalhador.renda(ano, mes));
			
		
	  sc.close();
	}

}
