package br.com.jardielsousa.enumeration

enum class StatusTransacao(
    val descricao: String
) {
    ATIVA("Ativa"),
    CANCELADA("Cancelada")
}