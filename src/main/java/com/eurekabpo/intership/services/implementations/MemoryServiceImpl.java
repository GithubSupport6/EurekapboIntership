package com.eurekabpo.intership.services.implementations;

import com.eurekabpo.intership.services.MemoryService;

import java.util.logging.Logger;

public class MemoryServiceImpl implements MemoryService {
    private static Logger logger = Logger.getLogger(MemoryServiceImpl.class.getName());

    @Override
    public String getFreeMemory() {
        logger.info("Getting free memory ...");
        return String.valueOf(Runtime.getRuntime().freeMemory());
    }

    @Override
    public String getAllMemory() {
        logger.info("Getting total memory ...");
        return String.valueOf(Runtime.getRuntime().totalMemory());
    }
}
