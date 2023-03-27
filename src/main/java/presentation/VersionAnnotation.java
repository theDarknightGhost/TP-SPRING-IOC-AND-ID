package presentation;

import metier.IMetier;
import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class VersionAnnotation {
    public static void main(String[] args) {
        ApplicationContext apx= new AnnotationConfigApplicationContext("dao","metier");
        IMetier metier = apx.getBean(IMetier.class) ;
        System.out.println(metier.calcule());
    }
}
