/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package Minggu12.Jobsheet12.Tugas;

import Minggu12.Jobsheet12.Praktikum.*;

/**
 *
 * @author user
 */
public class linkedList {
    Node head;
    Node tail;
    public int size;
    public linkedList() // Konstruktor
    {
        // pengesetan Nilai awal
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty()
    {
        return head == null;
    }
    public int getSize()
    {
        return size; // mendapatkan nilai size
    }
    public void insertAtStart(int val)
    {
        Node nptr = new Node(val,null); // pemanggilan kontruktor dengan nilai node = val , dan next = null
        nptr.setLink(head); // melink kan pointer akhir menuju node awal (head)
        if(head == null)
        {
            head = nptr; // dekklarasi head = node baru ( nptr )
            nptr.setLink(head);
            tail = head; // nilai tail = nilai head
        }
        else
        {
            tail.setLink(nptr); // pointer tail di set menuju node baru
            head = nptr; // deklarasi head baru
        }
        size++;
    }
    // penambahan data di akhir
    public void insertAtEnd(int val)
    {
        Node nptr = new Node(val,null); // mengisikan data + pointer pada node baru
        nptr.setLink(head);
        if(head == null)
        {
            head = nptr; // deklarasi head 
            nptr.setLink(head); // set pointer node baru -> head
            tail = head;
        }
        else
        {
            tail.setLink(nptr); // pointer tail di set ke Node baru
            tail = nptr; // menjadikan node baru = tail
        }
        size++;
    }
    // penambahan nilai sesuai posisi
    public void insertAtPos(int val , int pos)
    {
        Node nptr = new Node(val,null);//
        Node ptr = head; // DEKLARASI AWAL SEBAGAI HEAD
        pos = pos -1; // posisi yang di tentukan -1 node
        for(int i = 1; i < size -1; i++)
        {
            if(i == pos) // jika i sesuai posisi yg di tentukan
            {
                Node tmp = ptr.getLink(); // tmp ber isikan next
                ptr.setLink(nptr); // set pointer dari ptr = nptr
                nptr.setLink(tmp); // link nptr di kaitkan ke tmp
                break;
            }
            ptr = ptr.getLink(); // Node ptr , next node
        }
        size++;
    }
    // delete method
    public void deleteAtPos(int pos)
    {
        if(size == 1 && pos == 1) // jika berada pada posisi 1 dan size tinggal 1
        {
            //mengembalikan nilai head,tail = null dan size = 0
            head = null;
            tail = null;
            size = 0;
            return;
        }
        if(pos == 1) // jika posisi yg di maksud = 1
        {
            head = head.getLink(); // memindahkan nilai head
            tail.setLink(head); // memindahkan nilai next tail ke head baru
            size--;
            return ;
        }
        if(pos == size) // penghapusan nilai di akhir ( menghapus tail nya ) 
        {
            Node s = head; // penyamaan nilai s = head
            Node t = head; // penyamaan nilai s = head
            while (s != tail) // selama nilai s bukan = tail
            {
                t = s; // menyamakan nilai
                s = s.getLink(); // memindah kan pada nilai next / node depannya
            }
            tail = t; // memindahkan nilai tail
            tail.setLink(head); // memindahkan nilai next tail ke head baru
            size --;
            return;
        }
        Node ptr = head;
        pos = pos -1;
        for(int i = 1; i < size -1;i++)
        {
            if(i == pos)
            {
                Node tmp = ptr.getLink();
                tmp = tmp.getLink();
                ptr.setLink(tmp);
                break;
            }
            ptr = ptr.getLink();
        }
        size--;
    }
   public void Find(int val)
   {
       int posisi =0; // posisi awal 
       posisi = posisi -1; // posisi -1 karena dia circular ( size sebenarnya di -1 )
       Node tmp = head; //menyamakan nilai tmp = head
       for(int i = 1; i < size + 1;i++ )// perulangan mencari data yg di inginkan
       {         
           if(val == tmp.getData()) //kondisi menyamakan nilai
           {
               posisi = i;      
               deleteAtPos(posisi);
               System.out.println("data pada posisi "+ posisi +" sudah di delete");                            
           }           
           tmp = tmp.getLink();
       }      
   }    
    public void display()
    {
        System.out.println("\nCircular Singe Linked List = ");
        Node ptr = head; // deklarasi nilai awal ptr = nilai head;
        if(size == 0) // jika size = 0 / masih kosong
        {
            System.out.println("empty\n"); // deklarasi empty
            return;
        }
        if(head.getLink() == head)// jika pointer next dari head = head / circular
        {
            //jadi hanya ada 1 node saja ( node head )
            System.out.println(head.getData() + " -> "+ptr.getData()+ "\n");
            return;
        }
        System.out.print(head.getData() + " -> "); // print out data head
        ptr = head.getLink(); // ptr ber isi nilai node setelah node head
        while (ptr.getLink() != head) // perulangan sampai nilai node(akhir = head)
        {
            System.out.print(ptr.getData()+" -> ");
            ptr = ptr.getLink(); // ptr . next
        }
        System.out.print(ptr.getData()+ " -> ");
        ptr = ptr.getLink();
        System.out.print(ptr.getData() + "\n");
    }
}
