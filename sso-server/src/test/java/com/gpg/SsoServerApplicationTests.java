package com.gpg;

import com.gpg.dao.AdminDao;
import com.gpg.pojo.Admin;
import com.gpg.pojo.AdminInfo;
import com.gpg.pojo.jdtn.JdtUrl;
import com.gpg.pojo.jdtn.Jurisdiction;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.RedisTemplate;
import org.springframework.data.redis.core.SetOperations;
import org.springframework.data.redis.core.ValueOperations;
import org.springframework.test.context.junit4.SpringRunner;

import java.time.LocalDateTime;
import java.util.Arrays;
import java.util.concurrent.TimeUnit;

import static java.lang.Thread.sleep;

@RunWith(SpringRunner.class)
@SpringBootTest
public class SsoServerApplicationTests {

    @Autowired
    private RedisTemplate redisTemplate;
    @Test
    public void contextLoads() {

        try {
            ValueOperations<String,Integer> valueOperations = redisTemplate.opsForValue();
            valueOperations.set("a",125,5, TimeUnit.SECONDS);

            System.out.println(redisTemplate.opsForValue().get("a"));

            sleep(1000*10);
            System.out.println(redisTemplate.opsForValue().get("a"));


        } catch (Exception e) {
            e.printStackTrace();
        }
    }
    @Autowired
    private AdminDao adminDao;

    @Test
    public  void adminTest(){

        adminDao.save(new Admin()
                .setAdminId(3l)
                .setWorkNum("w3885")
                .setAdminName("admin")
                .setAdminPass("admin")
                .setAdminType(1).setAdminInfo(new AdminInfo()
                        .setEmail("gaozpg@163.com")
                        .setSex(1)
                        .setIdCardNo("340321199402144355")
                        .setPhone("17602123912")
                        .setRegisterTime(LocalDateTime.now())
                        .setWorkNum("w3885")
                         )
                .setJdtList(Arrays.asList(new Jurisdiction().setJdtName("用户管理员").setJdUrls(Arrays.asList(new JdtUrl().setUrl("/admin/adminUser")))))
        );
    }

}
