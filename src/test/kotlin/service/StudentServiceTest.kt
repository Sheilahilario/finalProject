package service

import model.Student
import org.junit.jupiter.api.Test
import java.util.*
import kotlin.test.assertEquals

internal class StudentServiceTest {

    val student = Student(id = "10001", name = "Isadora", email = "isadora@gmail.com", Date(2020,11,21) )

    @Test
    fun findStudent() {
        val studentTest = StudentService()
        studentTest.subscribeStudent(student)
        assertEquals(student,studentTest.findStudent(student.id))
    }
}