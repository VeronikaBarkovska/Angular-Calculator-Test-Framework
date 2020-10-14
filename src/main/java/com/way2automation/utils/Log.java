package com.way2automation.utils;
import org.apache.log4j.Logger;

public class Log {
    public static Logger LOG = Logger.getLogger(Log.class);
    public static Logger getInstance(){
        return LOG;
    }
}
