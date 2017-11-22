package com.pivotaltracker.tomandpiper.domain

import javax.persistence.Entity
import javax.persistence.GeneratedValue
import javax.persistence.GenerationType
import javax.persistence.Id

@Entity
data class Reservation(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id: Int = 0,
        val playerId: Int = 0,
        val pingPongTableId: Int = 1,
        val completed: Boolean = false
)