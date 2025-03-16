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
public class PriorityQueue implements PriorityQueueInterface{
    private ArrayList<Patient> thePQueue;
    
    public PriorityQueue() {
        thePQueue = new ArrayList<Patient>();  
    }
    
    @Override
    public void enqueue(Object element) {
        if (element instanceof Patient) {
            Patient patient = (Patient) element;
            thePQueue.add(patient);
            BubbleSort bubbleSort = new BubbleSort(thePQueue);
            bubbleSort.bubbleSort(); // Use BubbleSort class to sort thePQueue
        }
    }

    @Override
    public int size() {
        return thePQueue.size();
    }

    @Override
    public boolean isEmpty() {
        return thePQueue.isEmpty();
    }

    @Override
    public Object dequeue() {
        if (!thePQueue.isEmpty()) {
            return thePQueue.remove(0);
        }
        return null;
    }

    @Override
    public String printPQueue() {
        String result = "";
        for (Patient patient : thePQueue) {
            result += patient.toString() + "\n";
        }
        return result;
    }

    public Patient getFirst() {
        if (!thePQueue.isEmpty()) {
            return thePQueue.get(0);
        }
        return null;
    }
}
