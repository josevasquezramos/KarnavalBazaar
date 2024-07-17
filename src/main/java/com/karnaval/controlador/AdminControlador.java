package com.karnaval.controlador;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import com.karnaval.servicio.UsuarioService;


@Controller
@RequestMapping("/admin")
public class AdminControlador {
	
	@Autowired
    private UsuarioService usuarioService;
	
	@GetMapping({"/index", ""})
    public String getIndex(Model model) {
		model.addAttribute("listaUsuarios", usuarioService.listarTodos());
        return "admin/indexAdmin";
    }
	
}
