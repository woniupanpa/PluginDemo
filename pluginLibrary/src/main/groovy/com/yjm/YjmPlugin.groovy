package com.yjm
import org.gradle.api.Plugin
import org.gradle.api.Project
class YjmPlugin implements Plugin<Project> {
    @Override
    void apply(Project project) {

        project.task("yjm"){
            System.out.println("======================")
            System.out.println("my name is yjm")
            System.out.println("======================")
        }
    }
}