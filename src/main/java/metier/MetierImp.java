package metier;

import dao.IDao;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

@Component
public class MetierImp implements IMetier{
    @Autowired @Qualifier("bd")
    private IDao dao ;
    @Override
    public double calcule() {

        return dao.getDate().getTime()*3;
    }

    public void setDao(IDao dao) {
        this.dao = dao;
    }
}
