package com.smartcoder.controller;


import com.smartcoder.common.Result;
import com.smartcoder.entity.Answer;
import com.smartcoder.service.AnswerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/answer")
public class AnswerController {

    @Autowired
    private AnswerService answerService;

    @RequestMapping("/auth/add")
    public Result addAnswer(@RequestBody Answer answer) {
        return answerService.addAnswer(answer);
    }

    @RequestMapping("/auth/adopt")
    public Result adoptAnswer(Integer answerId, Integer status, Integer taskId) {
        return answerService.adoptAnswer(answerId, status, taskId);
    }


}
