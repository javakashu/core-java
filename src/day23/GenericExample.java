package day23;

import java.util.logging.Logger;

public class GenericExample {

    private static final Logger logger= Logger.getLogger(GenericExample.class.getName());

    public static void main(String[] args) {


        GenClass<String,String> stringGenClass = new GenClass<>("Hello","World");
        logger.info(stringGenClass.getValue1());
        logger.info(stringGenClass.getValue2());


        GenClass<Integer,Integer> integerGenClass = new GenClass<>(100,200);

        logger.info(integerGenClass.getValue1().toString());
        logger.info(integerGenClass.getValue2().toString());

        GenClass<Double,Double> doubleGenClass = new GenClass<>(100.0,200.0);
        logger.info(doubleGenClass.getValue1().toString());
        logger.info(doubleGenClass.getValue2().toString());

        GenClass<Boolean,Boolean> booleanGenClass = new GenClass<>(true,false);
        logger.info(booleanGenClass.getValue1().toString());
        logger.info(booleanGenClass.getValue2().toString());

        GenClass<String,Integer> ageGenClass = new GenClass<>("age",29);
        logger.info(ageGenClass.getValue1());
        logger.info(ageGenClass.getValue2().toString());

//        ArrayList<String> list = new ArrayList<>();
//        list.add("A");
//        list.add(20);
//        list.add(true);
//
//        String bool = list.get(0).toString();

//        sum(2,3);
//        sum(2.0,3.0);
//        sum(2.0f,3.0f);
//        sum("Akshu","Karki");

        max(1,2,3);
        max(2.0,3.0,4.0);
        max("a","b","c");
        max("Taman","Akshu","Junu");

        Product maxProduct = max(new Product("A",20),new Product("B",10),new Product("C",50));
        logger.info(maxProduct.toString());

        print(stringGenClass);
        print(integerGenClass);
        print(booleanGenClass);
        print(doubleGenClass);



    }

    public static  void print(GenClass<? extends Comparable<?>, ? extends Comparable<?>> genClass){

    }


    public static <N extends Number> void sum(N a , N b){


        double tempA = Double.parseDouble(a.toString());
        double tempB = Double.parseDouble(b.toString());

        logger.info(String.valueOf(tempA+tempB));

    }

    public  static <N extends Comparable<N> > N max (N a , N b , N c){

        N maxNumber = a ;
        if(b.compareTo(a) > 0){
            maxNumber = b ;
        } else if (c.compareTo(a) > 0) {
            maxNumber = c ;
        }
        return maxNumber;
    }
}
