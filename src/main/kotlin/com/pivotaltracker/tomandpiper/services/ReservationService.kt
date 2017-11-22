package com.pivotaltracker.tomandpiper.services

import com.pivotaltracker.tomandpiper.domain.Reservation
import com.pivotaltracker.tomandpiper.repositories.ReservationRepository
import org.springframework.stereotype.Component

@Component
class ReservationService(val repository: ReservationRepository,
                         val pingPongTableService: PingPongTableService) {
    fun findAll(): MutableList<Reservation>? {
        print(repository.findByCompleted(true))
        return repository.findAll()
    }


    fun save(reservation: Reservation) {
        var availableTableId = pingPongTableService.availableTables().findFirst()?.
        reservation.pingPongTableId = availableTableId?
        repository.save(reservation)

    }
}