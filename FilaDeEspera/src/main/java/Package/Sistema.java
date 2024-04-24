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
        filasPrioridades = (Queue<Object>[]) new Queue[5];
        for (int i = 0; i < 5; i++) {
            filasPrioridades[i] = new ArrayDeque<>();
        }
    }

    public void enfileirar(Object elemento, int prioridade) {
        if (prioridade >= 0 && prioridade < 5) {
            filasPrioridades[prioridade].add(elemento);
        } else {
            System.out.println("Prioridade inválida.");
        }
    }


    public void desenfileirar() {
    for (int i = 0; i < 5; i++) {
        if (!filasPrioridades[i].isEmpty()) {
            filasPrioridades[i].poll(); 
            return; 
        }
    }
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
            int indiceLocal = indice - count;
            Object[] elementos = filasPrioridades[i].toArray();
            return elementos[indiceLocal];
        }
        count += size;
    }
    return null;
}
}    

