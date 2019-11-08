package com.cesi.bankonet.entity;


import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;


@RunWith(SpringRunner.class)
@SpringBootTest
public class ClientTest {

    @Test
    public void clientTest() {
        Client client = new Client("test", "test", "test");
        Assert.assertEquals("test", client.getNom());
    }
}
