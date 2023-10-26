package com.smartcoder.controller;


import com.smartcoder.common.Result;
import com.smartcoder.entity.Task;
import com.smartcoder.service.TaskService;
import org.apache.ibatis.annotations.Param;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;

import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping("/task")
public class TaskController {
    @Autowired
    private TaskService taskService;


    @RequestMapping("/ask")
    public Result askForHelp(Integer taskId, Integer userId) {
        return taskService.askForHelp(taskId, userId);
    }

    @RequestMapping("/ask/list")
    public Result getAskTaskList() {
        return taskService.getAskTaskList();
    }

    @RequestMapping("/detail")
    public Result getTaskDetail( Integer taskId) {
        return taskService.getTaskDetail(taskId);
    }

    @RequestMapping("/add")
    public Result addTask(@RequestBody Task task) {
        return taskService.addTask(task);
    }

    @RequestMapping("/my/list")
    public Result getMyTaskList(Integer userId) {
        return taskService.getMyTaskList(userId);
    }

    @RequestMapping("/my/ask/list")
    public Result getMyAskTaskList(Integer userId) {
        return taskService.getMyAskTaskList(userId);
    }

    @RequestMapping("/my/accept/list")
    public Result getMyAnswerList(Integer userId) {
        return taskService.getMyAcceptTaskList(userId);
    }

    @RequestMapping("/task/detail")
    public Result getTaskAnswerDetail(Integer taskId) {
        return taskService.getTaskAnswerDetail(taskId);
    }

}
