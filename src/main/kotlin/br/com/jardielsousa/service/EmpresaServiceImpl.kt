package br.com.jardielsousa.service

import br.com.jardielsousa.model.Empresa
import br.com.jardielsousa.repository.EmpresaRepository
import org.springframework.stereotype.Service

@Service
class EmpresaServiceImpl(
    val empresaRepository: EmpresaRepository
) : EmpresaService {

    override fun criar(empresa: Empresa): Empresa = empresaRepository.save(empresa)

    override fun consultar(id: Long): Empresa {
        val empresaOptional = empresaRepository.findById(id)
        return empresaOptional.orElse(Empresa())
    }

    override fun listar(): List<Empresa> = empresaRepository.findAll()

}