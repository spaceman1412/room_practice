package com.example.roompractice.entities.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roompractice.entities.Director
import com.example.roompractice.entities.School

data class SchoolAndDirector(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val director: Director
)