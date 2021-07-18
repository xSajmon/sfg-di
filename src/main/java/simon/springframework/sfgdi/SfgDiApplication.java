package simon.springframework.sfgdi;

import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;
import org.springframework.context.ApplicationContext;
import simon.springframework.sfgdi.controllers.ConstructorInjectedController;
import simon.springframework.sfgdi.controllers.MyController;
import simon.springframework.sfgdi.controllers.PropertyInjectedController;
import simon.springframework.sfgdi.controllers.SetterInjectedController;

import java.lang.reflect.Constructor;

@SpringBootApplication
public class SfgDiApplication {

	public static void main(String[] args) {

		ApplicationContext ctx  = SpringApplication.run(SfgDiApplication.class, args);

		MyController myController  = (MyController) ctx.getBean("myController");

		String greeting = myController.sayHello();
		System.out.println(greeting);


		System.out.println("-------- Property");

		PropertyInjectedController propertyInjectedController = (PropertyInjectedController) ctx.getBean("propertyInjectedController");
		System.out.println(propertyInjectedController.getGreeting());


		System.out.println("--------- Setter");
		SetterInjectedController setterInjectedController = (SetterInjectedController) ctx.getBean("setterInjectedController");
		System.out.println(setterInjectedController.getGreeting());

		System.out.println("--------- Constructor");
		ConstructorInjectedController constructorInjectedController = (ConstructorInjectedController) ctx.getBean("constructorInjectedController");
		System.out.println(constructorInjectedController.getGreeting());
	}

}
