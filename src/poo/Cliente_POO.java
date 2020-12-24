/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package poo;

/**
 *
 * @author Thiago
 */
public class Cliente_POO extends Pessoa_POO {

    public static void main(String[] args) {

        Carro_POO c = new Carro_POO();
        c.carro_modelo();
        c.carro_cor();
        c.carro_ano();
        c.mostrar_info_carro();

        Cliente_POO e = new Cliente_POO();
        e.cliente_nome();
        e.cliente_idade();
        e.cliente_cpf();
        e.cliente_salario();
        e.cliente_compra();
        e.calcular_desconto();
        e.mostrar_info_cli();
    }
}
