package com.example.facturaapi.controller

import com.example.facturaapi.model.Invoice
import com.example.facturaapi.service.InvoiceService
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.*
import org.springframework.web.server.ResponseStatusException

@RestController
@RequestMapping( "/product")
class ProdutController {
    @Autowired
    lateinit var invoiceService: InvoiceService

    @GetMapping
    fun list():List<Invoice>{
        return invoiceService.list()
    }

    @PostMapping
    fun save(@RequestBody invoice: Invoice): Invoice {
            return invoiceService.save(invoice)

    }

    @PutMapping
    fun update (@RequestBody invoice: Invoice): ResponseEntity<Invoice> {
        return ResponseEntity(invoiceService.update(invoice), HttpStatus.OK)
    }

    @PatchMapping
    fun updateTotal (@RequestBody invoice: Invoice): ResponseEntity<Invoice> {
        return ResponseEntity(invoiceService.updateTotal(invoice), HttpStatus.OK)
    }
}