package com.atguigu.springcloud.dao;

import com.atguigu.springcloud.entities.Payment;
import org.apache.ibatis.annotations.Mapper;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Component;

/**
 * @Author Liu
 * @Date 2023/5/23 - 13:07
 **/


@Component       //代替@Repository声明bean
@Mapper               //mybatis提供的，等价：@MapperScan("com.atguigu.springcloud.dao")
//@Repository     //spring提供的。在此，只是为了声明bean对象
public interface PaymentDao {
     int create(Payment payment);
     Payment getPaymentById(@Param("id") Long id);
}

