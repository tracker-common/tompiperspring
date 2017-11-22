package com.pivotaltracker.tomandpiper.controllers

import com.pivotaltracker.tomandpiper.domain.Player
import com.pivotaltracker.tomandpiper.repositories.PlayerRepository
import com.pivotaltracker.tomandpiper.requests.CreatePlayerRequest
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController


@RestController
@RequestMapping("/Player")
class PlayerController(val repo: PlayerRepository) {

    @RequestMapping("", method = arrayOf(RequestMethod.GET))
    fun get() =
            repo.findAll()

    @RequestMapping("", method = arrayOf(RequestMethod.POST))
    fun create(@RequestBody request: CreatePlayerRequest) =
            repo.save(Player(name = request.name))
}