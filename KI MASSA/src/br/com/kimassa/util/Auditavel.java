package br.com.kimassa.util;

public interface Auditavel {

    void registrarLog(String acao);

    String obterHistorico();
}