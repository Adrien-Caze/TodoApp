package org.ldv.todoapp.controller.admin

import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.GetMapping

@Controller
class TachesController {
    @GetMapping("admin/taches")
    fun tachesAdmin(): String {
        return "admin/taches"
    }
}