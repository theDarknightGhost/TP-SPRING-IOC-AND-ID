package presentation;

import dao.IDao;
import dao.IdaoImpl;
import metier.IMetier;
import metier.MetierImp;

public class InstanciationStatique {
    public static void main(String[] args) {
        MetierImp ob = new MetierImp();
        IdaoImpl dao = new IdaoImpl();
        ob.setDao(dao);
        System.out.println(ob.calcule()) ;
    }
}
