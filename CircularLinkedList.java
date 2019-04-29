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
import Minggu12.Jobsheet12.Praktikum.*;
import java.util.Scanner;
public class CircularLinkedList {
    public static void main(String[]args)
    {
        Scanner sc = new Scanner(System.in);
        linkedList list = new linkedList();
        System.out.println("Circular Single Linked List\n");
        char ch; // character ch
        do
        {
            System.out.println("\nOperasi Circular Single Linked List\n");
            System.out.println("1. Menambahkan pada awal list");
            System.out.println("2. Menambahkan pada akhir list");
            System.out.println("3. Menambahkan berdasarkan indeks Posisi");
            System.out.println("4. Cek List kosong");
            System.out.println("5. Size List");
            System.out.println("6. Delete by Position");
            System.out.println("7. Delete by Data");
            System.out.println("===================================");
            int pilihan = sc.nextInt();
            switch(pilihan)
            {
                case 1:
                    System.out.println("Masukkan Nilai yang akan di tambahkan");
                    list.insertAtStart(sc.nextInt());
                    break;
                case 2:
                    System.out.println("Masukkan Nilai yang akan di tambahkan");
                    list.insertAtEnd(sc.nextInt());
                    break;
                case 3:
                    System.out.println("Masukkan Nilai yang akan di tambahkan");
                    int num = sc.nextInt();
                    System.out.println("Masukkan indeks posisi : ");
                    int pos = sc.nextInt();
                    if(pos <= 1 || pos > list.getSize())
                        System.out.println("Tidak ada indeks posisi tersebut\n");
                    else
                        list.insertAtPos(num,pos);
                    break;
                case 4:
                    System.out.println("Status List Kosong = "+ list.isEmpty());
                    break;
                case 5:
                    System.out.println("Size List = "+ list.getSize()+ "\n");
                    break;
                case 6:
                    System.out.print("Masukkan posisi yang ingin di hapus : ");
                    int item = sc.nextInt();
                    list.deleteAtPos(item);
                    break;
                case 7:
                    System.out.print("Masukkan data yang ingin di delete : ");
                    int val = sc.nextInt();
                    list.Find(val);
                    break;
                default:
                    System.out.println("Masukkan Sesuai pilihan yang ada");
                    break;
            }
            list.display();
            System.out.println("\nLanjutkan ? (Y/T) \n");
            ch = sc.next().charAt(0);
        }
        while(ch == 'Y' || ch == 'y');
    }
}
