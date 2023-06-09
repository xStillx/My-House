package com.example.myhouse.features.cameras.domain.model

data class Cameras(
    val data: DataCameras,
    val success: Boolean
)

data class DataCameras(
    val cameras: List<Camera>,
    val room: List<String>
)

data class Camera(
    val favorites: Boolean,
    val id: Int,
    val name: String,
    val rec: Boolean,
    val room: String?,
    val snapshot: String
)