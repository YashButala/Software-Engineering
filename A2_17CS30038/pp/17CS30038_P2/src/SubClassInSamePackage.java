class BaseClass{
        public int x = 10;
        private int y= 10;
        protected int z = 10;
        int a = 10;     //implicit default access modifier
       
        public int getX(){
                return x;
        }
        public void setX(int x)
        {
                this.x=x;
        }

        public int getY(){
                return y;
        }
        public void setY(int y)
        {
                this.y=y;
        }

        public int getZ(){
                return z;
        }
        public void setZ(int z)
        {
                this.z=z;
        }

        int getA(){
                return a;
        }


        void setA(int a ){
                this.a= a;
        }
}

public static void main(String args[])
{
- Show quoted text -
Reply | Reply to all | Forward | Print | Delete | Show original

Add star 
Yogesh Kumar
<yogicoder3795@gmail.com>	30 January 2019 at 17:19
To: Vipin Sharma <vipinamatya@gmail.com>, anunaysharma777@gmail.com, Arnab Maiti <maitiarnab9@gmail.com>, Yash Butala <butalayash99@gmail.com>, uditdesai2206 <uditdesai2206@gmail.com>
Reply | Reply to all | Forward | Print | Delete | Show original
hi

Add star 
Anunay Sharma
<anunaysharma777@gmail.com>	30 January 2019 at 17:23
To: Yogesh Kumar <yogicoder3795@gmail.com>
Cc: Vipin Sharma <vipinamatya@gmail.com>, Arnab Maiti <maitiarnab9@gmail.com>, Yash Butala <butalayash99@gmail.com>, uditdesai2206 <uditdesai2206@gmail.com>
Reply | Reply to all | Forward | Print | Delete | Show original
class BaseClass
        {
                public int x=10;
                private int y=10;
                protected int z=10;
                int a=10;
                public int getX()
                {
                        return x;
                }
                public void setX(int x)
                {
                        this.x=x;
                }
                private int getY()
                {
                        return y;
                }
                public void setY(int y)
                {
                        this.y=y;
                }
                protected int getZ()
                {
                        return z;
                }
                protected void setZ(int z)
                {
                        this.z=z;
                }
                int getA()
                {
                        return a;
                }
                void setA(int a)
                {
                        this.a=a;
                }
        }
        public class SubclassInSamePackage extends BaseClass
        {
                public static void main(String args[])
                {
                        BaseClass rr=new BaseClass();
                        rr.z=0;
                        SubclassInSamePackage subClassObj=new SubclassInSamePackage();
                        System.out.println("Value of x is : "+subClassObj.x);
                        subClassObj.setX(20);
                        System.out.println("Value of x is : "+subClassObj.x);
                        //System.out.println("Value of y is : "+subClassObj.y);
                        subClassObj.setY(20);
                        //System.out.println("Value of y is : "+subClassObj.y);
                        System.out.println("Value of z is : "+subClassObj.z);
                        subClassObj.setZ(20);
                        System.out.println("Value of z is : "+subClassObj.z);
                        System.out.println("Value of x is : "+subClassObj.a);
                        subClassObj.setA(20);
                        System.out.println("Value of x is : "+subClassObj.a);
                }
        }
