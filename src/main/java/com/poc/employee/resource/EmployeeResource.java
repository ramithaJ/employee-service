package com.poc.employee.resource;


import com.poc.employee.config.Config;
import com.poc.employee.model.Employee;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("v1")
public class EmployeeResource {


    @Autowired
    private Config config;


    @Value("${username}")
    private String userName;


    @Value("${password}")
    private String password;


    @RequestMapping(path = "/employee", method = RequestMethod.GET)
    public ResponseEntity<Employee> getEmployee(){


        Employee employee = new Employee();
        employee.setName(config.getMessage());

        System.out.println(config.getMessage());

        System.out.println(" user name from  secret " + userName);
        System.out.println(" password from  secret " + password);


        return  new ResponseEntity<Employee>(employee,HttpStatus.OK);
    }
}
