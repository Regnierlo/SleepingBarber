/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package sleepingbarber;

/**
 *
 * @author mm140419
 */
public class Client {
    public static int idAuto = 1;
    private int id;
    
    public Client(int id){
        this.id = id;
        idAuto++;
    }
    
    public int getId(){
        return id;
    }
}
