package org.demo.coreJava;

public class Child extends GrandParent{

    public static void main(String[] args){

        Child c = new Child();
        int glbage = c.getGlbage();
        System.out.println(glbage);

        int id = c.getId();
        System.out.println(id);

//        int glbage1 = c.glbage;
//        System.out.println(glbage1);

        int age = c.getAge();
        System.out.println(age);

        GrandParent g = new GrandParent();
        int glbage1 = g.getGlbage();
        System.out.println(glbage1);

        int id1 = g.getId();
        System.out.println(id1);

//        int glbage2 = g.glbage;
//        System.out.println(glbage2);

        int age1 = g.getAge();
        System.out.println(age1);

//        System.out.println(id);

    }
}
