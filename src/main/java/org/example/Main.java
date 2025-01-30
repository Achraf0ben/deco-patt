package org.example;

import boissons.Boisson;
import boissons.Deca;
import boissons.Expresso;
import boissons.Sumatra;
import deco.Chantilly;
import deco.Chocolat;
import deco.Noisette;


public class Main {
    public static void main(String[] args) {
        //Boisson boisson;
       /** boisson = new Expresso();

        System.out.println(boisson.getDescrciption());
        System.out.println(boisson.cout());

        boisson = new Sumatra();

        System.out.println(boisson.getDescrciption());
        System.out.println(boisson.cout());
**/
      /** boisson = new Sumatra();
        System.out.println(boisson.getDescrciption());
        System.out.println(boisson.cout());
        boisson = new Chocolat(boisson);
        System.out.println("***************");
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescrciption());
        System.out.println("***************");
        //Double chocolat
        boisson = new Chocolat(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescrciption());
        System.out.println("***************");

        boisson = new Noisette(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescrciption());
        System.out.println("***************");

        boisson = new Chantilly(boisson);
        System.out.println(boisson.cout());
        System.out.println(boisson.getDescrciption());
        System.out.println("***************"); **/

      // =========
        Boisson boisson = new Chantilly(new Chantilly(new Chantilly(new Noisette(new Deca()))));
        System.out.println(boisson.getDescrciption());
        System.out.println(boisson.cout());

    }
}