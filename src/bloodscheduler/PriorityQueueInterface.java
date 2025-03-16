/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package bloodscheduler;

/**
 *
 * @author rgiacovazzi
 */
public interface PriorityQueueInterface {
    public void enqueue(Object element);
    public int size();
    public boolean isEmpty();
    public Object dequeue();
    public String printPQueue();
}
