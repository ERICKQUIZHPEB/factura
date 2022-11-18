package com.example.facturaapi.service

import com.example.facturaapi.model.Client
import com.example.facturaapi.repository.ClientRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
<<<<<<< HEAD
=======

>>>>>>> origin/main
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException


<<<<<<< HEAD

=======
>>>>>>> origin/main
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
<<<<<<< HEAD

=======
>>>>>>> origin/main
    fun update(client: Client): Client{
        try {
            clientRepository.findById(client.id)
                ?: throw Exception("Id no existe")
<<<<<<< HEAD

=======
>>>>>>> origin/main
            return clientRepository.save(client)
        }
        catch(ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

<<<<<<< HEAD
    fun updateName(client:Client): Client {
        try{
            val response = clientRepository.findById(client.id)
                ?: throw Exception("ID no existe")
            response.apply{
                fullname=client.fullname
            }
            return clientRepository.save(response)
        }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
=======
>>>>>>> origin/main
}