package productor;


import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RestController;



@RestController
public class SaludoImplementacion implements SaludoControlador {
    public String saludar(@PathVariable("nombre") String nombre) {
        return String.format("Hola %s!\n", nombre);
    }
}
