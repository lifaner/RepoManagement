package com.ssm.ck.dao;

import com.ssm.ck.model.SuccessSeckill;

public interface SuccessSeckillDao {

    SuccessSeckill getModelByPrimaryId(long seckillId,long userPhone);

    int addSuccessSeckill(long seckillId,long userPhone);
}
