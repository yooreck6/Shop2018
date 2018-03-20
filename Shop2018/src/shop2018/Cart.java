/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.Collection;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Cart {
    private Map<Product,Integer> map = new HashMap();
    
    public void add(Product p)
    {
       if (map.containsKey(p))
       {
           int i = map.get(p);
           i++;
           map.put(p,i);
       }
       else
       {
           map.put(p,1);
       }
    }
    
    public BigDecimal toPay()
    {
        BigDecimal sum = BigDecimal.ZERO;
        for(Product p : map.keySet())
        {
            int ilosc = map.get(p);
            sum = sum.add(p.getPrice().multiply(new BigDecimal(ilosc)));
        }
        return sum;
    }
    
    public Collection<Product> getProducts()
    {
        return map.keySet();
    }
    
    public int getCount(Product p)
    {
        return map.get(p);
    }
    
    public String toString()
    {
        return map.toString()+" "+toPay();
    }
}
