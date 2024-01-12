package br.com.jardielsousa.model

import br.com.jardielsousa.enumeration.StatusTransacao
import jakarta.persistence.Entity
import jakarta.persistence.Enumerated
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.ManyToOne
import jakarta.persistence.Table
import java.math.BigDecimal

@Entity
@Table(name = "transacoes")
data class Transacao(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,

    val descricao: String,

    @Enumerated
    var status: StatusTransacao = StatusTransacao.ATIVA,

    var valor: BigDecimal,

    @ManyToOne
    @JoinColumn(name = "id_empresa")
    val empresa: Empresa,

    @ManyToOne
    @JoinColumn(name = "id_tipo")
    val tipoTransacao: TipoTransacao
)
