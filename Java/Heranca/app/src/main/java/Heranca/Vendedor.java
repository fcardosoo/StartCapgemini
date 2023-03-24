/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Heranca;


/**
 *
 * @author d311r
 */
public class Vendedor extends Funcionario{
    
    private int totalItensVendidos;
    private float comissaoPorItem;
    
    public Vendedor(){
        super();
    }
    
    public float calcularSalario(){
        return super.getSalario() + (this.comissaoPorItem * totalItensVendidos);
    }

    
    public int getTotalItensVendidos() {
        return totalItensVendidos;
    }

    public void setTotalItensVendidos(int totalItensVendidos) {
        this.totalItensVendidos = totalItensVendidos;
    }

    public float getComissaoPorItem() {
        return comissaoPorItem;
    }

    public void setComissaoPorItem(float comissaoPorItem) {
        this.comissaoPorItem = comissaoPorItem;
    }
    
    
}