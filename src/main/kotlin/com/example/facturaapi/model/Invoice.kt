package com.example.facturaapi.model

import java.util.*
import javax.persistence.*


@Entity
@Table(name="invoice")
class Invoice {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var code:String? = null

    @Column(name="create_at")
    var createAt: Date? = null

    var total:Double? = null

    @Column(name="client_id")
    var clientId: Long?= null
}