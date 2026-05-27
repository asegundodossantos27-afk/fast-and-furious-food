package com.devAna.fastfood.domain.model;

import jakarta.persistence.EntityManager;
import jakarta.persistence.PersistenceContext;
import java.util.List;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 *
 * @author sesi3dia
 */
@RestController
public class ProdutoController {

    @PersistenceContext
    private EntityManager manager;

    //@Autowired
    //private ProdutoRepository produtoRepository;
    @GetMapping("/produtos")
    public List<Produto> listas() {
        return manager.createQuery("from Produto", Produto.class).getResultList();
        //return produtoRepository.findAll();
    }

}
