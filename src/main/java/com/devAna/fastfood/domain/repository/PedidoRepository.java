/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package com.devAna.fastfood.domain.repository;

import com.devAna.fastfood.domain.model.ItemPedido;
import java.util.List;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

/**
 *
 * @author sesi3dia
 */
@Repository
public interface PedidoRepository extends JpaRepository<ItemPedido, Long> {
    List<ItemPedido> findByStatus(String status);
}

