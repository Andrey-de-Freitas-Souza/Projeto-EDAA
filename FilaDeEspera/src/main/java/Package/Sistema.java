package Package;

/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
import java.util.ArrayDeque;
import java.util.Queue;
/**
 *
 * @author andre
 */
public class Sistema {


    private Queue<Object>[] filasPrioridades;

    @SuppressWarnings("unchecked")
    public Sistema() {
        // Inicializando as filas de prioridades
        filasPrioridades = (Queue<Object>[]) new Queue[5];
        for (int i = 0; i < 5; i++) {
            filasPrioridades[i] = new ArrayDeque<>();
        }
    }

    // Adiciona um elemento com uma determinada prioridade
    public void enfileirar(Object elemento, int prioridade) {
        if (prioridade >= 0 && prioridade < 5) {
            filasPrioridades[prioridade].add(elemento);
        } else {
            System.out.println("Prioridade inválida.");
        }
    }

    // Remove e retorna o elemento com maior prioridade

    public void desenfileirar() {
    for (int i = 0; i < 5; i++) {
        // Verifica se a fila de prioridade não está vazia
        if (!filasPrioridades[i].isEmpty()) {
            filasPrioridades[i].poll(); // Remove o elemento da frente da fila
            return; // Retorna imediatamente após remover um elemento
        }
    }
    // Se todas as filas de prioridade estiverem vazias, não faz nada
}
   

    
    public int contarElementos() {
    int totalElementos = 0;
    for (Queue<Object> fila : filasPrioridades) {
        totalElementos += fila.size();
    }
    return totalElementos;
}
    
    public Object acessarElemento(int indice) {
    int count = 0;
    for (int i = 0; i < 5; i++) {
        int size = filasPrioridades[i].size();
        if (indice< count + size) {
            // Encontramos a fila que contém o índice global
            // Calculamos o índice local dentro dessa fila
            int indiceLocal = indice - count;
            // Converte a fila de prioridade para uma lista para acessar pelo índice
            Object[] elementos = filasPrioridades[i].toArray();
            return elementos[indiceLocal];
        }
        count += size;
    }
    System.out.println("Índice global inválido.");
    return null;
}
}    

