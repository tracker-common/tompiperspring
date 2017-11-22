package com.pivotaltracker.tomandpiper.repositories

import com.pivotaltracker.tomandpiper.domain.Reservation
import org.springframework.data.jpa.repository.JpaRepository

interface ReservationRepository : JpaRepository<Reservation, Int> {

    fun findByCompleted(completed: Boolean) : List<Reservation>

}
