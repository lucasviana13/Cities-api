package com.lucasviana.apicities.states.repository;

import com.lucasviana.apicities.states.State;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;
import java.util.Optional;

public interface StateRepository extends JpaRepository<State,Long> {
    List<State> findByUf(String uf);
}
