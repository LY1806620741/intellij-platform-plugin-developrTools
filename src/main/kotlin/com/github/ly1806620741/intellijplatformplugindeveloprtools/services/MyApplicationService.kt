package com.github.ly1806620741.intellijplatformplugindeveloprtools.services

import com.github.ly1806620741.intellijplatformplugindeveloprtools.MyBundle

class MyApplicationService {

    init {
        println(MyBundle.message("applicationService"))

        System.getenv("CI")
            ?: TODO("Don't forget to remove all non-needed sample code files with their corresponding registration entries in `plugin.xml`.")
    }
}
