package presentation;

import dao.IDao;
import metier.IMetier;

import java.io.File;
import java.lang.reflect.Method;
import java.util.Scanner;

public class InstanciationDynamique {
    public static void main(String[] args) throws Exception{
        // IDao doo =new IdaoImpl()
        Scanner sc = new Scanner(new File("config.txt"));
        String className1 = sc.nextLine() ;
        //System.out.println(className1);
        Class daoClass = Class.forName(className1);
        IDao daoOb = (IDao)daoClass.getConstructor().newInstance() ;
        String className2 = sc.nextLine() ;
       // System.out.println(className2);
        Class metierClass = Class.forName(className2);
        IMetier metier = (IMetier)metierClass.getConstructor().newInstance();
        Method setDao =metierClass.getDeclaredMethod("setDao",IDao.class);
        setDao.invoke(metier,daoOb) ;
        System.out.println(metier.calcule());


    }
}
