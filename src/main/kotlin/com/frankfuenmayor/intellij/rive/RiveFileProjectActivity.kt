package com.frankfuenmayor.intellij.rive

import com.intellij.openapi.project.Project
import com.intellij.openapi.startup.ProjectActivity

class RiveFileProjectActivity : ProjectActivity {
    override suspend fun execute(project: Project) {
        RiveFileServer.start()
    }
}