/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */

package btree;

/**
 *
 * @author kamaj
 */
public class Menu {
//main alkaa-----------------------------------------------------------------------------
        public static void main(String[] args) {

                        printMenu();

        }
//main loppuu --------------------------------------------------------------------------
//printMenu alkaa------------------------------------------------------------------
        private static void printMenu() {
                char select;
                //BinaryTree tree = new BinaryTree(); // luo tyhjä puu
                SortedArray sorted = new SortedArray();
                
                String data;
                do {

                        System.out.println("\n\t\t\t1. Lisää avain");
                        System.out.println("\t\t\t2. Etsi avaimella");
                        //System.out.println("\t\t\t3. Tulosta puu esijärjestyksessä.");
                        System.out.println("\t\t\t3. Tulosta lista.");
                        //System.out.println("\t\t\t3. Tulosta puu sisäjärjestyksessä.");
                        //System.out.print("\t\t\t4. Poista avaimella.");
                        System.out.println("\n\t\t\t5. lopetus ");
                        System.out.print("\n\n"); // tehdään tyhjiä rivejä
                        
                        select = Lue.merkki();
                        switch (select) {
                        case '1':
                            System.out.println("Anna uusi avain (merkkijono)");
                            data = new String(Lue.rivi());
                            //tree.insert(data);
                            sorted.add(data);
                            break;
                        case '2':
                            System.out.println("Anna etsitt�v� avain (merkkijono)");
                            data = Lue.rivi();
                            /*
                            if (tree.find(data)!=null) { // löytyykö?
                            	System.out.println("Avain l�ytyis");
                            }else {
                            	System.out.println("Avain ei l�ytynyt");
                            }*/
                            
                            int index = sorted.find(data);
                            if(index >= 0) {
                            	System.out.println("Avain '" + data + "' l�ytyi indeksist� " + index);
                            }else {
                            	System.out.println("Avainta ei l�ytynyt listasta");
                            }
                            break;
                        case '3':
                            //System.out.println("Puun j�rjestys");
                            //tree.inOrder();
                            //System.out.println();
                        	sorted.print();
                            char h = Lue.merkki(); // pysäytetään kontrolli
                            break;
                        /*    
                        case '4':
                            data = Lue.rivi();
                            tree.findForDelete(data);
                            break;*/
                        case '5':
                            break;
                        }
                }
                while (select != '5');
        }
//printMenu loppuu ----------------------------------------------------------------
}

