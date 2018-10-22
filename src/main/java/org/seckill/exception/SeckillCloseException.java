package org.seckill.exception;

/**
 * 描述:
 * 秒杀关闭异常
 *
 * @author xvanning
 * @create 2018-10-17 13:48
 */
public class SeckillCloseException extends SeckillException {
    public SeckillCloseException(String message) {
        super(message);
    }

    public SeckillCloseException(String message, Throwable cause) {
        super(message, cause);
    }
}