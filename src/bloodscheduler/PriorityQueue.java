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
 * Description: The PriorityQueue class implements the PriorityQueueInterface and represents a priority queue in the BloodScheduler application. It contains an ArrayList of patients and methods to enqueue, dequeue, and print the priority queue.
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
        
        StringBuffer sb = new StringBuffer();
        for (Patient patient : thePQueue) {
            sb.append(patient.toString() + "\n");
        }
        return sb.toString();
    }

    @Override
    public Patient getFirst() {
        if (!thePQueue.isEmpty()) {
            return thePQueue.get(0);
        }
        return null;
    }
}
