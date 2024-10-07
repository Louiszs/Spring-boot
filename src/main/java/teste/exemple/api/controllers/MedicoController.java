package teste.exemple.api.controllers;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import teste.exemple.api.dto.MedicosDTO;

@RestController
@RequestMapping("medicos")
public class MedicoController {

    @PostMapping
    public MedicosDTO chamar (@RequestBody MedicosDTO dados){
        return dados;
    }
}
