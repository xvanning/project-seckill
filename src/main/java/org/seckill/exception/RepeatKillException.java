package org.seckill.exception;

/**
 * 描述:
 * 重复秒杀异常
 *
 * @author xvanning
 * @create 2018-10-17 13:46
 */
public class RepeatKillException extends SeckillException{
    public RepeatKillException(String message) {
        super(message);
    }

    public RepeatKillException(String message, Throwable cause) {
        super(message, cause);
    }
}