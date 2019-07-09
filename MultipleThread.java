/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package algorithms;

/**
 *
 * @author Gökhan
 */
public class MultipleThread extends Thread{
    
    public static void main(String[] args) {
        MultipleThread t1=new MultipleThread();
        t1.start();
        MultipleThread t2=new MultipleThread();
        t2.start();
        MultipleThread t3=new MultipleThread();
        t3.start();
    }
    public void run(){
        if(this.getName().compareTo("Thread-0")==0){
            for (int i = 0; i < 100; i++) {
            System.out.println(" A ");
        }
        }
         if(this.getName().compareTo("Thread-1")==0){
            for (int i = 0; i < 100; i++) {
            System.out.println(" B ");
        }
         }
        if(this.getName().compareTo("Thread-2")==0){
            for (int i = 1; i <=100; i++) {
            System.out.println(" "+i+" ");
        }
        }
        
    }
    
}