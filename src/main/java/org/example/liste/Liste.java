package org.example.liste;

import java.util.ArrayList;
import java.util.LinkedList;
import java.util.List;

public class Liste {
    public static void main(String[] args) {

        String[] array = new String[5];
        array[1] = "Ana are mere";

        for(int i = 0; i < array.length; i++){
            //System.out.println(array[i]);
        }

        LinkedList<String> lista = new LinkedList<>();
        lista.add("Ana are mere");
        lista.add("Ana are pere");
        lista.add("Ana are prune");
        lista.add("Ana are banane");

        //System.out.println(lista.get(0));

        for(int i = 0; i < lista.size(); i++){
            //System.out.println(lista.get(i));
        }

        for(String elementDePrintat : lista){
            //System.out.println(elementDePrintat);
        }

        int i = 0;
        while(i < lista.size()){
            //System.out.println(lista.get(i));
            i++;
        }

        // List<String> listaNoua = new ArrayList<>();
    }
}
