/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devAna.fastfood.domain.model;

import com.devAna.fastfood.domain.repository.PedidoRepository;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 *
 * @author sesi3dia
 */
@Service
public class PedidoService {

    @Autowired
    private PedidoRepository repository;

    // 1. Criar ou Salvar Pedido
    public ItemPedido salvar(ItemPedido pedido) {
        return repository.save(pedido);
    }

    // 2. Listar todos os pedidos
    public List<ItemPedido> listarTodos() {
        return repository.findAll();
    }

    
    // 3. Buscar por ID
    public ItemPedido buscarPorId(Long id) {
        return repository.findById(id)
            .orElseThrow(() -> new RuntimeException("Pedido não encontrado com o ID: " + id));
    }

    
    public ItemPedido atualizarStatus(Long id, String novoStatus) {
        ItemPedido pedido = buscarPorId(id); // Usa o método de busca que criamos acima
        
        pedido.setStatus(novoStatus.toUpperCase());
        
        return repository.save(pedido);
    }
    
    // 5. Deletar Pedido
    public void deletar(Long id) {
        ItemPedido pedido = buscarPorId(id);
        repository.delete(pedido);
    }
}