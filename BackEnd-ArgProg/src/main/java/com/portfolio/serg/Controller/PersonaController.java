
package com.portfolio.serg.Controller;

import com.portfolio.serg.Entity.Persona;
import com.portfolio.serg.Interface.IPersonaService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PersonaController {
    @Autowired IPersonaService iPersonaService;
    
    @GetMapping
    public String decirHola(){
        return "Hola mundo";
    }
    
    
    @GetMapping("personas/traer")
    public List<Persona> getPersona(){
        return iPersonaService.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        iPersonaService.savePersona(persona);
        return "Se guardo nueva persona";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable long id){
        iPersonaService.deletePersona(id);
        return "Se elimino correctamente";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersono (@PathVariable Long id,
        @RequestParam("nombre") String nuevoNombre,
        @RequestParam("apellido") String nuevoApellido,
        @RequestParam("img") String nuevoImg){
        
        Persona persona = iPersonaService.findPersona(id);
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        
        iPersonaService.savePersona(persona);
        return persona;
    }
}
