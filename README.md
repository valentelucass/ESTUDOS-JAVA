# ESTUDOS-JAVA

Repositório com exercícios e pequenos projetos de estudo em Java. Organizado por assuntos (IF/ELSE, FOR, WHILE, VETORES, MATRIZES, SWITCH-CASE, MÉTODOS/FUNÇÕES) e por projetos simples em `PROJETOS/`.

## Visão Geral
- Conteúdo voltado a treinar lógica, sintaxe Java e uso de `Scanner`, estruturas de decisão e repetição, vetores/matrizes e métodos.
- Cada arquivo geralmente possui um `main` executável.

## Estrutura
- `INICIANDO-JAVA/` — exercícios básicos.
- `IF-ELSE/` — condicionais.
- `SWITCH-CASE/` — seleção múltipla.
- `FOR/`, `WHILE/` — laços de repetição.
- `VETORES/`, `MATRIZES-VETORES/` — arrays e matrizes.
- `METODOS-FUNCOES/` — extração de lógica em métodos.
- `PROJETOS/` — miniaplicações (ex.: `JogoAdvinhacao`, `Calculadora`, etc.).

## Pré-requisitos
- Java JDK 17+ (ou 11+). Verifique:
  ```bash
  java -version
  javac -version
  ```
- Windows (com Prompt de Comando ou PowerShell). Funciona também em Linux/macOS com ajustes de caminho.

## Como compilar e executar (Windows)
1) Abrir um terminal na pasta do repositório.
2) Navegar até a pasta do exercício e compilar:
   ```bat
   javac NomeDoArquivo.java
   ```
3) Executar a classe (sem .java):
   ```bat
   java NomeDoArquivo
   ```

Exemplos práticos:
- Rodar um exercício em `SWITCH-CASE/` (ex.: `Main6.java`):
  ```bat
  cd "SWITCH-CASE"
  javac Main6.java && java Main6
  ```
- Rodar um projeto (ex.: `PROJETOS/JogoAdvinhacao`):
  ```bat
  cd "PROJETOS/JogoAdvinhacao"
  javac *.java && java Main
  ```

Dica: use aspas em caminhos com espaços/acentos (como "Área de Trabalho").

## Executando no VS Code (recomendado)
- Instale as extensões: "Extension Pack for Java".
- Abra a pasta do repositório no VS Code.
- Abra um arquivo `.java` com `main` e clique em "Run" (ou use o botão ▶ na barra do editor).
- Para usar o Code Runner: configure para executar com `java`/`javac` via terminal integrado.

## Padrões de código e organização
- Cada arquivo deve conter uma classe pública com o mesmo nome do arquivo. Ex.: `public class Main6` em `Main6.java`.
- Use `Scanner` para entrada e sempre feche com `input.close()` ao final do `main` quando não houver mais leituras.
- Para casas decimais, prefira `Locale.US` quando necessário:
  ```java
  import java.util.Locale;
  Locale.setDefault(Locale.US);
  ```

## Dicas e problemas comuns
- Codificação/acentos: salve arquivos como UTF-8. No VS Code: UTF-8 no canto inferior direito.
- `Scanner` e quebra de linha: após `nextInt()`/`nextDouble()`, se for ler uma `String` completa use `input.nextLine()` para consumir a quebra de linha pendente.
- Locale: formatação com `String.format("%.2f", valor)` pode depender do locale. Se precisar de ponto decimal, defina `Locale.US`.
- OneDrive/caminhos com acento: use aspas quando rodar via terminal (ex.: `cd "C:\Users\lucas\OneDrive\Área de Trabalho\..."`).

## Como encontrar e rodar qualquer exercício rápido
- Listar arquivos Java (PowerShell):
  ```powershell
  Get-ChildItem -Recurse -Filter *.java | Select-Object FullName
  ```
- Compilar tudo de uma pasta:
  ```bat
  javac *.java
  ```
- Rodar uma classe específica:
  ```bat
  java NomeDaClasse
  ```

## Próximos passos sugeridos
- Adicionar testes simples (JUnit) para alguns exercícios.
- Padronizar nomes das classes de entrada (ex.: `Main`, `ExercicioN`, `QuestaoN`).
- Criar um script para compilar/rodar automaticamente por pasta.

## Licença
Uso educacional. Ajuste conforme necessário (MIT, Apache-2.0, etc.).
