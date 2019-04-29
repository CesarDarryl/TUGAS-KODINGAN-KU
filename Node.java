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
public class Node {
    int data;
    Node next;
    
    //konstruktor
    public Node()
    {
        next = null;
        data = 0;
    }
    // Kontruktor dengan parameter
    public Node(int d,Node n)
    {
        data = d;
        next = n;
    }
    public void setLink(Node n)
    {
        next = n; //
    }
    public void setData(int d)
    {
        data = d; // 
    }
    public Node getLink() // mendapatkan pointer dari Node
    {
        return next;
    }
    public int getData()
    {
        return data;
    }
}
