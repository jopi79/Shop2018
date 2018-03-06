/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package shop2018;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;


public class Koszyk {
    private Map<Produkt,Integer> map = new HashMap();
    
    public void dodaj(Produkt p)
    {
        map.put(p, 1);
    }
    
    public BigDecimal doZaplaty()
    {
        BigDecimal sum = BigDecimal.ZERO;
        for(Produkt p : map.keySet())
        {
            int ilosc = map.get(p);
            sum = sum.add(p.getCena().multiply(new BigDecimal(ilosc)));
        }
        return sum;
    }
    
    public String toString()
    {
        return map.toString()+" "+doZaplaty();
    }
}
