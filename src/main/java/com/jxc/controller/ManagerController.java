package com.jxc.controller;

import com.jxc.pojo.*;
import com.jxc.service.*;
import lombok.Setter;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;

import javax.servlet.http.HttpSession;
import java.util.Date;
import java.util.List;

@Controller
@RequestMapping("/mana")
public class ManagerController {
    @Autowired
    @Setter
    EmployeeService employeeService;

    @Autowired
    @Setter
    DeptService deptService;

    @Autowired
    @Setter
    ManagerService managerService;

    @Autowired
    @Setter
    TransferService transferService;

    @Autowired
    @Setter
    AttendanceService attendanceService;

    @Autowired
    @Setter
    AskleaveService askleaveService;

    @Autowired
    @Setter
    SalaryService salaryService;

    @Autowired
    @Setter
    BusinessService businessService;

    @RequestMapping("blank")
    public String blank() {
        return "mainAdmin";
    }

    @RequestMapping("askleave")
    public String askLeave(Model model, int page) {
        AskleaveExample example = new AskleaveExample();
        int totalNum = askleaveService.selectByExample(example).size();
        int currentPage = page;
        int pageSize = 5;
        example.setStartRow(currentPage * pageSize - pageSize);
        example.setPageSize(pageSize);
        example.createCriteria().andEnoIsNotNull();

//        System.out.println(totalNum + " " + currentPage + " " + pageSize);
        int totalPage = totalNum % pageSize == 0 ? totalNum / pageSize : totalNum / pageSize + 1;
        StringBuffer pageCode = new StringBuffer();
        pageCode.append("<li><a href='askleave?page=1'>首页</a></li>");
        if (currentPage == 1) {
//            pageCode.append("<li class='disabled'><a href='#'>上一页</a></li>");
        } else {
            pageCode.append("<li><a href='askleave?page=" + (currentPage - 1) + "'>上一页</a></li>");
        }
        for (int i = currentPage - 5; i <= currentPage + 5; i++) {
            if (i < 1 || i > totalPage) {
                continue;
            }
            if (i == currentPage) {
                pageCode.append("<li class='active'><a href='#'>" + i + "</a></li>");
            } else {
                pageCode.append("<li><a href='askleave?page=" + i + "'>" + i + "</a></li>");
            }
        }
        if (currentPage == totalPage) {
//            pageCode.append("<li class='disabled'><a href='#'>下一页</a></li>");
        } else {
            pageCode.append("<li><a href='askleave?page=" + (currentPage + 1) + "'>下一页</a></li>");
        }
        pageCode.append("<li><a href='askleave?page=" + totalPage + "'>尾页</a></li>");
        model.addAttribute("pageCode", pageCode.toString());
        model.addAttribute("askLeaveList", askleaveService.selectByExample(example));
        model.addAttribute("mainPage", "admin/askLeave.jsp");
        return "mainAdmin";
    }

    @RequestMapping("attendance")
    public String attendance(Model model, int page) {
        AttendanceExample example = new AttendanceExample();
        int totalNum = attendanceService.selectByExample(example).size();


        int currentPage = page;
        int pageSize = 5;
        example.setStartRow(currentPage * pageSize - pageSize);
        example.setPageSize(pageSize);
        example.createCriteria().andEnoIsNotNull();

//        System.out.println(totalNum + " " + currentPage + " " + pageSize);
        int totalPage = totalNum % pageSize == 0 ? totalNum / pageSize : totalNum / pageSize + 1;
        StringBuffer pageCode = new StringBuffer();
        pageCode.append("<li><a href='attendance?page=1'>首页</a></li>");
        if (currentPage == 1) {
//            pageCode.append("<li class='disabled'><a href='#'>上一页</a></li>");
        } else {
            pageCode.append("<li><a href='attendance?page=" + (currentPage - 1) + "'>上一页</a></li>");
        }
        for (int i = currentPage - 5; i <= currentPage + 5; i++) {
            if (i < 1 || i > totalPage) {
                continue;
            }
            if (i == currentPage) {
                pageCode.append("<li class='active'><a href='#'>" + i + "</a></li>");
            } else {
                pageCode.append("<li><a href='attendance?page=" + i + "'>" + i + "</a></li>");
            }
        }
        if (currentPage == totalPage) {
//            pageCode.append("<li class='disabled'><a href='#'>下一页</a></li>");
        } else {
            pageCode.append("<li><a href='attendance?page=" + (currentPage + 1) + "'>下一页</a></li>");
        }
        pageCode.append("<li><a href='attendance?page=" + totalPage + "'>尾页</a></li>");
        model.addAttribute("pageCode", pageCode.toString());
        model.addAttribute("attendanceList", attendanceService.selectByExample(example));
        model.addAttribute("mainPage", "admin/attendance.jsp");
        return "mainAdmin";
    }

    @RequestMapping("business")
    public String business(Model model, int page) {
        BusinessExample example = new BusinessExample();
        int totalNum = businessService.selectByExample(example).size();
        int currentPage = page;
        int pageSize = 5;
        example.setStartRow(currentPage * pageSize - pageSize);
        example.setPageSize(pageSize);
        example.createCriteria().andEnoIsNotNull();

//        System.out.println(totalNum + " " + currentPage + " " + pageSize);
        int totalPage = totalNum % pageSize == 0 ? totalNum / pageSize : totalNum / pageSize + 1;
        StringBuffer pageCode = new StringBuffer();
        pageCode.append("<li><a href='business?page=1'>首页</a></li>");
        if (currentPage == 1) {
//            pageCode.append("<li class='disabled'><a href='#'>上一页</a></li>");
        } else {
            pageCode.append("<li><a href='business?page=" + (currentPage - 1) + "'>上一页</a></li>");
        }
        for (int i = currentPage - 5; i <= currentPage + 5; i++) {
            if (i < 1 || i > totalPage) {
                continue;
            }
            if (i == currentPage) {
                pageCode.append("<li class='active'><a href='#'>" + i + "</a></li>");
            } else {
                pageCode.append("<li><a href='business?page=" + i + "'>" + i + "</a></li>");
            }
        }
        if (currentPage == totalPage) {
//            pageCode.append("<li class='disabled'><a href='#'>下一页</a></li>");
        } else {
            pageCode.append("<li><a href='business?page=" + (currentPage + 1) + "'>下一页</a></li>");
        }
        pageCode.append("<li><a href='business?page=" + totalPage + "'>尾页</a></li>");
        model.addAttribute("pageCode", pageCode.toString());
        model.addAttribute("businessList", businessService.selectByExample(example));
        model.addAttribute("mainPage", "admin/business.jsp");
        return "mainAdmin";
    }

    @RequestMapping("employee")
    public String employee(Model model, int page) {
//        EmployeeExample example = new EmployeeExample();
//        example.createCriteria().andEnoGreaterThanOrEqualTo(1);
//        List<Employee> a = employeeService.selectByExample(example);
//        model.addAttribute("employeeList", a);
//        model.addAttribute("mainPage", "admin/employee.jsp");
//        return "mainAdmin";
        EmployeeExample example = new EmployeeExample();
        List<Employee> a = employeeService.selectByExample(example);

        int totalNum = a.size();
        int currentPage = page;
        int pageSize = 5;
        example.setStartRow(currentPage * pageSize - pageSize);
        example.setPageSize(pageSize);
        example.createCriteria().andEnoIsNotNull();
        a = employeeService.selectByExample(example);
//        System.out.println(totalNum + " " + currentPage + pageSize);
        int totalPage = totalNum % pageSize == 0 ? totalNum / pageSize : totalNum / pageSize + 1;
        StringBuffer pageCode = new StringBuffer();
        pageCode.append("<li><a href='employee?page=1'>首页</a></li>");
        if (currentPage == 1) {
            pageCode.append("<li class='disabled'><a href='#'>上一页</a></li>");
        } else {
            pageCode.append("<li><a href='employee?page=" + (currentPage - 1) + "'>上一页</a></li>");
        }
        for (int i = currentPage - 5; i <= currentPage + 5; i++) {
            if (i < 1 || i > totalPage) {
                continue;
            }
            if (i == currentPage) {
                pageCode.append("<li class='active'><a href='#'>" + i + "</a></li>");
            } else {
                pageCode.append("<li><a href='employee?page=" + i + "'>" + i + "</a></li>");
            }
        }
        if (currentPage == totalPage) {
            pageCode.append("<li class='disabled'><a href='#'>下一页</a></li>");
        } else {
            pageCode.append("<li><a href='employee?page=" + (currentPage + 1) + "'>下一页</a></li>");
        }
        pageCode.append("<li><a href='employee?page=" + totalPage + "'>尾页</a></li>");
        model.addAttribute("pageCode", pageCode.toString());

        model.addAttribute("employeeList", a);
        model.addAttribute("mainPage", "admin/employee.jsp");
        return "mainAdmin";
    }

    @RequestMapping("salary")
    public String salary(Model model, int page) {
        SalaryExample example = new SalaryExample();

        int totalNum = salaryService.selectByExample(example).size();
        int currentPage = page;
        int pageSize = 5;
        example.setStartRow(currentPage * pageSize - pageSize);
        example.setPageSize(pageSize);
        example.createCriteria().andEnoIsNotNull();

//        System.out.println(totalNum + " " + currentPage + " " + pageSize);
        int totalPage = totalNum % pageSize == 0 ? totalNum / pageSize : totalNum / pageSize + 1;
        StringBuffer pageCode = new StringBuffer();
        pageCode.append("<li><a href='salary?page=1'>首页</a></li>");
        if (currentPage == 1) {
//            pageCode.append("<li class='disabled'><a href='#'>上一页</a></li>");
        } else {
            pageCode.append("<li><a href='salary?page=" + (currentPage - 1) + "'>上一页</a></li>");
        }
        for (int i = currentPage - 5; i <= currentPage + 5; i++) {
            if (i < 1 || i > totalPage) {
                continue;
            }
            if (i == currentPage) {
                pageCode.append("<li class='active'><a href='#'>" + i + "</a></li>");
            } else {
                pageCode.append("<li><a href='salary?page=" + i + "'>" + i + "</a></li>");
            }
        }
        if (currentPage == totalPage) {
//            pageCode.append("<li class='disabled'><a href='#'>下一页</a></li>");
        } else {
            pageCode.append("<li><a href='salary?page=" + (currentPage + 1) + "'>下一页</a></li>");
        }
        pageCode.append("<li><a href='salary?page=" + totalPage + "'>尾页</a></li>");
        model.addAttribute("pageCode", pageCode.toString());
        model.addAttribute("salaryList", salaryService.selectByExample(example));
        model.addAttribute("mainPage", "admin/salary.jsp");
        return "mainAdmin";
    }

    @RequestMapping("transfer")
    public String transfer(Model model, int page) {
        TransferExample example = new TransferExample();
//        example.createCriteria().andEnoGreaterThanOrEqualTo(1);


        int totalNum = transferService.selectByExample(example).size();
        int currentPage = page;
        int pageSize = 5;
        example.setStartRow(currentPage * pageSize - pageSize);
        example.setPageSize(pageSize);
        example.createCriteria().andEnoIsNotNull();

//        System.out.println(totalNum + " " + currentPage + " " + pageSize);
        int totalPage = totalNum % pageSize == 0 ? totalNum / pageSize : totalNum / pageSize + 1;
        StringBuffer pageCode = new StringBuffer();
        pageCode.append("<li><a href='transfer?page=1'>首页</a></li>");
        if (currentPage == 1) {
//            pageCode.append("<li class='disabled'><a href='#'>上一页</a></li>");
        } else {
            pageCode.append("<li><a href='transfer?page=" + (currentPage - 1) + "'>上一页</a></li>");
        }
        for (int i = currentPage - 5; i <= currentPage + 5; i++) {
            if (i < 1 || i > totalPage) {
                continue;
            }
            if (i == currentPage) {
                pageCode.append("<li class='active'><a href='#'>" + i + "</a></li>");
            } else {
                pageCode.append("<li><a href='transfer?page=" + i + "'>" + i + "</a></li>");
            }
        }
        if (currentPage == totalPage) {
//            pageCode.append("<li class='disabled'><a href='#'>下一页</a></li>");
        } else {
            pageCode.append("<li><a href='transfer?page=" + (currentPage + 1) + "'>下一页</a></li>");
        }
        pageCode.append("<li><a href='transfer?page=" + totalPage + "'>尾页</a></li>");
        model.addAttribute("pageCode", pageCode.toString());


        model.addAttribute("transferList", transferService.selectByExample(example));
        model.addAttribute("mainPage", "admin/transfer.jsp");
        return "mainAdmin";
    }


    @RequestMapping("addEmployee")
    public String addEmployee(Model model) {
        DeptExample example = new DeptExample();
        model.addAttribute("dept", deptService.selectByExample(example));
        model.addAttribute("mainPage", "admin/employeeSave.jsp");
        return "mainAdmin";
    }

    @RequestMapping("attendanceadd")
    public String attendanceadd(Model model) {
        model.addAttribute("mainPage", "admin/attendanceSave.jsp");
        return "mainAdmin";
    }

    @RequestMapping("businessadd")
    public String businessadd(Model model) {
        model.addAttribute("mainPage", "admin/businessSave.jsp");
        return "mainAdmin";
    }

    @RequestMapping("transferadd")
    public String transferadd(Model model) {
        model.addAttribute("mainPage", "admin/transferSave.jsp");
        return "mainAdmin";
    }

    @RequestMapping("salaryadd")
    public String salaryadd(Model model) {
        model.addAttribute("mainPage", "admin/salarySave.jsp");
        return "mainAdmin";
    }


    @RequestMapping("save")
    public String save(Model model, Employee employee, HttpSession session) {
        employee.setHiredate(new Date());
        int a = 0;
        if (session.getAttribute("update") != null && (int) session.getAttribute("update") == 1) {
            a = employeeService.updateByPrimaryKeySelective(employee);
            session.setAttribute("update", 0);
        } else {
            a = employeeService.insertSelective(employee);
        }
        if (a != 0) {
            model.addAttribute("error", "employee操作成功！");
        } else {
            model.addAttribute("error", "employee操作失败！");
        }
        model.addAttribute("mainPage", "admin/employeeSave.jsp");
        return "mainAdmin";
    }

    @RequestMapping("attendancesave")
    public String attendancesave(Model model, Attendance attendance, HttpSession session) {
        AttendanceExample example = new AttendanceExample();
        example.createCriteria().andEnoEqualTo(attendance.getEno()).andDnoEqualTo(attendance.getDno());
        int a = 0;
        if (session.getAttribute("update") != null && (int) session.getAttribute("update") == 1) {
            a = attendanceService.updateByExampleSelective(attendance, example);
            session.setAttribute("update", 0);
        } else {
            a = attendanceService.insertSelective(attendance);
        }
        if (a != 0) {
            model.addAttribute("error", "attendance操作成功！");
        } else {
            model.addAttribute("error", "attendance操作失败！");
        }
        model.addAttribute("mainPage", "admin/attendanceSave.jsp");
        return "mainAdmin";
    }

    @RequestMapping("salarysave")
    public String salarysave(Model model, Salary salary, HttpSession session) {
        salary.setDno(employeeService.selectByPrimaryKey(salary.getEno()).getDno());
        int a = 0;
        if (session.getAttribute("update") != null && (int) session.getAttribute("update") == 1) {
            a = salaryService.updateByPrimaryKeySelective(salary);
            session.setAttribute("update", 0);
        } else {
            salaryService.insertSelective(salary);
        }
        if (a != 0) {
            model.addAttribute("error", "salary操作成功！");
        } else {
            model.addAttribute("error", "salary操作失败！");
        }
        model.addAttribute("mainPage", "admin/salarySave.jsp");
        return "mainAdmin";
    }

    @RequestMapping("businesssave")
    public String businesssave(Model model, Business business, HttpSession session) {
        int a = 0;
        if (session.getAttribute("update") != null && (int) session.getAttribute("update") == 1) {
            a = businessService.updateByPrimaryKeySelective(business);
            session.setAttribute("update", 0);
        } else {
            a = businessService.insertSelective(business);
        }
        if (a != 0) {
            model.addAttribute("error", "business操作成功！");
        } else {
            model.addAttribute("error", "business操作失败！");
        }
        model.addAttribute("mainPage", "admin/businessSave.jsp");
        return "mainAdmin";
    }

    @RequestMapping("transfersave")
    public String transfersave(Model model, Transfer transfer, HttpSession session) {
        int a = 0;
        EmployeeExample example = new EmployeeExample();
        example.createCriteria().andEnoEqualTo(transfer.getEno());
        Employee employee = employeeService.selectByPrimaryKey(transfer.getEno());
        if (transfer.getOlddno().equals(employee.getDno())) {
            employee.setDno(transfer.getNewdno());
            if (session.getAttribute("update") != null && (int) session.getAttribute("update") == 1) {
                employeeService.updateByExampleSelective(employee, example);
                a = transferService.updateByPrimaryKeySelective(transfer);
                session.setAttribute("update", 0);
            } else {
                employeeService.updateByExample(employee, example);
                a = transferService.insertSelective(transfer);
            }
        }
        if (a != 0) {
            model.addAttribute("error", "transfer操作成功！");
        } else {
            model.addAttribute("error", "transfer操作失败！");
        }
        model.addAttribute("mainPage", "admin/transferSave.jsp");
        return "mainAdmin";
    }

    @RequestMapping("delete")
    public String delete(Model model, int id) {

        int a = employeeService.deleteByPrimaryKey(id);
        model.addAttribute("mainPage", "admin/employee.jsp");
        if (a != 0) {
            model.addAttribute("error", "删除employee成功！");
        } else {
            model.addAttribute("error", "删除employee失败！");
        }
        return "redirect:employee?page=1";
    }

    @RequestMapping("attendancedelete")
    public String attendancedelete(int id, Model model) {
        AttendanceExample example = new AttendanceExample();
        example.createCriteria().andEnoEqualTo(id);
        int a = attendanceService.deleteByExample(example);
        if (a != 0) {
            model.addAttribute("error", "删除attendance成功！");
        } else {
            model.addAttribute("error", "删除attendance失败！");
        }
        return "redirect:attendance?page=1";
    }

    @RequestMapping("transferdelete")
    public String studentdelete(int id, Model model) {
        TransferExample example = new TransferExample();
        example.createCriteria().andTnoEqualTo(id);
        int a = transferService.deleteByExample(example);
        if (a != 0) {
            model.addAttribute("error", "删除transfer成功！");
        } else {
            model.addAttribute("error", "删除transfer失败！");
        }
        return "redirect:transfer?page=1";
    }

    @RequestMapping("businessdelete")
    public String businessdelete(int id, Model model) {
        BusinessExample example = new BusinessExample();
        example.createCriteria().andBnoEqualTo(id);
        int a = businessService.deleteByExample(example);
        if (a != 0) {
            model.addAttribute("error", "删除business成功！");
        } else {
            model.addAttribute("error", "删除business失败！");
        }
        return "redirect:business?page=1";
    }

    @RequestMapping("salarydelete")
    public String salarydelete(int id, Model model) {
        SalaryExample example = new SalaryExample();
        example.createCriteria().andSnoEqualTo(id);
        int a = salaryService.deleteByExample(example);
        if (a != 0) {
            model.addAttribute("error", "删除salary成功！");
        } else {
            model.addAttribute("error", "删除salary失败！");
        }
        return "redirect:salary?page=1";
    }

    @RequestMapping("recorddelete")
    public String recorddelete(int recordId, Model model) {
        AskleaveExample example = new AskleaveExample();
        example.createCriteria().andLnoEqualTo(recordId);
        Askleave askleave = new Askleave();
        askleave.setState("false");
        int a = askleaveService.updateByExampleSelective(askleave, example);
        if (a != 0) {
            model.addAttribute("error", "更新askleave状态成功！");
        } else {
            model.addAttribute("error", "更新askleave状态失败！");
        }
        return "redirect:askleave?page=1";
    }

    @RequestMapping("recordagree")
    public String recordagree(int recordId, Model model) {
        AskleaveExample example = new AskleaveExample();
        example.createCriteria().andLnoEqualTo(recordId);
        Askleave askleave = new Askleave();
        askleave.setState("true");
        int a = askleaveService.updateByExampleSelective(askleave, example);
        if (a != 0) {
            model.addAttribute("error", "更新askleave状态成功！");
        } else {
            model.addAttribute("error", "更新askleave状态失败！");
        }
        return "redirect:askleave?page=1";
    }


    @RequestMapping("attendanceupdate")
    public String attendanceupdate(Model model, int id, HttpSession session) {
        session.setAttribute("update", 1);
        AttendanceExample example = new AttendanceExample();
        example.createCriteria().andEnoEqualTo(id);
//        List<Attendance> a = attendanceService.selectByExample(example);
        Attendance a = attendanceService.selectByExample(example).get(0);
        model.addAttribute("attendanceupdate", a);
        model.addAttribute("mainPage", "admin/attendanceSave.jsp");
//        if (a != null) {
//            model.addAttribute("error", "更新attendance成功！");
//        } else {
//            model.addAttribute("error", "更新attendance失败！");
//        }
        return "mainAdmin";
    }

    @RequestMapping("employeeupdate")
    public String employeeupdate(Model model, int id, HttpSession session) {
        session.setAttribute("update", 1);
//        EmployeeExample example = new EmployeeExample();
//        example.createCriteria().andEnoEqualTo(id);
//        List<Employee> aa = employeeService.selectByExample(example);
//        Employee a = employeeService.selectByExample(example).get(0);
        Employee a = employeeService.selectByPrimaryKey(id);
        model.addAttribute("employeeupdate", a);
        model.addAttribute("mainPage", "admin/employeeSave.jsp");
        DeptExample example1 = new DeptExample();
        model.addAttribute("dept", deptService.selectByExample(example1));
//        if (a != null) {
//            model.addAttribute("error", "更新employee成功！");
//        } else {
//            model.addAttribute("error", "更新employee失败！");
//        }
        return "mainAdmin";
    }

    @RequestMapping("businessupdate")
    public String businessupdate(Model model, int id, HttpSession session) {
        session.setAttribute("update", 1);
//        BusinessExample example = new BusinessExample();
//        example.createCriteria().andEnoEqualTo(id);
//        List<Business> a = businessService.selectByExample(example);
        Business a = businessService.selectByPrimaryKey(id);
        model.addAttribute("businessupdate", a);
        model.addAttribute("mainPage", "admin/businessSave.jsp");

//        if (a != null) {
//            model.addAttribute("error", "更新business成功！");
//        } else {
//            model.addAttribute("error", "更新business失败！");
//        }
        return "mainAdmin";
    }

    @RequestMapping("salaryupdate")
    public String salaryupdate(Model model, int id, HttpSession session) {
        session.setAttribute("update", 1);
//        SalaryExample example = new SalaryExample();
//        example.createCriteria().andSnoEqualTo(id);
//        List<Salary> a = salaryService.selectByExample(example);
//        model.addAttribute("salaryupdate", salaryService.selectByExample(example).get(0));
        Salary a = salaryService.selectByPrimaryKey(id);
        model.addAttribute("salaryupdate", a);
        model.addAttribute("mainPage", "admin/salarySave.jsp");

//        if (a != null) {
//            model.addAttribute("error", "更新salary成功！");
//        } else {
//            model.addAttribute("error", "更新salary失败！");
//        }
        return "mainAdmin";
    }

    @RequestMapping("transferupdate")
    public String transferupdate(Model model, int id, HttpSession session) {
        session.setAttribute("update", 1);
//        TransferExample example = new TransferExample();
//        example.createCriteria().andTnoEqualTo(id);
//        List<Transfer> a = transferService.selectByExample(example);
        Transfer a = transferService.selectByPrimaryKey(id);
        model.addAttribute("transferupdate", a);
        model.addAttribute("mainPage", "admin/transferSave.jsp");

//        if (a != null) {
//            model.addAttribute("error", "更新transfer成功！");
//        } else {
//            model.addAttribute("error", "更新transfer失败！");
//        }
        return "mainAdmin";
    }


    @RequestMapping("password")
    public String password(Model model, HttpSession session) {
        session.getAttribute("currentUser");
        model.addAttribute("mainPage", "admin/passwordChange.jsp");
        return "mainAdmin";
    }


//******************************

    @RequestMapping("select")
    public String select(String select, String selectop, Model model) {

        EmployeeExample example = new EmployeeExample();
        List<Employee> a = null;
        if (selectop.equals("eno")) {
            example.createCriteria().andEnoEqualTo(Integer.valueOf(select));
            a = employeeService.selectByExample(example);
        }
        if (selectop.equals("ename")) {
            example.createCriteria().andEnameLike("%" + select + "%");
            a = employeeService.selectByExample(example);
        }
        model.addAttribute("employeeList", a);
        model.addAttribute("mainPage", "admin/employee.jsp");
        return "mainAdmin";
    }

    @RequestMapping("attendanceselect")
    public String attendanceselect(int select, Model model) {
        AttendanceExample example = new AttendanceExample();
        example.createCriteria().andEnoEqualTo(select);
        List<Attendance> a = attendanceService.selectByExample(example);
        System.out.println(a);
        model.addAttribute("attendanceList", a);
        model.addAttribute("mainPage", "admin/attendance.jsp");
        return "mainAdmin";
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
        model.addAttribute("businessList", businessService.selectByExample(example));
        model.addAttribute("mainPage", "admin/business.jsp");
        return "mainAdmin";
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
        model.addAttribute("salaryList", salaryService.selectByExample(example));
        model.addAttribute("mainPage", "admin/salary.jsp");
        return "mainAdmin";
    }

    @RequestMapping("transferselect")
    public String transferselect(int select, String selectop, Model model) {
        TransferExample example = new TransferExample();

        switch (selectop) {
            case "eno":
                example.createCriteria().andEnoEqualTo(select);
                break;
            case "tno":
                example.createCriteria().andTnoEqualTo(select);
                break;
        }
        model.addAttribute("transferList", transferService.selectByExample(example));
        model.addAttribute("mainPage", "admin/transfer.jsp");
        return "mainAdmin";
    }

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
        model.addAttribute("askLeaveList", askleaveService.selectByExample(example));
        model.addAttribute("mainPage", "admin/askLeave.jsp");
        return "mainAdmin";
    }


    @RequestMapping("passwordchange")
    public String passwordchange(String oldPassword, String newPassword, HttpSession session, Model model) {
        int id = (int) session.getAttribute("id");
        Manager a = managerService.selectByPrimaryKey(id);
        int b = 0;
        if (a.getMpassword().equals(oldPassword)) {
            a.setMid(id);
            a.setMpassword(newPassword);
            b = managerService.updateByPrimaryKeySelective(a);
        }
        if (b != 0) {
            model.addAttribute("error", "密码修改成功！！！");
        } else {
            model.addAttribute("error", "密码修改失败！！！");
        }
        model.addAttribute("mainPage", "admin/passwordChange.jsp");
        return "mainAdmin";
    }
}
