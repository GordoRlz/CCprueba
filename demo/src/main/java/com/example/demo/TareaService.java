package com.example.demo;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import java.util.List;

@Service
public class TareaService {

    @Autowired
    private TareaRepository tareaRepository;

    // Método para obtener todas las tareas
    public List<Tarea> obtenerTodasLasTareas() {
        return tareaRepository.findAll();
    }

    // Método para guardar una nueva tarea
    public Tarea guardarTarea(Tarea tarea) {
        return tareaRepository.save(tarea);
    }

    // Método para obtener una tarea por su id
    public Tarea obtenerTareaPorId(Long id) {
        return tareaRepository.findById(id).orElse(null);
    }

    // Método para eliminar una tarea por su id
    public void eliminarTareaPorId(Long id) {
        tareaRepository.deleteById(id);
    }
}
