package br.com.jardielsousa.controller

import br.com.jardielsousa.model.Empresa
import br.com.jardielsousa.service.EmpresaService
import org.springframework.http.HttpStatus
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.PathVariable
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestBody
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/empresa")
class EmpresaController(
    val empresaService: EmpresaService
) {

    @PostMapping
    fun criar(@RequestBody empresa: Empresa): ResponseEntity<Empresa> {
        val empresacriada = empresaService.criar(empresa)
        return ResponseEntity.status(HttpStatus.CREATED).body(empresacriada)
    }

    @GetMapping("/{id}")
    fun consultar(@PathVariable id: Long) : ResponseEntity<Empresa> {
        val empresa = empresaService.consultar(id)
        return ResponseEntity.ok(empresa)
    }

    @GetMapping
    fun listar() : ResponseEntity<List<Empresa>> {
        val empresas = empresaService.listar()
        return ResponseEntity.ok(empresas)
    }
}