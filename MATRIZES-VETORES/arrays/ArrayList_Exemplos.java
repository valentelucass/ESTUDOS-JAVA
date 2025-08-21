package arrays;
import java.util.*;
import java.util.stream.Collectors;

public class ArrayList_Exemplos {

    public static void main(String[] args) {
        demoCriacaoEAdicao();
        demoAcessoModificacao();
        demoRemocoesEAmbiguidade();
        demoIteracao();
        demoConversoesEntreArrayEList();
        demoOrdenacao();
        demoOperacoesEmLote();
        demoObjetosPersonalizados();
        demoCapacidadeESincronizacao();
        demoStreams();
        imprimirExercicios();
    }

    // 1) Criação e adição básica
    static void demoCriacaoEAdicao() {
        System.out.println("\n== Criação e adição básica ==");
        ArrayList<String> lista = new ArrayList<>();
        lista.add("Maçã"); // adiciona no final
        lista.add("Banana");
        lista.add("Laranja");
        System.out.println("Lista: " + lista); // toString padrão: [Maçã, Banana, Laranja]

        // adicionar em posição específica
        lista.add(1, "Pera"); // insere "Pera" no índice 1, deslocando os demais
        System.out.println("Após add(1, \"Pera\"): " + lista);

        // informações
        System.out.println("Tamanho: " + lista.size());
        System.out.println("Vazia? " + lista.isEmpty());
    }

    // 2) Acesso e modificação
    static void demoAcessoModificacao() {
        System.out.println("\n== Acesso e modificação ==");
        ArrayList<Integer> nums = new ArrayList<>();
        nums.add(10);
        nums.add(20);
        nums.add(30);

        // get e set
        System.out.println("Elemento índice 1: " + nums.get(1)); // 20
        nums.set(1, 25); // substitui o elemento no índice 1
        System.out.println("Depois de set(1,25): " + nums);

        // toArray
        Integer[] arrInteger = nums.toArray(new Integer[0]);
        System.out.println("Array via toArray: " + Arrays.toString(arrInteger));

        // converter para primitivos (int[]) usando stream
        int[] primitivos = nums.stream().mapToInt(Integer::intValue).toArray();
        System.out.println("Array primitivo: " + Arrays.toString(primitivos));
    }

    // 3) Remoções e ambiguidade com Integer
    static void demoRemocoesEAmbiguidade() {
        System.out.println("\n== Remoções e ambiguidade (Integer) ==");
        ArrayList<String> letras = new ArrayList<>(Arrays.asList("a", "b", "c"));
        letras.remove("b"); // remove por valor
        System.out.println("Após remove(\"b\"): " + letras);

        ArrayList<Integer> numeros = new ArrayList<>(Arrays.asList(0, 1, 2, 3));
        System.out.println("Original numeros: " + numeros);
        numeros.remove(2); // remove por índice quando tipo é int primitivo na chamada: remove(int index)
        System.out.println("Depois remove(2) -> remove índice 2: " + numeros);

        // Para remover o valor 1 (não o índice 1), use Integer.valueOf
        numeros.add(2); // volta a ter 2
        System.out.println("Antes de remover por valor: " + numeros);
        numeros.remove(Integer.valueOf(1)); // remove o elemento cujo valor é 1
        System.out.println("Depois remove(Integer.valueOf(1)): " + numeros);
    }

    // 4) Iteração: for, foreach, Iterator, ListIterator e Streams
    static void demoIteracao() {
        System.out.println("\n== Iteração ==");
        ArrayList<String> tarefas = new ArrayList<>(Arrays.asList("Estudar", "Praticar", "Revisar"));

        // for tradicional por índice
        for (int i = 0; i < tarefas.size(); i++) {
            System.out.println("Índice " + i + " -> " + tarefas.get(i));
        }

        // for-each (enhanced for)
        for (String t : tarefas) {
            System.out.println("Tarefa: " + t);
        }

        // Iterator (permite remover enquanto itera)
        Iterator<String> it = tarefas.iterator();
        while (it.hasNext()) {
            String t = it.next();
            if (t.equals("Praticar")) {
                it.remove(); // remoção segura durante iteração
            }
        }
        System.out.println("Após remoção com iterator: " + tarefas);

        // ListIterator para percorrer em ambas direções
        ListIterator<String> lit = tarefas.listIterator();
        while (lit.hasNext()) {
            lit.next();
        }
        while (lit.hasPrevious()) {
            System.out.println("ListIterator backward: " + lit.previous());
        }
    }

    // 5) Conversões entre Array e ArrayList e diferenças com Arrays.asList
    static void demoConversoesEntreArrayEList() {
        System.out.println("\n== Conversões Array <-> ArrayList ==");

        // Array -> List com Arrays.asList (view fixa ligada ao array)
        String[] frutas = {"Maçã", "Banana", "Laranja"};
        List<String> view = Arrays.asList(frutas);
        System.out.println("View com Arrays.asList: " + view);
        // view.add("Uva"); // lança UnsupportedOperationException se descomentado

        // Se precisar de lista mutável, crie uma nova ArrayList a partir da view
        ArrayList<String> listaMutavel = new ArrayList<>(Arrays.asList(frutas));
        listaMutavel.add("Uva");
        System.out.println("ArrayList mutável: " + listaMutavel);

        // ArrayList -> Array
        String[] copia = listaMutavel.toArray(new String[0]);
        System.out.println("De volta a array: " + Arrays.toString(copia));

        // Atenção especial com int[] e Arrays.asList
        int[] prims = {1, 2, 3};
        List<int[]> trap = Arrays.asList(prims); // cria List<int[]> com 1 elemento (o array)
        System.out.println("Pitfall Arrays.asList com int[]: size = " + trap.size());

        // Correto usando Integer[] ou copiando manualmente
        Integer[] wrapper = {1, 2, 3};
        List<Integer> listFromWrapper = Arrays.asList(wrapper);
        System.out.println("Arrays.asList com Integer[] -> " + listFromWrapper);
    }

    // 6) Ordenação de listas (Collections.sort e Comparator)
    static void demoOrdenacao() {
        System.out.println("\n== Ordenação ==");
        ArrayList<String> nomes = new ArrayList<>(Arrays.asList("Zé", "Ana", "joão", "Bruno"));
        System.out.println("Antes: " + nomes);

        // Ordenação natural (case-sensitive)
        Collections.sort(nomes);
        System.out.println("Collections.sort (natural): " + nomes);

        // Ordenação case-insensitive
        nomes = new ArrayList<>(Arrays.asList("Zé", "Ana", "joão", "Bruno"));
        nomes.sort(String.CASE_INSENSITIVE_ORDER);
        System.out.println("Case-insensitive: " + nomes);

        // Ordenação com Comparator customizado (por tamanho da string)
        nomes.sort(Comparator.comparingInt(String::length));
        System.out.println("Ordenado por tamanho: " + nomes);
    }

    // 7) Operações em lote: addAll, removeAll, retainAll, clear
    static void demoOperacoesEmLote() {
        System.out.println("\n== Operações em lote ==");
        ArrayList<String> a = new ArrayList<>(Arrays.asList("A", "B", "C"));
        ArrayList<String> b = new ArrayList<>(Arrays.asList("B", "C", "D"));

        ArrayList<String> copiaA = new ArrayList<>(a);
        copiaA.addAll(b); // união (com duplicatas)
        System.out.println("a + b (addAll): " + copiaA);

        ArrayList<String> copiaB = new ArrayList<>(a);
        copiaB.removeAll(b); // remove elementos presentes em b
        System.out.println("a - b (removeAll): " + copiaB);

        ArrayList<String> copiaC = new ArrayList<>(a);
        copiaC.retainAll(b); // interseção a ∩ b
        System.out.println("a ∩ b (retainAll): " + copiaC);

        copiaC.clear();
        System.out.println("Após clear, copiaC.isEmpty()? " + copiaC.isEmpty());
    }

    // 8) Uso com objetos personalizados (ex: Pessoa)
    static void demoObjetosPersonalizados() {
        System.out.println("\n== Objetos personalizados ==");
        ArrayList<Pessoa> pessoas = new ArrayList<>();
        pessoas.add(new Pessoa("Ana", 20));
        pessoas.add(new Pessoa("Bruno", 25));
        pessoas.add(new Pessoa("Carla", 22));

        System.out.println("Lista de pessoas: " + pessoas);

        // Ordenar por idade usando Comparator
        pessoas.sort(Comparator.comparingInt(Pessoa::getIdade));
        System.out.println("Ordenadas por idade: " + pessoas);
    }

    // 9) Capacidade e sincronização
    static void demoCapacidadeESincronizacao() {
        System.out.println("\n== Capacidade e sincronização ==");
        ArrayList<Integer> nums = new ArrayList<>(50); // garantir capacidade inicial
        System.out.println("Capacidade inicial solicitada: 50 (não é visível, mas evita re-allocs no começo)");
        nums.add(1);
        nums.add(2);

        // trimToSize reduz o array interno ao tamanho atual
        nums.trimToSize();

        // sincronizar uma lista para uso concorrente
        List<Integer> sincrona = Collections.synchronizedList(new ArrayList<>(Arrays.asList(1,2,3)));
        System.out.println("Lista sincronizada: " + sincrona);
    }

    // 10) Streams com ArrayList
    static void demoStreams() {
        System.out.println("\n== Streams ==");
        ArrayList<Integer> nums = new ArrayList<>(Arrays.asList(5, 3, 8, 1, 2));
        // filtrar, mapear e coletar
        List<Integer> paresOrdenados = nums.stream()
                .filter(n -> n % 2 == 0)
                .sorted()
                .collect(Collectors.toList());
        System.out.println("Pares ordenados via stream: " + paresOrdenados);

        // soma usando sum()
        int soma = nums.stream().mapToInt(Integer::intValue).sum();
        System.out.println("Soma: " + soma);
    }

    // Exercícios impressos no final
    static void imprimirExercicios() {
        System.out.println("\n== Exercícios sugeridos ==");
        System.out.println("1) Escreva uma função que recebe ArrayList<Integer> e retorna a média (double) dos valores.");
        System.out.println("2) Dado ArrayList<String> com nomes, remova todos que começam com letra 'A' usando Iterator.");
        System.out.println("3) Construa ArrayList<Pessoa> e ordene por nome e depois por idade (two-step).\n");
        System.out.println("4) Implemente um pequeno menu que permite adicionar, listar, remover por índice e sair.");
        System.out.println("5) (Desafio) Dado int[] grande, copie para ArrayList<Integer>, remova valores duplicados e retorne array sem duplicatas.");
    }

    // Classe auxiliar para demoObjetosPersonalizados
    static class Pessoa {
        private final String nome;
        private final int idade;

        public Pessoa(String nome, int idade) {
            this.nome = nome;
            this.idade = idade;
        }

        public String getNome() { return nome; }
        public int getIdade() { return idade; }

        @Override
        public String toString() {
            return nome + "(" + idade + ")";
        }
    }
}

