package com.pavithra.dropwizard.Services;

import com.pavithra.dropwizard.db.EmployeeDAO;
import com.pavithra.dropwizard.model.Employee;

import java.util.List;

public class EmployeeService {

    private EmployeeDAO employeeDAO;


    public EmployeeService(final EmployeeDAO employeeDAO) {
        this.employeeDAO = employeeDAO;
    }

    public List<Employee> getEmployee() {
        return this.employeeDAO.getEmployee();
    }

    public Object getEmploye(final String E_Id) {
        return this.employeeDAO.getEmploye(E_Id);
    }

}
