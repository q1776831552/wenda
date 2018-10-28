package com.company.wenda;

import com.company.wenda.mapper.QuestionMapper;
import com.company.wenda.mapper.UserMapper;
import com.company.wenda.model.Question;
import com.company.wenda.model.User;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;

import org.springframework.boot.test.SpringApplicationConfiguration;
import org.springframework.test.context.jdbc.Sql;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

import java.util.Date;
import java.util.Random;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringApplicationConfiguration(classes = WendaApplication.class)


public class InitDatabaseTests {
    @Autowired
    UserMapper userMapper;
    @Autowired
    QuestionMapper questionMapper;
    @Test
    public void contextLoads() {

       /* for (int i = 1; i <= 10; i++) {
            Question question = new Question();
            question.setCommentCount(i);
            question.setContent(String.format("balabalala... content %d", i));
            question.setId(i);
            question.setTitle(String.format("title%d", i));
            question.setUserId(i);
            Date date = new Date();
            date.setTime(date.getTime() + 3600 * 1000 * 5 * i);
            question.setCreatedDate(date);
            questionMapper.addQuestion(question);
        }*/
        System.out.println(questionMapper.selectLatestQuestions(0, 0, 10));

    }
}
