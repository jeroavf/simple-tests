package br.mp.mpf.simpletests.model.service;

import java.util.List;

import br.mp.mpf.simpletests.model.Defeito;
import br.mp.mpf.simpletests.model.repository.DefeitoRepository;

public class DefeitoService {

    private DefeitoRepository repository;

    public DefeitoService(DefeitoRepository repository) {
	super();
	this.repository = repository;
    }

    public Defeito incluir(Defeito entidade) {
	return repository.incluir(entidade);
    }

    public Defeito alterar(Defeito entidade) {
	return repository.alterar(entidade);
    }

    public void excluir(Defeito entidade) {
	repository.excluir(entidade);
    }

    public Defeito consultarPorId(Long id) {
	return repository.consultarPorId(id);
    }

    public List<Defeito> consultarTodos() {
	return repository.consultarTodos();
    }

}
