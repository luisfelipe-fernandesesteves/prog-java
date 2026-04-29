package br.com.fiap.main;

import br.com.fiap.entities.Pessoa;
import br.com.fiap.entities.PessoaJuridica;
import br.com.fiap.entities.PessoaFisica;
import br.com.fiap.entities.DadosBancarios;

import javax.swing.*;

public class TesteSistema {

    static String texto(String j){
        return JOptionPane.showInputDialog(j);
    }
    static int inteiro(String j){
        return Integer.parseInt(JOptionPane.showInputDialog(j));
    }
    static double real(String j){
        return Double.parseDouble(JOptionPane.showInputDialog(j));
    }

    

}
