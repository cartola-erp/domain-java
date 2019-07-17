/*
 * StringUtil.java
 *
 * Created on 25 de Junho de 2007, 19:37
 *
 *
 *
 */
package net.cartola.util;

import java.util.Collection;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;
import java.util.Set;

/**
 *
 * @author TuvaniMM
 */
public final class StringUtil {

    public final static int ALINHAMENTO_ESQUERDA = 0;
    public final static int ALINHAMENTO_DIREITA = 1;
    private static final Map<Character, String> htmlIsoChars = new HashMap<Character, String>();
    private static final Map<String, Character> htmlIsoEntities = new HashMap<String, Character>();
    
    static {
        htmlIsoChars.put('”', "&quot;");
        htmlIsoChars.put('"', "&quot;");
        htmlIsoChars.put('\'',"&apos;");
//        htmlIsoChars.put('/', "&#47;");
//        htmlIsoChars.put('&', "&amp;");
        htmlIsoChars.put('<', "&lt;");
        htmlIsoChars.put('>', "&gt;");
//        htmlIsoChars.put(' ',"&nbsp;");
        htmlIsoChars.put('¡', "&iexcl;");
        htmlIsoChars.put('¢', "&cent;");
        htmlIsoChars.put('£', "&pound;");
        htmlIsoChars.put('¤', "&curren;");
        htmlIsoChars.put('¥', "&yen;");
        htmlIsoChars.put('¦', "&brvbar;");
        htmlIsoChars.put('§', "&sect;");
        htmlIsoChars.put('¨', "&uml;");
        htmlIsoChars.put('©', "&copy;");
        htmlIsoChars.put('ª', "&ordf;");
        htmlIsoChars.put('«', "&laquo;");
        htmlIsoChars.put('¬', "&not;");
        htmlIsoChars.put('�',"&shy;");
        htmlIsoChars.put('®', "&reg;");
        htmlIsoChars.put('¯', "&macr;");
        htmlIsoChars.put('°', "&deg;");
        htmlIsoChars.put('±', "&plusmn;");
        htmlIsoChars.put('²', "&sup2;");
        htmlIsoChars.put('³', "&sup3;");
        htmlIsoChars.put('´', "&acute;");
        htmlIsoChars.put('µ', "&micro;");
        htmlIsoChars.put('¶', "&para;");
        htmlIsoChars.put('·', "&middot;");
        htmlIsoChars.put('¸', "&cedil;");
        htmlIsoChars.put('¹', "&sup1;");
        htmlIsoChars.put('º', "&ordm;");
        htmlIsoChars.put('»', "&raquo;");
        htmlIsoChars.put('¼', "&frac14;");
        htmlIsoChars.put('½', "&frac12;");
        htmlIsoChars.put('¾', "&frac34;");
        htmlIsoChars.put('¿', "&iquest;");
        htmlIsoChars.put('×', "&times;");
        htmlIsoChars.put('÷', "&divide;");
        htmlIsoChars.put('À', "&Agrave;");
        htmlIsoChars.put('Á', "&Aacute;");
        htmlIsoChars.put('Â', "&Acirc;");
        htmlIsoChars.put('Ã', "&Atilde;");
        htmlIsoChars.put('Ä', "&Auml;");
        htmlIsoChars.put('Å', "&Aring;");
        htmlIsoChars.put('Æ', "&AElig;");
        htmlIsoChars.put('Ç', "&Ccedil;");
        htmlIsoChars.put('È', "&Egrave;");
        htmlIsoChars.put('É', "&Eacute;");
        htmlIsoChars.put('Ê', "&Ecirc;");
        htmlIsoChars.put('Ë', "&Euml;");
        htmlIsoChars.put('Ì', "&Igrave;");
        htmlIsoChars.put('Í', "&Iacute;");
        htmlIsoChars.put('Î', "&Icirc;");
        htmlIsoChars.put('Ï', "&Iuml;");
        htmlIsoChars.put('Ð', "&ETH;");
        htmlIsoChars.put('Ñ', "&Ntilde;");
        htmlIsoChars.put('Ò', "&Ograve;");
        htmlIsoChars.put('Ó', "&Oacute;");
        htmlIsoChars.put('Ô', "&Ocirc;");
        htmlIsoChars.put('Õ', "&Otilde;");
        htmlIsoChars.put('Ö', "&Ouml;");
        htmlIsoChars.put('Ø', "&Oslash;");
        htmlIsoChars.put('Ù', "&Ugrave;");
        htmlIsoChars.put('Ú', "&Uacute;");
        htmlIsoChars.put('Û', "&Ucirc;");
        htmlIsoChars.put('Ü', "&Uuml;");
        htmlIsoChars.put('Ý', "&Yacute;");
        htmlIsoChars.put('Þ', "&THORN;");
        htmlIsoChars.put('ß', "&szlig;");
        htmlIsoChars.put('à', "&agrave;");
        htmlIsoChars.put('á', "&aacute;");
        htmlIsoChars.put('â', "&acirc;");
        htmlIsoChars.put('ã', "&atilde;");
        htmlIsoChars.put('ä', "&auml;");
        htmlIsoChars.put('å', "&aring;");
        htmlIsoChars.put('æ', "&aelig;");
        htmlIsoChars.put('ç', "&ccedil;");
        htmlIsoChars.put('è', "&egrave;");
        htmlIsoChars.put('é', "&eacute;");
        htmlIsoChars.put('ê', "&ecirc;");
        htmlIsoChars.put('ë', "&euml;");
        htmlIsoChars.put('ì', "&igrave;");
        htmlIsoChars.put('í', "&iacute;");
        htmlIsoChars.put('î', "&icirc;");
        htmlIsoChars.put('ï', "&iuml;");
        htmlIsoChars.put('ð', "&eth;");
        htmlIsoChars.put('ñ', "&ntilde;");
        htmlIsoChars.put('ò', "&ograve;");
        htmlIsoChars.put('ó', "&oacute;");
        htmlIsoChars.put('ô', "&ocirc;");
        htmlIsoChars.put('õ', "&otilde;");
        htmlIsoChars.put('ö', "&ouml;");
        htmlIsoChars.put('ø', "&oslash;");
        htmlIsoChars.put('ù', "&ugrave;");
        htmlIsoChars.put('ú', "&uacute;");
        htmlIsoChars.put('û', "&ucirc;");
        htmlIsoChars.put('ü', "&uuml;");
        htmlIsoChars.put('ý', "&yacute;");
        htmlIsoChars.put('þ', "&thorn;");
        htmlIsoChars.put('ÿ', "&yuml;");
        
        htmlIsoEntities.put("&quot;", '"');
        htmlIsoEntities.put("&apos;",'\'');
//        htmlIsoEntities.put("&#47;", '/');
//        htmlIsoEntities.put("&amp;", '&');
        htmlIsoEntities.put("&lt;", '<');
        htmlIsoEntities.put("&gt;", '>');
        htmlIsoEntities.put("&nbsp;",' ');
        htmlIsoEntities.put("&iexcl;", '¡');
        htmlIsoEntities.put("&cent;", '¢');
        htmlIsoEntities.put("&pound;", '£');
        htmlIsoEntities.put("&curren;", '¤');
        htmlIsoEntities.put("&yen;", '¥');
        htmlIsoEntities.put("&brvbar;", '¦');
        htmlIsoEntities.put("&sect;", '§');
        htmlIsoEntities.put("&uml;", '¨');
        htmlIsoEntities.put("&copy;", '©');
        htmlIsoEntities.put("&ordf;", 'ª');
        htmlIsoEntities.put("&laquo;", '«');
        htmlIsoEntities.put("&not;", '¬');
        htmlIsoEntities.put("&shy;",'�');
        htmlIsoEntities.put("&reg;", '®');
        htmlIsoEntities.put("&macr;", '¯');
        htmlIsoEntities.put("&deg;", '°');
        htmlIsoEntities.put("&plusmn;", '±');
        htmlIsoEntities.put("&sup2;", '²');
        htmlIsoEntities.put("&sup3;", '³');
        htmlIsoEntities.put("&acute;", '´');
        htmlIsoEntities.put("&micro;", 'µ');
        htmlIsoEntities.put("&para;", '¶');
        htmlIsoEntities.put("&middot;", '·');
        htmlIsoEntities.put("&cedil;", '¸');
        htmlIsoEntities.put("&sup1;", '¹');
        htmlIsoEntities.put("&ordm;", 'º');
        htmlIsoEntities.put("&raquo;", '»');
        htmlIsoEntities.put("&frac14;", '¼');
        htmlIsoEntities.put("&frac12;", '½');
        htmlIsoEntities.put("&frac34;", '¾');
        htmlIsoEntities.put("&iquest;", '¿');
        htmlIsoEntities.put("&times;", '×');
        htmlIsoEntities.put("&divide;", '÷');
        htmlIsoEntities.put("&Agrave;", 'À');
        htmlIsoEntities.put("&Aacute;", 'Á');
        htmlIsoEntities.put("&Acirc;", 'Â');
        htmlIsoEntities.put("&Atilde;", 'Ã');
        htmlIsoEntities.put("&Auml;", 'Ä');
        htmlIsoEntities.put("&Aring;", 'Å');
        htmlIsoEntities.put("&AElig;", 'Æ');
        htmlIsoEntities.put("&Ccedil;", 'Ç');
        htmlIsoEntities.put("&Egrave;", 'È');
        htmlIsoEntities.put("&Eacute;", 'É');
        htmlIsoEntities.put("&Ecirc;", 'Ê');
        htmlIsoEntities.put("&Euml;", 'Ë');
        htmlIsoEntities.put("&Igrave;", 'Ì');
        htmlIsoEntities.put("&Iacute;", 'Í');
        htmlIsoEntities.put("&Icirc;", 'Î');
        htmlIsoEntities.put("&Iuml;", 'Ï');
        htmlIsoEntities.put("&ETH;", 'Ð');
        htmlIsoEntities.put("&Ntilde;", 'Ñ');
        htmlIsoEntities.put("&Ograve;", 'Ò');
        htmlIsoEntities.put("&Oacute;", 'Ó');
        htmlIsoEntities.put("&Ocirc;", 'Ô');
        htmlIsoEntities.put("&Otilde;", 'Õ');
        htmlIsoEntities.put("&Ouml;", 'Ö');
        htmlIsoEntities.put("&Oslash;", 'Ø');
        htmlIsoEntities.put("&Ugrave;", 'Ù');
        htmlIsoEntities.put("&Uacute;", 'Ú');
        htmlIsoEntities.put("&Ucirc;", 'Û');
        htmlIsoEntities.put("&Uuml;", 'Ü');
        htmlIsoEntities.put("&Yacute;", 'Ý');
        htmlIsoEntities.put("&THORN;", 'Þ');
        htmlIsoEntities.put("&szlig;", 'ß');
        htmlIsoEntities.put("&agrave;", 'à');
        htmlIsoEntities.put("&aacute;", 'á');
        htmlIsoEntities.put("&acirc;", 'â');
        htmlIsoEntities.put("&atilde;", 'ã');
        htmlIsoEntities.put("&auml;", 'ä');
        htmlIsoEntities.put("&aring;", 'å');
        htmlIsoEntities.put("&aelig;", 'æ');
        htmlIsoEntities.put("&ccedil;", 'ç');
        htmlIsoEntities.put("&egrave;", 'è');
        htmlIsoEntities.put("&eacute;", 'é');
        htmlIsoEntities.put("&ecirc;", 'ê');
        htmlIsoEntities.put("&euml;", 'ë');
        htmlIsoEntities.put("&igrave;", 'ì');
        htmlIsoEntities.put("&iacute;", 'í');
        htmlIsoEntities.put("&icirc;", 'î');
        htmlIsoEntities.put("&iuml;", 'ï');
        htmlIsoEntities.put("&eth;", 'ð');
        htmlIsoEntities.put("&ntilde;", 'ñ');
        htmlIsoEntities.put("&ograve;", 'ò');
        htmlIsoEntities.put("&oacute;", 'ó');
        htmlIsoEntities.put("&ocirc;", 'ô');
        htmlIsoEntities.put("&otilde;", 'õ');
        htmlIsoEntities.put("&ouml;", 'ö');
        htmlIsoEntities.put("&oslash;", 'ø');
        htmlIsoEntities.put("&ugrave;", 'ù');
        htmlIsoEntities.put("&uacute;", 'ú');
        htmlIsoEntities.put("&ucirc;", 'û');
        htmlIsoEntities.put("&uuml;", 'ü');
        htmlIsoEntities.put("&yacute;", 'ý');
        htmlIsoEntities.put("&thorn;", 'þ');
        htmlIsoEntities.put("&yuml;", 'ÿ');
    }

    public static String preenche(int i, char caracter) {
        String aux = "";
        for (int j = 0; j < i; j++) {
            aux += caracter;
        }
        return aux;
    }

    /**
     * Creates a new instance of StringUtil
     */
    public static String prepareString(String aux) {
        if (aux == null) {
            aux = "";
        } else {
            if(aux.contains("”")) {
                aux = replace(aux, "”", "\"");
            }
            aux = replace(aux, "\\", "\\\\");
            aux = replace(aux, "\"", "\\\"");
        }
        return aux.trim();
    }

    public static String replace(String str, String pattern, String replace) {
        int s = 0;
        int e = 0;
        StringBuilder result = new StringBuilder();

        while ((e = str.indexOf(pattern, s)) >= 0) {
            result.append(str.substring(s, e));
            result.append(replace);
            s = e + pattern.length();
        }
        result.append(str.substring(s));
        return result.toString();
    }

    public static String ajusta(String aux, int tamanho, int alinhamento) {
        if (aux == null) {
            aux = espaco(tamanho);
        }

        if (aux.length() > tamanho) {
            aux = aux.substring(0, tamanho);
        } else if (aux.length() < tamanho) {
            if (alinhamento == 0) {
                aux += espaco(tamanho - aux.length());
            } else {
                aux = espaco(tamanho - aux.length()) + aux;
            }
        }
        return aux;
    }

    public static String ajusta(String aux, int tamanho, int alinhamento, char caracter) {
        if (aux == null) {
            aux = preenche(tamanho, caracter);
        }

        if (aux.length() > tamanho) {
            if (alinhamento == ALINHAMENTO_ESQUERDA) {
                aux = aux.substring(0, tamanho);
            } else {
                int tam = aux.length();
                aux = aux.substring(tam - tamanho, tam);
            }
        } else if (aux.length() < tamanho) {
            if (alinhamento == ALINHAMENTO_ESQUERDA) {
                aux += preenche(tamanho - aux.length(), caracter);
            } else {
                aux = preenche(tamanho - aux.length(), caracter) + aux;
            }
        }
        return aux;
    }

    public static String espaco(int i) {
        String aux = "";
        for (int j = 0; j < i; j++) {
            aux += " ";
        }
        return aux;
    }

    public static boolean isNull(String str) {
        return (str == null || str.trim().equals(""));
    }

    public static boolean isNotNull(String str) {
        return !isNull(str);
    }

    public static String noDeadKeysToUpperCase(String str) {
        if (isNull(str)) {
            return str;
        }
        return str.toUpperCase().replace("Á", "A")
                .replace("À", "A")
                .replace("Ã", "A")
                .replace("Ä", "A")
                .replace("Â", "A")
                .replace("Ç", "C")
                .replace("Ñ", "N")
                .replace("É", "E")
                .replace("Ê", "E")
                .replace("È", "E")
                .replace("Ë", "E")
                .replace("Í", "I")
                .replace("Ì", "I")
                .replace("Î", "I")
                .replace("Ï", "I")
                .replace("Ó", "O")
                .replace("Ò", "O")
                .replace("Ô", "O")
                .replace("Õ", "O")
                .replace("Ö", "O")
                .replace("Ú", "U")
                .replace("Ù", "U")
                .replace("Ü", "U")
                .replace("Û", "U")
                .replace("º", "o")
                .replace("&", "E")
                .replace("ª", "a");
    }

    public static String noSpecialKeys(String str) {
        return noSpecialKeys(str, null);
    }

    public static String noSpecialKeys(String str, String ignorados[]) {
        if (str == null) {
            return null;
        }
        String substituidos[][] = new String[][]{
            {"á", " "}, {",", " "}, {"á", " "}, {"-", " "}, {"&", "e"}, {"!", " "}, {"@", " "}, {"#", " "}, {"$", " "}, {"%", " "}, {"*", " "}, {"{", " "}, {"}", " "}, {"_", " "}, {"=", " "}, {"+", " "}, {"<", " "}, {">", " "}, {";", " "}, {":", " "}, {"á", " "} //,{"", " "}
            , {"}", " "}, {"[", " "}, {"]", " "}, {"|", " "}, {"'", " "}, {"`", " "}, {"^", " "}, {".", " "}, {"~", " "}, {"º", " "}};
        String aux = noDeadKeysToUpperCase(str);
        for (String[] substituicao : substituidos) {
            boolean naoIgnorada = true;
            if (ignorados != null) {
                for (String ignorado : ignorados) {
                    if (ignorado.equals(substituicao[0])) {
                        naoIgnorada = false;
                    }
                }
            }
            if (naoIgnorada) {
                aux = aux.replace(substituicao[0], substituicao[1]);
            }
        }
        return soEspacoSimples(aux).trim();
    }

    public static String somenteLetras(String string) {
        if (isNull(string)) {
            return string;
        }
        char[] characters = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char character : characters) {
            if (Character.isLetter(character)) {
                sb.append(character);
            }
        }
        return sb.toString();
    }

    public static String somenteNumeros(String string) {
        return somenteNumeros(string, null);
    }

    public static String somenteNumeros(String string, char... ignorados) {
        if (isNull(string)) {
            return string;
        }

        Set<Character> ignoradosSet = new HashSet<Character>();
        if (ignorados != null) {
            for (char c : ignorados) {
                ignoradosSet.add(c);
            }
        }
        char[] characters = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char character : characters) {
            if (ignorados != null) {
                if (ignoradosSet.contains(character)) {
                    sb.append(character);
                }
            }
            if (Character.isDigit(character)) {
                sb.append(character);
            }
        }
        return sb.toString();
    }

    public static String somenteNumerosELetras(String string) {
        return somenteNumerosELetras(string, false);
    }
    
    public static String somenteNumerosELetras(String string, boolean ignoraEspacos, char... ignorados) {
        if (isNull(string)) {
            return string;
        }
        Set<Character> ignoradosSet = new HashSet<Character>();
        if (ignorados != null) {
            for (char c : ignorados) {
                ignoradosSet.add(c);
            }
        }
        char[] characters = string.toCharArray();
        StringBuilder sb = new StringBuilder();
        for (char character : characters) {
            if (Character.isLetterOrDigit(character)
                    || (ignoradosSet.contains(character))
                    || (ignoraEspacos && Character.isSpaceChar(character))) {
                sb.append(character);
            }
        }
        return sb.toString();
    }

    /**
     * @see http://www.w3schools.com/tags/ref_entities.asp
     * @param string
     * @return
     * Class StringEntity
     * org.apache.http.entity.AbstractHttpEntity
     * org.apache.http.entity.StringEntity
     */
    public static String htmlIso8859encode(String string) {
        if(isNull(string)) {
            return string;
        }
        StringBuilder sb = new StringBuilder();
        for(char achar:string.toCharArray()) {
            if(htmlIsoChars.containsKey(achar)) {
                sb.append(htmlIsoChars.get(achar));
            } else {
                sb.append(achar);
            }
        }
        return sb.toString();
    }
    
    public static String htmlIso8859decode(String string) {
        if(isNull(string)) {
            return string;
        }
//        StringBuilder sb = new StringBuilder();
        for(String entity:htmlIsoEntities.keySet()) {
            if(string.contains(entity)) {
                string = string.replaceAll(entity, htmlIsoEntities.get(entity).toString());
            }
        }
        return string;
    }

    public static String ieInvalido(String ie) {
        if (ie.length() < 14) {
            ie = "";
        }
        return ie;
    }

    public static String limitaTamanho(String string, int tamanhoMaximo) {
        if (isNull(string)) {
            return string;
        }
        if (string.length() > tamanhoMaximo) {
            string = string.substring(0, tamanhoMaximo);
        }
        return string;
    }

    public static String notNull(String str) {
        return (str == null ? "" : str);
    }

    public static String soEspacoSimples(String astring) {
        if (astring == null) {
            return null;
        }
        while (astring.contains("\t")) {
            astring = astring.replace("\t", " ");
        }
        while (astring.contains("  ")) {
            astring = astring.replace("  ", " ");
        }
        return astring;
    }

    public static String soPrimeiraMaiuscula(String astring) {
        if (astring == null) {
            return null;
        }
        String palavras[] = astring.split(" ");
        StringBuilder sb = new StringBuilder();
        boolean primeira = true;
        for (String palavra : palavras) {
            if (primeira) {
                primeira = false;
            } else {
                sb.append(" ");
            }
            String tratada = soPrimeiraMaiusculaPalavra(palavra);
            sb.append(tratada);
        }
        return sb.toString();
    }

    public static String soPrimeiraMaiusculaPalavra(String astring) {
        if (astring == null) {
            return null;
        }
        String string = astring.toLowerCase();
        if (string.length() == 1) {
            return string;
        }
        if (string.equals("da") || string.equals("de") || string.equals("do")) {
            return string;
        }
        return (string.length() > 2 ? string.substring(0, 1).toUpperCase() + string.substring(1) : string);
    }

    public static String getCnpjFormatado(String cnpj) {
        if (cnpj != null && cnpj.length() == 14) {
            return cnpj.substring(0, 2) + "." + cnpj.substring(2, 5) + "." + cnpj.substring(5, 8) + "/"
                    + cnpj.substring(8, 12) + "-" + cnpj.substring(12, 14);
        }
        return cnpj;
    }

    public static String getCpfFormatado(String cpf) {
        if (cpf != null && cpf.length() == 11) {
            return cpf.substring(0, 3) + "." + cpf.substring(3, 6) + "." + cpf.substring(6, 9) + "-"
                    + cpf.substring(9, 11);
        }
        return cpf;
    }

    public static String toString(Collection<String> s) {
        StringBuilder sb = new StringBuilder();
        for (String as : s) {
            sb.append(as);
            sb.append("\n");
        }
        return sb.toString();
    }
    
    public static String asteriscoParaPorcentagem(String str) {
        if (str == null) {
            return null;
        }
        if (str.contains("*")) {
            return str.replaceAll("\\*", "%");
        } else {
            return str;
        }
    }
}
