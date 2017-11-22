package com.pivotaltracker.tomandpiper.controllers

import com.pivotaltracker.tomandpiper.domain.PingPongTable
import com.pivotaltracker.tomandpiper.requests.CreatePingPongTableRequest
import com.pivotaltracker.tomandpiper.services.PingPongTableService
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestMethod
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/PingPongTables")
class PingPongTableController(val service: PingPongTableService) {

    @RequestMapping("", method = arrayOf(RequestMethod.GET))
    fun get() =
            service.findAll()

    @RequestMapping("", method = arrayOf(RequestMethod.POST))
    fun create(@RequestBody request: CreatePingPongTableRequest) =
            service.save(PingPongTable(name = request.name))

}