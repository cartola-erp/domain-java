/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package net.cartola.util;

import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 *
 * @author DAVID.DIAS
 */
public class Validadores {

    public static boolean validarEmail(String email) {
        Pattern p = Pattern.compile("^[\\w\\.-]+@([\\w\\-]+\\.)+[A-Z]{2,4}$", Pattern.CASE_INSENSITIVE);
        Matcher m = p.matcher(email);
        return m.matches();
    }
}
