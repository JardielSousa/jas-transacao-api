package br.com.jardielsousa.service

import br.com.jardielsousa.model.Empresa

interface EmpresaService {
    fun criar(empresa: Empresa): Empresa

    fun consultar(id: Long): Empresa

    fun listar(): List<Empresa>
}