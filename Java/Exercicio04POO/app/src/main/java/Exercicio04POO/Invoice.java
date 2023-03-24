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
        this.setCodigoItem(codigoItem);
        this.setDescricaoItem(descricaoItem);
        this.setPrecoUnit(precoUnit);
        this.setQuantidadeComprada(quantidadeComprada);
    }

    public double getInvoiceAmount() {
        return quantidadeComprada * precoUnit;
    }

    public int getCodigoItem() {
        return codigoItem;
    }

    public void setCodigoItem(int codigoItem) {
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
        if (quantidadeComprada < 0) {
            this.quantidadeComprada = 0;
        } else {
            this.quantidadeComprada = quantidadeComprada;
        }
    }

    public float getPrecoUnit() {
        return precoUnit;
    }

    public void setPrecoUnit(float precoUnit) {
        if (precoUnit < 0) {
            this.precoUnit = 0;
        } else {
            this.precoUnit = precoUnit;
        }
    }
}
