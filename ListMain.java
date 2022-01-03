package com.bridgelabz.day14;

public class ListMain {
    public static void main(String[] args) {
        ListDemo listDemo = new ListDemo();
        System.out.println("Welcome to the Linked List");
        listDemo.addData();
        System.out.println("Data Added");
        listDemo.dataAdding();
        System.out.println("Deleting First Node");
        listDemo.deleteFirst();
        System.out.println("Deleting Last Node");
        listDemo.deleteLast();

    }


}

