/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

import java.util.Scanner;

/**
 *
 * @author Clarisse Angeline
 * 
 * 
 */ 


public class num1 {        
    private Node head, tail;
    private int size;

    private Node createNewNode(String index) throws Exception {
        Node node = new Node(index);
        return node;
    }

    private void insertion(String index, int position) throws Exception {
        if (position < 0 || position > size) {
            throw new Exception("Index Invalid");
        } else if (position == 0) {
            insertBeg(index);
        } else if (position == size) {
            insertEnd(index);
        } else {
            Node node = createNewNode(index);
            Node prev = getNodeAt(position - 1);
            node.next = prev.next;
            prev.next = node;
            size++;
        }
    }

    private void insertBeg(String index) throws Exception {
        Node node = createNewNode(index);

        if (size == 0) {
            head = tail = node;
            tail.next = head; 
        } else {
            node.next = head;
            head = node;
            tail.next = head; 
        }

        size++;
    }

    private void insertEnd(String index) throws Exception {
        Node node = createNewNode(index);
        if (size == 0) {
            head = tail = node;
            tail.next = head; 
        } else {
            tail.next = node;
            tail = node;
            tail.next = head; 
        }
        size++;
    }
    
    private Node getNodeAt(int position) throws Exception {
        if (size == 0) {
            throw new Exception("Linked List is Empty");
        } else if (position < 0 || position >= size) {
            throw new Exception("Invalid Position");
        } else {
            Node temp = head;
            for (int i = 0; i < position; i++) {
                temp = temp.next;
            }
            return temp;
        }
    }
     private void display() throws Exception {
        if (size == 0) {
            System.out.println("List is Empty");
            return;
        }

        Node temporary = head;

        do {
            System.out.print(temporary.data + " , ");
            temporary = temporary.next;
        } while (temporary != head);

        System.out.println();
    }
    public static void main(String[] args) throws Exception {
        Scanner scn = new Scanner(System.in);
        num1 list = new num1();
        boolean start = true;

        while (start) {
            String namee;
            int position;
            System.out.println("menu: ");
            System.out.println("1. insertion ");
            System.out.println("2. display ");
            int choiceInput = scn.nextInt();
             if(choiceInput==1){
                 System.out.println("Enter Name: ");
                 namee = scn.nextLine();
                 
                 System.out.println("Enter position");
                 position = scn.nextInt();
                 
                 list.insertion(namee, position);
                 break;
             }
        }
    }
}


    
    
