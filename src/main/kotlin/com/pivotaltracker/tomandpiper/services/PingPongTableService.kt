package com.pivotaltracker.tomandpiper.services

import com.pivotaltracker.tomandpiper.domain.PingPongTable
import com.pivotaltracker.tomandpiper.repositories.PingPongTableRepository
import com.pivotaltracker.tomandpiper.repositories.ReservationRepository
import org.springframework.stereotype.Component

@Component
class PingPongTableService(val tableRepository: PingPongTableRepository,
                           val reservationRepository: ReservationRepository) {
    fun findAll() =
            tableRepository.findAll()


    fun save(pingPongTable: PingPongTable) =
            tableRepository.save(pingPongTable)

    fun availableTables() =
            tableRepository.findAll().stream().filter { t ->
                !reservationRepository.findByCompleted(false).map { r -> r.id }.contains(t.id)
            }
}