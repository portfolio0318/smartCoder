package com.smartcoder.entity.vo;

import com.smartcoder.entity.Answer;
import com.smartcoder.entity.Task;
import lombok.Data;

import java.util.List;

@Data
public class AnswerTaskDetail {
    private Task task;
    private List<Answer> answerList;
}
