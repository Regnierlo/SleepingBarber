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
public class Barber extends Thread{
    private Queue salle;
    private boolean arret = false;
    private boolean actif = true;
    
    public Barber(Queue s){
        this.salle = s;
    }
    
    public void run(){
        int r = 0 ;
        while(!arret){
            if(salle.nbElts() > 0){
                salle.retirer();
                System.out.println("Je retire");
            
                try {
                    //System.out.println("Je coiffe");
                    actif = true;
                    r = (int)(Math.random()*(300-1))+1;
                    Thread.sleep(r);
                } catch (InterruptedException e) {
                    e.printStackTrace();
                    System.out.println("Oooooh non j'ai loupé la coiffure !!!");
                }
            }
            else{
                try{
                    actif=false;
                    r = (int)(Math.random()*(3000-1))+1 ;
                    System.out.println("ZZzzzzzZZZZZZzzzzz : " + r);
                    Thread.sleep(r) ;
                }catch(InterruptedException e){
                    e.printStackTrace() ;
                    System.out.println("J'ai fait un rêve, où tous les cheveux avaient disparus.");
                }
            }
        }
    }
    
    public void stopper(){
        arret = true;
    }
}
