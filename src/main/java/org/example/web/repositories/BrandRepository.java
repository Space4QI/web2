package org.example.web.repositories;

import org.example.web.models.Brand;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.UUID;

@Repository
public interface BrandRepository extends JpaRepository<Brand, UUID>{
    Brand findBrandByName(String name);
}
