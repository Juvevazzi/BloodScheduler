/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodscheduler;

import java.util.ArrayList;

/**
 *
 * @author rgiacovazzi
 * Date: 14/03/2025
 * Description: The BubbleSort class implements the bubble sort algorithm to sort an array of patients in ascending order.
 */
public class BubbleSort {

    private ArrayList<Patient> patients;

    public BubbleSort(ArrayList<Patient> patients) {
        this.patients = patients;
    }

    public void bubbleSort() {
        bubbleSortRecursive(patients.size());
    }

    private void bubbleSortRecursive(int n) {
        if (n == 1) {
            return;
        }

        for (int i = 0; i < n - 1; i++) {
            if (patients.get(i).getPriorityScore() < patients.get(i + 1).getPriorityScore()) {
                swap(i, i + 1);
            }
        }

        bubbleSortRecursive(n - 1);
    }

    public void swap(int pos1, int pos2) {
        Patient temp = patients.get(pos1);
        patients.set(pos1, patients.get(pos2));
        patients.set(pos2, temp);
    }
}
