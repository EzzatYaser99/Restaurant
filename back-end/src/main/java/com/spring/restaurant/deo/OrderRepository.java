package com.spring.restaurant.deo;

import com.spring.restaurant.model.Order;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;


@Repository
public interface OrderRepository extends JpaRepository<Order,Long> {

Page<Order> findByCategoryId(Long id, Pageable pageable);
Page<Order>findByNameContaining(String name ,Pageable pageable);



@Query ("select count (id) from Order where category.id= ?1")
public  long getOrderLengthByCategoryId(Long id);


@Query("select count (id) from Order where name LIKE %?1%")
public  long getOrderSizeByKey(String key);

}
