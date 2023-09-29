/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package exam2;

import java.util.LinkedList;
import java.util.Scanner;

/**
 *
 * @author Clarisse Angeline
 */

class Node {
    String data;
    Node next;

    Node(String name) {
        data = name;
        next = null;
    }
}
public class num2 {
        public Node head;
    public Node insertNode(String data){
        
    Node newNode = new Node(data);
    newNode.next = head;
    head = newNode;
    
        return head;
    }
    
        public void display(){
        Node node = head;
        
        while (node != null) {            
            System.out.println(node.data + ",");
            node = node.next;
        }
        System.out.println("");
    }
    
        public boolean search(String target){
        Node current = head;
        
            while (current != null) {            
                if (current.data == target) {
                    return true;
                }
                current = current.next;
        }
        
        return false;
    }
            public String SearchPosition(String target){
    Node current = head;
    String pos = ;
    
        while (current != null) {            
            if (current.data == target) {
                return pos;
                
            }
            current = current.next;
            pos++;
        }
        return null;
    }
    public static void main(String[] args) {
        LinkedList<String> benta= new LinkedList<>();
        Scanner scn = new Scanner (System.in);
        
        benta.add("Fita");
        benta.add("Pride Powder");
        benta.add("Canola Oil");
        benta.add("Nescafe Black Coffee\n");
        benta.add("Ariel Powder");
        benta.add("Rebisco");
        benta.add("Steelwool");
        benta.add("Head and Shoulders\n");
        benta.add("Nova");
        benta.add("Tanduay");
        benta.add("BearBrand");
        benta.add("Nature Spring Mineral Water 80z\n");
        benta.add("Coke 1 Liter");
        benta.add("Sprite Kasalo");
        benta.add("Royal 1 Liter");
        benta.add("Sugar");
        System.out.println("Ms. Inday has the following products ");
        System.out.println("      =====================");
        System.out.println(benta);
        
        
        System.out.println("You are looking for?  ");   
                String targerVal = scn.nextLine();
                
//        String Position = benta.searchProduct(targerVal);
        
//        if (Position != null) {
//            System.out.println(targerVal + " is in " + Position);
//        } else {
//            System.out.println("The "+ targerVal + " is not here");
//
//        }
    }

    }

