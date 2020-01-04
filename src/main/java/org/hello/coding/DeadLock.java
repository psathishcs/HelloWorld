package org.hello.coding;

public class DeadLock {
    int i =0, j = 0;
    String st1= "Java";
    String st2 = "Unix";
    Thread th1 = new Thread("My Thread 1"){
        public void run(){
            while (true){
                synchronized (st1){
                    synchronized (st2){
                        System.out.println("t1 " + i++ + " "+ st1 + ", " + st2);
                    }
                }
            }
        }
    };
    Thread th2 = new Thread("My Thread 2"){
        public void run(){
            while (true){
                synchronized (st2){
                    synchronized (st1){
                        System.out.println("t2 " +  j++ + " " + st2 + ", " + st1);
                    }
                }
            }
        }
    };

    public static void main(String[] args){
        DeadLock deadLock = new DeadLock();
        deadLock.th1.start();
        deadLock.th2.start();
    }
}
