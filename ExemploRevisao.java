package AtividadeRevisao1;

import java.util.Scanner;

public class ExemploRevisao {
    Scanner sc = new Scanner(System.in);

    public void exemplo1() {
        // 1° Ler o Numero
        System.out.println(" Digite um Número:");
        double nDigitado = sc.nextDouble();

        // 2° Se o número for maior que dez
        if(nDigitado>10){
         System.out.println("É Maior que dez!");

        }
        // 3° Se não 
        else{
         System.out.println("não é maior que 10!");
        }
    }

  public void Exercico1() {

    System.out.println("Informe o Numero de Horas Trabalhadas no Mês");
    double nHorasTrabalhadasMes = sc.nextDouble();
    System.out.println("Informe o Salario por Hora Trabalhado (Calculo Base 200 Horas)");
    double nSalarioHora = sc.nextDouble();

    double horaBase = 200;
    double valorHoraExtra = 0.5;

    double salarioExtra = ((nSalarioHora*valorHoraExtra)+ nSalarioHora);

    double horaExtraValor = ((nHorasTrabalhadasMes-horaBase)* salarioExtra);
    
    double salarioBase = (horaBase * nSalarioHora);

    double salarioFinal = salarioBase + horaExtraValor;

    System.out.println(" O Salario do Mês:" + salarioFinal);

  }




}
