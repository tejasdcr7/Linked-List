package com.bridgelabz.day14;
import java.util.LinkedList;

public class ListDemo {
        public static void addData() {
            LinkedList list = new LinkedList();
            list.add(56);
            list.add(30);
            list.add(70);
            System.out.println(list);
        }
        public static void dataAdding(){
            LinkedList list = new LinkedList();
            list.add(70);
            list.push(30);
            list.push(56);
            System.out.println(list);
    }
        public static void deleteFirst(){
            LinkedList list = new LinkedList();
            list.add(56);
            list.add(30);
            list.add(70);
            list.pop();
            System.out.println(list);
        }
        public static void deleteLast(){
            LinkedList list = new LinkedList();
            list.add(56);
            list.add(30);
            list.add(70);
            list.pollLast();
            System.out.println(list);
        }
}

