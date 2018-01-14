package com.dber.plat.api;

import com.dber.plat.api.entity.Account;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.test.context.junit4.SpringJUnit4ClassRunner;

@RunWith(SpringJUnit4ClassRunner.class)
@SpringBootTest(classes = PlatClient.class)
public class PlatClientTest {

    @Autowired
    private PlatClient client;

    @Test
    public void test() {
        System.out.println(client.test());
    }

    @Test
    public void getAccount() {
        Account account = new Account();
        account.setName("aa");
        System.out.println(client.getAccount(account));
    }
}
