/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */

package net.cartola.domain;

/**
 * 16/12/2016 10:09:27
 * @author Francisco Assis
 */
public class ItemAvaliacao {
    private Long id;
    private Usuario usuario;
    private Item item;
    private ItemAvaliacaoTipo avaliacao;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }
    
    public Usuario getUsuario() {
        return usuario;
    }

    public void setUsuario(Usuario usuario) {
        this.usuario = usuario;
    }

    public Item getItem() {
        return item;
    }

    public void setItem(Item item) {
        this.item = item;
    }

    public ItemAvaliacaoTipo getAvaliacao() {
        return avaliacao;
    }

    public void setAvaliacao(ItemAvaliacaoTipo avaliacao) {
        this.avaliacao = avaliacao;
    }
    
    
}
