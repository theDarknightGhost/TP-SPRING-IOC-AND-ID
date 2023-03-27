package dao;

import org.springframework.stereotype.Component;

import java.util.Date;
@Component("ws")
public class IdaoImplV2 implements IDao{

    @Override
    public Date getDate() {
        System.out.println("la version de web Service");
        return new Date();
    }
}
