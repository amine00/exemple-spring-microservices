package com.ataha.organization.client;

import java.util.List;

import org.springframework.cloud.openfeign.FeignClient;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;

import com.ataha.organization.model.Employee;

@FeignClient(name = "employee-service")
public interface EmployeeClient {

	@GetMapping("/employee/organization/{organizationId}")
	List<Employee> findEmployeesByOrganizationId(@PathVariable("organizationId") Long organizationId);
}