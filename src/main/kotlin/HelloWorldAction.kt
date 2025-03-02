package com.intelij.pluginStarter

import com.intellij.openapi.actionSystem.AnAction
import com.intellij.openapi.actionSystem.AnActionEvent
import com.intellij.openapi.ui.Messages

class HelloWorldAction : AnAction("Say Hello") {
    override fun actionPerformed(e: AnActionEvent) {
        Messages.showMessageDialog(
            e.project,
            "Hello from your Plugin! 🎉",
            "My Plugin",
            Messages.getInformationIcon()
        )
    }
}
