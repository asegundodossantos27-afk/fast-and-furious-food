/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package com.devAna.fastfood.domain.model;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesi3dia
 */
@RestController
@RequestMapping("/fastfurious/pedido")
public class PedidoController {

    @Autowired
    private PedidoService service;

    @PutMapping("/status/{id}")
    public ResponseEntity<ItemPedido> alterarStatus(@PathVariable Long id, @RequestBody String novoStatus) {
        return ResponseEntity.ok(service.atualizarStatus(id, novoStatus));
    }
}
