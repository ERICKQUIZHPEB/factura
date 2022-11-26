package com.example.facturaapi.service

import com.example.facturaapi.model.Detail
import com.example.facturaapi.repository.DetailRepository
import com.example.facturaapi.repository.ProductRepository
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.HttpStatus
import org.springframework.stereotype.Service
import org.springframework.web.server.ResponseStatusException

@Service
class DetailService {
    @Autowired
    lateinit var detailRepository: DetailRepository

    @Autowired
    lateinit var productRepository: ProductRepository

    fun list():List<Detail>{
        return detailRepository.findAll()
    }

    fun save(detail: Detail):Detail{

        try{
            val response=detailRepository.save(detail)
            val responseProduct=productRepository.findById(response.productId)
            responseProduct?.apply{
                    stock=stock?.minus(detail.quantity!!)
                }
            productRepository.save(responseProduct)

            return response
        }
        catch(ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }

    }


    fun update(detail: Detail): Detail{
        try{
            detailRepository.findById(detail.id)
                ?: throw Exception("Id no existe")

            return detailRepository.save(detail)
        }
        catch(ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND, ex.message)
        }
    }

    fun updateQuantity(detail: Detail): Detail {
        try{
            val response = detailRepository.findById(detail.id)
                ?: throw Exception("ID no existe")
            response.apply{
                quantity=detail.quantity
            }
            return detailRepository.save(response)
            }
        catch (ex:Exception){
            throw ResponseStatusException(HttpStatus.NOT_FOUND,ex.message)
        }
    }
}