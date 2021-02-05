package com.example.todolist.tests

import androidx.test.ext.junit.rules.ActivityScenarioRule
import androidx.test.platform.app.InstrumentationRegistry
import androidx.test.ext.junit.runners.AndroidJUnit4
import com.example.todolist.MainActivity
import com.example.todolist.steps.TasksStep
import com.schibsted.spain.barista.interaction.BaristaSleepInteractions.sleep
import org.junit.ClassRule
import org.junit.Test
import org.junit.runner.RunWith
import org.junit.Rule

@RunWith(AndroidJUnit4::class)
class E2ETest {

    @Rule
    @JvmField
    val activityRule = ActivityScenarioRule(MainActivity::class.java)

    @Test
    fun toDoTaskTest() {

        TasksStep.whenUserEnterTaskSummary("Test LION-1234 Jira Ticket")

        TasksStep.thenUserAddTaskToDoList()

        TasksStep.thenUserMarkTaskDone()

        TasksStep.thenDeleteDoneTask()

    }

}