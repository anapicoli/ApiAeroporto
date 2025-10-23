package anapicoli.aeroporto.controller;

import anapicoli.aeroporto.model.Aeroporto;
import anapicoli.aeroporto.service.AeroportoService;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/aeroportos")
public class AeroportoController {

    private final AeroportoService service;

    public AeroportoController(AeroportoService service) {
        this.service = service;
    }

    @PostMapping
    public Aeroporto criarAeroporto(@RequestBody Aeroporto aeroporto) {
        return service.criarAeroporto(aeroporto);
    }

    @GetMapping
    public List<Aeroporto> listarTodos() {
        return service.listarTodos();
    }

    @GetMapping("/{id}")
    public ResponseEntity<Aeroporto> buscarPorId(@PathVariable Long id) {
        return service.buscarPorId(id)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @PutMapping("/{id}")
    public ResponseEntity<Aeroporto> atualizar(@PathVariable Long id, @RequestBody Aeroporto aeroporto) {
        return service.atualizar(id, aeroporto)
                .map(ResponseEntity::ok)
                .orElse(ResponseEntity.notFound().build());
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletar(@PathVariable Long id) {
        boolean deletado = service.deletar(id);
        return deletado ? ResponseEntity.noContent().build() : ResponseEntity.notFound().build();
    }
}