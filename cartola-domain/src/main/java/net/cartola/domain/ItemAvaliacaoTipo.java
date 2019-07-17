/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.cartola.domain;

/**
 * 16/12/2016 10:09:39
 * @author Francisco Assis
 */
public enum ItemAvaliacaoTipo {
    PESSIMO, RUIM, BOM, OTIMO, EXCELENTE;
    
    public static double getPontuacaoAvaliacao(ItemAvaliacaoTipo ava){
        switch(ava){
            case PESSIMO: return 0;
            case RUIM: return 3;
            case BOM: return 6;
            case OTIMO: return 8;
            case EXCELENTE: return 10;
            default: return -1;
        }
    }
}
