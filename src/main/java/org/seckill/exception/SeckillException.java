package org.seckill.exception;

/**
 * 描述:
 * 秒杀相关业务异常
 *
 * @author xvanning
 * @create 2018-10-17 13:49
 */
public class SeckillException extends RuntimeException {
    public SeckillException(String message) {
        super(message);
    }

    public SeckillException(String message, Throwable cause) {
        super(message, cause);
    }
}