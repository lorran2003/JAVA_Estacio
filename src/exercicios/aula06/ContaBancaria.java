
package com.mycompany.aula06;

import java.text.DateFormat;
import java.text.DecimalFormat;
import java.text.SimpleDateFormat;
import java.util.Date;


public class ContaBancaria {
    private double saldo;
    private Date dataDeAbertura;
    DateFormat dateFormate;
    DecimalFormat decimalFormat;
    ContaBancaria(){
        saldo = 0.00;
        dataDeAbertura = new Date();
    }
    
    public String getDataDeAbertura(){ 
        dateFormate = new SimpleDateFormat("dd/MM/yyyy");
        return dateFormate.format(dataDeAbertura);
    }
    
    public String getSaldo(){ 
        decimalFormat = new DecimalFormat("R$ #,##0.00");
        return decimalFormat.format(saldo);
    }
    
    public void setSaldo(double novoSaldo){
        saldo = novoSaldo;
    }
    
    public void Depositar(double valor){
        saldo += valor;
    }
    
    public void Sacar(double valor){
        if(saldo - valor > 0){
            saldo -= valor;
        }
    }
}
