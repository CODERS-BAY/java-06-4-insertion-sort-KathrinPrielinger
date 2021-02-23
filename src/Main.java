import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        //Insertion Sort
        int[] array = {-13, 5, 102, -25, 0};

        int temp = 0;
        int j = 0;

        //Unsortierten Bereich des Arrays durchzählen
        for (int i = 1; i < array.length; i++) { //

            j = i;

            while ((j > 0) && (array[j - 1] > array[j])) { //wenn: der Index j größer als 0 ist UND der Wert des array an der Stelle j-1 größer als der Wert
                                                            //des array j ist
                int switcher = array[j - 1];                //dann speichere den Wert des array an der Stelle j-1 in die Variable switcher

                array[j - 1] = array[j];                    //der Wert des array an der Stelle j wird an die Position des Werts des array j - 1 gespeichert

                array[j] = switcher;                        //der Wert von switcher wird an die Stelle des Werts des array an der Stelle j gespeichert.
                j--;                                        //j wird vermindert
            }
        }

        System.out.println(Arrays.toString(array));
    }
}


        /*
        //Selection Sort
        int[] array = {-13, 5, 102, -25, 0}; //erstelle ein Array namens array mi 5 Elementen
        //Äußere for-Schleife
        for (int i = 0; i < array.length; i++) {        //die Variable i = 0; wenn i kleiner als die Länge von array ist {

            int minIndex = i;                           //wird der aktuelle Wert der Variable i in minIndex gespeichert
            int minimum = array[i];                     //wird der Wert von array an der Stelle i in minimum gespeichert

            for (int j = i; j < array.length; j++) {     //die Variable j = hat den Wert von i; wenn j kleiner als die Länge von array ist {
                if (array[j] < minimum) {               //prüfe (ob der Wert von array an der Stelle j kleiner als der Wert von minimum ist
                    minimum = array[j];                 //der Wert von array an der Stelle j wird in minimum gespeichert
                    minIndex = j;                       //der Wert von j wird in minIndex gespeichert
                }
            }

             int switcher = array[i];                    //der Wert von array an der Stelle i wird in Variable switcher gespeichert
            array[i] = array[minIndex];                 //der Wert von array an der Stelle minIndex wird als Wert von array an der Stelle i abgespeichert
            array[minIndex] = switcher;                 //der Wert von Switcher wird im array an der Stelle von minIndex abgespeichert
            System.out.println(Arrays.toString(array));//Elemente des arrays werden als Strings auf der Konsole ausgegeben.
        }

    }
}
*/
