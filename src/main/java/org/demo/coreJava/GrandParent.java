package org.demo.coreJava;

public class GrandParent {
   protected int glbage = 20;  // global variable
    protected static int id = 228; // static variable

    public int getGlbage(){

        return glbage;
    }

    public int getId(){

        return id;
    }
    public int getAge(){
        int locage = 28;
        return locage;
    }

    public static void main(String[] args){
        int locage = 10; // local variable

        GrandParent g = new GrandParent();

        System.out.println(g.glbage);
        System.out.println(locage);
        System.out.println(id);
    }
}
