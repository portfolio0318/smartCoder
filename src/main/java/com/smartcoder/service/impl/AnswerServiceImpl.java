package com.smartcoder.service.impl;

import com.smartcoder.common.Result;
import com.smartcoder.entity.Answer;
import com.smartcoder.entity.Task;
import com.smartcoder.mapper.AnswerMapper;
import com.smartcoder.mapper.TaskMapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;

/**
 * <p>
 *  Answer service implementation class
 * </p>
 *
 * @author author
 * @since 2023-10-22
 */
@Service
public class AnswerServiceImpl extends ServiceImpl<AnswerMapper, Answer> implements com.smartcoder.service.AnswerService {
    @Autowired
    private TaskMapper taskMapper;
    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public Result addAnswer(Answer answer) {
        if(answer.getTaskId()==null&&answer.getUserId()==null){
            return Result.fail("The task or user does not exist!");
        }else{
            Answer existingAnswer = answerMapper.selectById(answer.getAnswerId());
            if (existingAnswer != null) {
                return Result.fail("The answer id already exist");
            }
        }
        answer.setAccepted(0);
        return Result.success(answerMapper.insert(answer));
    }

    @Override
    public Result adoptAnswer(Integer answerId, Integer status, Integer taskId) {
        Answer answer = answerMapper.selectById(answerId);
        Task task = taskMapper.selectById(taskId);
        if (answer == null) {
            return Result.fail("The answer does not exist");
        }
        if (status == 0) {
            answer.setAccepted(0);
            task.setFinished(0);
            taskMapper.updateById(task);

        } else {
            answer.setAccepted(1);
            task.setFinished(1);
            taskMapper.updateById(task);
        }
        return Result.success(answerMapper.updateById(answer));
    }

    @Override
    public Result amountAnswer() {
        int count = Math.toIntExact(answerMapper.selectCount(null));
        return Result.success(count);
    }

    @Override
    public Result updateAcceptedStatus(Integer answerId) {
        Answer answer = answerMapper.selectById(answerId);
        if (answer == null) {
            return Result.fail("The answer does not exist");
        }
        if (answer.getAccepted() == 0) {
            answer.setAccepted(1);
        } else {
            answer.setAccepted(0);
        }
        answerMapper.updateById(answer);
        return Result.success(answer);
    }
}
