/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackproject;

import java.util.Iterator;
import java.util.LinkedList;

/**
 *
 * @author kamaj
 */
public class Stack {
	
    //private ListItem mTop; // viite pinon huipulle
    private int mSize = 0; // pinottujen alkioiden lkm
    
    /**
     * Teht�v� 6
     * LinkedList implements the Collection interface. 
     * It uses a doubly linked list internally to store the elements. 
     * It can store the duplicate elements. 
     * It maintains the insertion order and is not synchronized. 
     * In LinkedList, the manipulation is fast because no shifting is required
     */
    private LinkedList<String> list;
    public Stack() {
    	list = new LinkedList<String>();
    }
    
    public void push(String aData) {
    	mSize++;
    	list.push(aData);
    }
    
    public String pop() {
    	mSize--;
    	return list.pop();
    }
    
    public void printItems() {
    	System.out.println("Tulosta pinon sis�lt�: ");
    	Iterator<String> itr = list.listIterator();
    		while(itr.hasNext()) {
    			System.out.println(itr.next());
    		}
    }
    
    
    /*
    // luo uusi lista-alkio, vie se pinon huipulle
    public void push(String aData){
        ListItem newList = new ListItem();
        newList.setData(aData);
        newList.setNext(mTop);
        mTop = newList;
        mSize++;
    }*/
    
    /*
    // jono teht�v� 2
	public void enqueue(String aData) {
		ListItem newList = new ListItem();
		
		if(mTop == null) {
			newList.setData(aData);
			mTop = newList;
			mSize++;
			return;
		}
		
		newList.setData(aData);
		newList.setNext(null);
		
		ListItem last = mTop;
		while(last.getNext() !=null) {
			last = last.getNext();
		}
		
		last.setNext(newList);
		mSize++;
	}*/
    
	/*
    // palauta pinon huipulla oleva alkio, jos pinossa ei ole
    // mitään palauta null
    public ListItem pop() {
        ListItem temp = mTop;
        mTop = mTop.getNext();
        mSize--;
        return temp;
    }*/
   
    /*
	// jono teht�v� 2
	public ListItem dequeue() {
		
		if(mTop == null) {
			System.out.println("Jono on tyhj�");
			return null;
		}
		
		ListItem temp = mTop;
		mTop = mTop.getNext();
		mSize--;
		return temp;
	}*/
    
    
    // palauta pinottujen alkioiden lkm
    public int getSize() {
        return mSize;
    }
    
    /*
    // tulosta pinon sisältö muuttamatta pinoa
    public void printItems() {
        System.out.println("Tulosta pinon sis�lt�");
        ListItem current = mTop;
        while(current != null) {
        	System.out.println(current);
        	current = current.getNext();
        }
    }*/
    
}
