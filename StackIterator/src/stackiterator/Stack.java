/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package stackiterator;

/**
 *
 * @author kamaj
 */
public class Stack {

        ListItem top; // top näkyy oletuspakkaukseen
        private int size;
        
        private int maxSize = 10;
        private ListItem[] listOfListItems = new ListItem[maxSize];

        public Stack() {
                top = null;
                size = 0;
        }
        //  palautetaan pino-iteraattori
        public StackIterator iterator() {
            return new StackIterator(this);
        }
        
        
        // muodostetaan uusi alkio ja viedään se huipulle
        public void push(String aData) {
        	if(size < maxSize) {
                ListItem newItem = new ListItem(); // luodaan uusi lista-alkio
                newItem.setData(aData);
                listOfListItems[size] = newItem;
                newItem.setLink(top); // kytketään uusi alkio aikaisempaan huippualkioon
                top = newItem; // uusi alkio pinon 1:ksi
                size++;
        	}
        }
        // poistetaan alkio pinon huipulta, jos pinossa ei alkioita palautetaan null
        public ListItem pop() {
        	
        	if(size > 0) {
        		top = top.getLink();
        		size--;
        		ListItem listItemRemoved = listOfListItems[size];
        		listOfListItems[size] = null;
        		return listItemRemoved;
        	}else {
        		return null;
        	}
        }
        // palautetaan pinottujen alkioiden lukumäärä
        public int getSize() {
                return size;
        }
        // listataan sisältö
        public void printItems() {
        	
        	for(ListItem item : listOfListItems) {
        		
        		try {
        			
        			System.out.println(item.getData());
        			
        		}catch(Exception e) {
        			
        		}
        	}
        }
}

