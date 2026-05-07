# 🛤️ A Jornada — Erros, Correções e Aprendizados

> "Quem documenta o caminho aprende duas vezes."

Este arquivo registra todos os tropeços, dúvidas e descobertas durante a construção
do RPG do Bardo Louco. É um diário técnico — cada erro virou conceito, cada conceito virou base.

---

## 🎯 Objetivo do projeto

Construir um RPG simples em Java para aprender, na prática:
- Orientação a Objetos
- Modelagem de entidades
- Herança
- Organização de código
- Estruturação de sistemas

---

## 📍 Etapa 1 — Fundamentos (variáveis, atributos e estado)

### ❌ Confusão entre variável local e estado do objeto
Foi criada uma variável temporária `String humano` que não alterava o personagem real.

**Correção:** usar atributo único do objeto: `meuPersonagem.raca = "Humano";`

**Lição:** *Objetos guardam o estado real do sistema.*

---

### ❌ Uso de `==` para atribuição
Tentativa: `definirClasse == meuPersonagem;`

**Correção:** `=` atribui, `==` compara.

**Lição:** *Operadores têm papéis distintos. Confundi-los é confundir intenção com verificação.*

---

### ❌ `for` desnecessário
Loop usado pra executar uma única vez.

**Lição:** *Loops só existem quando há repetição real.*

---

### ❌ Exibir o número da escolha em vez da raça
`println(definirClasse)` mostrava `1` ou `2`.

**Correção:** mostrar o estado real: `println(meuPersonagem.raca)`.

**Lição:** *Separar entrada do usuário do estado do sistema.*

---

## 📍 Etapa 2 — Modelagem (representando a realidade)

### ❌ Variáveis separadas por raça
`String humano; String orc;` — modelagem que não representava a realidade.

**Correção:** `String raca;` — o personagem tem **uma** raça.

**Lição:** *Modelagem deve refletir a realidade do sistema.*

---

### ❌ Confusão entre método e classe
Métodos `void orc()` e `void humano()` usados pra representar tipos.

**Correção:** criar **classes** `Orc` e `Humano` herdando de `Personagem`.

**Lição:**
- Classe representa **o que algo É**.
- Método representa **o que algo FAZ**.

---

### ✅ Introdução à Herança
`class Orc extends Personagem` — Orc é um tipo especializado de Personagem.

---

## 📍 Etapa 3 — Sintaxe e estruturação

### ❌ Método dentro de construtor
```java
public Humano() {
    void exibeFicha() { }   // inválido
}
```

**Correção:** métodos ficam fora de outros métodos/construtores.

---

### ❌ Erro: `reached end of file while parsing`
Falta de chave `}` fechando a classe.

**Lição:** *Toda abertura precisa de fechamento. Estrutura é contrato.*

---

### ❌ `else (condição)` inválido
**Correção:** `else if (condição)`.

---

### ❌ Uso incorreto de `void`
`void orc;` — `void` é tipo de retorno, não tipo de variável.

**Correção:** chamar método com `orc();`.

---

## 📍 Etapa 4 — Objetos, instâncias e estado

### ❌ Variável local sombreando atributo
```java
public Humano() {
    String escolhaRaca = "Humano"; // cria variável local
}
```

**Correção:** usar o atributo herdado:
```java
escolhaRaca = "Humano";
```

**Lição:** *Declarar dentro do construtor cria uma variável que morre com ele.*

---

### ❌ Nome ficando `null` após escolha de raça
Causa: criar um novo objeto após capturar o nome zerava tudo.

**Correção:** capturar o nome **depois** de instanciar a raça correta.

**Lição:** *`new` cria objeto zerado. Estado anterior se perde se não for transferido.*

---

### ❌ Confusão entre classe interna e classe separada
- Classe interna: `new Classes.Humano()`
- Classe separada: `new Humano()`

**Lição:** *A localização da classe define como ela é referenciada.*

---

## 📍 Etapa 5 — Comparações e Strings

### ❌ Comparação sensível a maiúsculas
`equals("Humano")` falhava se o usuário digitasse "HUMANO".

**Correção:** `equalsIgnoreCase("Humano")`.

---

### ✅ Normalização com `toLowerCase()`
`"ORC".toLowerCase()` → `"orc"`.

---

## 📍 Etapa 6 — Exibição e `toString()`

### ❌ Saída `Classes$Humano@17a7cec2`
Causa: `println` chamava o `toString()` padrão de `Object`.

**Correção:** sobrescrever `toString()`:
```java
@Override
public String toString() {
    return escolhaRaca;
}
```

**Lição:** *Objetos devem saber se apresentar.*

---

### ❌ `@Override` em construtor
Construtores não são herdados — não podem ser sobrescritos.

---

### ❌ `meuPersonagem.nome = meuPersonagem.toString();`
`toString()` é pra **exibir**, não pra **armazenar**.

---

## 📍 Etapa 7 — Entrada de dados (`Scanner`)

### ❌ `nextLine()` pulado após `nextInt()`
Causa: o `nextInt()` deixa o ENTER no buffer, e o `nextLine()` seguinte o consome vazio.

**Correção rápida:**
```java
input.nextInt();
input.nextLine(); // consome ENTER pendente
```

**Correção definitiva:**
```java
Integer.parseInt(input.nextLine());
```

**Lição:** *Toda fonte externa de dados é traiçoeira. O que sobra invisível é o que mais quebra.*

---

## 📍 Etapa 8 — Polimento final (lore e UX)

- Reescrita da lore com verbos mais fortes e imagens concretas.
- Uso de `.formatted()` para personalizar texto com nome do jogador.
- Troca de `println` por `print` em prompts pra cursor ficar na mesma linha.
- Pausa entre parágrafos com `Thread.sleep()` pra dar ritmo cinematográfico.

---

## 🧠 Lições maiores (que vão além do Java)

1. **Modelagem é mais importante que sintaxe.**  
   Saber declarar variável é fácil. Saber *o que* declarar é o que separa programador de digitador.

2. **Objetos têm estado e comportamento.**  
   Estado = atributos. Comportamento = métodos. Tudo gira em torno disso.

3. **Toda abstração esconde uma realidade — represente bem.**  
   Se a modelagem está errada, qualquer código em cima vai sofrer.

4. **Erro não é fracasso, é dado.**  
   Cada bug deste documento virou conceito assimilado.

5. **O que sobra invisível é o que mais quebra.**  
   Vale pro `Scanner`, vale pra vida.

---

## ⚔️ Evolução real

**Saí de:**
- variáveis soltas
- lógica procedural
- "como faço funcionar?"

**Cheguei em:**
- abstração
- herança
- estruturação
- modelagem orientada a objetos
- "como represento isso corretamente?"

Esse é o início da mentalidade de engenharia de software.