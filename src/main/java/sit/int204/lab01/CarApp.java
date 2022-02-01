package sit.int204.lab01;

import org.springframework.context.ApplicationContext;
import org.springframework.context.support.ClassPathXmlApplicationContext;
import sit.int204.lab01.beans.Car;
import sit.int204.lab01.beans.Counter;
import sit.int204.lab01.beans.GeometricShape;
import java.applet.AppletContext;

public class CarApp {
    public static void main(String[] args) {
        ApplicationContext context = new
                ClassPathXmlApplicationContext("ApplicationContext.xml");
//        Counter counter = (Counter)context.getBean("pCounter");
//        System.out.println(System.identityHashCode(counter));
//        counter.increment();
//        f1(context);
//        System.out.println(counter.getCount());
//        Car aCar = (Car) context.getBean("car");
//        aCar.start();
//        System.out.println(aCar);
//        System.out.println("----------------------------------");
//        Car bCar = (Car) context.getBean("carZ");
//        bCar.start();
//        System.out.println(bCar);
        GeometricShape circle = (GeometricShape) context.getBean("circle");
        GeometricShape rectangle = (GeometricShape) context.getBean("rectangle");
        System.out.println(circle);
        System.out.println(rectangle);
    }
    private static void f1(ApplicationContext context){
//        ApplicationContext context = new
//                ClassPathXmlApplicationContext("ApplicationContext.xml");
        Counter counter = (Counter)context.getBean("pCounter");
        counter.increment();
        counter.increment();
        System.out.println(System.identityHashCode(counter));
    }
}
