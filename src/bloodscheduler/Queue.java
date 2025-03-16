/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodscheduler;

import java.util.*;

/**
 *
 * @author rgiacovazzi
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

    public Object frontElement() {
        if (theQueue.size() > 0) {
            return theQueue.get(0);
        } else {
            return null;
        }
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
            for (Patient patient : theQueue) {
                sb.append(patient).append("\n");
            }
            return sb.toString();
        }
    }
}
