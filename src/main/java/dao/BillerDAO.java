package dao;

import java.util.ArrayList;
import java.util.List;

import model.Biller;

public class BillerDAO {
    public List<Biller> readBillerList() {
        long currentTime = System.currentTimeMillis();
        List<Biller> billerList = new ArrayList<>();
        if (currentTime % 2 != 0) {
            billerList.add(new Biller());
        }
        else {
            billerList.add(new Biller());
            billerList.add(new Biller());
        }
        return billerList;
    }
    
    
    public Biller findBillerByCode(String billerCode) {
        if (billerCode == null || billerCode.length() == 0) {
            return null;
        }
        Biller biller = new Biller();
        
        return biller;
    }
    
    public Biller save(Biller biller) throws IllegalArgumentException{
        if (biller == null) {
            throw new IllegalArgumentException();
        }
        
        return biller;
    }
    
    public void delete(Biller biller) {
        if (biller != null) {
            return;
        }
    }
    
}
