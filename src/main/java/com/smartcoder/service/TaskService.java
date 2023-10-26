package com.smartcoder.service;

import com.smartcoder.common.Result;
import com.smartcoder.entity.Task;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  服务类
 * </p>
 *
 * @author author
 * @since 2023-10-22
 */
public interface TaskService extends IService<Task> {

    /**
     * ask for help
     * @param taskId task id
     * @param userId user id
     * @return Result
     */
    Result askForHelp(Integer taskId, Integer userId);

    /**
     * get unfinished task
     * @return Result
     */
    Result getAskTaskList();

    /**
     * get task detail
     * @param taskId task id
     * @return Result
     */
    Result getTaskDetail(Integer taskId);

    /**
     * add task
     * @param task task
     * @return Result
     */
    Result addTask(Task task);

    /**
     * get user's task
     * @param userId user id
     * @return Result
     */
    Result getMyTaskList(Integer userId);

    /**
     * get unfinished user task
     * @param userId user id
     * @return Result
     */
    Result getMyAskTaskList(Integer userId);

    /**
     * get finished user task
     * @param userId user id
     * @return Result
     */
    Result getMyAcceptTaskList(Integer userId);

    /**
     * get task and answer detail
     * @param taskId task id
     * @return Result
     */
    Result getTaskAnswerDetail(Integer taskId);

}
