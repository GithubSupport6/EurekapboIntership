package com.eurekabpo.intership.tests;

import com.eurekabpo.intership.services.BeanConfiguration;
import com.eurekabpo.intership.services.NameService;
import com.eurekabpo.intership.services.implementations.NameServiceImpl;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.test.context.ContextConfiguration;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;
import org.springframework.test.context.web.WebAppConfiguration;

@RunWith(SpringJUnit4ClassRunner.class)
@ContextConfiguration(classes = { BeanConfiguration.class })
@WebAppConfiguration
public class NameServiceTest {

    @Autowired
    private NameService nameService;

    @Test
    public void testName()
    {
        Assert.assertTrue(nameService.getComputerName().contains("-"));
    }

}
