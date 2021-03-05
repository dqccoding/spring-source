package test.mixin;

import org.springframework.context.ApplicationContext;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class TestMain {
	public static void main(String[] args) {
		ApplicationContext context = new AnnotationConfigApplicationContext(TestConfig.class);
		Object name = context.getBean("name");
		System.out.println(name);
	}
}
