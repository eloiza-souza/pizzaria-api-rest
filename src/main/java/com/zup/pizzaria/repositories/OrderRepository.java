package com.zup.pizzaria.repositories;

import com.zup.pizzaria.models.OrderModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface OrderRepository extends JpaRepository<OrderModel, Long> {
}
