package com.kumu.springproject.Controler;

import org.springframework.stereotype.Controller;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;

import java.util.ArrayList;
import java.util.List;
import java.util.Map;

import com.kumu.springproject.Model.User;
import org.springframework.web.bind.annotation.ResponseBody;


@Controller
@RequestMapping(value = "/register")
public class RegisterController {
    @RequestMapping("Registration")

    public String viewRegistration(Map<String, Object> model) {
        User userForm = new User();
        model.put("userForm", userForm);

        List<String> professionList = new ArrayList<>();
        professionList.add("Teacher");
        professionList.add("Doctor");
        professionList.add("Engineer");
        model.put("professionList", professionList);

        return "Registration.jsp";
    }

    @RequestMapping(method = RequestMethod.POST)
    public String processRegistration(@ModelAttribute("userForm") User user,
                                      Map<String, Object> model) {

        System.out.println("username: " + user.getUsername());
        System.out.println("password: " + user.getPassword());
        System.out.println("email: " + user.getEmail());
        System.out.println("birth date: " + user.getBirthDate());
        System.out.println("profession: " + user.getProfession());

        return "RegistrationSuccess.jsp";
    }
}

