package com.example.todolist.steps

import com.example.todolist.screens.TasksScreen

object TasksStep {
        fun whenUserEnterTaskSummary(summary: String) {
            TasksScreen.enterTaskSummary(summary)
        }

        fun thenUserAddTaskToDoList() {
            TasksScreen.addTaskToDoList()
        }

        fun thenUserMarkTaskDone() {
            TasksScreen.markTaskDone()
        }

        fun thenDeleteDoneTask() {
            TasksScreen.deleteDoneTask()
        }


}