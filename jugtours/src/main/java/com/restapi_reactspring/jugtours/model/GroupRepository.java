package com.restapi_reactspring.jugtours.model;

import org.springframework.data.jpa.repository.JpaRepository;

public interface GroupRepository extends JpaRepository<Group, Long>{
  Group findByName(String name);
}
