/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.math.BigDecimal;

/**
 *
 * @author Student
 */
public class Shop2018 {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Product chleb = new Product("chleb",new BigDecimal("2.2"));
        Product maslo = new Product("maslo", new BigDecimal("6.15"));
        Product mleko = new Product("mleko", new BigDecimal("1.9"));
        Product jogurt = new Product("jogurt", new BigDecimal("0.95"));
        
        Cart koszyk = new Cart();
        koszyk.add(maslo);
        koszyk.add(jogurt);
        koszyk.add(mleko);
        koszyk.add(chleb);
        koszyk.add(chleb);
        
        System.out.println(koszyk);
        
        Warehouse w = new Warehouse();
        System.out.println(w);
        w.doOrder(koszyk);
        System.out.println(w);
        
    }
    
}
