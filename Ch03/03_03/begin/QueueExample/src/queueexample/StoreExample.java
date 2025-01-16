/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package queueexample;

import java.util.ArrayList;
import java.util.LinkedList;

/**
 *
 * @author betha
 */
public class StoreExample {
    
    public static void main(String[] args) {                
        LinkedList<CustomerExample> queue = new LinkedList<>();
        queue.add(new CustomerExample("Sally"));
        queue.add(new CustomerExample("Ben"));
        queue.add(new CustomerExample("Emma"));
        queue.add(new CustomerExample("Fred"));
        queue.add(new CustomerExample("Veronika"));
        queue.add(new CustomerExample("Bethany"));
        System.out.println(queue);
        serverCustomers(queue);
    }

    static void serverCustomers(LinkedList<CustomerExample> queue) {
        //fifo
        CustomerExample first = queue.poll();
        first.serve();
        System.out.println(queue);

        //lifo
        CustomerExample last = queue.pollLast();
        last.serve();
        System.out.println(queue);

        //fifo
        CustomerExample first2 = queue.pollFirst();
        first2.serve();
        System.out.println(queue);
    }
}
