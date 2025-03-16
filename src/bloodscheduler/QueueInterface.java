/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodscheduler;

/**
 *
 * @author rgiacovazzi
 * Date: 14/03/2025
 * Description: The QueueInterface interface defines the methods that a Queue class must implement in the BloodScheduler application.
 */
public interface QueueInterface {
    
    public boolean isEmpty();
    public int size();
    public void enqueue(Object newItem);
    public Object dequeue();
    public String printQueue();

}
