-- 创建秒杀表
create table seckill(
  `seckill_id` bigint not null auto_increment comment '商品库存id',
  `name` varchar(120) not null comment '商品名称',
  `number` int not null comment '秒杀商品库存',
  `start_time` timestamp not null comment '秒杀开始时间',
  `end_time` timestamp not null comment '秒杀结束时间',
  `create_time` timestamp not null default current_timestamp comment '创建时间',
  primary key (seckill_id),
  key idx_start_time(start_time),
  key idx_end_time(end_time),
  key idx_create_time(create_time)
) engine=innodb auto_increment=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';
-- 初始化数据
insert seckill
(name,number,start_time,end_time)
  value
  ('1000元秒杀iphone6','100','2018-5-18 00:00:00','2018-5-19 00:00:00'),
  ('500元秒杀ipad','200','2018-5-18 00:00:00','2018-5-19 00:00:00'),
  ('300元秒杀小米6','300','2018-5-18 00:00:00','2018-5-19 00:00:00'),
  ('100元秒杀红米note','400','2018-5-18 00:00:00','2018-5-19 00:00:00');
-- 创建秒杀明细表
create table success_killed(
  `seckill_id` bigint not null comment '秒杀商品id',
  `user_phone` bigint not null comment '用户电话',
  `state` tinyint not null default -1 comment '状态标识: -1:无效,0:成功 1:已付款 2:已发货',
  `create_time` timestamp not null default current_timestamp comment '创建时间',
  key idx_seckill_id(seckill_id),
  key idx_user_phone(user_phone),
  key idx_create_time(create_time)
)ENGINE=innodb AUTO_INCREMENT=1000 DEFAULT CHARSET=utf8 COMMENT='秒杀库存表';




