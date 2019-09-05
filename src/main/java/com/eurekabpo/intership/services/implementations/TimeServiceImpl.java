package com.eurekabpo.intership.services.implementations;

import com.eurekabpo.intership.services.TimeService;

import java.text.SimpleDateFormat;
import java.util.Date;
import java.util.logging.Logger;

public class TimeServiceImpl implements TimeService {
    private static Logger logger = Logger.getLogger(TimeServiceImpl.class.getName());

    @Override
    public String getCurrDate() {
        logger.info("Getting date ... ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("EEEE dd.MM.yyyy");
        return simpleDateFormat.format(new Date());
    }

    @Override
    public String getCurrTime() {
        logger.info("Getting time ... ");
        SimpleDateFormat simpleDateFormat = new SimpleDateFormat("HH:mm");
        return simpleDateFormat.format(new Date());
    }
}
