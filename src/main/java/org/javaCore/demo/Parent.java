package org.javaCore.demo;

import org.demo.coreJava.GrandParent;

public class Parent extends GrandParent{

    void father(){

    }

    void mother(){

    }

    public static void main(String[] args){

        Parent p = new Parent();
        int glbage1 = p.glbage;
        System.out.println(glbage1);

        int age = p.getAge();
        System.out.println(age);

        GrandParent g = new GrandParent();
        int glbage2 = g.getGlbage();
        System.out.println(glbage2);

        int age1 = g.getAge();
        System.out.println(age1);


        System.out.println(id);

    }
}
