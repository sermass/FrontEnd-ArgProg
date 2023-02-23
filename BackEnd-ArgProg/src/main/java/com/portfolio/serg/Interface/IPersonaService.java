
package com.portfolio.serg.Interface;

import com.portfolio.serg.Entity.Persona;
import java.util.List;


public interface IPersonaService {
    
    //Lista de Personas
    public List<Persona> getPersona();

    //guardar persona
    public void savePersona(Persona pers);
    
    //Eliminar una persona por Id
    public void deletePersona(Long id);
    
    //Buscar persona por id
    public Persona findPersona(Long id);
    
}
