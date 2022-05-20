package com.bnta.dragonball_api.repositories;

import com.bnta.dragonball_api.models.Saga;
import org.springframework.data.jpa.repository.JpaRepository;

public interface SagaRepository extends JpaRepository<Saga, Long> {
}
