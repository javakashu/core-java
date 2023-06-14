package day8;

public class HierarchicalInheritanceExample {

    public static void main(String[] args) {

        Science sci = new Science();
        Commerce comm = new Commerce();
        Arts art = new Arts();

        //all the subclasses can access the method of the super class

        sci.methodStudent();
        comm.methodStudent();
        art.methodStudent();

    }
}
