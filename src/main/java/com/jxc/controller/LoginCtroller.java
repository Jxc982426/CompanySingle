package com.jxc.controller;

import com.jxc.pojo.*;
import com.jxc.service.EmployeeService;
import com.jxc.service.ManagerService;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.List;

@Controller
public class LoginCtroller {
    @Setter
    @Autowired
    private ManagerService managerService;
    @Setter
    @Autowired
    private EmployeeService employeeService;
    @RequestMapping("/login")
    public String login(String userType, String userName, String password, HttpSession session) {

        if (userType.equals("admin")) {
            Manager manager = new Manager();
            manager.setMname(userName);
            ManagerExample example = new ManagerExample();
            example.createCriteria().andMnameEqualTo(userName).andMpasswordEqualTo(password);
            List<Manager> a = managerService.selectByExample(example);
            if (!a.isEmpty()) {
                session.setAttribute("currentUser", a.get(0).getMname());
                session.setAttribute("id", a.get(0).getMid());
                return "mainAdmin";
            }
        }
        if (userType.equals("manager")) {
            Employee employee = new Employee();
            employee.setEname(userName);
            EmployeeExample example = new EmployeeExample();
            example.createCriteria().andEnameEqualTo(userName).andEpasswordEqualTo(password);
            List<Employee> a = employeeService.selectByExample(example);
            if (!a.isEmpty()) {
                session.setAttribute("currentUser", a.get(0).getEname());
                session.setAttribute("id", a.get(0).getEno());
                return "mainManager";
            }
        }
        return "index";
    }
}
