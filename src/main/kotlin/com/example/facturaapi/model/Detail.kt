package com.example.facturaapi.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name="detail")
class Detail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var quantity:Double? = null

    @Column(name="invoice_id")
    var invoiceId: Long?= null
}