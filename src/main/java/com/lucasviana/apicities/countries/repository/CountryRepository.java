package com.lucasviana.apicities.countries.repository;

import com.lucasviana.apicities.countries.Country;
import org.springframework.data.jpa.repository.JpaRepository;

public interface CountryRepository extends JpaRepository<Country, Long> {
}