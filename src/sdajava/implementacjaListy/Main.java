package sdajava.implementacjaListy;

import java.util.List;

public class Main {

    public static void main(String[] args) {

        ListImpl lista = new ListImpl();

        lista.addElement("test");
        lista.addElement("drugi");
        lista.addElement("trzeci");

       lista.showList();
       System.out.println("Rozmiar listy to  " + lista.sizeList());
    }
}
