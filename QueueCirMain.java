/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu12.Jobsheet12.Tugas;

/**
 *
 * @author user
 */
import java.util.Scanner;
public class QueueCirMain {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        QueueCir list = new QueueCir(); // pemanggilan konstruktor
        int pil = 0;
        do
        {
            System.out.println("Queue Circular Linked List");
            System.out.println("Pilih menu : \n1. Enqueue \n2. Dequeue \n3. Print Data \n4. Keluar");            
            pil = sc.nextInt();
            switch(pil)
            {
                case 1:
                    System.out.print("Masukkan antrian : \n ->");
                    list.Enqueue(sc.nextInt());
                    System.out.println("");
                    break;
                case 2:
                    list.Dequeue();                   
                    System.out.println("");
                    break;
                case 3:
                    list.display();
                    System.out.println("");
                    break;
            }
        }
        while(pil != 4);
    }
}
