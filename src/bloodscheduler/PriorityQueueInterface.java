/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodscheduler;

/**
 *
 * @author rgiacovazzi
 * Date: 14/03/2025
 * Description: The PriorityQueueInterface interface defines the methods that a PriorityQueue class must implement in the BloodScheduler application.
 */
public interface PriorityQueueInterface {
    public void enqueue(Object element);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public String printPQueue();
    public Object getFirst();
}
