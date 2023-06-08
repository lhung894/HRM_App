/*
 * Copyright (c) 2023 Thermo Fisher Scientific
 * All rights reserved.
 */


package com.example.demo.Repository;

import java.util.List;

import com.example.demo.Entity.DuAnEntity;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;


/**
 * TODO: Interface description
 *
 */
public interface DuAnRepository extends JpaRepository<DuAnEntity, Long>
{
    /**
     * TODO: Method description
     *
     * @return
     */
    @Query(value = "SELECT u FROM DuAnEntity u WHERE u.status = 1")
    List<DuAnEntity> GetAllActive();
}

