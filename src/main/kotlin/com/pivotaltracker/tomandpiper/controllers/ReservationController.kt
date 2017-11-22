package com.pivotaltracker.tomandpiper.controllers

import com.pivotaltracker.tomandpiper.domain.Reservation
import com.pivotaltracker.tomandpiper.repositories.ReservationRepository
import com.pivotaltracker.tomandpiper.requests.CreateReservationRequest
import com.pivotaltracker.tomandpiper.services.ReservationService
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/Reservations")
class ReservationController(val service: ReservationService) {

    @RequestMapping("", method = arrayOf(RequestMethod.GET))
    fun get() =
            service.findAll()

    @RequestMapping("", method = arrayOf(RequestMethod.POST))
    fun create(@RequestBody request: CreateReservationRequest) =
            service.save(Reservation(playerId = request.playerId))



}