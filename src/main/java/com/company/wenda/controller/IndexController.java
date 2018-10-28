package com.company.wenda.controller;

import com.company.wenda.model.Question;
import com.company.wenda.model.ViewObject;
import com.company.wenda.service.QuestionService;
import com.company.wenda.service.Userservice;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;

import java.util.ArrayList;
import java.util.List;

@Controller
public class IndexController {
    @Autowired
    QuestionService questionService;
    @Autowired
    Userservice userservice;

    @RequestMapping(path ={"/",  "/index"}, method = RequestMethod.GET)

    public String index(Model model) {
        List<Question> questionList = questionService.getLatestQuestions(0, 0 ,10);
        List<ViewObject> vos = new ArrayList<>();
        for (Question question : questionList) {
            ViewObject vo = new ViewObject();
            vo.set("question", question);
            vo.set("user", userservice.getUserById(question.getUserId()));
            vos.add(vo);
        }
        model.addAttribute("vos", vos);
        return "index";
    }
}
