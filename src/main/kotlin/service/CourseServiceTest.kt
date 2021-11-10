package service

import model.Course
import model.Module
import org.junit.jupiter.api.Test

import org.junit.jupiter.api.Assertions.*

internal class CourseServiceTest {

    private val teste = CourseService()
    val course = Course("INTRO-CS-3", "Algorithm Design and Problem Solving - Introduction ",
        9, Module("dois","Algorithm Design and Problem Solving - Introduction",""))

    @Test
    fun getCourse() {
        teste.registerCourse(course)
        assertNotEquals(true, teste.getCourse("INTRO-CS-3"))

    }

}