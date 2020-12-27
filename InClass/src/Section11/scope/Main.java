package Section11.scope;

public class Main {
    public static void main(String[] args) {
        ScopeCheck scopeInstance = new ScopeCheck();

        scopeInstance.timesTwo();
        System.out.println("*****************************");
        ScopeCheck.InnerClass innerClass = scopeInstance.new InnerClass();
        innerClass.timesTwo();
    }
}
