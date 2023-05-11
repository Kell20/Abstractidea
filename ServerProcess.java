import java.io.*;
import java.util.Scanner;

public class ServerProcess {
    public static void main(String[]args) {
        Client1 q = new Client1();
        Thread th1 = new Thread(q);
        th1.start();


            Serverl serv = new Serverl();
            serv.start();

            try {
            Thread.sleep(10000);
        } catch (InterruptedException v) {
            System.out.println(v.getMessage());
        }
            Client2 kelvin = new Client2();
        Thread th2 = new Thread(kelvin);
        th2.start();
    }
}

class Serverl extends Thread{
    String file;
    String ip;
    private String ip(){
        System.out.println("search for ip");
        Scanner a=new Scanner(System.in);
        this.file=a.nextLine();
        return ip;
    }

    private void connection(){
        System.out.println("connection was configured");
        System.out.println("protocols:");
        System.out.println( "http protocol and speed is"+" 23mb/s");
    }

    private void listen(){
        System.out.println("client1 enter web address");
        Scanner tel=new Scanner(System.in);
        this.file=tel.nextLine();
    }

    private void send(){
        String a=this.file;
         if("www.electromagnetic science.net".equals(a)) {
            System.out.println("is a field of study which consist interaction of electric science and magnetism science");
        } else if ("www.aeronautics science.org".equals(a)) {
            System.out.println("deals with study of designing a space craft machines");
        } else {
            System.out.println("url not found");
        }
    }
    @Override
    public void run(){
        ip();
        try{
            Thread.sleep(3000);
        }catch (InterruptedException e){
            System.out.println(e.getMessage());
        }

        connection();
        try{
            Thread.sleep(4000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        listen();
        try{
            Thread.sleep(2000);
        }catch(InterruptedException e){
            System.out.println(e.getMessage());
        }

        send();
    }
}
 class Client1 implements Runnable{
     @Override
     public void run() {
         System.out.println("client1  establissh connection with a server");
     }
 }
 class Client2 implements Runnable {
     @Override
     public void run() {

         try {
             Thread.sleep(4000);
         } catch (InterruptedException e) {
             System.out.println(e.getMessage());
         }

         System.out.println("client2 establish connection with server");
     }
 }