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

    public BinaryTree(String rootValue, int height) {
        root = new Node(rootValue, height);
    }
    
    public BinaryTree(String  rootValue) {
        root = new Node(rootValue);
    }
    
    public BinaryTree() {
    	root = null;
    }
    /*public BinaryTree(String rootValue, BinaryTree left, BinaryTree right){
        root = new Node(rootValue, left, right);
    } */
    
    public void insert(String aData){ // boolean paluuarvoksi?
    	aData = aData.toLowerCase();
    	
    	if(root == null) {
    		root = new Node(aData, 0);
    				return;
    	}
    	
    	if(aData.compareTo(root.getData()) <= 0) {
    		if(root.left() == null) {
    			root.setLeft(new BinaryTree(aData, 0));
    		}else {
    			root.left().insert(aData);
    		}
    	}else {
    		if(root.right() == null) {
    			root.setRight(new BinaryTree(aData, 0));
    		}else {
    			root.right().insert(aData);
    		}
    	}
    	
    	int heightLeft = root.left() != null ? root.left().root.getNodeHeight() : 0;
    	int heightRight = root.right() != null ? root.right().root.getNodeHeight() : 0;
    	
    	root.setNodeHeight(max(heightLeft, heightRight)+1);
    	
    	/*
    	//tarkistetaan onko puu tyhjä, jos on nii luodaan uusi solmu
    	if(root == null) {
    		root = new Node(aData, 0);
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
    	}*/
    	
    }
    
    private int max(int a, int b) {
		return (a > b) ? a: b;
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
            } else {
                System.out.println("Solmun poisto jolla 2 lasta");
                Node lastChild = lastChild(tree.root.right().root);
                BinaryTree tree1 = new BinaryTree();
                System.out.println("Uusi alkio poistettavan tilalle");
                delete(tree, lastChild.getData());
                tree1.root = new Node(lastChild.getData());
                tree1.root.setLeft(tree.root.left());
                tree1.root.setRight(tree.root.right());
                tree.root = tree1.root;
            }
        } else if(data.compareTo(tree.root.getData()) < 0){
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

    
    private Node lastChild(Node node) {
        if (node.left() != null) {
            return lastChild(node.left().root);
        }
        return node;
	}

	public BinaryTree find(String aData){	
        aData = aData.toLowerCase();
        
        if (aData.equals(root.getData())) {
            return new BinaryTree(aData);
        } else if (aData.compareTo(root.getData()) < 0) {
            if (root.left() != null) {
                return root.left().find(aData);
            }
            return null;
        } else {
            if (root.right() != null) {
                return root.right().find(aData);
            }
            return null;
        }
    }
	
    public void inOrder() {
        if (root != null) {
            if (root.left() != null)
                root.left().inOrder();
            System.out.print(root.getData() + ":" + root.getNodeHeight() + " - ");
            if (root.right() != null)
                root.right().inOrder();
        }
    }
    
	/*
    public void preOrder() {
        if (root != null) {
            System.out.println(root.getData()+',');
            if (root.left() != null) // pÃ¤Ã¤seeekÃ¶ vasemmalle?
                root.left().preOrder();
            if (root.right() != null) // pÃ¤Ã¤seekÃ¶ oikealle?
                root.right().preOrder();
        }

    }*/

    public void setLeft(BinaryTree tree) {
        root.setLeft(tree);
    }

    public void setRight(BinaryTree tree) {
        root.setRight(tree);
    }
}
