package productor;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;

public interface SaludoControlador {
    @RequestMapping("/saludo/{nombre}")
    String saludar(@PathVariable("nombre") String nombre);
}
