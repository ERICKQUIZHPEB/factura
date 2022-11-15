package com.example.facturaapi.service

import com.example.facturaapi.model.Client
import com.example.facturaapi.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus

import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException


@Service
class ClientService {
    @Autowired
    lateinit var clientRepository: ClientRepository

    fun list():List<Client>{
        return clientRepository.findAll()
    }

    fun save(client:Client):Client{
        return clientRepository.save(client)
    }
    fun update(client: Client): Client{
        try {
            clientRepository.findById(client.id)
                ?: throw Exception("Id no existe")
            return clientRepository.save(client)
        }
        catch(ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

}