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
    	
    	//tarkistetaan onko puu tyhjä, jos on nii luodaan uusi solmu
    	if(root == null) {
    		root = new Node(aData);
    		return;
    	}
    	
    	//muussa tapauksessa lisää tai toista vasen 
    	if(root.getData().compareToIgnoreCase(aData) > 0) { 
    		if(root.left() != null) {
    			root.left().insert(aData);
    		}else {
    			this.setLeft(new BinaryTree(aData));
    		}
    		return;
    	}
    	
    	//oikea puoli
    	if(root.getData().compareToIgnoreCase(aData) < 0) {
    		if(root.right() != null) {
    			root.right().insert(aData);
    		}else {
    			this.setRight(new BinaryTree(aData));
    		}
    		return;
    	}
    	
    }
    
    public void findForDelete(String data) {
        data = data.toLowerCase();
        BinaryTree temp = delete(this, data);
        if(temp != null) {
            System.out.println("Poistettu " + data);
        } else {
            System.out.println("Ei löydy");
        }
    }

    
    private BinaryTree delete(BinaryTree tree, String data) {

        if (tree == null) {
            return null;
        }
        if (find(data) == null) {
            return null;
        }

        if (data.equals(tree.root.getData())) {
            if (tree.root.left() == null && tree.root.right() == null) {
                System.out.println("Root poisto");
                tree.root = null;
            } else if (tree.root.right() == null){
                System.out.println("Vasemman lapsen poisto");
                Node child = tree.root.left().root;
                tree.root = child;
            } else if (tree.root.left() == null) {
                System.out.println("Oikean lapsen poisto");
                Node child = tree.root.right().root;
                tree.root = child;
            } 
        } 
        
        if (data.compareTo(tree.root.getData()) < 0) {
	            delete(tree.root.left(), data);
	        } else if (data.compareTo((tree.root.getData())) > 0) {
	            delete(tree.root.right(), data);
        }

        if (tree.root != null) {
            if (tree.root.left() != null) {
                if (tree.root.left().root == null) {
                    tree.setLeft(null);
                }
            }
            if (tree.root.right() != null) {
                if (tree.root.right().root == null ) {
                    tree.setRight(null);
                }
            }
        }
        return tree;

    }

    
    public BinaryTree find(String aData){
    	
    	if(root.getData().equals(aData)) {
    		return this;
    	}else if(root.getData().compareTo(aData) > 0) {
    		if(root.left() != null) {
    			return root.left().find(aData);
    		}
    	}else if(root.getData().compareTo(aData) < 0) {
    		if(root.right() != null) {
        		return root.right().find(aData);
    		}
    	}
        return null;
    }
    public void preOrder() {
        if (root != null) {
            System.out.println(root.getData()+',');
            if (root.left() != null) // pÃ¤Ã¤seeekÃ¶ vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pÃ¤Ã¤seekÃ¶ oikealle?
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
