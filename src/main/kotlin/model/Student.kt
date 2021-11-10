package model

import service.CourseService
import java.util.*
import kotlin.collections.ArrayList

class Student(id: String?, name: String?, email: String?, birthDate: Date?) : Person(id, name, email, birthDate),
    Evaluation {
    private val average = 0.0

    private val courses: MutableList<Course?> = ArrayList()
    private val approvedCourses: MutableMap<String, Course> = HashMap()

    override fun getAverage(): Double {
        return average;
    }

    override fun getApprovedCourses(): List<Course> {
        return approvedCourses.values.toList()

    }

    fun enrollToCourse(course: Course?){
        if (course != null){
        courses.add(course)
        println("Student added sucessfully")
        }else("Invalid registration")
    }

    fun registerApprovedCourse(course: Course) {
        approvedCourses[course.code] = course
    }

    fun isCourseApproved(courseCode: String?): Boolean {
        if (courseCode != null) {
            return approvedCourses.contains(courseCode)
        } else return false
    }
    fun isAttendingCourse(courseCode: String?): Boolean {
        if(courseCode != null) {
            return CourseService().getCourse(courseCode) != null
        }
        return false
        }



     override fun toString(): String {
        return "Student {" + super.toString() + "}"
    }
}
