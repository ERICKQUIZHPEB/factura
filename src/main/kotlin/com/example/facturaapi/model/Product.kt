package com.example.facturaapi.model

import java.util.*
import javax.persistence.*

@Entity
@Table(name="product")
class Product {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    var description:String? = null

    var brand: String? = null

    var stock:Double? = null

}