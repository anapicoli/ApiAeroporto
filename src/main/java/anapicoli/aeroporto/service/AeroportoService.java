package anapicoli.aeroporto.service;

import anapicoli.aeroporto.model.Aeroporto;
import anapicoli.aeroporto.repository.AeroportoRepository;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class AeroportoService {

    private final AeroportoRepository repository;

    public AeroportoService(AeroportoRepository repository) {
        this.repository = repository;
    }

    public Aeroporto criarAeroporto(Aeroporto aeroporto) {
        return repository.save(aeroporto);
    }

    public List<Aeroporto> listarTodos() {
        return repository.findAll();
    }

    public Optional<Aeroporto> buscarPorId(Long id) {
        return repository.findById(id);
    }

    public Optional<Aeroporto> atualizar(Long id, Aeroporto aeroporto) {
        return repository.findById(id).map(a -> {
            a.setNome(aeroporto.getNome());
            a.setCodigoIATA(aeroporto.getCodigoIATA());
            a.setCidade(aeroporto.getCidade());
            a.setEstado(aeroporto.getEstado());
            a.setPais(aeroporto.getPais());
            return repository.save(a);
        });
    }

    public boolean deletar(Long id) {
        return repository.findById(id).map(a -> {
            repository.delete(a);
            return true;
        }).orElse(false);
    }
}