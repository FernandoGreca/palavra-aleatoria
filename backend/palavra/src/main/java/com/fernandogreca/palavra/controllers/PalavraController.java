package com.fernandogreca.palavra.controllers;

import java.util.ArrayList;
import java.util.List;
import java.util.Random;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.fernandogreca.palavra.models.PalavraModel;

@RestController
public class PalavraController {

    List<PalavraModel> palavrasAleatorias = new ArrayList<>(List.of(
            new PalavraModel("algoritmo", "Sequência finita de instruções bem definidas",
                    "Conceito fundamental em programação"),
            new PalavraModel("compilador", "Programa que traduz código fonte em linguagem de máquina",
                    "Necessário para a execução de programas"),
            new PalavraModel("depuracao", "Processo de encontrar e resolver bugs",
                    "Ferramenta essencial para desenvolvedores"),
            new PalavraModel("framework", "Conjunto de bibliotecas e ferramentas que auxiliam o desenvolvimento",
                    "Exemplo: Spring, Angular"),
            new PalavraModel("iteracao", "Processo de repetir um conjunto de instruções", "Usado em loops"),
            new PalavraModel("polimorfismo", "Capacidade de um objeto ser referenciado de várias formas",
                    "Conceito chave na orientação a objetos"),
            new PalavraModel("recursao", "Função que chama a si mesma",
                    "Útil para resolver problemas complexos de forma elegante"),
            new PalavraModel("sintaxe", "Regras que definem a estrutura do código",
                    "Importante para evitar erros de compilação"),
            new PalavraModel("classe", "Molde para criar objetos", "Componente básico da orientação a objetos"),
            new PalavraModel("objeto", "Instância de uma classe",
                    "Representa entidades no mundo real no contexto de programação"),
            new PalavraModel("encapsulamento", "Ocultação de detalhes de implementação",
                    "Promove a modularidade e a segurança"),
            new PalavraModel("heranca", "Mecanismo onde uma classe herda características de outra",
                    "Facilita a reutilização de código"),
            new PalavraModel("interface", "Contrato que uma classe pode implementar",
                    "Define um conjunto de métodos sem implementação"),
            new PalavraModel("metodo", "Função definida em uma classe",
                    "Realiza operações ou manipulações de dados do objeto"),
            new PalavraModel("parametro", "Variável usada para passar dados para um método",
                    "Permite a entrada de diferentes valores em métodos"),
            new PalavraModel("script", "Conjunto de comandos executados por um interpretador",
                    "Usado para automatizar tarefas"),
            new PalavraModel("variavel", "Espaço na memória para armazenar valores", "Elemento básico de programação"),
            new PalavraModel("excecao", "Evento anômalo ou erro que ocorre durante a execução",
                    "Deve ser tratado para evitar falhas"),
            new PalavraModel("banco de dados", "Sistema para armazenar e gerenciar dados",
                    "Crucial para aplicações que manipulam grandes volumes de informação"),
            new PalavraModel("api", "Interface de Programação de Aplicações",
                    "Permite que diferentes sistemas se comuniquem"),
            new PalavraModel("biblioteca", "Coleção de funções e rotinas reutilizáveis",
                    "Facilita o desenvolvimento de software"),
            new PalavraModel("compilacao", "Processo de conversão de código fonte em executável",
                    "Necessário para programas escritos em linguagens compiladas"),
            new PalavraModel("depurador", "Ferramenta que auxilia na identificação de erros de código",
                    "Essencial para a correção de bugs"),
            new PalavraModel("expressao lambda", "Forma concisa de representar funções anônimas",
                    "Usada em linguagens que suportam programação funcional"),
            new PalavraModel("implementacao", "Ato de escrever o código para executar a lógica",
                    "Parte essencial do desenvolvimento de software"),
            new PalavraModel("jdk", "Kit de Desenvolvimento Java",
                    "Inclui ferramentas necessárias para desenvolver em Java"),
            new PalavraModel("jvm", "Máquina Virtual Java", "Executa programas Java"),
            new PalavraModel("pacote", "Agrupamento de classes e interfaces relacionadas",
                    "Ajuda a organizar o código"),
            new PalavraModel("subclasse", "Classe que herda de outra classe",
                    "Facilita a especialização de comportamentos"),
            new PalavraModel("superclasse", "Classe da qual outras classes herdam",
                    "Base para a criação de subclasses"),
            new PalavraModel("refatoracao", "Processo de melhorar o código sem alterar sua funcionalidade",
                    "Melhora a legibilidade e manutenção"),
            new PalavraModel("padrao de projeto", "Solução reutilizável para problemas comuns de software",
                    "Exemplos incluem Singleton, Factory"),
            new PalavraModel("sistema operacional", "Software que gerencia hardware e software",
                    "Exemplos incluem Windows, Linux"),
            new PalavraModel("conexao", "Ligação entre dois sistemas ou dispositivos",
                    "Essencial para comunicação de rede"),
            new PalavraModel("protocolo", "Conjunto de regras para comunicação", "Exemplos incluem HTTP, FTP"),
            new PalavraModel("thread", "Unidade básica de execução em um processo",
                    "Permite execução paralela de código"),
            new PalavraModel("unicode", "Padrão de codificação de caracteres",
                    "Permite representação de texto em diferentes sistemas"),
            new PalavraModel("serializacao",
                    "Processo de converter um objeto em bytes para armazenamento ou transmissão",
                    "Útil para persistência de dados"),
            new PalavraModel("git", "Sistema de controle de versão distribuído",
                    "Usado para rastrear mudanças no código")));

    @GetMapping("/buscarPalavraAleatoriamente")
    public PalavraModel bucarPalavraAleatoria() {
        Random random = new Random();
        int index = random.nextInt(palavrasAleatorias.size());
        PalavraModel palavraAleatoria = palavrasAleatorias.get(index);
        return palavraAleatoria;
    }
}
