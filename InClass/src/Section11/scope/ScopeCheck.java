package Section11.scope;

public class ScopeCheck {
    public int publicVar = 0;
    private int privateVar = 1;


    public int getPrivateVar(){
        return  privateVar;
    }

    public void timesTwo(){
        int privateVar = 2;
        for(int i=0;i<2;i++){
            System.out.println(i+" times two is "+ i * privateVar);
        }
    }

    public class InnerClass{
        public int privateVar = 3;

        public InnerClass(){
            System.out.println("InnerClass created, privateVar is "+ privateVar);
        }

        public void timesTwo(){
            int privateVar = 10;
            for(int i=0;i<2;i++){
                System.out.println(i+" times two is " + i * this.privateVar);
            }
        }
    }
}
