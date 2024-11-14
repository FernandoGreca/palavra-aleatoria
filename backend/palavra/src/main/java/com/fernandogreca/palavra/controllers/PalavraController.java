package com.fernandogreca.palavra.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class PalavraController {

    public static final List<String> palavrasAleatorias = new ArrayList<>(List.of(
            "algoritmo",
            "compilador",
            "depuracao",
            "framework",
            "iteracao",
            "polimorfismo",
            "recursao",
            "sintaxe",
            "classe",
            "objeto",
            "encapsulamento",
            "heranca",
            "interface",
            "metodo",
            "parametro",
            "script",
            "variavel",
            "excecao",
            "banco de dados",
            "api",
            "biblioteca",
            "compilacao",
            "depurador",
            "expressao lambda",
            "implementacao",
            "jdk",
            "jvm",
            "pacote",
            "subclasse",
            "superclasse",
            "refatoracao",
            "padrao de projeto",
            "sistema operacional",
            "conexao",
            "protocolo",
            "thread",
            "unicode",
            "serializacao",
            "compilador",
            "git"));

    @GetMapping("/buscarPalavraAleatoriamente")
    public String bucarPalavraAleatoria() {
        Random random = new Random();
        int index = random.nextInt(palavrasAleatorias.size());
        String palavraAleatoria = palavrasAleatorias.get(index);
        return palavraAleatoria;
    }
}
