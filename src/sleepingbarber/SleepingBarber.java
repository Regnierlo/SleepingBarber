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
public class SleepingBarber {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        Queue salleAttente = new Queue(5);
        Barber b = new Barber(salleAttente);
        b.start();
        
        //Simulation arrive client
        for (int i = 0; i < 10000; i++) {
            System.out.println("Salle d'attente occupée par "+salleAttente.nbElts());
            
            if(salleAttente.arriver(new Client(Client.idAuto++)) != -1){
                System.out.println("Un nouveau client arrive");
            }else{
                System.out.println("Un client est reparti");
            }
            try {
                Thread.sleep(400);
            } catch (InterruptedException e) {
                e.printStackTrace();
            }
        }
        
        b.stopper();
    }
    
}
