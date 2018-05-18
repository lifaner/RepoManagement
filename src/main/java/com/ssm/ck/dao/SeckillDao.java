package com.ssm.ck.dao;

import com.ssm.ck.model.Seckill;

import java.util.Date;

public interface SeckillDao {

    /**
     * 减库存
     * @param seckillId
     * @param createTime
     * @return
     */
    int reduceNumber(long seckillId,Date createTime);

    /**
     * 根据id查
     * @param id
     * @return
     */
    Seckill getSeckillById(long id);
}
