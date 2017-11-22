package com.pivotaltracker.tomandpiper.repositories

import com.pivotaltracker.tomandpiper.domain.Player
import org.springframework.data.jpa.repository.JpaRepository

interface PlayerRepository : JpaRepository<Player, Int>