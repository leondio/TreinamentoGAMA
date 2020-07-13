package exercicios.exercicio02;

public class Relogio {
    private int hora, minuto, segundo;

    Relogio(int hora) {
        this.hora = hora;
        minuto = 0;
        segundo = 0;
    }

    Relogio(int hora, int minuto) {
        this.hora = hora;
        this.minuto = minuto;
        segundo = 0;
    }

    Relogio(int hora, int minuto, int segundo) {
        if (hora >= 0 && hora <= 24) {
            this.hora = hora;
        } else {
            //log("errorHora");
        }
        if (minuto >= 0 && minuto <= 60) {
            this.minuto = minuto;
        } else {
           // log("errorMinuto");
        }
        if (segundo >= 0 && segundo <= 60) {
            this.segundo = segundo;
        } else {
            //log("errorSegundo");
        }
    }

    public void setHora(int hora) {
        if (hora >= 0 && hora <= 24) {
            this.hora = hora;
        } else {
         //   log("errorHora");
        }

    }

    public int getHora() {
        return hora;
    }

    public void setMinuto(int minuto) {
        if (minuto >= 0 && minuto <= 60) {
            this.minuto = minuto;
        } else {
           // log("errorMinuto");
        }
    }

    public int getMinuto() {
        return minuto;
    }

    public void setSegundo(int segundo) {
        if (segundo >= 0 && segundo <= 60) {
            this.segundo = segundo;
        } else {
           // log("errorSegundo");
        }
    }

    public int getSegundo() {
        return segundo;
    }

    public String exibir() {
        return ("Horário: " + hora + ":" + minuto + ":" + segundo);
    }

 /**   String log(String input) {
        switch (input) {
            case "errorHora":
                System.out.println("Horário digitado é inválido");
                break;
            case "errorMinuto":
                System.out.println("Minuto digitado é inválido");
                break;
            case "errorSegundo":
                System.out.println("Segundo digitado é inválido");
                break;
            default:
                return input;
        }
 */
    
}
