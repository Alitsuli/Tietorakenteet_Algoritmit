/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package btree;

/**
 *
 * @author kamaj
 */
public class BinaryTree {

    private Node root;

    public BinaryTree(String rootValue) {
        root = new Node(rootValue);
    }
    
    public BinaryTree() {
        root = null;
    }
    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    } */
    
    public void insert(String aData){ // boolean paluuarvoksi?
    	
    	//tarkistetaan onko puu tyhj�, jos on nii luodaan uusi solmu
    	if(root == null) {
    		root = new Node(aData);
    		return;
    	}
        
    	//muussa tapauksessa lis�� tai toista vasen 
    	if(root.getData().compareToIgnoreCase(aData) > 0) {
    		if(root.left() != null) {
    			root.left().insert(aData);
    		}else {
    			this.setLeft(new BinaryTree(aData));
    		}
    		return;
    	}
    	
    	//oikea puoli
    	if(root.getData().compareToIgnoreCase(aData) > 0) {
    		if(root.right() != null) {
    			root.right().insert(aData);
    		}else {
    			this.setRight(new BinaryTree(aData));
    		}
    		return;
    	}
    	
    }
    
    public BinaryTree find(String aData){
    	
    	if(root.getData().equals(aData)) {
    		return this;
    	}else if(root.getData().compareTo(aData) > 0) {
    		return root.left().find(aData);
    	}else if(root.getData().compareTo(aData) < 0) {
    		return root.right().find(aData);
    	}
        return null;
    }
    public void preOrder() {
        if (root != null) {
            System.out.println(root.getData()+',');
            if (root.left() != null) // pääseeekö vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pääseekö oikealle?
                root.right().preOrder();
        }

    }

    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }
}
