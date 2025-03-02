package com.intelij.pluginStarter

import com.intellij.notification.NotificationGroupManager
import com.intellij.notification.NotificationType
import com.intellij.openapi.diagnostic.Logger
import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.StartupActivity

class MyStartupListener : StartupActivity {
    private val logger = Logger.getInstance(MyStartupListener::class.java)

    override fun runActivity(project: Project) {
        logger.info("Hello World Plugin: MyStartupListener is running!")  // Log before

        // ✅ Fixed: Use NotificationGroupManager instead of deprecated NotificationGroup
        val notificationGroup = NotificationGroupManager.getInstance()
            .getNotificationGroup("My Plugin Notifications")

        notificationGroup.createNotification(
            "Hello World! Plugin is Active 🚀",
            NotificationType.INFORMATION
        ).notify(project)

        logger.info("Hello World Plugin: Notification should be visible now!") // Log after
    }
}