package com.pivotaltracker.tomandpiper.domain

import javax.persistence.*

@Entity
data class PingPongTable(
        @Id
        @GeneratedValue(strategy = GenerationType.IDENTITY)
        val id : Int = 0,
        val name: String = ""
)