package org.studyeasy.Interfaces;

public class Hello {
    public static void main(String[] args) {

    Phone phone =new Iphone8();

    System.out.println("Processor: "+phone.processor());
    System.out.println("Space in GB: "+phone.spaceINGB());

    }
}
