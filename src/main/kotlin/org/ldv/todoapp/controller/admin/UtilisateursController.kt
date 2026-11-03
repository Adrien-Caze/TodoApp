package org.ldv.todoapp.controller.admin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class UtilisateursController {
    @GetMapping("admin/utilisateurs")
    fun tachesAdmin(): String {
        return "admin/utilisateurs"
    }
}