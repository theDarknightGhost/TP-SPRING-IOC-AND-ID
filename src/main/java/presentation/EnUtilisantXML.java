package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.support.AbstractXmlApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;

public class EnUtilisantXML {
    public static void main(String[] args) {
        ApplicationContext apx = new ClassPathXmlApplicationContext("spring.xml") ;
        IMetier metier = apx.getBean(IMetier.class) ;
        System.out.println(metier.calcule());

    }
}
