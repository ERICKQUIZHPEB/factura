package com.example.facturaapi.model

import javax.persistence.*
import javax.validation.constraints.NotBlank

@Entity
@Table(name="client")
class Client {
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Id
    @Column(updatable = false)
    var id: Long? = null

    @NotBlank(message="Obligatorio")
    var nui:String? = null

    @NotBlank(message="Obligatorio")
    var fullname:String? = null

    var address:String? = null
}