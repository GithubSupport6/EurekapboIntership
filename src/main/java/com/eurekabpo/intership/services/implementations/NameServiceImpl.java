package com.eurekabpo.intership.services.implementations;

import com.eurekabpo.intership.services.NameService;

import java.net.InetAddress;
import java.net.UnknownHostException;
import java.util.logging.Level;
import java.util.logging.Logger;

public class NameServiceImpl implements NameService {
    private String CANNOT_FIND_NAME = "Cannot find name";
    private static Logger logger = Logger.getLogger(NameServiceImpl.class.getName());

    @Override
    public String getComputerName() {
        try {
            return InetAddress.getLocalHost().getHostName();
        } catch (UnknownHostException e) {
            e.printStackTrace();
            logger.log(Level.WARNING, e.getMessage());
        }
        return CANNOT_FIND_NAME;
    }
}
