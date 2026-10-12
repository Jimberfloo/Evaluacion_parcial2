package cl.duoc.microservicio_evaluacion2.controller;

import cl.duoc.microservicio_evaluacion2.model.Producto;
import cl.duoc.microservicio_evaluacion2.repository.ProductoRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/productos")
public class ProductoController {

    @Autowired
    private ProductoRepository productoRepository;

    @GetMapping
    public List<Producto> obtenerTodos() {
        return productoRepository.findAll();
    }

    @PostMapping
    public ResponseEntity<Producto> crearProducto(@RequestBody Producto producto) {
        Producto nuevo = productoRepository.save(producto);
        return new ResponseEntity<>(nuevo, HttpStatus.CREATED);
    }
}