package dao;
import org.springframework.stereotype.Component;

import java.util.Date ;
@Component("bd")
public class IdaoImpl implements IDao{
    @Override
    public Date getDate(){
        System.out.println("Version BD");
        return  new Date();
    }
}
