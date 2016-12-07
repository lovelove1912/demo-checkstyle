package service;

import java.util.List;

import model.Biller;

public interface BillerService {
    Biller readBiller(String billerCode);
    Biller updateBiller(Biller biller);
    void deleteBiller(Biller biller);
    List<Biller> searchBiller(String keyword);
}
