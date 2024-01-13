package com.financeiro.pagar;

import org.apache.commons.lang3.StringUtils;

import static java.lang.System.*;

public class TextApp {
    public static void main(String[] args) {
        String nome = "Vinicius Santos";

     System.out.println(StringUtils.abbreviate(nome, 10));
    }
}
