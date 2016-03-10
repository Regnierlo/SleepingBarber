/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleepingbarber;
import java.util.*;

/**
 *
 * @author mm140419
 */
public class Queue {
    private LinkedList list;
    private int maxElements = 0;
    
    public Queue(int max){
        list = new LinkedList();
        maxElements = max;
    }
    
    public synchronized int arriver(Object o){
        int res;
        if(this.nbElts() < maxElements){
            list.add(o);
            res = 0;
        }else{
            res = -1;
        }
        
        return res;
    }
    
    public synchronized Object retirer(){
        return list.removeFirst();
    }
    
    public int nbElts(){
        return list.size();
    }
}
