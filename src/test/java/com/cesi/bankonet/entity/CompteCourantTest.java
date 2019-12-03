package com.cesi.bankonet.entity;

import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CompteCourantTest {

    @Test
    public void compteCourantTest() {
        CompteCourant cc = new CompteCourant("0123", "Compte Courant", 100.50, 500);
        Assert.assertEquals("Compte Courant", cc.getIntitule());
    }
}
