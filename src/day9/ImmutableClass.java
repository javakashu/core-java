package day9;


public final class ImmutableClass {

        private final int id;
        private final String name;

        public int getId(){

            return id;

        }

        public ImmutableClass(int i,String s){
            this.id =i;
            this.name= s;

        }

    public static void main(String[] args) {
        ImmutableClass a = new ImmutableClass(1,"Java");
        System.out.println(a.name =="Java");




    }

}
