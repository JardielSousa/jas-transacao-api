package br.com.jardielsousa.repository

import br.com.jardielsousa.model.Empresa
import org.springframework.data.jpa.repository.JpaRepository

interface EmpresaRepository: JpaRepository<Empresa, Long> {
}