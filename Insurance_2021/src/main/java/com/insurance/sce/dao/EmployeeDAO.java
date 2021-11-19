package com.insurance.sce.dao;

import java.util.ArrayList;

import com.insurance.sce.model.employee.Employee;

public interface EmployeeDAO {
	public boolean insert(Employee employee);
	public ArrayList<Employee> select();
	public Employee selectEmployee(String employeeId);
	public Employee selectEmployeeByIdPw(String employeeId, String password);
	public Employee selectSlaesPerson(String employeeId);
	public ArrayList<Employee> selectSlaesPersons();
	public boolean updateSaleHistory(String employeeId);
	public boolean delete(String employeeId);
}
