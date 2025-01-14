package com.zup.pizzaria.repositories;

import com.zup.pizzaria.models.ClientModel;
import org.springframework.data.jpa.repository.JpaRepository;

public interface ClientRepository extends JpaRepository<ClientModel, Long> {
}
