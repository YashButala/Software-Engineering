interface I1{
        void methodI1(); //public static by default
}

interface I2{
        void methodI2(); //public static by default
}


class A1{
        public String methodA1(){
                String strA1 = " I am method C1 of class A1";
                return strA1;
        }

        public String toString(){
                return "toString() method of class A1";
        }
}


public class B1 extends A1 implements I2{

        void methodI1(){
        System.out.println(" I am a methodI1 of class B1");
        }
        public void methodI2(){
        System.out.println(" I am a methodI2 of class B1");
        }
        public static void main(String[] args){
                System.out.println("It Compiles :)");
        }

}       

