package com.example.facturaapi.controller

import com.example.facturaapi.model.Client
import com.example.facturaapi.service.ClientService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.web.bind.annotation.*

@RestController
@RequestMapping( "/client")
class ClientController {

    @Autowired
    lateinit var clientService: ClientService

    @GetMapping
    fun list():List<Client>{
        return clientService.list()
    }

    @PostMapping
    fun save(@RequestBody client:Client):Client{
        return clientService.save(client)
    }
}