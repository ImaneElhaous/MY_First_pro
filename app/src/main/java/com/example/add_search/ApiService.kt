package com.example.add_search
import  com.example.add_search.AddResponse


import retrofit2.Call
import retrofit2.http.Body
import retrofit2.http.GET
import retrofit2.http.POST

data class Car(
    val id: Int,
    val name: String,
    val price: Double,
    val image: String,
    val isFullOptions: Boolean
)

data class AddResponse(
    val status: Int,
    val status_message: String
)

interface ApiService {
    @GET("CarAPI/readAll.php")
    fun getCars(): Call<List<Car>>

    @POST("CarAPI/create.php")
    fun addCar(@Body car: Car): Call<AddResponse>

    @POST("CarAPI/update.php")
    fun updateCar(@Body car: Car): Call<AddResponse>

    @POST("CarAPI/delete.php")
    fun deleteCar(@Body car: Car): Call<AddResponse>
}