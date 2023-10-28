package com.smartcoder.service;

import com.smartcoder.common.Result;
import com.smartcoder.entity.Answer;
import com.baomidou.mybatisplus.extension.service.IService;

/**
 * <p>
 *  service class
 * </p>
 *
 * @author author
 * @since 2023-10-22
 */
public interface AnswerService extends IService<Answer> {
    /**
     * Add answer
     * @param answer
     * @return Result
     */
    Result addAnswer(Answer answer);

    /**
     * adoption or cancel adoption
     * @param answerId answer Id
     * @param status  0：cancel adoption 1：adoption
     * @param taskId task id
     * @return Result
     */
    Result adoptAnswer(Integer answerId, Integer status, Integer taskId);

    /**
     * Return amount of all answer
     *
     * @return Result
     */
    Result amountAnswer();

    /**
     * update accepted status
     *
     * @return Result
     */
    Result updateAcceptedStatus(Integer answerId);

}
