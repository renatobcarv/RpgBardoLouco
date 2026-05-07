# 🎲 RPG do Bardo Louco

> Projeto de aprendizado em Java focado em **Programação Orientada a Objetos (POO)**.  
> Construído passo a passo, errando, corrigindo e documentando cada conceito assimilado.

---

## 📜 Sobre o projeto

Um pequeno RPG de console onde o jogador escolhe sua raça (Humano ou Orc),
recebe um nome, lê a lore do reino de Alabart e visualiza sua ficha técnica.

Simples na superfície. Profundo no propósito: cada linha foi escrita
para internalizar conceitos fundamentais de orientação a objetos.

---

## 🎮 Como jogar

### Pré-requisitos
- Java 17 ou superior (por causa das *text blocks* `"""`)

### Compilar e executar

```bash
cd src
javac Classes.java JogadorMain.java
java JogadorMain
```

---

## 🧠 Conceitos aplicados

| Conceito | Onde aparece |
|----------|--------------|
| Classes e objetos | `Classes.java` |
| Atributos de instância | `dano`, `vida`, `armadura`, `nome` |
| Herança | `Humano extends Classes`, `Orc extends Classes` |
| Classes internas estáticas | `public static class Humano` |
| Sobrescrita de método | `@Override toString()` |
| Construtores | `public Humano()`, `public Orc()` |
| Entrada de dados | `Scanner` e tratamento do buffer |
| Text blocks | Lore em `"""..."""` |

---

## 📂 Estrutura

```
rpg-bardo-louco/
├── README.md          → este arquivo
├── docs/
│   └── JORNADA.md     → registro completo dos erros e aprendizados
└── src/
    ├── Classes.java   → classe base + raças (Humano, Orc)
    └── JogadorMain.java → fluxo principal do jogo
```

---

## 🛤️ A jornada

Este projeto não nasceu pronto. Ele foi sendo construído errando, quebrando e refatorando.  
Toda essa trajetória está documentada em [`docs/JORNADA.md`](docs/JORNADA.md) — leitura recomendada
pra quem está começando em POO.

---

## ✍️ Autor

**Renato Barros de Carvalho**
Primeira aula prática de Orientação a Objetos.

---

## 📖 Licença

Projeto de estudo, livre pra usar, modificar e aprender.
