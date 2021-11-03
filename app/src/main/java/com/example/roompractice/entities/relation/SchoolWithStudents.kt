package com.example.roompractice.entities.relation

import androidx.room.Embedded
import androidx.room.Relation
import com.example.roompractice.entities.School
import com.example.roompractice.entities.Student

data class SchoolWithStudents(
    @Embedded val school: School,
    @Relation(
        parentColumn = "schoolName",
        entityColumn = "schoolName"
    )
    val students: List<Student>
)