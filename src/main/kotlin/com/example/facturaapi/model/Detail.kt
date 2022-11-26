package com.example.facturaapi.model

import javax.persistence.*

@Entity
@Table(name="detail")
class Detail {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    @Column(name="invoice_id")
    var invoiceId: Long? = null

    @Column(name="product_id")
    var productId: Long?= null

    var  quantity: Double? = null
}