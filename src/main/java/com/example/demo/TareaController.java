package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import java.util.List;

@RestController
@RequestMapping("/api/tareas")
public class TareaController {

    @Autowired
    private TareaService tareaService;

    // Endpoint para obtener todas las tareas
    @GetMapping
    public List<Tarea> obtenerTodasLasTareas() {
        return tareaService.obtenerTodasLasTareas();
    }

    // Endpoint para obtener una tarea por su id
    @GetMapping("/{id}")
    public Tarea obtenerTareaPorId(@PathVariable Long id) {
        return tareaService.obtenerTareaPorId(id);
    }

    // Endpoint para guardar una nueva tarea
    @PostMapping
    public Tarea guardarTarea(@RequestBody Tarea tarea) {
        return tareaService.guardarTarea(tarea);
    }

    // Endpoint para eliminar una tarea por su id
    @DeleteMapping("/{id}")
    public void eliminarTareaPorId(@PathVariable Long id) {
        tareaService.eliminarTareaPorId(id);
    }
}
