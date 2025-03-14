/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package bloodscheduler;

/**
 *
 * @author rgiacovazzi
 */
public interface QueueInterface {

    public boolean isEmpty();

    public int size();

    public Object frontElement();

    public void enqueue(Object newItem);

    public Object dequeue();
}
