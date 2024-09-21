package com.reed0ne.aula;

import com.reed0ne.aula.entities.Employee;
import com.reed0ne.aula.services.SalaryService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.CommandLineRunner;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

@SpringBootApplication
public class AulaApplication implements CommandLineRunner {
	@Autowired
	private SalaryService salaryService;

	public static void main(String[] args) {
		SpringApplication.run(AulaApplication.class, args);
	}

	@Override
	public void run(String... args) throws Exception {
		System.out.println(salaryService.netSalary(new Employee("Maria", 4000.00)));
	}
}
