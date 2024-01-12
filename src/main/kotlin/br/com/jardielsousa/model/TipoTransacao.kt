package br.com.jardielsousa.model

import com.fasterxml.jackson.annotation.JsonIgnore
import jakarta.persistence.Entity
import jakarta.persistence.GeneratedValue
import jakarta.persistence.GenerationType
import jakarta.persistence.Id
import jakarta.persistence.JoinColumn
import jakarta.persistence.OneToMany
import jakarta.persistence.Table

@Entity
@Table(name = "tipo_transacoes")
data class TipoTransacao(
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    val id: Long,
    val descricao: String,

    @OneToMany
    @JoinColumn(name = "id_tipo")
    @JsonIgnore
    val transacoes: List<Transacao>
)
