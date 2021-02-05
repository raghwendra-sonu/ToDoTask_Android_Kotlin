package com.example.todolist.screens
import com.example.todolist.R
import com.schibsted.spain.barista.assertion.BaristaVisibilityAssertions.assertContains
import com.schibsted.spain.barista.interaction.BaristaClickInteractions.clickOn
import com.schibsted.spain.barista.interaction.BaristaEditTextInteractions.writeTo
import com.schibsted.spain.barista.interaction.BaristaSleepInteractions.sleep

object TasksScreen {

    fun enterTaskSummary(summary: String) {
        clickOn(R.id.etTodoTitle)
        writeTo(R.id.etTodoTitle, summary);
        assertContains(R.id.etTodoTitle, summary);
        sleep(2000);
    }

    fun addTaskToDoList() {
        clickOn(R.id.btnAddTodo)
        sleep(2000);
    }

    fun markTaskDone(){
        clickOn(R.id.cbDone)
        sleep(2000);
    }

    fun deleteDoneTask() {
        clickOn(R.id.btnDeleteDoneTodos)
        sleep(2000);
    }

}