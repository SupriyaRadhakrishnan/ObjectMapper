package com.json.ObjectMapper;

import java.io.File;
import java.util.*;

import com.fasterxml.jackson.databind.JsonNode;
import com.fasterxml.jackson.databind.ObjectMapper;

public class JsonDemo {

	public static void main(String[] args) {
try {
    ObjectMapper objMap = new ObjectMapper();
    
//    Employee e1 = new Employee(1,"John","Sales","Manager");
//    Employee e2 = new Employee(2,"Sam","HR","Director");
//    
//    List<Employee> list = new ArrayList<Employee>();
//    list.add(e1);
//    list.add(e2);
//    
//    
//    objMap.writeValue(new File("target/emp.json"),list);
    
    String employeeJson = "{\"id\":1,\"name\":\"John\",\"department\":\"Sales\",\"designation\":\"Manager\"}";
//    Employee employee = objMap.readValue(employeeJson, Employee.class);
//    
//    	System.out.println("name : " + employee.getName());
    
    JsonNode jsnode = objMap.readTree(employeeJson);
    String empname = jsnode.get("name").asText();
    String empdept = jsnode.get("department").asText();
    
    System.out.println("name : " + empname + ".empdept : " + empdept);
 
}
catch(final Exception e)
{
	e.printStackTrace();
}

	}

}
