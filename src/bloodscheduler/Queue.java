/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodscheduler;

import java.util.*;

/**
 *
 * @author rgiacovazzi
 * Date: 14/03/2025
 * Description: The Queue class implements the QueueInterface and represents a queue in the BloodScheduler application. It contains an ArrayList of patients and methods to enqueue, dequeue, and print the queue.
 */
public class Queue implements QueueInterface {

    private ArrayList<Patient> theQueue;

    public Queue() {
        theQueue = new ArrayList<Patient>();
    }

    public boolean isEmpty() {
        return theQueue.isEmpty();
    }

    public int size() {
        
        return theQueue.size();
    }

    public void enqueue(Object newItem) {
        theQueue.add((Patient) newItem);
    }

    public Object dequeue() {
        if (theQueue.size() > 0) {
            return theQueue.remove(0);
        } else {
            return null;
        }
    }

    @Override
    public String printQueue() {
        if (theQueue.isEmpty()) {
            return "No Show Queue is empty.";
        } else {
            StringBuffer sb = new StringBuffer();
            int size = theQueue.size();
            int start = Math.max(0, size - 5); // Start from the last 5 elements or the beginning if less than 5
            for (int i = start; i < size; i++) {
                sb.append(theQueue.get(i)).append("\n");
            }
            return sb.toString();
        }
    }
}
