package cl.duoc.microservicio_evaluacion2.repository;

import cl.duoc.microservicio_evaluacion2.model.Producto;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface ProductoRepository extends JpaRepository<Producto, Long> {
}
