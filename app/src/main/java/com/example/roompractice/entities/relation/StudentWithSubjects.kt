package com.example.roompractice.entities.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.roompractice.entities.Student
import com.example.roompractice.entities.Subject

data class StudentWithSubjects(
    @Embedded val student: Student,
    @Relation(
        parentColumn = "studentName",
        entityColumn = "subjectName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val subjects: List<Subject>
)