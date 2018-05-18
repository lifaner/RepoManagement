package com.ssm.ck;

import com.ssm.ck.dao.SeckillDao;
import com.ssm.ck.model.Seckill;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.test.context.SpringBootTest;
import org.springframework.data.redis.core.StringRedisTemplate;
import org.springframework.test.context.junit4.SpringRunner;

@RunWith(SpringRunner.class)
@SpringBootTest
public class CkApplicationTests {

    @Autowired
    private SeckillDao seckillDao;

    @Test
    public void contextLoads() {
        long id = 1000l;

        Seckill seckill = seckillDao.getSeckillById(id);
        System.out.println(seckill);

    }

}
