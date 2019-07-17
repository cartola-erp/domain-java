package net.cartola.util;

import java.math.BigDecimal;
import java.text.NumberFormat;
import java.util.Locale;
import java.util.logging.Level;
import java.util.logging.Logger;

/**
 * 14/02/2010 14:08:48
 * @author Murilo
 */
public class NumberUtil {
    private static final NumberFormat DECIMAL_BANCO = NumberFormat.getNumberInstance(Locale.US);
    private static final NumberFormat DECIMAL = NumberFormat.getNumberInstance(new Locale("pt", "BR"));

    static {
        int produtoQuantidadePrecisao = Integer.parseInt(System.getProperty("decimal.precisao", "2"));
        DECIMAL_BANCO.setMaximumFractionDigits(produtoQuantidadePrecisao);
        DECIMAL_BANCO.setMinimumFractionDigits(produtoQuantidadePrecisao);
        DECIMAL_BANCO.setGroupingUsed(false);

        DECIMAL.setMaximumFractionDigits(produtoQuantidadePrecisao);
        DECIMAL.setMinimumFractionDigits(produtoQuantidadePrecisao);
        DECIMAL.setGroupingUsed(false);
    }

    public static int soma(int [] vetor){
        int soma = 0;
        for(int posicao=0;posicao<vetor.length;posicao++){
            soma += vetor[posicao];
        }
        return soma;
    }

    public static String decimalBanco(double valor){
        return DECIMAL_BANCO.format(valor);
    }
    
    public static String decimalBanco(Double valor){
        if (valor == null) {
            valor = 0d;
        }
        return DECIMAL_BANCO.format(valor);
    }
    
    public static String decimalBanco(Float valor){
        if (valor == null) {
            valor = 0f;
        }
        return DECIMAL_BANCO.format(valor);
    }
    
    public static String decimalBanco(Double valor, int casas){
        if (valor == null) {
            valor = 0d;
        }
        NumberFormat decimalLocal = NumberFormat.getNumberInstance(Locale.US);
        decimalLocal.setMaximumFractionDigits(casas);
        decimalLocal.setMinimumFractionDigits(casas);
        decimalLocal.setGroupingUsed(false);
        return decimalLocal.format(valor);
    }

    public static String decimal(double valor) {
        return DECIMAL.format(valor);
    }
    
    public static String decimal(Number valor) {
        if (valor == null) {
            valor = 0d;
        }
        return DECIMAL.format(valor);
    }
    
    public static String decimal(Double valor, int casas) {
        if (valor == null) {
            valor = 0d;
        }
        NumberFormat decimalLocal = NumberFormat.getNumberInstance();
        decimalLocal.setMaximumFractionDigits(casas);
        decimalLocal.setMinimumFractionDigits(casas);
        decimalLocal.setGroupingUsed(false);
        return decimalLocal.format(valor);
    }

    public static double getDouble(String text) {
        if(text==null || "".equals(text)) {
            return 0d;
        } else {
            text = text.replace(",", ".");
            double valor = 0d;
            try {
                valor = DECIMAL_BANCO.parse(text).doubleValue();
            } catch(NumberFormatException ex) {
                ex.printStackTrace(System.err);
            } finally {
                return valor;
            }
        }
    }

    public static int getIntegerNullSafe(String string) {
        if(string==null || "".equals(string.trim())) {
            return 0;
        }
        int valor = 0;
        try {
            valor = Integer.parseInt(string);
        } catch(Exception ex) {
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "Erro de formatacao", ex);
        }
        return valor;
    }

    public static long getLongNullSafe(String string) {
        if(string==null || "".equals(string.trim())) {
            return 0;
        }
        long valor = 0;
        try {
            valor = Long.parseLong(string);
        } catch(Exception ex) {
            Logger.getLogger(Logger.GLOBAL_LOGGER_NAME).log(Level.INFO, "Erro de formatacao", ex);
        }
        return valor;
    }
    
     public static String getNullSafeForUI(Number number) {
        if (number == null) {
            return "";
        }
        
        if(number instanceof Float || number instanceof Double || number instanceof BigDecimal) {
            return decimal(number.doubleValue());
        } else {
            return Long.toString(number.longValue());
        }
    }

    public static int modulo11(String campo) {
        return modulo11(campo, 9);
    }

    public static int modulo11(String campo, int type) {
        int multiplicador = 2;
        int multiplicacao = 0;
        int soma_campo = 0;

        for (int i = campo.length(); i > 0; i--) {
            multiplicacao = Integer.parseInt(campo.substring(i - 1, i)) * multiplicador;

            soma_campo = soma_campo + multiplicacao;

            multiplicador++;
            if (multiplicador > 7 && type == 7) {
                multiplicador = 2;
            } else if (multiplicador > 9 && type == 9) {
                multiplicador = 2;
            }
        }

        int dac = 11 - (soma_campo % 11);

        if (dac > 9 && type == 7) {
            dac = 0;
        } else if ((dac == 0 || dac == 1 || dac > 9) && type == 9) {
            dac = 1;
        }

        return dac;
    }

}
