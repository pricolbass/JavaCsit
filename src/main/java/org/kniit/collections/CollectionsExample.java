package org.kniit.collections;

import java.util.ArrayDeque;
import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collections;
import java.util.Deque;
import java.util.HashSet;
import java.util.Iterator;
import java.util.LinkedHashSet;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Map;
import java.util.PriorityQueue;
import java.util.TreeMap;

public class CollectionsExample {

    public static void main(String[] args) {
        System.out.println("=== Java Collections Framework Demo ===\n");

        demonstrateArrayList();
        demonstrateLinkedList();
        demonstrateIterator();
        demonstrateListIterator();
        demonstrateHashSet();
        demonstrateLinkedHashSet();
        demonstrateTreeMap();
        demonstratePriorityQueue();
        demonstrateArrayDeque();
    }

    private static void demonstrateArrayList() {
        System.out.println("1. ARRAYLIST DEMO");
        System.out.println("-".repeat(50));

        ArrayList<String> fruits = new ArrayList<>();

        fruits.add("Apple");
        fruits.add("Banana");
        fruits.add("Cherry");

        System.out.println("ArrayList: " + fruits);
        System.out.println("Size: " + fruits.size());
        System.out.println("Element at index 2: " + fruits.get(2));

        fruits.add(1, "Avocado");
        System.out.println("After insert at index 1: " + fruits);

        fruits.remove("Banana");
        System.out.println("After removing 'Banana': " + fruits);

        System.out.println("Contains 'Apple': " + fruits.contains("Apple"));

        System.out.println();
    }

    private static void demonstrateLinkedList() {
        System.out.println("2. LINKEDLIST DEMO");
        System.out.println("-".repeat(50));

        LinkedList<Integer> numbers = new LinkedList<>();

        numbers.add(10);
        numbers.add(20);
        numbers.add(30);

        numbers.addFirst(5);
        numbers.addLast(40);

        System.out.println("LinkedList: " + numbers);

        System.out.println("First element: " + numbers.getFirst());
        System.out.println("Last element: " + numbers.getLast());

        numbers.removeFirst();
        numbers.removeLast();
        System.out.println("After removing first and last: " + numbers);

        System.out.println();
    }

    private static void demonstrateIterator() {
        System.out.println("3. ITERATOR DEMO");
        System.out.println("-".repeat(50));

        List<String> cities = new ArrayList<>();
        cities.add("New York");
        cities.add("London");
        cities.add("Paris");
        cities.add("Tokyo");
        cities.add("Moscow");

        System.out.println("Original list: " + cities);

        Iterator<String> iterator = cities.iterator();

        System.out.println("\nIterating with Iterator:");
        while (iterator.hasNext()) {
            String city = iterator.next();
            System.out.println("  - " + city);

            // Удаление элемента во время итерации
            if (city.equals("Paris")) {
                iterator.remove();
                System.out.println("    (removed Paris)");
            }
        }

        System.out.println("\nList after iteration: " + cities);
        System.out.println();
    }

    private static void demonstrateListIterator() {
        System.out.println("4. LISTITERATOR DEMO");
        System.out.println("-".repeat(50));

        List<String> animals = new ArrayList<>();
        animals.add("Dog");
        animals.add("Cat");
        animals.add("Bird");
        animals.add("Fish");

        System.out.println("Original list: " + animals);

        ListIterator<String> listIterator = animals.listIterator();

        // Прямой обход
        System.out.println("\nForward iteration:");
        while (listIterator.hasNext()) {
            String animal = listIterator.next();
            System.out.println("  - " + animal);

            if (animal.equals("Cat")) {
                listIterator.set("Lion");
            }
            if (animal.equals("Bird")) {
                listIterator.add("Eagle");
            }
        }

        System.out.println("\nBackward iteration:");
        while (listIterator.hasPrevious()) {
            String animal = listIterator.previous();
            System.out.println("  - " + animal);
        }

        System.out.println("\nList after modifications: " + animals);
        System.out.println();
    }

    private static void demonstrateHashSet() {
        System.out.println("5. HASHSET DEMO");
        System.out.println("-".repeat(50));

        HashSet<String> languages = new HashSet<>();

        // Добавление элементов
        languages.add("Java");
        languages.add("Python");
        languages.add("JavaScript");
        languages.add("C++");
        languages.add("Java"); // Дубликат - не будет добавлен

        System.out.println("HashSet: " + languages);
        System.out.println("Size: " + languages.size());
        System.out.println("Contains 'Python': " + languages.contains("Python"));

        languages.remove("C++");
        System.out.println("After removing 'C++': " + languages);

        System.out.println("\nIterating HashSet:");
        for (String lang : languages) {
            System.out.println("  - " + lang);
        }

        System.out.println();
    }

    private static void demonstrateLinkedHashSet() {
        System.out.println("6. LINKEDHASHSET DEMO");
        System.out.println("-".repeat(50));

        LinkedHashSet<String> colors = new LinkedHashSet<>();

        colors.add("Red");
        colors.add("Green");
        colors.add("Blue");
        colors.add("Yellow");
        colors.add("Red");

        System.out.println("LinkedHashSet (maintains insertion order): " + colors);

        System.out.println("\nIteration order:");
        Iterator<String> it = colors.iterator();
        int count = 1;
        while (it.hasNext()) {
            System.out.println("  " + count++ + ". " + it.next());
        }

        System.out.println();
    }

    private static void demonstrateTreeMap() {
        System.out.println("7. TREEMAP DEMO");
        System.out.println("-".repeat(50));

        TreeMap<String, Integer> studentGrades = new TreeMap<>();

        studentGrades.put("Alice", 95);
        studentGrades.put("Charlie", 88);
        studentGrades.put("Bob", 92);
        studentGrades.put("Diana", 85);

        System.out.println("TreeMap (sorted by keys): " + studentGrades);

        System.out.println("\nAlice's grade: " + studentGrades.get("Alice"));

        System.out.println("First key: " + studentGrades.firstKey());
        System.out.println("Last key: " + studentGrades.lastKey());
        System.out.println("Keys lower than 'Charlie': " + studentGrades.headMap("Charlie"));

        System.out.println("\nAll student grades:");
        for (Map.Entry<String, Integer> entry : studentGrades.entrySet()) {
            System.out.println("  " + entry.getKey() + ": " + entry.getValue());
        }

        System.out.println();
    }

    // ==================== PriorityQueue Demo ====================
    private static void demonstratePriorityQueue() {
        System.out.println("8. PRIORITYQUEUE DEMO");
        System.out.println("-".repeat(50));

        PriorityQueue<Integer> priorityQueue = new PriorityQueue<>();

        priorityQueue.offer(30);
        priorityQueue.offer(10);
        priorityQueue.offer(50);
        priorityQueue.offer(20);
        priorityQueue.offer(40);

        System.out.println("PriorityQueue: " + priorityQueue);
        System.out.println("Peek (smallest element): " + priorityQueue.peek());

        System.out.println("\nPolling elements (in priority order):");
        while (!priorityQueue.isEmpty()) {
            System.out.println("  Polled: " + priorityQueue.poll());
        }

        System.out.println("\nPriorityQueue with custom comparator (max-heap):");
        PriorityQueue<Integer> maxHeap = new PriorityQueue<>(Collections.reverseOrder());
        maxHeap.addAll(Arrays.asList(30, 10, 50, 20, 40));

        while (!maxHeap.isEmpty()) {
            System.out.println("  Polled: " + maxHeap.poll());
        }

        System.out.println();
    }

    private static void demonstrateArrayDeque() {
        System.out.println("9. ARRAYDEQUE DEMO");
        System.out.println("-".repeat(50));

        ArrayDeque<String> deque = new ArrayDeque<>();

        deque.addFirst("First");
        deque.addLast("Last");
        deque.offerFirst("Start");
        deque.offerLast("End");

        System.out.println("ArrayDeque: " + deque);

        System.out.println("\nUsing as Stack (LIFO):");
        Deque<String> stack = new ArrayDeque<>();
        stack.push("One");
        stack.push("Two");
        stack.push("Three");

        System.out.println("Stack: " + stack);
        System.out.println("Pop: " + stack.pop());
        System.out.println("Peek: " + stack.peek());

        System.out.println("\nUsing as Queue (FIFO):");
        Deque<String> queue = new ArrayDeque<>();
        queue.offer("Task 1");
        queue.offer("Task 2");
        queue.offer("Task 3");

        System.out.println("Queue: " + queue);
        System.out.println("Poll: " + queue.poll());
        System.out.println("Peek: " + queue.peek());

        System.out.println("\nIterating ArrayDeque:");
        for (String item : deque) {
            System.out.println("  - " + item);
        }

        System.out.println();
    }

}
