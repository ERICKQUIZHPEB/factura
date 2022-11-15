package com.example.facturaapi.repository

import com.example.facturaapi.model.Client
import org.springframework.data.jpa.repository.JpaRepository
import org.springframework.stereotype.Repository

@Repository
interface ClientRepository:JpaRepository<Client, Long> {
}