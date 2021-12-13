package com.payroll.payrollservice.infrastructure;

import com.payroll.payrollservice.domain.Employee.Employee;
import com.payroll.payrollservice.domain.Employee.IEmployeeRepository;
import com.payroll.payrollservice.domain.Order.IOrderRepository;
import com.payroll.payrollservice.domain.Order.Order;
import com.payroll.payrollservice.domain.Order.Status;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.boot.CommandLineRunner;
import org.springframework.context.annotation.Bean;
import org.springframework.context.annotation.Configuration;

@Configuration
public class LoadDatabase {
    private static final Logger log = LoggerFactory.getLogger(LoadDatabase.class);

    @Bean
    public CommandLineRunner initDatabase(IEmployeeRepository employeeRepository, IOrderRepository orderRepository) {
        return args -> {

            employeeRepository.save(new Employee("Bilbo", "Baggins", "burglar"));
            employeeRepository.save(new Employee("Frodo", "Baggins", "thief"));
            employeeRepository.findAll().forEach(employee -> log.info("Preloaded " + employee));

            orderRepository.save(new Order("MacBook Pro", Status.COMPLETED));
            orderRepository.save(new Order("Iphone", Status.IN_PROGRESS));

            orderRepository.findAll().forEach(order -> log.info("Preloaded " + order));
        };
    }
}
