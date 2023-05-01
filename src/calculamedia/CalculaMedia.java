/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package calculamedia;

import java.util.Scanner;

/**
 *
 * @author chris
 */
public class CalculaMedia {
private String nome;
private String turma; 
private String disciplina; 
private double tarefa; 
private double apostila; 
private double trabalho; 
private double tic; 
private double relatorio; 
private double avaliativas; 
private double trilhas; 
private double simulado; 
private double prova; 
private double media;    
public void recebeDadosPratica(String disciplina) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o nome do aluno: ");
    this.setNome(sc.nextLine());
    System.out.print("Digite a turma do aluno: ");
    this.setTurma(sc.nextLine());
    System.out.print("Digite a disciplina: ");
    this.setDisciplina(sc.nextLine());
    System.out.print("Digite a nota da tarefa: ");
    this.setTarefa(sc.nextDouble());
    System.out.print("Digite a nota da apostila: ");
    this.setApostila(sc.nextDouble());
    System.out.print("Digite a nota do trabalho: ");
    this.setTrabalho(sc.nextDouble());
    System.out.print("Digite a nota do TIC: ");
    this.setTic(sc.nextDouble());
    System.out.print("Digite a nota do relatorio: ");
    this.setRelatorio(sc.nextDouble());
    System.out.print("Digite a nota da prova: ");
    this.setProva(sc.nextDouble());
}
public void recebeDadosTeorica(String disciplina) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o nome do aluno: ");
    this.setNome(sc.nextLine());
    System.out.print("Digite a turma do aluno: ");
    this.setTurma(sc.nextLine());
    System.out.print("Digite a disciplina: ");
    this.setDisciplina(sc.nextLine());
    System.out.print("Digite a nota da apostila: ");
    this.setApostila(sc.nextDouble());
    System.out.print("Digite a nota do trabalho: ");
    this.setTrabalho(sc.nextDouble());
    System.out.print("Digite a nota do TIC: ");
    this.setTic(sc.nextDouble());
    System.out.print("Digite a nota do relatório: ");
    this.setRelatorio(sc.nextDouble());
    System.out.print("Digite a nota da prova: ");
    this.setProva(sc.nextDouble());
}
public void recebeDadosRegular(String disciplina) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o nome do aluno: ");
    this.setNome(sc.nextLine());
    System.out.print("Digite a turma do aluno: ");
    this.setTurma(sc.nextLine());
    System.out.print("Digite a disciplina: ");
    this.setDisciplina(sc.nextLine());
    System.out.print("Digite a nota da apostila: ");
    this.setApostila(sc.nextDouble());
    System.out.print("Digite a nota do trabalho: ");
    this.setTrabalho(sc.nextDouble());
    System.out.print("Digite a nota das trilhas: "); 
    this.setTrilhas(sc.nextDouble()); 
    System.out.print("Digite a nota das atividades avaliativas: "); 
    this.setAvaliativas(sc.nextDouble());    
    System.out.print("Digite a nota da prova: ");
    this.setProva(sc.nextDouble());
}
public void recebeDadosRegular3ano(String disciplina) {
    Scanner sc = new Scanner(System.in);
    
    System.out.print("Digite o nome do aluno: ");
    this.setNome(sc.nextLine());
    System.out.print("Digite a turma do aluno: ");
    this.setTurma(sc.nextLine());
    System.out.print("Digite a disciplina: ");
    this.setDisciplina(sc.nextLine());
    System.out.print("Digite a nota da apostila: ");
    this.setApostila(sc.nextDouble());
    System.out.print("Digite a nota do trabalho: ");
    this.setTrabalho(sc.nextDouble());
    System.out.print("Digite a nota das trilhas: "); 
    this.setTrilhas(sc.nextDouble()); 
    System.out.print("Digite a nota das atividades avaliativas: "); 
    this.setAvaliativas(sc.nextDouble());    
    System.out.print("Digite a nota do simulado: ");
    this.setSimulado(sc.nextDouble());
    System.out.print("Digite a nota da prova: ");
    this.setProva(sc.nextDouble());
}

public void recebeDadosPratica(String nome,String turma,String disciplina,double tarefa,double apostila,double trabalho,double tic,double relatorio,double trilhas,double avaliativas,double simulado,double prova) { 
    this.setNome(nome); 
    this.setTurma(turma); 
    this.setDisciplina(disciplina); 
    this.setTarefa(tarefa); 
    this.setApostila(apostila); 
    this.setTrabalho(trabalho); 
    this.setTic(tic); 
    this.setRelatorio(relatorio); 
    this.setProva(prova);
    
    this.setAvaliativas(avaliativas);
    this.setTrilhas(trilhas);
    this.setSimulado(simulado);  }
public void recebeDadosTeorica(String nome,String turma,String disciplina,double apostila,double trabalho,double tic,double relatorio,double avaliativas,double prova) { 
    this.setNome(nome); 
    this.setTurma(turma); 
    this.setDisciplina(disciplina); 
    this.setApostila(apostila); 
    this.setTrabalho(trabalho); 
    this.setTic(tic); 
    this.setRelatorio(relatorio); 
    this.setProva(prova);
    }
public void recebeDadosRegular(String nome,String turma,String disciplina,double apostila,double trabalho,double trilhas,double avaliativas,double prova) { 
    this.setNome(nome); 
    this.setTurma(turma); 
    this.setDisciplina(disciplina); 
    this.setApostila(apostila); 
    this.setTrabalho(trabalho); 
    this.setProva(prova);  
    this.setAvaliativas(avaliativas);
    this.setTrilhas(trilhas);  
}
public void recebeDadosRegular3ano(String nome,String turma,String disciplina,double apostila,double trabalho,double trilhas,double avaliativas,double simulado,double prova) { 
    this.setNome(nome); 
    this.setTurma(turma); 
    this.setDisciplina(disciplina); 
    this.setApostila(apostila); 
    this.setTrabalho(trabalho); 
    this.setProva(prova);
    this.setAvaliativas(avaliativas);
    this.setTrilhas(trilhas);
    this.setSimulado(simulado);  
}

public double CalculaMediaPratica(double tic, double prova, double relatorio, double apostila, double trabalho, double tarefa) { 
    double media = 0;
        media = (getTarefa() * 0.3) + (getApostila() * 0.05) + (getTrabalho() * 0.1) + (getTic() * 0.15)  + (getRelatorio() * 0.1) +  (getProva() * 0.3);
        return media;
            }
public double CalculaMediaTeorica(double tic, double prova, double relatorio, double apostila, double trabalho) { 
    double media = 0;
        media = (getTarefa() * 0.3) + (getApostila() * 0.05) + (getTrabalho() * 0.1) + (getTic() * 0.15)  + (getRelatorio() * 0.1) +  (getProva() * 0.3);
        return media;
            }
public double CalculaMediaRegular(double trilha, double prova, double avaliativa, double apostila, double trabalho) { 
    double media = 0;
        media = (this.getApostila() * 0.05 + this.getTrabalho() * 0.1 + this.getTrilhas() * 0.15 + this.getAvaliativas() * 0.2 + this.getProva() * 0.5);
        return media;
            }
public double CalculaMediaRegular3ano(double trilha, double prova, double avaliativa, double apostila, double trabalho, double simulado) { 
    double media = 0;
        media = (this.getApostila() * 0.05 + this.getTrabalho() * 0.1 + this.getTrilhas() * 0.15 + this.getAvaliativas() * 0.1 + this.getSimulado() * 0.2 + this.getProva() * 0.4);
        return media;
            }


public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public String getTurma() {
        return turma;
    }
    public void setTurma(String turma) {
        this.turma = turma;
    }
    public String getDisciplina() {
        return disciplina;
    }
    public void setDisciplina(String disciplina) {
        this.disciplina = disciplina;
    }
    public double getTarefa() {
        return tarefa;
    }
    public void setTarefa(double tarefa) {
        this.tarefa = tarefa;
    }
    public double getApostila() {
        return apostila;
    }
    public void setApostila(double apostila) {
        this.apostila = apostila;
    }
    public double getTrabalho() {
        return trabalho;
    }
    public void setTrabalho(double trabalho) {
        this.trabalho = trabalho;
    }
    public double getTic() {
        return tic;
    }
    public void setTic(double tic) {
        this.tic = tic;
    }
    public double getRelatorio() {
        return relatorio;
    }
    public void setRelatorio(double relatorio) {
        this.relatorio = relatorio;
    }
    public double getAvaliativas() {
        return avaliativas;
    }
    public void setAvaliativas(double avaliativas) {
        this.avaliativas = avaliativas;
    }
    public double getTrilhas() {
        return trilhas;
    }
    public void setTrilhas(double trilhas) {
        this.trilhas = trilhas;
    }
    public double getSimulado() {
        return simulado;
    }
    public void setSimulado(double simulado) {
        this.simulado = simulado;
    }
    public double getProva() {
        return prova;
    }
    public void setProva(double prova) {
        this.prova = prova;
    }
    public double getMedia() {
        return media;
    }
    public void setMedia(double media) {
        this.media = media;
    }
    public void exibeDadosPratica() { 
    System.out.println("Nome do aluno: " + this.getNome()); 
    System.out.println("Turma: " + this.getTurma()); 
    System.out.println("Disciplina: " + this.getDisciplina()); 
    System.out.println("Media: " + this.CalculaMediaPratica(tic, prova, relatorio, apostila, trabalho,tarefa)); 
}
public void exibeDadosTeorica() { 
    System.out.println("Nome do aluno: " + this.getNome()); 
    System.out.println("Turma: " + this.getTurma()); 
    System.out.println("Disciplina: " + this.getDisciplina()); 
    System.out.println("Media: " + this.CalculaMediaTeorica(tic, prova, relatorio, apostila, trabalho)); 
}
public void exibeDadosRegular() { 
    System.out.println("Nome do aluno: " + this.getNome()); 
    System.out.println("Turma: " + this.getTurma()); 
    System.out.println("Disciplina: " + this.getDisciplina()); 
    System.out.println("Media: " + this.CalculaMediaRegular(trilhas, prova, avaliativas, apostila, trabalho)); 
}
public void exibeDadosRegular3ano() { 
    System.out.println("Nome do aluno: " + this.getNome()); 
    System.out.println("Turma: " + this.getTurma()); 
    System.out.println("Disciplina: " + this.getDisciplina()); 
    System.out.println("Media: " + this.CalculaMediaRegular3ano(trilhas, prova, avaliativas, apostila, trabalho, simulado)); 
}
    public static void main(String[] args) {
        
        Scanner scanner = new Scanner(System.in);
        
       CalculaMedia calcular = new CalculaMedia();

        System.out.println("Escolha a disciplina:");
        System.out.println("1 - Pratica");
        System.out.println("2 - Teorica");
        System.out.println("3 - Regular");
        System.out.println("4 - Regular 3 ano");

        int opcao = scanner.nextInt();

        switch (opcao) {
            case 1:
                calcular.recebeDadosPratica("Pratica");
                calcular.CalculaMediaPratica(opcao, opcao, opcao, opcao, opcao,opcao);
                calcular.exibeDadosPratica();
                break;
            case 2:
                calcular.recebeDadosTeorica("Teorica");
                calcular.CalculaMediaTeorica(opcao, opcao, opcao, opcao, opcao);
                calcular.exibeDadosTeorica();
                break;
            case 3:
                calcular.recebeDadosRegular("Regular");
                calcular.CalculaMediaRegular(opcao, opcao, opcao, opcao, opcao);
                calcular.exibeDadosRegular();
                break;
            case 4:
                calcular.recebeDadosRegular3ano("Regular 3 ano");
                calcular.CalculaMediaRegular3ano(opcao, opcao, opcao, opcao, opcao, opcao);
                calcular.exibeDadosRegular3ano();
                break;
            default:
                System.out.println("Opção inválida");
                return;
        }
    }
}
