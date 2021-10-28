package com.vacina;

import java.util.Calendar;
import java.util.Date;

public class Main {
    public static void main(String[] args) {
        // Data e hora de agendamento
        int year = 2021;
        int month = 10;
        int day = 21;

        Calendar calendar = Calendar.getInstance();

        // No mês começa do 0 e termina no 11, não sei o motivo
        calendar.set(year,month-1,day);

        Date date = calendar.getTime();

        // Agendamento e registro da vacina
        Pessoa pessoa = new Pessoa("Luiz", "Gustavo", "998887770", "Pfizer", date);
        IRegistro registro = new RegistroVacinaProxy();
        registro.registrar(pessoa.dados());
    }
}
