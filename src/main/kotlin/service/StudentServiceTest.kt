package service

import model.Student
import org.junit.jupiter.api.Test
import org.junit.jupiter.api.Assertions.*

internal class StudentServiceTest {

    private var teste = StudentService()
        val j123 = Student("j123", "james", "", null)
    @Test
    fun isSubscribed() {
        teste.subscribeStudent(j123)
        assertEquals(false, teste.isSubscribed("j123"))
    }





}