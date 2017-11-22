package com.pivotaltracker.tomandpiper.repositories

import com.pivotaltracker.tomandpiper.domain.PingPongTable
import org.springframework.data.jpa.repository.JpaRepository

interface PingPongTableRepository : JpaRepository<PingPongTable, Int>