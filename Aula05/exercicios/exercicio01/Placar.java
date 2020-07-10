package exercicios.exercicio01;

public class Placar {
    String time1, time2;
    int golsTime1, golsTime2;

    Placar(){
        time1 = "Time da casa";
        time2 = "Visitante";
        golsTime1 = 0;
        golsTime2 = 0;
    }

    Placar(String time1, String time2){
        this.time1 = time1;
        this.time2 = time2;
        golsTime1 = 0;
        golsTime2 = 0;
    }

    Placar(String time1, String time2, int golsTime1, int golsTime2){
        this.time1 = time1;
        this.time2 = time2;
        this.golsTime1 = golsTime1;
        this.golsTime2 = golsTime2;
    }

    String exibir(){
        return(time1 + " " + golsTime1 + " X " + golsTime2 + " " + time2);
    }
}