package com.company.wenda.service;

import com.company.wenda.mapper.QuestionMapper;
import com.company.wenda.model.Question;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class QuestionService {
    @Autowired
    QuestionMapper questionMapper;

    public List<Question> getLatestQuestions(int userId, int offset, int limit) {
        return questionMapper.selectLatestQuestions(userId, offset, limit);
    }
}
