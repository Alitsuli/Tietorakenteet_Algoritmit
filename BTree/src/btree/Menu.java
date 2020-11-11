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
                char select, select1;
                BinaryTree tree = new BinaryTree(); // luo tyhjä puu
                String data;
                do {

                        System.out.println("\n\t\t\t1. Lisää avain");
                        System.out.println("\t\t\t2. Etsi avaimella");
                        System.out.println("\t\t\t3. Tulosta puu esijärjestyksessä.");
                        System.out.println("\t\t\t3. Tulosta puu sisäjärjestyksessä.");
                        System.out.println("\t\t\t4. lopetus ");
                        System.out.print("\n\n"); // tehdään tyhjiä rivejä
                        select = Lue.merkki();
                        switch (select) {
                        case '1':
                            data = new String(Lue.rivi());
                            tree.insert(data);
                            break;
                        case '2':
                            data = Lue.rivi();
                            if (tree.find(data)!=null) // löytyykö?
                            
                            break;
                        case '3':
                            tree.preOrder();
                            char h = Lue.merkki(); // pysäytetään kontrolli
                            break;
                        case '4':
                            //tree.inOrder();
                            break;
                        }
                }
                while (select != '4');
        }
//printMenu loppuu ----------------------------------------------------------------
}

