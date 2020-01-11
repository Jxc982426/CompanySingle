package com.jxc.controller;

import com.jxc.pojo.*;
import com.jxc.service.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.security.SignedObject;
import java.time.LocalDateTime;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("employee")
public class EmployeeController {

    @Autowired
    @Setter
    EmployeeService employeeService;
    @Autowired
    @Setter
    DeptService deptService;

    @Autowired
    @Setter
    BusinessService businessService;
    @Autowired
    @Setter
    SignService signService;
    @Autowired
    @Setter
    AskleaveService askleaveService;
    @Autowired
    @Setter
    AttendanceService attendanceService;
    @Autowired
    @Setter
    SalaryService salaryService;


    @RequestMapping("blank")
    public String blank() {

        return "mainManager";
    }

    @RequestMapping("business")
    public String business(Model model, HttpSession session) {

        BusinessExample example = new BusinessExample();
        example.createCriteria().andEnoEqualTo((Integer) session.getAttribute("id"));

        model.addAttribute("studentList", businessService.selectByExample(example));

        model.addAttribute("mainPage", "dormManager/business.jsp");
        return "mainManager";
    }

    @RequestMapping("sign")
    public String sign(Model model, HttpSession session) {

        SignExample example = new SignExample();
        example.createCriteria().andEnoEqualTo((Integer) session.getAttribute("id"));

        model.addAttribute("studentList", signService.selectByExample(example));
        model.addAttribute("mainPage", "dormManager/sign.jsp");
        return "mainManager";
    }

    @RequestMapping("signadd")
    public String signadd(Model model, HttpSession session) {
        Date n = new Date();
        Sign sign = new Sign();
        sign.setFirstsign(n);
        LocalDateTime localDateTime = LocalDateTime.now();
        if (localDateTime.getHour() >= 23) {
            sign.setLate("1");
        } else {
            sign.setLate("0");
        }
        session.setAttribute("date", n);
        sign.setEno((int) session.getAttribute("id"));
        sign.setSignweek(n.getDay());
        sign.setSigndate(n);
        SignExample example = new SignExample();
        example.createCriteria().andSigndateEqualTo(n);
        if (signService.selectByExample(example).size() == 0) {
            signService.insertSelective(sign);
            model.addAttribute("error", "打卡成功！");
        } else {
            model.addAttribute("error", "打卡失败！");
        }
        model.addAttribute("mainPage", "dormManager/sign.jsp");
        return "redirect:sign";
    }

    @RequestMapping("signadd2")
    public String signadd2(Model model, HttpSession session) {
        Date n = new Date();
        Sign sign = new Sign();
        SignExample example = new SignExample();
        sign.setLastsign(n);
        LocalDateTime localDateTime = LocalDateTime.now();
        if (localDateTime.getHour() <= 13) {
            sign.setLeaveearly("1");
        } else {
//            sign.setLate("0");
            sign.setLeaveearly("0");
        }
        int id = (int) session.getAttribute("id");
        example.createCriteria().andEnoEqualTo(id).andSigndateEqualTo((Date) session.getAttribute("date"));
        signService.updateByExampleSelective(sign, example);
        model.addAttribute("error", "打卡成功！");
        model.addAttribute("mainPage", "dormManager/sign.jsp");
        return "redirect:sign";
    }

    @RequestMapping("attendance")
    public String attendance(Model model, HttpSession session) {
        AttendanceExample example = new AttendanceExample();
        example.createCriteria().andEnoEqualTo((Integer) session.getAttribute("id"));

        model.addAttribute("recordList", attendanceService.selectByExample(example));
        model.addAttribute("mainPage", "dormManager/attendance.jsp");
        return "mainManager";
    }

    @RequestMapping("salary")
    public String salary(Model model, HttpSession session) {
        SalaryExample example = new SalaryExample();
        example.createCriteria().andEnoEqualTo((Integer) session.getAttribute("id"));

        model.addAttribute("studentList", salaryService.selectByExample(example));
        model.addAttribute("mainPage", "dormManager/salary.jsp");
        return "mainManager";
    }

    @RequestMapping("askLeave")
    public String askLeave(Model model, HttpSession session) {
        AskleaveExample example = new AskleaveExample();
        example.createCriteria().andEnoEqualTo((Integer) session.getAttribute("id"));

        model.addAttribute("askleaveList", askleaveService.selectByExample(example));
        model.addAttribute("mainPage", "dormManager/askLeave.jsp");
        return "mainManager";
    }

    @RequestMapping("password")
    public String password(Model model) {

        model.addAttribute("mainPage", "dormManager/passwordChange.jsp");
        return "mainManager";
    }

    @RequestMapping("passwordchange")
    public String passwordchange(String oldPassword, String newPassword, Model model, HttpSession session) {
        int id = (int) session.getAttribute("id");
        Employee a = employeeService.selectByPrimaryKey(id);
        int b = 0;
        if (a.getEpassword().equals(oldPassword)) {
            a.setEno(id);
            a.setEpassword(newPassword);
            b = employeeService.updateByPrimaryKeySelective(a);
        }
        if (b != 0) {
            model.addAttribute("error", "成功！！！");
        } else {
            model.addAttribute("error", "失败！！！");
        }
        model.addAttribute("mainPage", "dormManager/passwordChange.jsp");
        return "mainManager";
    }


    //    @RequestMapping("")
//    public String  (){
//
//        return "";
//    }
//    @RequestMapping("")
//    public String  (){
//
//        return "";
//    }
//
    @RequestMapping("askLeaveselect")
    public String askLeaveselect(int select, String selectop, Model model) {
        AskleaveExample example = new AskleaveExample();
        switch (selectop) {
            case "lno":
                example.createCriteria().andLnoEqualTo(select);
                break;
            case "eno":
                example.createCriteria().andEnoEqualTo(select);
                break;
            case "dno":
                example.createCriteria().andDnoEqualTo(select);
                break;
        }
        model.addAttribute("recordList", askleaveService.selectByExample(example));
        model.addAttribute("mainPage", "dormManager/askLeave.jsp");
        return "mainManager";
    }


    @RequestMapping("attendanceselect")
    public String attendanceselect(int select, Model model) {
        AttendanceExample example = new AttendanceExample();
        example.createCriteria().andEnoEqualTo(select);
        List<Attendance> a = attendanceService.selectByExample(example);
        System.out.println(a);
        model.addAttribute("dormBuildList", a);
        model.addAttribute("mainPage", "dormManager/attendance.jsp");
        return "mainManager";
    }

    @RequestMapping("businessselect")
    public String businessselect(int select, String selectop, Model model) {
        BusinessExample example = new BusinessExample();
        switch (selectop) {
            case "eno":
                example.createCriteria().andEnoEqualTo(select);
                break;
            case "bno":
                example.createCriteria().andBnoEqualTo(select);
                break;
            case "dno":
                example.createCriteria().andDnoEqualTo(select);
                break;
        }
        model.addAttribute("studentList", businessService.selectByExample(example));
        model.addAttribute("mainPage", "dormManager/business.jsp");
        return "mainManager";
    }


    @RequestMapping("salaryselect")
    public String salaryselect(int select, String selectop, Model model) {
        SalaryExample example = new SalaryExample();
        switch (selectop) {
            case "eno":
                example.createCriteria().andEnoEqualTo(select);
                break;
            case "sno":
                example.createCriteria().andSnoEqualTo(select);
                break;
            case "dno":
                example.createCriteria().andDnoEqualTo(select);
                break;
        }
        model.addAttribute("studentList", salaryService.selectByExample(example));
        model.addAttribute("mainPage", "dormManager/salary.jsp");
        return "mainManager";
    }

    @RequestMapping("askLeaveadd")
    public String askLeaveadd(Model model) {
        model.addAttribute("mainPage", "dormManager/askleaveSave.jsp");
        return "mainManager";
    }

    @RequestMapping("askLeavesave")
    public String askLeavesave(Model model, Askleave askleave, HttpSession session) {
        model.addAttribute("mainPage", "dormManager/askleaveSave.jsp");

        int id = (int) session.getAttribute("id");
        askleave.setEno(id);
        Employee a = employeeService.selectByPrimaryKey(askleave.getEno());
        askleave.setDno(a.getDno());
        askleave.setEname(a.getEname());

        Dept b = deptService.selectByPrimaryKey(askleave.getDno());
        askleave.setDname(b.getDname());

        int c = askleaveService.insert(askleave);


        if (c != 0) {
            model.addAttribute("error", "成功！！！");
        } else {
            model.addAttribute("error", "失败！！！");
        }
        model.addAttribute("mainPage", "dormManager/askleaveSave.jsp");
        return "mainManager";
    }

}
