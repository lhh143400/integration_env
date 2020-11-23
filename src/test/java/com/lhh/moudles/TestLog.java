package com.lhh.moudles;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author lhh
 * @Date 2019/10/29 21:49
 */
public class TestLog {

    private static Logger logger= LoggerFactory.getLogger(TestLog.class);

    public static void main(String[] args) {

        logger.trace("这是跟踪信息");
        logger.error("测试错误日志");
    }
}
