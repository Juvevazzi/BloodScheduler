/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Main.java to edit this template
 */
package bloodscheduler;

import java.util.*;

/**
 *
 * @author rgiacovazzi
 */
public class BloodSchedulerApp {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        /// Create patients
        Patient p1 = new Patient("Alice", "Urgent", 70, true, "Dr. Smith", "123-456-7890");
        Patient p2 = new Patient("Bob", "Medium", 30, false, "Dr. Johnson", "987-654-3210");
        Patient p3 = new Patient("Charlie", "Low", 5, false, "Dr. Brown", "555-555-5555");


        // Print patients to check priority scores
        System.out.println(p1);
        System.out.println(p2);
        System.out.println(p3);

        // Create a Queue to track No Show patients
        Queue noShowQueue = new Queue();

        // Enqueue patients
        noShowQueue.enqueue(p1);
        noShowQueue.enqueue(p2);
        noShowQueue.enqueue(p3);

        // Print queue to check if patients were added
        System.out.println(noShowQueue.printQueue());

        // Dequeue a patient and print updated queue
        noShowQueue.dequeue();
        System.out.println("After removing one patient:");
        System.out.println(noShowQueue.printQueue());

        // Create a PriorityQueue to manage patients based on priority
        PriorityQueue priorityQueue = new PriorityQueue();

        // Enqueue patients into the priority queue
        priorityQueue.enqueue(p1);
        priorityQueue.enqueue(p2);
        priorityQueue.enqueue(p3);

        // Print priority queue to check if patients were added in correct order
        System.out.println("Priority Queue:");
        System.out.println(priorityQueue.printPQueue());

        // Dequeue a patient and print updated priority queue
        priorityQueue.dequeue();
        System.out.println("After removing one patient from Priority Queue:");
        System.out.println(priorityQueue.printPQueue());

        // Create a list of patients for bubble sort testing
        ArrayList<Patient> patientList = new ArrayList<>();
        patientList.add(p1);
        patientList.add(p2);
        patientList.add(p3);

        // Print unsorted patient list
        System.out.println("Unsorted Patient List:");
        for (Patient patient : patientList) {
            System.out.println(patient);
        }

        // Sort the patient list using BubbleSort
        BubbleSort bubbleSort = new BubbleSort(patientList);
        bubbleSort.bubbleSort();

        // Print sorted patient list
        System.out.println("Sorted Patient List:");
        for (Patient patient : patientList) {
            System.out.println(patient);
        }
        
        /* Create and display the form */
        java.awt.EventQueue.invokeLater(new Runnable() {
            public void run() {
                new BloodSchedulerGUI().setVisible(true);
            }
        });
    }
    
}
