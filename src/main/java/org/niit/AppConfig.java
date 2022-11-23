package org.niit;

import org.springframework.context.annotation.Bean;

public class AppConfig {

    @Bean("EE")
    public Employee getEmployee(){
        Employee employee = new Employee();
        employee.setEmpId(123);
        employee.setEmpName("Aman");
        employee.setMobileNo("123654789");
        employee.setAddress("DELHI");
        return employee;
    }
    @Bean("first")
    public Department getDepartment(){
        return new Department(212,"HR");
    }

    @Bean("Second")
    public Department getDepartment2(){
        return new Department(500,"Library");
    }
}
