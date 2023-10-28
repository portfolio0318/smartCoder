package com.smartcoder.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.QueryWrapper;
import com.smartcoder.common.Result;
import com.smartcoder.entity.Answer;
import com.smartcoder.entity.Task;
import com.smartcoder.entity.vo.AnswerTaskDetail;
import com.smartcoder.mapper.AnswerMapper;
import com.smartcoder.mapper.TaskMapper;
import com.smartcoder.service.TaskService;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;
import java.time.ZoneId;
import java.util.List;

/**
 * <p>
 *  Task service implementation class
 * </p>
 *
 * @author author
 * @since 2023-10-22
 */
@Service
public class TaskServiceImpl extends ServiceImpl<TaskMapper, Task> implements TaskService {
    @Autowired
    private TaskMapper taskMapper;
    @Autowired
    private AnswerMapper answerMapper;

    @Override
    public Result askForHelp(Integer taskId, Integer userId) {
        Task task = taskMapper.selectById(taskId);
        if (task == null) {
            return Result.fail("The task does not exist");
        }
        if (!task.getUserId().equals(userId)) {
            return Result.fail("illegal operation.");
        }
        task.setFinished(0);
        return Result.success(taskMapper.updateById(task));
    }

    @Override
    public Result getAskUnfinishedTaskList() {
        QueryWrapper<Task> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("finished", 0);
        List<Task> tasks = taskMapper.selectList(queryWrapper);
        if (tasks == null) {
            return Result.fail("No task!");
        }
        for (Task task : tasks) {
            task.setContent(task.getContent());
        }
        return Result.success(tasks);
    }

    @Override
    public Result getAskAllTaskList() {
        QueryWrapper<Task> queryWrapper = new QueryWrapper<>();
        List<Task> tasks = taskMapper.selectList(queryWrapper);
        if (tasks == null) {
            return Result.fail("No task!");
        }
        for (Task task : tasks) {
            task.setContent(task.getContent());
        }
        return Result.success(tasks);
    }

    @Override
    public Result getTaskDetail(Integer taskId) {
        return Result.success(taskMapper.selectById(taskId));
    }

    @Override
    public Result addTask(Task task) {
        if (task == null) {
            return Result.fail("The task is empty");
        }
        Task existingTask = taskMapper.selectById(task.getTaskId());
        if (existingTask != null) {
            return Result.fail("Task ID already exists");
        }

        task.setFinished(0);
        taskMapper.insert(task);
        return Result.success();
    }

    @Override
    public Result getMyTaskList(Integer userId) {
        QueryWrapper<Task> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", userId);
        List<Task> tasks = taskMapper.selectList(queryWrapper);
        for (Task task : tasks) {
            task.setContent(task.getContent());
        }
        return Result.success(tasks);
    }

    @Override
    public Result getMyAskTaskList(Integer userId) {
        QueryWrapper<Task> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", userId);
        queryWrapper.eq("finished", 0);
        List<Task> tasks = taskMapper.selectList(queryWrapper);
        for (Task task : tasks) {
            task.setContent(task.getContent());
        }
        return Result.success(tasks);
    }


    @Override
    public Result getMyAcceptTaskList(Integer userId) {
        QueryWrapper<Task> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("user_id", userId);
        queryWrapper.eq("finished", 1);
        List<Task> tasks = taskMapper.selectList(queryWrapper);
        for (Task task : tasks) {
            task.setContent(task.getContent());
        }
        return Result.success(tasks);
    }

    @Override
    public Result getTaskAnswerDetail(Integer taskId) {
        Task task = taskMapper.selectById(taskId);
        if (task == null) {
            return Result.fail("The task does not exist!");
        }
        QueryWrapper<Answer> queryWrapper = new QueryWrapper<>();
        queryWrapper.eq("task_id", taskId);
        List<Answer> answers = answerMapper.selectList(queryWrapper);
        AnswerTaskDetail result = new AnswerTaskDetail();
        result.setTask(task);
        result.setAnswerList(answers);

        return Result.success(result);
    }
}
