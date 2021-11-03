package com.example.roompractice.entities.relation

import androidx.room.Embedded
import androidx.room.Junction
import androidx.room.Relation
import com.example.roompractice.entities.Student
import com.example.roompractice.entities.Subject

data class SubjectWithStudents(
    @Embedded val subject: Subject,
    @Relation(
        parentColumn = "subjectName",
        entityColumn = "studentName",
        associateBy = Junction(StudentSubjectCrossRef::class)
    )
    val students: List<Student>
)