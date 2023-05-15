package mx.com.mySpringProyect.one;


import java.util.*;
import lombok.extern.slf4j.Slf4j;
import mx.com.domain.Persona;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
//import org.springframework.web.bind.annotation.RestController;

@Controller
//@RestController
@Slf4j
public class ControladorInicio {
    
    @GetMapping("/")
    public String inicio(Model miModelo){
        
        var miSaludo = "Hola mundo con Thymeleaf";
        var persona= new Persona();
        var persona2= new Persona();
        
        persona.setNombre("Uriel");
        persona.setApellido("Gonzalez");
        persona.setEmail("uriel@mail.com");
        persona.setTelefono("3315197218");
        
        persona2.setNombre("Karen");
        persona2.setApellido("Cecilia");
        persona2.setEmail("kceci@mail.com");
        persona2.setTelefono("3329040347");
        
        var personas = Arrays.asList(persona, persona2);
        //var personas = new ArrayList();
        
        log.info("Ejecutando el controlador Sring MVC");
        miModelo.addAttribute("mensaje", miSaludo);
        miModelo.addAttribute("uriel", persona);
        miModelo.addAttribute("nosotros",personas);
        return "index";
        }
}
