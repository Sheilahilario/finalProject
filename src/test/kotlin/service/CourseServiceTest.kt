package service

import model.Course
import model.Module
import org.junit.jupiter.api.Test
import kotlin.test.assertEquals

internal class CourseServiceTest {
    val module1 = Module("0000", "Math", "technical programs")
    val course = Course("INTRO-CS-1", "Introduction to Computer Science", 9, module1)

    @Test
    fun getCourse() {
        val courseTest = CourseService()
        courseTest.registerCourse(course)
        assertEquals(course, courseTest.getCourse("INTRO-CS-1"))
    }
}