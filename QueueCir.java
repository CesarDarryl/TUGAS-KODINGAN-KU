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
public class QueueCir {
    Node head;// deklarasi attribut head
    Node tail;// deklarasi attribut tail
    public int size; // deklarasi attribut size
    
    public QueueCir() // Konstruktor tanpa parameter
    {
        // deklarasi Nilai awal attribut
        head = null;
        tail = null;
        size = 0;
    }
    public boolean isEmpty(){ System.out.println("Antrian masih kosong");return head == null;}
    
    public int getSize(){return size;}
    public void Enqueue(int val)
    {
        Node nptr = new Node(val,null); // menginputkan data
        nptr.setLink(head); // me link kan Pointer nptr -> head
        if(head == null)
        {
            head = nptr; // nilai head = nptr
            nptr.setLink(head); // mengembalikan nilai pointer nptr ke head
            tail = head; // pengeset an tail kembali ke head
        }
        else
        {
            tail.setLink(nptr);
            tail = nptr;
        }size++;
    }
    public void Dequeue()
    {
        if(size == 0)
        {
            isEmpty();
            getSize();
        }
        else
        {
            head = head.getLink();
            tail.setLink(head);
            size--;
            System.out.println("");
        }
    }
    public void display()
    {
        System.out.print("\nAntrian");
        Node ptr = head; // nilai ptr = nilai head
        if(isEmpty()){System.out.println("is Empty");}
        if(head.getLink() == head)
        {
            System.out.print(head.getData() + " -> "+ptr.getData());
            return;
        }
        System.out.print(head.getData() + " -> ");
        ptr = head.getLink();
        while(ptr.getLink() != head)
        {
            System.out.print(ptr.getData()+" -> ");
            ptr = ptr.getLink();
        }
        System.out.print(ptr.getData()+" -> ");
        ptr = ptr.getLink();
        System.out.println(ptr.getData());
    }
}
