/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Exercicio04POO;

/**
 *
 * @author d311r
 */
public class Invoice {
    
    private int codigoItem;
    private String descricaoItem;
    private int quantidadeComprada;
    private float precoUnit;

    public Invoice(int codigoItem, String descricaoItem, int quantidadeComprada, float precoUnit) {
        this.codigoItem = codigoItem;
        this.descricaoItem = descricaoItem;
        
        if (quantidadeComprada < 0){
            this.quantidadeComprada = 0;
        } else{
            this.quantidadeComprada = quantidadeComprada;
        }
        
        if(precoUnit < 0){
            this.precoUnit = 0;
        } else {
            this.precoUnit = precoUnit;
        }        
    }

    public int getCodigoItem(){
        return codigoItem;
    }
    
    public void setCodigoItem(int codigoItem){
        this.codigoItem = codigoItem;
    }

    public String getDescricaoItem() {
        return descricaoItem;
    }

    public void setDescricaoItem(String descricaoItem) {
        this.descricaoItem = descricaoItem;
    }

    public int getQuantidadeComprada() {
        return quantidadeComprada;
    }

    public void setQuantidadeComprada(int quantidadeComprada) {
        this.quantidadeComprada = quantidadeComprada;
    }

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {
        this.precoUnit = precoUnit;
    }
    
    
}
